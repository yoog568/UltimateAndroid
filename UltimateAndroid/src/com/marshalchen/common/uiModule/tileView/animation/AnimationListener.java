package com.marshalchen.common.uiModule.tileView.animation;

import java.util.HashMap;

public interface AnimationListener {
	public void onAnimationStart();
	public void onAnimationProgress(HashMap<String, Double> values);
	public void onAnimationComplete();
}
