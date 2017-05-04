package com.example.hasee.coffeedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected TextView mTextView2;
    protected ImageButton mImageButton;
    protected ImageButton mImageButton2;
    protected TextView mTextView3;
    protected Button mButton3;
    private int mCoffeeCount = 1;
    private static final int mCoffeePrice = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        initView();
        initListener();
    }

    private void initListener() {
        mImageButton.setOnClickListener(this);
        mImageButton2.setOnClickListener(this);
        mButton3.setOnClickListener(this);
    }

    private void initView() {
        //显示coffee数量
        mTextView2 = (TextView) findViewById(R.id.textView2);
        //coffee数量增加
        mImageButton = (ImageButton) findViewById(R.id.imageButton);
        //coffee数量减少
        mImageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        //总价提示
        mTextView3 = (TextView) findViewById(R.id.textView3);
        //订coffee
        mButton3 = (Button) findViewById(R.id.button3);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageButton:
                if (mCoffeeCount > 1) {
                    calePrice(--mCoffeeCount);
                } else {
                    Toast.makeText(this, "您不要来一杯么？", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.imageButton2:
                calePrice(++mCoffeeCount);
                break;
            case R.id.button3:
                Toast.makeText(this, "Enjoy the Coffee Time~", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private void calePrice(int coffeeCount) {
        //计算总价
        int sum = coffeeCount * mCoffeePrice;
        //显示coffee数量
        mTextView2.setText(String.valueOf(coffeeCount));
        //显示总价提示
        mTextView3.setText(String.format(getString(R.string.hint2), sum));
    }

}
