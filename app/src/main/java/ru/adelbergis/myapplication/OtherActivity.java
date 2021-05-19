package ru.adelbergis.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class OtherActivity extends AppCompatActivity {
    private SimpleDateFormat mTimeFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss", Locale.US);

    private TextView mOutputTextView;//Так мы создали типа тексвью
    private Button mWorkButton;//И типа кнопку
    private Button mReturnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //метод вызывается в начале жизненного цикла
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);//так мы задаем тот Лояут который будет отображаться на экране

        mOutputTextView = findViewById(R.id.view_output);//Так мы посместили текст наш ЮИ текста по id
        mWorkButton = findViewById(R.id.view_work);//так мы поместили UI кнопки
        mReturnButton = findViewById(R.id.button_return);


        mWorkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mOutputTextView.setText(mTimeFormat.format(Calendar.getInstance().getTime()));
                //и так мы сделали действие и положили время
            }
        });

        mReturnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mOutputTextView.setText("No output");
            }
        });
    }
}