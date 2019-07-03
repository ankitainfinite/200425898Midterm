package com.example.a200425898midterm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

Button btn1,btn2;
TextView cpu;
EditText firstname,lastname;
DatabaseReference dbref;
Spinner spinner;
    private static final Random rand=new Random();
    int rantInt=rand.nextInt(100)+1;

 String get;
 String result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        firstname = (EditText) findViewById(R.id.editText1);
        lastname = (EditText) findViewById(R.id.editText2);
        cpu = (TextView) findViewById(R.id.textView);
        spinner = (Spinner) findViewById(R.id.user);
        dbref = FirebaseDatabase.getInstance().getReference("Game");
        get=firstname.getText().toString().trim();
        get=lastname.getText().toString().trim();
        spinner.setOnItemClickListener(Rock);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rantInt.equalsIgnoreCase("<34")) {

                    result.setext("Draw");
                    dbref.child(dbref.push().getKey()).setValue("None");

                } else if (rantInt.equalsIgnoreCase("34<rantInt<67")) {

                    result.setText("You lost");
                    dbref.child(dbref.push().getKey()).setValue("Computer");

                } else {

                    result.setText("you win");
                    dbref.child(dbref.push().getKey()).setValue("User");
                }
            }
             spinner.setOnItemClickListener("Paper");
        btn1.OnClickListener(new View.OnClickListener() {
                 @Override
                public void onClick(View v) {
                    if (rantInt.equalsIgnoreCase("<34")) {

                        result.setext("You win");
                        dbref.child(dbref.push().getKey()).setValue("User");
                        Toast.makeText()

                    } else if (rantInt.equalsIgnoreCase("34<rantInt<67")) {

                        result.setText("Draw");
                        dbref.child(dbref.push().getKey()).setValue("None");

                    } else {

                        result.setText("you lost");
                        dbref.child(dbref.push().getKey()).setValue("Computer");
                    }


            } spinner.setOnItemClickListener(Scissors);
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (rantInt.equalsIgnoreCase("<34")) {

                            result.setext("You win");
                            dbref.child(dbref.push().getKey()).setValue("User");

                        } else if (rantInt.equalsIgnoreCase("34<rantInt<67")) {

                            result.setText("You lost");
                            dbref.child(dbref.push().getKey()).setValue("Computer");

                        } else {

                            result.setText("Draw");
                            dbref.child(dbref.push().getKey()).setValue("None");
                        }


        });





    }