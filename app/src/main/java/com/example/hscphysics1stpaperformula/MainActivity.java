package com.example.hscphysics1stpaperformula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     Button first;
     Button sec,third,fourth,fiveth,six,seven,eight,nine,ten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first=findViewById(R.id.FirstChapterId);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next= new Intent(getApplicationContext(),FirstChapterActivity.class);
                startActivity(next);
            }
        });

        sec=findViewById(R.id.SecndChapterId);
        sec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next1= new Intent(getApplicationContext(),SecondChapterActivity.class);
                startActivity(next1);
            }
        });

        third=findViewById(R.id.thirdchapterId);
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next2= new Intent(getApplicationContext(),ThirdActivity.class);
                startActivity(next2);
            }
        });


        fourth=findViewById(R.id.fourthchapterId);
        fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next3= new Intent(getApplicationContext(),FourthActivity.class);
                startActivity(next3);
            }
        });

        fiveth=findViewById(R.id.fifthethchapterId);
        fiveth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next4= new Intent(getApplicationContext(),FivethActivity.class);
                startActivity(next4);
            }
        });

        six=findViewById(R.id.sixthchapterid);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next5= new Intent(getApplicationContext(),SixthActivity.class);
                startActivity(next5);
            }
        });

        seven=findViewById(R.id.seventhchapterId);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next6= new Intent(getApplicationContext(),SevenActivity.class);
                startActivity(next6);
            }
        });



        eight=findViewById(R.id.eightchapterID);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next7= new Intent(getApplicationContext(),EightthActivity.class);
                startActivity(next7);
            }
        });

        nine=findViewById(R.id.ninethchapterId);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next8= new Intent(getApplicationContext(),NInethActivity.class);
                startActivity(next8);
            }
        });

        ten=findViewById(R.id.tenthchapterId);
        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next9= new Intent(getApplicationContext(),TenthActivity.class);
                startActivity(next9);
            }
        });





    }
}
