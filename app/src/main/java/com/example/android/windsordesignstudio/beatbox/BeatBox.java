package com.example.android.windsordesignstudio.beatbox;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.IOException;

/**
 * Created by Rockwell Windsor Rice on 4/19/18.
 */

public class BeatBox {
    private static final String TAG = "BeatBox";
    private static final String SOUNDS_FOLDER = "sample_sounds";

    /*
    *  Assets are accessed using the AssetManager class
    *  You can get an AssetManager from any context
    */
    private AssetManager mAssets;

    public BeatBox(Context context) {
        mAssets = context.getAssets();
        loadSounds();
    }

    private void loadSounds() {
        String[] soundNames;

        try {
            soundNames = mAssets.list(SOUNDS_FOLDER);
            Log.i(TAG, "Found " + soundNames.length + " sounds.");
        } catch(IOException ioe) {
            Log.e(TAG, "Could not list any sounds.");
            return;
        }
    }
}
