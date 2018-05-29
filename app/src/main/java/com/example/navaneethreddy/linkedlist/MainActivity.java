package com.example.navaneethreddy.linkedlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    String n1, n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final EditText number1 = (EditText)findViewById(R.id.editText);
        final EditText number2 = (EditText)findViewById(R.id.editText2);
        Button submit = (Button)findViewById(R.id.button);
       final TextView tv = (TextView)findViewById(R.id.textView);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n1 = number1.getText().toString();
               n2 = number2.getText().toString();
               // n1="123";
                //n2="457";
                System.out.println("main");
                HugeInteger h1 = new HugeInteger(n1);
                HugeInteger h2 = new HugeInteger(n2);
                HugeInteger result = h1.addition(h2);
                tv.setText(result.toString());
                System.out.println("main answer "+result);
                System.out.println(result.toString());
            }

        });
    }
}
