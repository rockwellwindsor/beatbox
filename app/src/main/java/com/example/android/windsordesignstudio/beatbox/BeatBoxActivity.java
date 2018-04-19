package com.example.android.windsordesignstudio.beatbox;

import android.support.v4.app.Fragment;

import com.example.android.windsordesignstudio.beatbox.fragment.BeatBoxFragment;

public class BeatBoxActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }
}
