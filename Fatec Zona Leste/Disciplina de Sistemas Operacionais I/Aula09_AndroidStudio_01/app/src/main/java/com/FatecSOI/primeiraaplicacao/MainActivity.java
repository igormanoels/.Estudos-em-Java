package com.FatecSOI.primeiraaplicacao;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText etSInicial;
    private EditText etVelo;
    private EditText etTempo;
    //private Button btnCalc;
    private TextView tvRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        etSInicial = findViewById(R.id.etSInicial);
        etSInicial.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
        // centraliza o conteudo da caixa de texto

        etVelo = findViewById(R.id.etVelo);
        etVelo.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);

        etTempo = findViewById(R.id.etTempo);
        etTempo.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);

        tvRes = findViewById(R.id.tvRes);
        tvRes.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);

        Button btnCalc = findViewById(R.id.btnCalc);
        btnCalc.setOnClickListener(op -> calc()); // Botão chama a função de calculo


    }

    private void calc()
    {
        float sinicial = Float.parseFloat(etSInicial.getText().toString());
        float veloc = Float.parseFloat(etVelo.getText().toString());
        float tempo = Float.parseFloat(etTempo.getText().toString());
        float sFinal = sinicial + veloc * tempo;
        String res = getString(R.string.sFinal) + " " + sFinal + " m";
        tvRes.setText(res);

        etSInicial.setText("");
        etVelo.setText("");
        etTempo.setText("");

    }
}