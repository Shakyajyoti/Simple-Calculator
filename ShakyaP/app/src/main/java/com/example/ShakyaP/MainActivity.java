package com.example.ShakyaP;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    EditText edt_num1,edt_num2;
    int num1,num2;
    String sign ;
    TextView result, txtv_num1 , txtv_num2 ,txtv_sign;
    Button  B1 , B2 , B3 , B4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtv_num1=findViewById(R.id.get_num1);
        txtv_num2=findViewById(R.id.get_num2);
        txtv_sign=findViewById(R.id.txtv_sign);

        declareView();
        ViewClick();
        Bundle bundle=getIntent().getExtras();

        if(bundle!=null)
        {
             num1= bundle.getInt("num1");
             num2=bundle.getInt("num2");
             sign= bundle.getString("signActivity");

            txtv_num1.setText(String.valueOf(num1));
            txtv_num2.setText(String.valueOf(num2));
            txtv_sign.setText(String.valueOf(sign));

            result.setText(String.valueOf(bundle.getInt("result")));
        }

    }

    private void declareView()
    {
        edt_num1=findViewById(R.id.edt_num1);
        edt_num2=findViewById(R.id.edt_num2);
        result=findViewById(R.id.result);
        B1=findViewById(R.id.B1);
        B2=findViewById(R.id.B2);
        B3=findViewById(R.id.B3);
        B4=findViewById(R.id.B4);
    }

    private void ViewClick()
    {
        B1.setOnClickListener(this);
        B2.setOnClickListener(this);
        B3.setOnClickListener(this);
        B4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId()){

            case R.id.B1:
                if (validationRule()){

                    int a = Integer.valueOf(edt_num1.getText().toString().trim());
                    int b = Integer.valueOf(edt_num2.getText().toString().trim());

                    Intent intent=new Intent(MainActivity.this,MainActivity1.class);

                    intent.putExtra("1st_Num",a);
                    intent.putExtra("2nd_Num",b);
                    intent.putExtra("sign","+");

                    startActivity(intent);
                    finish();
                }
                break;

            case R.id.B2:
                if (validationRule()){

                    int a = Integer.valueOf(edt_num1.getText().toString().trim());
                    int b = Integer.valueOf(edt_num2.getText().toString().trim());

                    Intent intent=new Intent(MainActivity.this,MainActivity1.class);

                    intent.putExtra("1st_Num",a);
                    intent.putExtra("2nd_Num",b);
                    intent.putExtra("sign","-");

                    startActivity(intent);
                    finish();
                }
                break;

            case R.id.B3:
                if (validationRule()){

                    int a = Integer.valueOf(edt_num1.getText().toString().trim());
                    int b = Integer.valueOf(edt_num2.getText().toString().trim());

                    Intent intent=new Intent(MainActivity.this,MainActivity1.class);

                    intent.putExtra("1st_Num",a);
                    intent.putExtra("2nd_Num",b);
                    intent.putExtra("sign","*");

                    startActivity(intent);
                    finish();
                }
                break;

            case R.id.B4:
                if (validationRule()){

                    int a = Integer.valueOf(edt_num1.getText().toString().trim());
                    int b = Integer.valueOf(edt_num2.getText().toString().trim());

                    Intent intent=new Intent(MainActivity.this,MainActivity1.class);

                    intent.putExtra("1st_Num",a);
                    intent.putExtra("2nd_Num",b);
                    intent.putExtra("sign","/");

                    startActivity(intent);
                    finish();
                }
                break;


        }
    }

    private boolean validationRule()
    {
        if(edt_num1.getText().toString().trim().isEmpty())
        {
            Toast.makeText(MainActivity.this,"Enter first number",Toast.LENGTH_LONG).show();
            return false;
        }
        else if(edt_num1.getText().toString().trim().length()>3)
        {
            Toast.makeText(MainActivity.this,"Enter only three digit",Toast.LENGTH_LONG).show();
            return false;
        }

        if(edt_num2.getText().toString().trim().isEmpty())
        {
            Toast.makeText(MainActivity.this,"Enter second number",Toast.LENGTH_LONG).show();
            return false;
        }
        else if(edt_num2.getText().toString().trim().length()>3)
        {
            Toast.makeText(MainActivity.this,"Enter only three digit",Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
    }
}
