package com.example.usuario.nativecoders;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sair(View View) {
        System.exit(0);

    }

    public void tela2(View View) {
        setContentView(R.layout.tela2);

    }

    public void sim(View View) {
        Toast.makeText(this, "Parabéns!!! você esta no caminho certo.", Toast.LENGTH_LONG).show();
    }

    public void nao(View View) {
        setContentView(R.layout.tela3);
    }

    public void sim2(View View) {
        setContentView(R.layout.tela4);
    }

    public void nao2(View View) {
        setContentView(R.layout.activity_main);

    }

    public void meetup(View View) {
        String url = "http://www.meetup.com/pt/Native-Coders/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void youtube(View View) {
        String url = "https://www.youtube.com/channel/UCNIRtYLJaYFxxqmY8i5j4gw/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    public void sair2 (View View) {
        new AlertDialog.Builder(this).setMessage("Deseja sair do Aplicativo?")
                .setPositiveButton("sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Intent.ACTION_MAIN);
                        intent.addCategory(intent.CATEGORY_HOME);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        finish();
                    }
                }).setNegativeButton("não", null).show();
    }
    public void sobre (View View) {
        AlertDialog AlertDialog;
        AlertDialog = new AlertDialog.Builder(this).create();
        AlertDialog.setTitle("Native Coders");
        AlertDialog.setMessage("Aplicativo desenvolvido por: Native Coders");
        AlertDialog.show();


    }
    public void voltar (View View) {
        setContentView(R.layout.activity_main);

    }
}
