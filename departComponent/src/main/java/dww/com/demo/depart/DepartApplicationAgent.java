package dww.com.demo.depart;

import android.util.Log;

import com.dww.demo.componentlib.interfaces.IApplication;
import com.dww.demo.componentlib.router.Router;
import com.dww.demo.componentservice.ui.FragmentService;
import com.luojilab.component.componentlib.router.ui.UIRouter;

import dww.com.demo.depart.serviceimlp.FragmentServiceImpl;

/**
 * Created by dww on 2018/7/13.
 */

public class DepartApplicationAgent implements IApplication {
    Router router = Router.getInstance();
    UIRouter uiRouter = UIRouter.getInstance();
    String TAG = DepartApplicationAgent.class.getSimpleName();

    @Override
    public void onCreate() {
        uiRouter.registerUI("depart");
        router.addService(FragmentService.class.getSimpleName(), new FragmentServiceImpl());
        Log.d(TAG, "onCreate");
    }

    @Override
    public void onTerminate() {
        uiRouter.unregisterUI("depart");
        router.removeService(FragmentService.class.getSimpleName());
        Log.d(TAG, "onTerminate");
    }
}
