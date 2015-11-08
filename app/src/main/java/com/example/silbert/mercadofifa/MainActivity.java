package com.example.silbert.mercadofifa;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.silbert.mercadofifa.model.Jogador;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    EditText lucro, valorJogador;
    BigDecimal lucroInformado, valorJogadorInformado,taxaFifa, vendaJogador;
    Jogador jogador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lucro = (EditText) findViewById(R.id.lucro);
        valorJogador = (EditText) findViewById(R.id.valorJogador);
    }

    public void calcular(View view){
        String editText1 = lucro.getText().toString();
        String editText2 = valorJogador.getText().toString();

        if(editText1.trim().isEmpty()|| editText2.trim().isEmpty()){
            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setMessage("Campos em branco, informe um valor");
            dlg.setNeutralButton("OK", null);
            dlg.show();
        }else {
            jogador = new Jogador();

            jogador.setLucro(new BigDecimal(lucro.getText().toString()));
            lucroInformado = jogador.getLucro();
            jogador.setValorJogador(new BigDecimal(valorJogador.getText().toString()));
            valorJogadorInformado = jogador.getValorJogador();
            taxaFifa = jogador.getTaxaFifa();

            vendaJogador = lucroInformado.add(valorJogadorInformado.
                    add(valorJogadorInformado.multiply(taxaFifa)));

            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setTitle("Mercado");
            dlg.setMessage("Valor Jogador: "+valorJogadorInformado+"\n"+"Lucro: "+lucroInformado+
                    "\n"+"Vender jogador por " + vendaJogador + " coins");
            dlg.setNeutralButton("OK", null);
            dlg.show();

            lucro.setText("");
            valorJogador.setText("");
        }
    }
}
