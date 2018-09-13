package dww.com.demo.depart.serviceimlp;


import android.app.Fragment;

import com.dww.demo.componentservice.ui.FragmentService;

import dww.com.demo.depart.ui.OrderFragment;

/**
 * Created by dww on 2018/7/16.
 */

public class FragmentServiceImpl implements FragmentService {
    @Override
    public Fragment getOrderFragment() {
        return new OrderFragment();
    }
}
