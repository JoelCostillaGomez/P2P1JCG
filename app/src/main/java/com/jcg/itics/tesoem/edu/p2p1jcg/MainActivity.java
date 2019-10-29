package com.jcg.itics.tesoem.edu.p2p1jcg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton rmasculino, rfemenino;
    RadioButton rsuma, rresta, rmultiplicacion, rdivision;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rmasculino = (RadioButton) findViewById(R.id.rmasculino);
        rfemenino = (RadioButton) findViewById(R.id.rfemenino);

        rsuma =(RadioButton) findViewById(R.id.rsuma);
        rresta =(RadioButton) findViewById(R.id.rresta);
        rmultiplicacion = (RadioButton) findViewById(R.id.rmultiplicacion);
        rdivision = (RadioButton) findViewById(R.id.rdivision);
        result=(TextView) findViewById(R.id.result);
    }
    public void invocamensaje(View view){
        if(rmasculino.isChecked()){
            Toast.makeText(this, "Selecciono Masculino", Toast.LENGTH_LONG).show();
        }
        if(rfemenino.isChecked()){
            Toast.makeText(this,"Selecciono femenino",Toast.LENGTH_LONG).show();
        }
    }

    public void math (View v){
        if(rsuma.isChecked()){

            EditText num1= (EditText) findViewById(R.id.txtnum1);
            EditText num2= (EditText) findViewById(R.id.txtnum2);
            Double int1 = Double.parseDouble(num1.getText().toString());
            Double int2 = Double.parseDouble(num2.getText().toString());

            Double res = int1+int2;
            result.setText(""+res);
        }
        if(rresta.isChecked()){

            EditText num1= (EditText) findViewById(R.id.txtnum1);
            EditText num2= (EditText) findViewById(R.id.txtnum2);
            Double int1 = Double.parseDouble(num1.getText().toString());
            Double int2 = Double.parseDouble(num2.getText().toString());

            Double res = int1-int2;
            result.setText(""+res);
        }
        if(rmultiplicacion.isChecked()){

            EditText num1= (EditText) findViewById(R.id.txtnum1);
            EditText num2= (EditText) findViewById(R.id.txtnum2);
            Double int1 = Double.parseDouble(num1.getText().toString());
            Double int2 = Double.parseDouble(num2.getText().toString());

            Double res = int1*int2;
            result.setText(""+res);
        }
        if(rdivision.isChecked()){

            EditText num1= (EditText) findViewById(R.id.txtnum1);
            EditText num2= (EditText) findViewById(R.id.txtnum2);
            Double int1 = Double.parseDouble(num1.getText().toString());
            Double int2 = Double.parseDouble(num2.getText().toString());

            Double res = int1/int2;
            result.setText(""+res);
        }
    }
}
