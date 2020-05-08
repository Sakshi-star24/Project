package com.example.scafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class order extends AppCompatActivity {

    static int count=0;
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,to,tor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        t1 = findViewById(R.id.tvi);
        t2 = findViewById(R.id.tvq);
        t3 = findViewById(R.id.tvp);
        t4 = findViewById(R.id.tvi2);
        t5 = findViewById(R.id.tvq2);
        t6 = findViewById(R.id.tvp2);
        t7 = findViewById(R.id.tvi3);
        t8 = findViewById(R.id.tvq3);
        t9 = findViewById(R.id.tvp3);
        t10 = findViewById(R.id.tvi4);
        t11 = findViewById(R.id.tvq4);
        t12 = findViewById(R.id.tvp4);
        t13 = findViewById(R.id.tvi5);
        t14 = findViewById(R.id.tvq5);
        t15 = findViewById(R.id.tvp5);
        to = findViewById(R.id.to);
        tor = findViewById(R.id.tor);

        String a = getIntent().getStringExtra("price");
        String b = getIntent().getStringExtra("qty");
        String c = getIntent().getStringExtra("item");
       /* String d = getIntent().getStringExtra("price2");
        String e = getIntent().getStringExtra("qty2");
        String f = getIntent().getStringExtra("item2");
        String g = getIntent().getStringExtra("price3");
        String h = getIntent().getStringExtra("qty3");
        String i = getIntent().getStringExtra("item3");
        String j = getIntent().getStringExtra("price4");
        String k = getIntent().getStringExtra("qty4");
        String l = getIntent().getStringExtra("item4");
        String m = getIntent().getStringExtra("price5");
        String n = getIntent().getStringExtra("qty5");
        String o = getIntent().getStringExtra("item5");*/


        if (a != null && b != null && c != null) {

            int x = Integer.parseInt(a);
            int r = Integer.parseInt(b);
            int t = x * r;

            String total = String.valueOf(t);
            t1.setText(c);
            t2.setText(b);
            t3.setText(total);
        }
        else {
            t1.setText(null);
            t2.setText(null);
            t3.setText(null);

        }


        /*if(d!=null&&e!=null&&f!=null) {
            String total2=calc(d,e,f);
            t4.setText(f);
            t5.setText(e);
            t6.setText(total2);
        }
        else {
            t4.setText(null);
            t5.setText(null);
            t6.setText(null);

        }

        if(g!=null&&h!=null&&i!=null) {
            String total3=calc(g,h,i);
            t7.setText(i);
            t8.setText(h);
            t9.setText(total3);
        }
        else {
            t7.setText(null);
            t8.setText(null);
            t9.setText(null);

        }

        if(j!=null&&k!=null&&l!=null) {
            String total4=calc(j,k,l);
            t10.setText(l);
            t11.setText(k);
            t12.setText(total4);
        }
        else {
            t10.setText(null);
            t11.setText(null);
            t12.setText(null);

        }

        if(m!=null&&n!=null&&o!=null) {
            String total5=calc(m,n,o);
            t13.setText(o);
            t14.setText(n);
            t15.setText(total5);
        }
        else {
            t13.setText(null);
            t14.setText(null);
            t15.setText(null);

        }

    }
    public String calc(String x,String y,String z){


    }*/


    }
    public void conf(View v){
        Intent in = new Intent(this, Confirm.class);
        startActivity(in);
    }
    public void back(View v){
        Intent in = new Intent(this, food.class);
        startActivity(in);
    }

}
