package com.fatecsoi.calculadoraeqseggrau;

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

    private EditText valorA;
    private EditText valorB;
    private EditText valorC;
    private TextView x1Linha;
    private TextView x2Linha;


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
        valorA = findViewById(R.id.etValorA);
        valorA.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
        // centraliza o conteudo da caixa de texto

        valorB = findViewById(R.id.etValorB);
        valorB.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);

        valorC = findViewById(R.id.etValorC);
        valorC.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);

        x1Linha = findViewById(R.id.tvResX1);
        x1Linha.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);

        x2Linha = findViewById(R.id.tvResX2);
        x2Linha.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);

        Button btnCalc = findViewById(R.id.btnCalcular);
        btnCalc.setOnClickListener(op -> calc()); // Botão chama a função de calculo


    }

    private void calc()
    {
        float delta, x1 , x2;
        float A = Float.parseFloat(valorA.getText().toString());
        float B = Float.parseFloat(valorB.getText().toString());
        float C = Float.parseFloat(valorC.getText().toString());

        delta = (float) (Math.pow(B, 2) - 4 * A * C);
        delta = (float) Math.sqrt(delta);

        x1 = (-B + delta) / 2 * A;
        x2 = (-B - delta) / 2 * A;

        String res1 = getString(R.string.x1Linha) + " " + x1;
        x1Linha.setText(res1);

        String res2 = getString(R.string.x2Linha) + " " + x2;
        x2Linha.setText(res2);

        valorA.setText("");
        valorB.setText("");
        valorC.setText("");

    }
}