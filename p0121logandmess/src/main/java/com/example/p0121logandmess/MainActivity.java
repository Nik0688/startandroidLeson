package com.example.p0121logandmess;

import static com.example.p0121logandmess.R.id.btnOk;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener{
  private static final String TAG = "myLogs";
  TextView tvOut;
  Button btnOk;
  Button btnCancel;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Log.d(TAG, "Найдем view элементы");

    tvOut = (TextView) findViewById(R.id.tvOut);
    btnOk = (Button) findViewById(R.id.btnOk);
    btnCancel = (Button) findViewById(R.id.btnCancel);

    Log.d(TAG, "присваиваем обработчик кнопкам");
    btnOk.setOnClickListener(this);
    btnCancel.setOnClickListener(this);
  }

  @Override
  public void onClick(View view) {
    Log.d(TAG, "по id определяем кнопку, вызвавшую этот обработчик");
    switch (view.getId()) {
      case R.id.btnOk:
        // кнопка ОК
        Log.d(TAG, "кнопка ОК");
        tvOut.setText("Нажата кнопка ОК");
        Toast.makeText(this,"Нажата кнопка Ok",Toast.LENGTH_LONG).show();
        break;
      case R.id.btnCancel:
        // кнопка Cancel
        Log.d(TAG, "кнопка Cancel");
        tvOut.setText("Нажата кнопка Cancel");
        Toast.makeText(this, "Нажата кнопка Cancel", Toast.LENGTH_LONG).show();
        break;
    }
  }
}
