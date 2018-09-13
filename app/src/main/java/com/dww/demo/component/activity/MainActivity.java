package com.dww.demo.component.activity;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.dww.demo.basiclib.beans.CarBrandBean;
import com.dww.demo.component.R;
import com.dww.demo.componentlib.router.Router;
import com.dww.demo.componentservice.ui.FragmentService;
import com.luojilab.component.componentlib.router.ui.UIRouter;
import com.luojilab.component.componentlib.service.AutowiredService;
import com.luojilab.component.componentlib.service.JsonService;
import com.luojilab.router.facade.annotation.RouteNode;

/**
 * Created by dww on 2018/7/7.
 */
@RouteNode(path = "/main", desc = "home page")
public class MainActivity extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_main);
        findViewById(R.id.tv_click_mainActivity).setOnClickListener(this);
        findViewById(R.id.tv_jump_mainActivity).setOnClickListener(this);
        AutowiredService.Factory.getInstance().create().autowire(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_click_mainActivity:
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                FragmentService service = (FragmentService) Router.getInstance().getService(FragmentService.class.getSimpleName());
                if (null != service) {
                    Fragment orderFrag = service.getOrderFragment();
                    ft.replace(R.id.fl_parent_mainActivity, orderFrag)
                            .commitAllowingStateLoss();
                }
                break;
            case R.id.tv_jump_mainActivity:
                go2DepartWithUri();
                Toast.makeText(this, "Router 跳转", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }

    private void go2DepartWithUri() {
        CarBrandBean carBrandBean = new CarBrandBean();
        carBrandBean.setBrandName("奥迪A6L");
        carBrandBean.setCarAge(2);
        carBrandBean.setCarNo("1214234ABG");
        carBrandBean.setNew(false);
        final String URI_LEGAL = "main://depart/departMain?userName=dingWeiWei&password=13501277044&carBrandBean=";
        UIRouter.getInstance().openUri(this, URI_LEGAL + JsonService.Factory.getInstance().create().toJsonString(carBrandBean) + "&amp", null);
    }

    private void go2DepartWithUri2() {
        CarBrandBean carBrandBean = new CarBrandBean();
        carBrandBean.setBrandName("奥迪A7L");
        carBrandBean.setCarAge(2);
        carBrandBean.setCarNo("66666666");
        carBrandBean.setNew(true);
        Bundle bundle = new Bundle();
        bundle.putString("userName", "dww");
        bundle.putString("password", "17666665656");
        bundle.putString("carBrandBean", JsonService.Factory.getInstance().create().toJsonString(carBrandBean));
        UIRouter.getInstance().openUri(this, "main://depart/departMain", bundle);
    }
}
