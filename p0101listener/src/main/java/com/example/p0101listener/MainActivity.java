package com.example.p0101listener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    final TextView tvOut = (TextView) findViewById(R.id.tvOut);
    Button btnOk = (Button) findViewById(R.id.btnOk);
    Button btnCancel = (Button) findViewById(R.id.btnCancel);

    OnClickListener oclBtn = new OnClickListener() {
      @Override
      public void onClick(View view) {
        switch (view.getId()){
          case R.id.btnOk:
            tvOut.setText("Нажата кнопка OK");
            break;
          case R.id.btnCancel:
            tvOut.setText("Нажата кнопка Cancel");
            break;
        }
      }
    };

    btnOk.setOnClickListener(oclBtn);
    btnCancel.setOnClickListener(oclBtn);
  }
}
