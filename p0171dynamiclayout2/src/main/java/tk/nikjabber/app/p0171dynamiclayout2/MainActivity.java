package tk.nikjabber.app.p0171dynamiclayout2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout llMain;
    RadioGroup rgGraviry;
    EditText etName;
    Button btnCreate, btnClear;

    int wrapContent = LinearLayout.LayoutParams.WRAP_CONTENT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llMain = (LinearLayout) findViewById(R.id.llMain);
        rgGraviry = (RadioGroup) findViewById(R.id.rgGravity);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnCreate = (Button) findViewById(R.id.btnCreate);
        etName = (EditText) findViewById(R.id.etName);

        btnCreate.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnCreate:
                LinearLayout.LayoutParams lparams = new LinearLayout.LayoutParams(wrapContent, wrapContent);
                int btnGravity = Gravity.LEFT;

                switch (rgGraviry.getCheckedRadioButtonId()){
                    case R.id.rbLeft:
                        btnGravity = Gravity.LEFT;
                        break;
                    case R.id.rbRight:
                        btnGravity = Gravity.RIGHT;
                        break;
                    case R.id.rbCenter:
                        btnGravity = Gravity.CENTER;
                        break;
                }
                lparams.gravity = btnGravity;
                Button btnNew =new Button(this);
                btnNew.setText(etName.getText().toString());
                llMain.addView(btnNew, lparams);
                break;
            case R.id.btnClear:
                llMain.removeAllViews();
                Toast.makeText(this, "Удалено", Toast.LENGTH_LONG).show();
        }
    }
}
