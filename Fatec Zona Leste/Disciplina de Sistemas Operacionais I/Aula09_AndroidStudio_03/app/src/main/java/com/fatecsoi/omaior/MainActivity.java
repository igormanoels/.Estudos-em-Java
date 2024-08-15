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

    private void calc() {
        String result;
        int A = Integer.parseInt(valorA.getText().toString());
        int B = Integer.parseInt(valorB.getText().toString());

        StringBuilder primeNumbers = new StringBuilder();

        if (A <= B) {
            if (A >= 0 && B <= 50) {
                for (int i = A; i <= B; i++) {
                    if (ePrime(i)) {
                        primeNumbers.append(i).append(" ");
                    }
                }
                result = primeNumbers.toString();
            } else {
                result = "A entrada precisa ser de valores entre 0 e 50.";
            }
        } else {
            result = "O valor de A precisa ser menor ou igual ao valor de B.";
        }

        res.setText(result);


        valorA.setText("");
        valorB.setText("");
5
    }

    public static boolean ePrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
