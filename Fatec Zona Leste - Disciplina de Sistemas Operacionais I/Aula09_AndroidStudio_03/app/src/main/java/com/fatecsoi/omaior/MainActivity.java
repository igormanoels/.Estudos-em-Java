package com.fatecsoi.omaior;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView res;
    private EditText valorA;
    private EditText valorB;


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

        valorA = findViewById(R.id.etNum1);
        valorA.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);

        valorB = findViewById(R.id.etNum2);
        valorB.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);

        Button btnCalc = findViewById(R.id.btnVerificar);
        btnCalc.setOnClickListener(op -> calc()); // Botão chama a função de calculo

        res = findViewById(R.id.tvRes);
        res.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);


    }

    private void calc()
    {
        String result;5
        int A = Integer.parseInt(valorA.getText().toString());
        int B = Integer.parseInt(valorB.getText().toString());

        if (A == B)
        {
            result = "Os valores são iguais.";
        } else if (A > B)
        {
            result = "O Maior valor é o " + A;
        }
        else
        {
            result = "O Maior valor é o " + B;
        }
        res.setText(result);


        valorA.setText("");
        valorB.setText("");

    }
}