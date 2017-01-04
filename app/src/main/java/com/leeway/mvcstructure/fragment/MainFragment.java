package com.leeway.mvcstructure.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.leeway.mvcstructure.R;

/**
 * Created by Lee Lorz on 1/4/2017.
 */

public class MainFragment extends Fragment {

    int someVar;

    int x, y, z;

    TextView tvHello;

    public static MainFragment newInstance(int someVar) {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        args.putInt("someVar", someVar);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Read from Arguments
        someVar = getArguments().getInt("someVar");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main,
                container, false);
        initInstaces(rootView);
        return rootView;
    }

    private void initInstaces(View rootView) {
        // findViewById
        tvHello = (TextView) rootView.findViewById(R.id.tvHello);
    }

    public void setHelloText(String text) {
        tvHello.setText(text);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // save state here
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (savedInstanceState != null) {
            // restore state here
        }
    }
}
