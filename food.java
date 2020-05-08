package com.example.scafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class food extends AppCompatActivity {

    Button p,m,o,ca;
    TextView t,t2,t3,t4,t5,tp,tp2,tp3,tp4,tp5;
    CheckBox c,c2,c3,c4,c5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        p=findViewById(R.id.add);
        m=findViewById(R.id.less);
        t=findViewById(R.id.tvqty);
        c=findViewById(R.id.checkBox);
        o=findViewById(R.id.order);
        ca=findViewById(R.id.cancel);
        t2=findViewById(R.id.tvqty2);
        t3=findViewById(R.id.tvqty3);
        t4=findViewById(R.id.tvqty4);
        t5=findViewById(R.id.tvqty5);
        c2=findViewById(R.id.cb2);
        c3=findViewById(R.id.cb3);
        c4=findViewById(R.id.cb4);
        c5=findViewById(R.id.cb5);
        tp=findViewById(R.id.tp);
        tp2=findViewById(R.id.tp2);
        tp3=findViewById(R.id.tp3);
        tp4=findViewById(R.id.tp4);
        tp5=findViewById(R.id.tp5);

        Toast.makeText(food.this,"Login Successful",Toast.LENGTH_SHORT).show();


    }

  public String add(String x){
        int n=Integer.parseInt(x);
        n=n+1;
        String m=String.valueOf(n);
        return(m);

    }
    public String less(String z){

        int n=Integer.parseInt(z);
        if(n<=1)
            return ("1");
        else {
            n = n - 1;
            String m = String.valueOf(n);
            return (m);
        }
    }


    public void res2add(View v){
        String s=t2.getText().toString();
        String m=add(s);
        t2.setText(m);
    }
    public void res2less(View v){
        String s=t2.getText().toString();
        String m=less(s);
        t2.setText(m);
    }

    public void res3add(View v){
        String s=t3.getText().toString();
        String m=add(s);
        t3.setText(m);
    }
    public void res3less(View v){
        String s=t3.getText().toString();
        String m=less(s);
        t3.setText(m);
    }

    public void res4add(View v){
        String s=t4.getText().toString();
        String m=add(s);
        t4.setText(m);
    }
    public void res4less(View v){
        String s=t4.getText().toString();
        String m=less(s);
        t4.setText(m);
    }

    public void res5add(View v){
        String s=t5.getText().toString();
        String m=add(s);
        t5.setText(m);
    }
    public void res5less(View v){
        String s=t5.getText().toString();
        String m=less(s);
        t5.setText(m);
    }

    public void res1add(View v){
        String s=t.getText().toString();
        String m=add(s);
        t.setText(m);
    }
    public void res1less(View v){
        String s=t.getText().toString();
        String m=less(s);
        t.setText(m);
    }

    public void order(View v){

        String s,p,q,item;

        if(c.isChecked()) {
            s = c.getText().toString();
            p = tp.getText().toString();
            q = t.getText().toString();
            item=item+"\n"+
            Intent i = new Intent(this, order.class);
            i.putExtra("item", s);
            i.putExtra("price", p);
            i.putExtra("qty", q);
            startActivity(i);
        }
        /*if(c2.isChecked()) {
            String s = c2.getText().toString();
            String p = tp2.getText().toString();
            String q = t2.getText().toString();
            Intent i = new Intent(this, order.class);
            i.putExtra("item2", s);
            i.putExtra("price2", p);
            i.putExtra("qty2", q);
            startActivity(i);
        }
        if(c3.isChecked()) {
            String s = c3.getText().toString();
            String p = tp3.getText().toString();
            String q = t3.getText().toString();
            Intent i = new Intent(this, order.class);
            i.putExtra("item3", s);
            i.putExtra("price3", p);
            i.putExtra("qty3", q);
            startActivity(i);
        }
        if(c4.isChecked()) {
            String s = c4.getText().toString();
            String p = tp4.getText().toString();
            String q = t4.getText().toString();
            Intent i = new Intent(this, order.class);
            i.putExtra("item4", s);
            i.putExtra("price4", p);
            i.putExtra("qty4", q);
            startActivity(i);
        }
        if(c5.isChecked()) {
            String s = c5.getText().toString();
            String p = tp5.getText().toString();
            String q = t5.getText().toString();
            Intent i = new Intent(this, order.class);
            i.putExtra("item5", s);
            i.putExtra("price5", p);
            i.putExtra("qty5", q);
            startActivity(i);
        }*/
        else {
            String s=null;
            String p=null;
            String q=null;

            Intent i = new Intent(this, order.class);
            i.putExtra("item", s);
            i.putExtra("price", p);
            i.putExtra("qty", q);
            startActivity(i);
        }
    }

}
