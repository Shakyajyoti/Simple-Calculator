package com.example.ShakyaP;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity  {

    TextView txtv_num1 , txtv_num2 ,txtv_sign;
    int num1,num2;
    String sign;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        txtv_num1=findViewById(R.id.get_num1);
        txtv_num2=findViewById(R.id.get_num2);
        txtv_sign=findViewById(R.id.txtv_sign);
        submit=findViewById(R.id.btn_sub);

        Bundle bundle=getIntent().getExtras();

        if(bundle!=null)
        {
            num1 = bundle.getInt("1st_Num");
            num2 =bundle.getInt("2nd_Num");
            sign = bundle.getString("sign");

            txtv_num1.setText(String.valueOf(num1));
            txtv_num2.setText(String.valueOf(num2));
            txtv_sign.setText(String.valueOf(sign));

        }

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(sign.equalsIgnoreCase("+"))
                {
                    int res=num1+num2;
                    Intent intent=new Intent(MainActivity1.this,MainActivity.class);
                    intent.putExtra("num1",num1);
                    intent.putExtra("num2",num2);
                    intent.putExtra("signActivity",sign);
                    intent.putExtra("result",res);
                    startActivity(intent);
                    finish();
                }
                else if(sign.equalsIgnoreCase("-"))
                {
                    int res=num1-num2;
                    Intent intent=new Intent(MainActivity1.this,MainActivity.class);
                    intent.putExtra("num1",num1);
                    intent.putExtra("num2",num2);
                    intent.putExtra("signActivity",sign);
                    intent.putExtra("result",res);

                    startActivity(intent);
                    finish();
                }
                if(sign.equalsIgnoreCase("*"))
                {
                    int res=num1*num2;
                    Intent intent=new Intent(MainActivity1.this,MainActivity.class);
                    intent.putExtra("num1",num1);
                    intent.putExtra("num2",num2);
                    intent.putExtra("signActivity",sign);
                    intent.putExtra("result",res);

                    startActivity(intent);
                    finish();
                }

                if(sign.equalsIgnoreCase("/"))
                {
                    int res=num1/num2;
                    Intent intent=new Intent(MainActivity1.this,MainActivity.class);
                    intent.putExtra("num1",num1);
                    intent.putExtra("num2",num2);
                    intent.putExtra("signActivity",sign);
                    intent.putExtra("result",res);

                    startActivity(intent);
                    finish();
                }

            }
        });



    }
}