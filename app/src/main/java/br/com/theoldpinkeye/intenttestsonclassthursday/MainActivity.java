package br.com.theoldpinkeye.intenttestsonclassthursday;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
  // constante com o nome do "extra" que vai dentro do intent
  public static final String EXTRA_MESSAGE = "MEU TEXTO";

  // Criando a função que será chamada pelo clique no botão
  public void sendMessage(View view){
    // aqui será colocado o comportamento quando clicarmos

    // instanciando o Intent fornecendo o contexto atual do app e a classe de destino
    Intent intent = new Intent(this, DisplayMessageActivity.class);

    // linkando o componente do Edittext do layout com uma variável java (BINDING)
    EditText editText = findViewById(R.id.editText);

    // captando o valor digitado em tela para uso
    String mensagem = editText.getText().toString();

    // adicionando o conteúdo ao intent
    intent.putExtra(EXTRA_MESSAGE, mensagem);
    // checando se o intent está levando a informação
    Log.e("Meu Intent", intent.toString());
    // chamando a nova activity com um intent
    startActivity(intent);
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }
}
