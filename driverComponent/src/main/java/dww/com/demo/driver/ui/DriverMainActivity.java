package dww.com.demo.driver.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import dww.com.demo.driver.R;

public class DriverMainActivity extends Activity implements View.OnClickListener {

    private FrameLayout fl_parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.driver_activity_main);
        findViewById(R.id.tv_click_driverMainActivity).setOnClickListener(this);
        fl_parent = findViewById(R.id.fl_parent);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.tv_click_driverMainActivity) {

        }
    }
}
