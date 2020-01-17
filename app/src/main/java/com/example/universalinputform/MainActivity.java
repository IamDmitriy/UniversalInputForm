package com.example.universalinputform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        final TextView inputUserName = findViewById(R.id.inputUserName);
        final TextView inputEmail = findViewById(R.id.inputEmail);
        final TextView generatedText = findViewById(R.id.generatedTxt);
        Button btnOk = findViewById(R.id.btnOk);
        Button btnClear = findViewById(R.id.btnClear);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inputUserName.getText().toString().equals("") || inputEmail.getText().toString().equals("")) {
                    generatedText.setText("Пожалуйста, заполните все поля!");
                    return;
                }

                String text = "Подписка на рассылку успешно оформлена для пользователя " +
                        inputUserName.getText() + " на электронный адрес " + inputEmail.getText();
                generatedText.setText(text);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputUserName.setText("");
                inputEmail.setText("");
                generatedText.setText("");
            }
        });
    }


}
