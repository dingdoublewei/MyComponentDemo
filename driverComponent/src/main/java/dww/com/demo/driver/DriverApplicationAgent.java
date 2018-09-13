package dww.com.demo.driver;

import android.util.Log;

import com.dww.demo.componentlib.interfaces.IApplication;
import com.luojilab.component.componentlib.router.ui.UIRouter;

/**
 * Created by dww on 2018/7/16.
 */

public class DriverApplicationAgent implements IApplication {
    String TAG = DriverApplicationAgent.class.getSimpleName();

    @Override
    public void onCreate() {
        Log.d(TAG, "onCreate");
    }

    @Override
    public void onTerminate() {
        Log.d(TAG, "onTerminate");
    }
}
