package upb.cartavirtual;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class pMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_menu);
    }




    public void AbrirEntrada(View v){

        Intent i = new Intent(this, pEntradas.class);
        startActivity(i);
    }

    public void AbrirPlatoPrincipal(View v){

        Intent i = new Intent(this, pPrincipal.class);
        startActivity(i);
    }

    public void AbrirPostre(View v){

        Intent i = new Intent(this, pPostre.class);
        startActivity(i);
    }

    public void AbrirBebida(View v){

        Intent i = new Intent(this, pBebidas.class);
        startActivity(i);
    }

}
