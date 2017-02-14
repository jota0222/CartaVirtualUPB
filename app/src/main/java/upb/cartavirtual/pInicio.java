package upb.cartavirtual;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class pInicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_inicio);
    }


    public void AbrirSede(View v) {
        Intent i = new Intent(this, pSedes.class );
        startActivity(i);

    }




}
