package com.example.aluno.topicosapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tela2Activity extends AppCompatActivity {
    private TextView textViewResultado;
    private EditText etValor;
    private EditText etCotacao;
    private Button btnCalcular;
    private double valor1;
    private double valor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        textViewResultado = (TextView) findViewById(R.id.textViewResultado);
        etValor = (EditText) findViewById(R.id.editTextValor);
        etCotacao = (EditText) findViewById(R.id.editTextCotacao);
        btnCalcular = (Button) findViewById(R.id.buttonCalcular);


        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                valor1 = Double.parseDouble(etValor.getText().toString());
                valor2 = Double.parseDouble(etCotacao.getText().toString());
                double resultado = (valor1*valor2);
                textViewResultado.setText("O valor equivalente é: "+(resultado));

            }


        });
    }
}
