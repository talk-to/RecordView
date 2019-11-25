package com.devlomi.record_view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

/**
 * Created by Devlomi on 13/12/2017.
 */

public class ScaleAnim {
    private View view;
    public ScaleAnim(View view) {
        this.view = view;
    }


    void start() {
        AnimatorSet set = new AnimatorSet();
        set.start();
    }

    void stop() {
        AnimatorSet set = new AnimatorSet();
        set.start();
    }
}