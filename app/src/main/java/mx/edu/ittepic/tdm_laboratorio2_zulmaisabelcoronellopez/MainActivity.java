package mx.edu.ittepic.tdm_laboratorio2_zulmaisabelcoronellopez;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    protected Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8;
    private Boolean c1, c2, c3, c4, c5, c6, c7, c8, c9;
    int turno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button) findViewById(R.id.button5);
        btn1 = (Button) findViewById(R.id.button6);
        btn2 = (Button) findViewById(R.id.button7);
        btn3 = (Button) findViewById(R.id.button8);
        btn4 = (Button) findViewById(R.id.button9);
        btn5 = (Button) findViewById(R.id.button10);
        btn6 = (Button) findViewById(R.id.button11);
        btn7 = (Button) findViewById(R.id.button12);
        btn8 = (Button) findViewById(R.id.button13);


        turno = 1;
        c1 = false;
        c2 = false;
        c3 = false;
        c4 = false;
        c5 = false;
        c6 = false;
        c7 = false;
        c8 = false;
        c9 = false;

        btn0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (btn0.getText().toString().equals("")) {
                    if (turno == 1) {
                        turno = 2;
                        btn0.setText("X");

                    } else if (turno == 2) {
                        turno = 1;
                        btn0.setText("O");
                    }
                }
                c1 = true;
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (btn1.getText().toString().equals("")) {
                    if (turno == 1) {
                        turno = 2;
                        btn1.setText("X");
                    } else if (turno == 2) {
                        turno = 1;
                        btn1.setText("O");
                    }
                }
                c2 = true;
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (btn2.getText().toString().equals("")) {
                    if (turno == 1) {
                        turno = 2;
                        btn2.setText("X");
                    } else if (turno == 2) {
                        turno = 1;
                        btn2.setText("O");
                    }
                }
                c3 = true;

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (btn3.getText().toString().equals("")) {
                    if (turno == 1) {
                        turno = 2;
                        btn3.setText("X");
                    } else if (turno == 2) {
                        turno = 1;
                        btn3.setText("O");
                    }
                }
                c4 = true;

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (btn4.getText().toString().equals("")) {
                    if (turno == 1) {
                        turno = 2;
                        btn4.setText("X");
                    } else if (turno == 2) {
                        turno = 1;
                        btn4.setText("O");
                    }
                }
                c5 = true;

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (btn5.getText().toString().equals("")) {
                    if (turno == 1) {
                        turno = 2;
                        btn5.setText("X");
                    } else if (turno == 2) {
                        turno = 1;
                        btn5.setText("O");
                    }
                }
                c6 = true;

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (btn6.getText().toString().equals("")) {
                    if (turno == 1) {
                        turno = 2;
                        btn6.setText("X");
                    } else if (turno == 2) {
                        turno = 1;
                        btn6.setText("O");
                    }
                }
                c7 = true;
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (btn7.getText().toString().equals("")) {
                    if (turno == 1) {
                        turno = 2;
                        btn7.setText("X");
                    } else if (turno == 2) {
                        turno = 1;
                        btn7.setText("O");
                    }
                }
                c8 = true;
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (btn8.getText().toString().equals("")) {
                    if (turno == 1) {
                        turno = 2;
                        btn8.setText("X");
                    } else if (turno == 2) {
                        turno = 1;
                        btn8.setText("O");
                    }
                }
                c9 = true;
            }
        });
    }
}
