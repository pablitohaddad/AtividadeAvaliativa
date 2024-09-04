package br.com.pablohaddad.atividadeavaliativa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // DECLARACAO DAS VARIAVEIS PARA OS ELEMENTOS
    // DA INTERFACE DO USUARIO --> xml

    private EditText nomeEdit, idadeEdit, qtdDinheiroEdit;

    private Button enviarBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // DEFINIR O LAYOUT DA ACTIVITY
        setContentView(R.layout.activity_main);
        // ASSOCIAR AS VARIAVEIS AOS ELEMENTOS DA INTERFACE COM BASE EM SEUS id`s
        nomeEdit = findViewById(R.id.edtNome);
        idadeEdit = findViewById(R.id.edtIdade);
        qtdDinheiroEdit = findViewById(R.id.edtQtdDinheiro);
        enviarBtn = findViewById(R.id.btnEnviar);

        // DEFINIR UM EVENTO DE CLIQUE DO BOTAO
        // DEFINIR UM LISTENER PARA BOTAO "enviarBtn"
        enviarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // CRIAR UM NOVO INTENT PARA INICIAR A ACTIVITY "ListaActivity"
                Intent intencao = new Intent(getApplicationContext(), SegundaActivity.class);
                intencao.putExtra("nome", nomeEdit.getText().toString());
                intencao.putExtra("idade", idadeEdit.getText().toString());
                intencao.putExtra("quantidadeDinheiro", qtdDinheiroEdit.getText().toString());
                // INICIALIZAR A LISTA ACTIVITY
                startActivity(intencao);
            }
        });


    }
}