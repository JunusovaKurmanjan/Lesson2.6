package com.example.lesson26;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText email, password;
    private Button button;
    private ConstraintLayout box;
    private TextView vhod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       button = findViewById(R.id.button);
       email = findViewById(R.id.email);
       password = findViewById(R.id.password);
       box = findViewById(R.id.box);
       vhod = findViewById(R.id.vhod);



       email.addTextChangedListener(new TextWatcher() {
           @Override
           public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

           }

           @Override
           public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
               if(password.getText().toString().length()>=1 || email.getText().toString().length() >=1 ) {
                   button.setBackgroundColor(button.getContext().getResources().getColor(R.color.orange));
               } else {
                   button.setBackgroundColor(button.getContext().getResources(). getColor(R.color.gray));
               }
           }

           @Override
           public void afterTextChanged(Editable editable) {

           }
       });

       password.addTextChangedListener(new TextWatcher() {
           @Override
           public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

           }

           @Override
           public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
               if(password.getText().toString().length()>=1 || email.getText().toString().length() >=1 ) {
                   button.setBackgroundColor(button.getContext().getResources().getColor(R.color.orange));
               } else {
                   button.setBackgroundColor(button.getContext().getResources(). getColor(R.color.gray));
               }
           }

           @Override
           public void afterTextChanged(Editable editable) {

           }
       });

       button.setOnClickListener(e-> {
           if (email.getText().toString().equals("admin@gmail.com")&& password.getText().toString().equals("admin")) {
               box.setVisibility(View.GONE);
               vhod.setVisibility(View.GONE);
               Toast.makeText(this,"Вы успешно зарегестрировались",Toast.LENGTH_LONG).show();
           } else {
               Toast.makeText(this, "Неправильный логин и пароль", Toast.LENGTH_LONG).show();
           }
       });
    }
}
