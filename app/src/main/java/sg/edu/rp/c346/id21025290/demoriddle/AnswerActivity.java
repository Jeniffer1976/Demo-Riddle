package sg.edu.rp.c346.id21025290.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {
TextView tvAns;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        Log.d("AnswerActivity1", "onCreate() called.");

        tvAns = findViewById(R.id.textViewAns);

        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Question");
        String output = questionsSelected;
        switch (questionsSelected){
            case "Q1":
                output+= " answer is Queue";
                break;
            case "Q2":
                output+= " answer is Gone";
                break;
        }
        tvAns.setText(output);


    }
    @Override
    protected void onStart() {
        Log.d("AnswerActivity1", "onStart() called.");
        super.onStart();
    }
    @Override
    protected void onResume() {
        Log.d("AnswerActivity1", "onResume() called.");
        super.onResume();
    }
    @Override
    protected void onPause() {
        Log.d("AnswerActivity1", "onPause() called.");
        super.onPause();
    }
    @Override
    protected void onStop() {
        Log.d("AnswerActivity1", "onStop() called.");
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        Log.d("AnswerActivity1", "onDestroy() called.");
        super.onDestroy();
    }
    @Override
    protected void onRestart() {
        Log.d("AnswerActivity1", "onRestart() called.");
        super.onRestart();
    }

}