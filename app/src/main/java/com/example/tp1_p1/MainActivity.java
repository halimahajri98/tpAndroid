package com.example.tp1_p1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 Button btnConvert;
 EditText inputMoney ;
 RadioButton euroDinar , dinarEuro;
 TextView Res;

@Override
protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
btnConvert = findViewById(R.id.btn_convert);
euroDinar = findViewById(R.id.euroDinar);
dinarEuro = findViewById(R.id.dinarEuro);
inputMoney = findViewById(R.id.inputMoney);
Res = findViewById(R.id.resultat);


btnConvert.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if(euroDinar.isChecked()){
            double ammount = Integer.parseInt(inputMoney.getText().toString());
            double newAmmount =  3.25*ammount ;
           Res.setText(String.valueOf(newAmmount));
        }
        else {
            double ammount = Integer.parseInt(inputMoney.getText().toString());
            double newAmmount =  3.25/ammount ;
            Res.setText(String.valueOf(newAmmount));
        }
    }
});


    }

}