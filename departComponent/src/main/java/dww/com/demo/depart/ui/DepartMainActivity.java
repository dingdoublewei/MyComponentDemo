package dww.com.demo.depart.ui;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.dww.demo.basiclib.beans.CarBrandBean;
import com.luojilab.component.componentlib.service.AutowiredService;
import com.luojilab.router.facade.annotation.Autowired;
import com.luojilab.router.facade.annotation.RouteNode;

import dww.com.demo.depart.R;

@RouteNode(path = "/departMain", desc = "depart home page")
public class DepartMainActivity extends Activity implements View.OnClickListener {
    @Autowired
    String userName;
    @Autowired
    String password;
    @Autowired
    CarBrandBean carBrandBean;
    String TAG = DepartMainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.depart_activity_main);
        AutowiredService.Factory.getInstance().create().autowire(this);
        initData();
    }

    private void initData() {
        Log.d(TAG, "carBrandBean= " + carBrandBean.toString());
        Log.d(TAG, "userName= " + userName);
        Log.d(TAG, "password= " + password);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
        }
    }
}
