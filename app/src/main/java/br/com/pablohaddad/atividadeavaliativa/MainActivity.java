package br.com.pablohaddad.atividadeavaliativa;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText exemplo1, exemplo2;
    ProgressBar exemplo3;
    Button exemplo4, exemplo5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        exemplo1 = findViewById(R.id.edtExemplo1);
        exemplo2 = findViewById(R.id.edtExemplo2);
        exemplo3 = findViewById(R.id.pgExemplo3);
        exemplo4 = findViewById(R.id.btnExemplo4);
        exemplo5 = findViewById(R.id.btnExemplo5);

        exemplo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Que bom que estamos aqui!", Toast.LENGTH_SHORT).show();
                exemplo1.setText("Que bom que deseja ficar :)");
                exemplo3.getProgress();
            }
        });
        exemplo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exemplo2.setText("Ah, você quer sair :)");
            }
        });

    }
}