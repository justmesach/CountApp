package com.thelabs.count;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    public int i=0;
    public String score="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv=(TextView)findViewById(R.id.textView2);
                score=Integer.toString(++i);
                tv.setText(score);
            }
        });

        Button b2=(Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv=(TextView)findViewById(R.id.textView2);
                score=Integer.toString(0);
                tv.setText(score);
                i=0;
            }
        });

        Button b3=(Button)findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv=(TextView)findViewById(R.id.textView2);
                if(i>0)
                    score=Integer.toString(--i);
                tv.setText(score);
            }
        });
    }
}
