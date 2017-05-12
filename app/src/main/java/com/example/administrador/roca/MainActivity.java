package com.example.administrador.roca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

     private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         toolbar = (Toolbar) findViewById(R.id.tool_bar);
        //COMENTARIO IMPORTANTE

         setSupportActionBar(toolbar);

       }

    public void ejecutar_class_inf(View v){

        Intent intenInf = new Intent(this,InfLayoutClass.class);
        startActivity(intenInf);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu mi_menu) {
        //return super.onCreateOptionsMenu(mi_menu);

        getMenuInflater().inflate(R.menu.menu_en_activity,mi_menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem option_item) {

        int opcionMenu = option_item.getItemId();

        if (opcionMenu == R.id.idConfiguracion)
        {
            return  true;

        }

        if(opcionMenu == R.id.idInfo){

            ejecutar_class_inf(null);
             return true;
        }

        return super.onOptionsItemSelected(option_item);
    }
}
