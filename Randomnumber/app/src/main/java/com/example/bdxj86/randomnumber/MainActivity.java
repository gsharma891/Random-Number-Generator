package com.example.bdxj86.randomnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Random;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    public final static String RAND_NUM = "com.example.bdxj86.randomnumber.MESSAGE";
    int i;   //Variabe scope

    public void makeToast(String string){
        Toast.makeText(MainActivity.this, string,Toast.LENGTH_SHORT).show();
    }

    public void guess(View view){

        EditText guessEditText = (EditText)findViewById(R.id.guessEditText);
        int guessInt = Integer.parseInt(guessEditText.getText().toString());

        if(guessInt>i){
            makeToast("Guess is Lower try Lower");

        }
        else if (guessInt< i) {
            makeToast("Guess is high Try Higher number");
        }

        else {
            makeToast("Guess is Right");
            //Random rand = new Random();
            //i = rand.nextInt(20)+1;
        }

        //Toast.makeText(MainActivity.this,guessEditText.getText().toString(),Toast.LENGTH_LONG).show();




    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int max=10;
        int min=1;
        int diff=max-min;
        Random rn = new Random();
        int i = rn.nextInt(diff+1);
        i+=min;
        System.out.print("The Random Number is " + i);



        /*
        TextView tview = (TextView)findViewById(R.id.textView4);
        String result = edit.getText().toString();
        tview.setText(result);
        */

    }
    /*
    public class rtn {
        //public static void main(String[] args) {

            int max=10;
            int min=1;
            int diff=max-min;
            Random rn = new Random();
            int i = rn.nextInt(diff+1);
            i+=min;
            System.out.print("The Random Number is " + i);


        //}
    }
    */



}
/*
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.problem2);
        textIn = (EditText) findViewById(R.id.probText);
        Button ans3 = (Button) findViewById(R.id.answer3);



        ans3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                String probString = textIn.getText().toString();
                Integer probInt = Integer.parseInt(probString);
                Integer prob = 31;
                if (probInt.equals(prob)) {
                    Toast toast = Toast.makeText(answer3.this,"CORRECT!",Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                    toast.show();
                    startActivity(new Intent("com.sample.androidsample.ANSWER4")    );

                } else {
                    Toast toast = Toast.makeText(answer3.this,"Wrong answer! Try again.",Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                    toast.show();
                }
            }
        });
}
 */
/*

EditText edit = (EditText)findViewById(R.id.editText);
        Button btn = (Button) findViewById(R.id.);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast = Toast.makeText(MainActivity.this,edit.getText().toString());

                /*
                String probString = edit.getText().toString();

                if (edit.equals(randomBox()))
                {
                    Toast toast = Toast.makeText(MainActivity.this,"CORRECT!",Toast.LENGTH_SHORT);
                }
                else
                {
                    Toast toast = Toast.makeText(MainActivity.this,"Try Next Time!",Toast.LENGTH_SHORT);
                }
                */



