package com.uninorte.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Calculadora extends AppCompatActivity {
    String TAG="MENSAJE";
    EditText not1;
    EditText not2;
    EditText not3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        not1=(EditText)findViewById(R.id.nota1);
        not2=(EditText)findViewById(R.id.nota2);
        not3=(EditText)findViewById(R.id.nota3);
    }

    public void Aceptar(View view) {
        double corte1=Double.parseDouble(not1.getText().toString());
        double corte2=Double.parseDouble(not2.getText().toString());
        double corte3=Double.parseDouble(not3.getText().toString());
        double corte4=(3.5 - (corte1+corte2+corte3)*0.25)/0.25;
        String f=corte4+"";
        Toast.makeText(this, f,Toast.LENGTH_LONG).show();
        Log.d(TAG, f);
    }
}
