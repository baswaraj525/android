package com.kkk.temperatureconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button b1;
    private  Button b2;
    private TextView t1;
    private  TextView t2;
    private EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        t1 = (TextView) findViewById(R.id.textView);
        t2 = (TextView) findViewById(R.id.textView2);
        e1 = (EditText) findViewById(R.id.editText);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = e1.getText().toString();
                if (s.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "input the values", Toast.LENGTH_LONG).show();
                }
                else {
                    double d = Double.parseDouble(s);

                    double f = f_to_c(d);
                    String s1 = String.valueOf(f);
                    t2.setText(s1);

                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s3 = e1.getText().toString();
                if (s3.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "input the values", Toast.LENGTH_LONG).show();
                }
                else {
                    double e = Double.parseDouble(s3);

                    double j = f_to_c(e);
                    String s2 = String.valueOf(j);
                    t2.setText(s2);

                }
            }
        });
    }
         public double c_to_f(double a)
    {
        double res=(a*5)/9;
        return res;

    }
    public  double f_to_c(double b)
    {
        double resa=(b-32)/9;
         return resa;
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

