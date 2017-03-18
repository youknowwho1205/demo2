package com.youknowwho.demo2;

import android.content.res.Configuration;
import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.youknowwho.demo2.adapters.ScreenSlidePagerAdapter;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView item1;
    private TextView item2;
    private TextView item3;
    private TextView item4;
    private TextView item5;
    private TextView txtItem;
    private LinearLayout parentBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();


    }

    private void initUI() {

        item1 = (TextView)findViewById(R.id.item1);
        item1.setOnClickListener(this);

        item2 = (TextView)findViewById(R.id.item2);
        item2.setOnClickListener(this);

        item3 = (TextView)findViewById(R.id.item3);
        item3.setOnClickListener(this);

        item4 = (TextView)findViewById(R.id.item4);
        item4.setOnClickListener(this);

        item5 = (TextView)findViewById(R.id.item5);
        item5.setOnClickListener(this);

        // Instantiate a ViewPager and a PagerAdapter.
        ViewPager mPager = (ViewPager) findViewById(R.id.pager);
        ScreenSlidePagerAdapter mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);

        txtItem = (TextView)findViewById(R.id.txt_item);

        parentBtn = (LinearLayout)findViewById(R.id.parent_btn);

        Button btnRed = (Button) findViewById(R.id.btn_red);
        btnRed.setOnClickListener(this);

        Button btnBlue = (Button) findViewById(R.id.btn_blue);
        btnBlue.setOnClickListener(this);

        Button btnGreen = (Button) findViewById(R.id.btn_green);
        btnGreen.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        v.startAnimation(new AlphaAnimation(1f, 0.5f));

        switch (v.getId()){

            case R.id.item1:
                txtItem.setText(item1.getText());
                break;

            case R.id.item2:
                txtItem.setText(item2.getText());
                break;

            case R.id.item3:
                txtItem.setText(item3.getText());
                break;

            case R.id.item4:
                txtItem.setText(item4.getText());
                break;

            case R.id.item5:
                txtItem.setText(item5.getText());
                break;

            case R.id.btn_red:
                parentBtn.setBackgroundColor(Color.RED);
                break;

            case R.id.btn_blue:
                parentBtn.setBackgroundColor(Color.BLUE);
                break;

            case R.id.btn_green:
                parentBtn.setBackgroundColor(Color.GREEN);
                break;
        }

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
