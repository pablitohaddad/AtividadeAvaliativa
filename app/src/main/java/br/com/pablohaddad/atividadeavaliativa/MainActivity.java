package br.com.pablohaddad.atividadeavaliativa;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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



    }
}