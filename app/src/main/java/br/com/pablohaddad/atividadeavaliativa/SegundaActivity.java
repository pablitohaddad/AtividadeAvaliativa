package br.com.pablohaddad.atividadeavaliativa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SegundaActivity extends AppCompatActivity {

    private TextView nomeTv, idadeTv, qtdDinheiroTv;

    private Button voltarBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        nomeTv = findViewById(R.id.tvNome);
        idadeTv = findViewById(R.id.tvEmail);
        qtdDinheiroTv = findViewById(R.id.tvPhone);
        voltarBtn = findViewById(R.id.btnVoltar);
        setContentView(R.layout.activity_segunda);

        // RECEBER INTENCOES
        Intent recebeIntent = getIntent();
        String nomeLocal = recebeIntent.getStringExtra("nome");
        String emailLocal = recebeIntent.getStringExtra("email");
        String phoneLocal = recebeIntent.getStringExtra("phone");

        nomeTv.setText("Nome: " + nomeLocal);
        idadeTv.setText("Idade: " + emailLocal);
        qtdDinheiroTv.setText("Quantidade de dinheiro: " + phoneLocal);

        voltarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}