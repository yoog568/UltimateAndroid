/*
 * Copyright (c) 2014. Marshal Chen.
 */

package com.marshalchen.common.uiModule.niftymodaldialogeffects.effects;

import android.view.View;

import com.marshalchen.common.uiModule.nineoldandroids.animation.ObjectAnimator;

/**
 * Created by lee on 2014/7/30.
 */
public class FadeIn extends BaseEffects{

    @Override
    protected void setupAnimation(View view) {
        getAnimatorSet().playTogether(
                ObjectAnimator.ofFloat(view,"alpha",0,1).setDuration(DURATION)

        );
    }
}
