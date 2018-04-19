package com.example.android.windsordesignstudio.beatbox;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Rockwell Windsor Rice on 4/19/18.
 */

public abstract class SingleFragmentActivity extends AppCompatActivity {

    protected abstract Fragment createFragment();

    @LayoutRes
    protected int getLayoutResId() {
        return R.layout.activity_fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the view to be inflated by activity_fragment.xml
        setContentView(getLayoutResId());

        FragmentManager fm = getSupportFragmentManager();

        // Look for the fragment in FragmentManager...
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        // ...and if it does not exist create one.
        if (fragment == null) {
            fragment = createFragment();
            fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
        }
    }
}