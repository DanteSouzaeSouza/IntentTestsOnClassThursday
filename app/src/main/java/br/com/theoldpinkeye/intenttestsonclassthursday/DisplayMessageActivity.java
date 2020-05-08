package br.com.theoldpinkeye.intenttestsonclassthursday;

import android.content.Intent;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

public class DisplayMessageActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_display_message);

    // Dentro do método onCreate()

    // Instanciando novo Intent para recebermos os dados
    Intent intent = getIntent();

    // Extraindo a mensagem de dentro do intent
    String mensagem = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

    // Linkar o textView do layout com o código Java
    TextView textView = findViewById(R.id.textView);

    // colocando dentro do textview a mensagem
    textView.setText(mensagem);

    // Fazendo o BINDING da toolbar do layout com o código java
    Toolbar toolbar = findViewById(R.id.display_message_toolbar);

    // configurando a minha toolbar como uma SupportActionBar
    setSupportActionBar(toolbar);

    // atrelando à nossa nova ToolBar uma ActionBar
    ActionBar actionBar = getSupportActionBar();

    // ativando a actionbar com um botão HOME na forma de um botão voltar
    actionBar.setDisplayHomeAsUpEnabled(true);
  }
}
