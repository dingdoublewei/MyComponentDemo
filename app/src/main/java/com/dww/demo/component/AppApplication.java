package com.dww.demo.component;

import android.app.Application;

import com.dww.demo.componentlib.interfaces.IApplication;
import com.luojilab.component.componentlib.router.ui.UIRouter;

import dww.com.demo.depart.DepartApplicationAgent;
import dww.com.demo.driver.DriverApplicationAgent;

/**
 * Created by dww on 2018/7/9.
 */

public class AppApplication extends Application {
    UIRouter uiRouter = UIRouter.getInstance();
    DepartApplicationAgent departApplicationAgent = new DepartApplicationAgent();
    DriverApplicationAgent driverApplicationAgent = new DriverApplicationAgent();

    @Override
    public void onCreate() {
        super.onCreate();
        uiRouter.registerUI("app");
        departApplicationAgent.onCreate();
        driverApplicationAgent.onCreate();
//        Router.registerComponent("dww.com.demo.depart.DepartApplicationAgent");
//        Router.registerComponent("dww.com.demo.driver.DriverApplicationAgent");
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        uiRouter.unregisterUI("app");
        departApplicationAgent.onTerminate();
        driverApplicationAgent.onTerminate();
//        Router.unregisterComponent("dww.com.demo.depart.DepartApplicationAgent");
//        Router.unregisterComponent("dww.com.demo.driver.DriverApplicationAgent");
    }
}
