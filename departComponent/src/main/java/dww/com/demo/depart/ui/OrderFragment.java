package dww.com.demo.depart.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import dww.com.demo.depart.R;

/**
 * Created by dww on 2018/7/16.
 */

public class OrderFragment extends Fragment {

    private View rootView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (rootView == null) {
            rootView = inflater.inflate(R.layout.depart_frag_order, container, false);
        }
        initView(rootView);
        return rootView;
    }

    private void initView(View rootView) {
        rootView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "OrderFragment", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
