package com.example.master.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //显示文字
    public void textView (View view) {
        Toast.makeText(MainActivity.this, R.string.toast_text, Toast.LENGTH_SHORT).show();
    }

    //显示图片
    public void imageView(View view) {
        Toast toast = new Toast(this) ;
        ImageView iv = new ImageView(this);
        iv.setImageResource(R.mipmap.dog);
        toast.setView(iv);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.show();
    }

    //显示图文
    public void textAndImage(View view) {
        Toast toast = new Toast(this) ;
        ImageView iv = new ImageView(this);
        TextView tv = new TextView(this);
        tv.setText(R.string.toast_text);
        iv.setImageResource(R.mipmap.ic_launcher);


        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.addView(iv);
        layout.addView(tv);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setView(layout);

        toast.show();
    }
}
