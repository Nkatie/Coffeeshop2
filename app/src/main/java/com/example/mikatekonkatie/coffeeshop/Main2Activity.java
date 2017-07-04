package com.example.mikatekonkatie.coffeeshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    Button menu;
    TextView tv, tv2, tv3, tv4, tv5, tv6, tv7, tv8;
    EditText ed;

    double total = 0;
    double amount = 0;
    double price = 40, price2 = 30, price3 = 45, price4 = 35, price5 = 20, price6 = 25;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        menu = (Button) findViewById(R.id.button);
        tv = (TextView) findViewById(R.id.textView);
        tv2 = (TextView) findViewById(R.id.textView6);
        tv3 = (TextView) findViewById(R.id.textView4);
        tv4 = (TextView) findViewById(R.id.textView8);
        tv5 = (TextView) findViewById(R.id.textView7);
        tv6 = (TextView) findViewById(R.id.textView9);
        tv7 = (TextView) findViewById(R.id.textView10);
        ed  = (EditText) findViewById(R.id.editText);
        tv8=(TextView)findViewById(R.id.textView5);



        menu.setOnClickListener(this);
        tv.setOnClickListener(this);
        tv2.setOnClickListener(this);
        tv3.setOnClickListener(this);
        tv4.setOnClickListener(this);
        tv5.setOnClickListener(this);
        tv6.setOnClickListener(this);
        tv8.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {


        if (v.getId() == R.id.textView) {
            amount = amount + price;
            Toast.makeText(Main2Activity.this, "R" + price, Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.textView6) {
            amount = amount + price2;
            Toast.makeText(Main2Activity.this, "R" + price2, Toast.LENGTH_SHORT).show();

        } else if (v.getId() == R.id.textView4) {
            amount = amount + price3;
            Toast.makeText(Main2Activity.this, "R" + price3, Toast.LENGTH_SHORT).show();

        } else if (v.getId() == R.id.textView8) {
            amount = amount + price4;
            Toast.makeText(Main2Activity.this, "R" + price4, Toast.LENGTH_SHORT).show();

        } else if (v.getId() == R.id.textView7) {
            amount = amount + price5;
            Toast.makeText(Main2Activity.this, "R" + price5, Toast.LENGTH_SHORT).show();


        }else  if (v.getId() == R.id.textView9) {
                amount = amount + price6;
                Toast.makeText(Main2Activity.this, "R" + price6, Toast.LENGTH_LONG).show();
            } else if (v.getId() == R.id.button) {
                total = total + amount;
                 Toast.makeText(Main2Activity.this, "your order is R" + total, Toast.LENGTH_LONG).show();
                double change = 0;
                int cash = Integer.parseInt(ed.getText().toString());
                change = cash - total;
                tv7.setText("" + change);
               // Toast.makeText(Main2Activity.this, "R" + change, Toast.LENGTH_LONG).show();
                total = -total;
               total = 0;
                amount = 0;


        }else if (v.getId()==R.id.textView5){
            Intent intent=new Intent(Main2Activity.this,MainActivity.class);
            startActivity(intent);
        }
    }
}
