package mx.edu.ittepic.tdm_laboratorio2_zulmaisabelcoronellopez;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   protected Button btnx0, btnx1, btnx2, btno3,btno4, btno5 , btnp6 , btnp7,btnp8;
    protected  Button[] ArrButton;
    int turno, contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnx0 = (Button)findViewById(R.id.button5);
        btnx1 = (Button)findViewById(R.id.button6);
        btnx2 = (Button)findViewById(R.id.button7);
        btno3 = (Button)findViewById(R.id.button8);
        btno4 = (Button)findViewById(R.id.button9);
        btno5 = (Button)findViewById(R.id.button10);
        btnp6 = (Button)findViewById(R.id.button11);
        btnp7 = (Button)findViewById(R.id.button12);
        btnp8 = (Button)findViewById(R.id.button13);

        ArrButton = new Button[]{btnx0, btnx1, btnx2, btno3,btno4, btno5 , btnp6 , btnp7,btnp8};
        for (Button b : ArrButton){
            b.setOnClickListener(this);

        }
    }
    public void onClick(View v){
        contador++;
        turno = contador%2;
        //Jugador 1 X
        if(turno ==1){

        }
        //Jugador 2 O
        else{

        }
        }
        public void imprimirXO(char letra, View v){

        }
}
