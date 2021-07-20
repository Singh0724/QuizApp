package com.example.java_quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] question = {"1.Java is a person?",
    "2.Java was introduced in1233?","3.Java was created using Python?",
    "4.Java has abstract Classes?", "5.Java supported Interfaces?"};

    private  boolean[] answer = {false,false,false,true,true};
    private int score= 0;
    Button yes;
    Button no;
    TextView question1;

private  int index= 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        question1 = findViewById(R.id.question1);
        question1.setText(question[index]);
                yes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(index<=question.length-1){
                            if(answer[index]==true){
                                score++;
                            }
                            index++;
                            if(index<=question.length-1){
                                question1.setText(question[index]);
                            }
                            else{
                                Toast.makeText(MainActivity.this, "Your score is" + score + "/" + question.length, Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            Toast.makeText(MainActivity.this, "Restart your app to play again", Toast.LENGTH_SHORT).show();
                        }
                      }

                    });


            no.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(index<=question.length-1){
                        if(answer[index]==false){
                            score++;
                        }
                        index++;
                        if(index<=question.length-1){
                            question1.setText(question[index]);
                        }
                        else{
                            Toast.makeText(MainActivity.this, "Your score is" + score + "/" + question.length, Toast.LENGTH_SHORT).show();

                        }
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Restart your app to play again", Toast.LENGTH_SHORT).show();
                    }
                }

            });
    }
}