package com.example.mypoupacinhazinha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    //1) declarando variaveis

    Button btnContar;
    EditText txtJuros,txtAnos,txtDeposito;
    TextView lblTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnContar = (Button) findViewById(R.id.btnContar);
        txtJuros = (EditText)  findViewById(R.id.txtJuros);
        txtAnos = (EditText) findViewById(R.id.txtAnos);
        txtDeposito = (EditText) findViewById(R.id.txtDeposito);
        lblTotal = (TextView) findViewById(R.id.lblTotal);

        btnContar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String juros = txtJuros.getText().toString();
                double juros1 = Double.parseDouble(juros);

                String anos = txtAnos.getText().toString();
                double anos1 = Double.parseDouble(anos);

                String deposito = txtDeposito.getText().toString();
                double deposito1 = Double.parseDouble(deposito);

                double total = 0;

                total = juros1 * (anos1 * deposito1);

                Toast.makeText(MainActivity.this,
                                "Total: "+total,Toast.LENGTH_LONG).show();
            }
        });
    }
}