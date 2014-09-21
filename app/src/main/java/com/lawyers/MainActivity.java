package com.lawyers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by linyun on 14-9-21.
 */
public class MainActivity extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.main_btn_ask).setOnClickListener(this);
        findViewById(R.id.main_btn_check).setOnClickListener(this);
        findViewById(R.id.main_btn_expose).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case R.id.main_btn_ask:
                intent = new Intent(this, AskActivity.class);
                break;
            case R.id.main_btn_check:
                intent = new Intent(this, CheckActivity.class);
                break;
            case R.id.main_btn_expose:
                intent = new Intent(this, ExposeActivity.class);
                break;
            default:
                break;
        }
        if (intent != null)
            startActivity(intent);
    }
}
