package upb.cartavirtual;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class pSedes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_sedes);
    }


    public void AbrirMenu(View v){

        Intent i = new Intent(this, pMenu.class);
        startActivity(i);

    }


    public void AbrirMapa(View v){

        Intent i = new Intent(this, pMapa.class);
        startActivity(i);
    }


}
