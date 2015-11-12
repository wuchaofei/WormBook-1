package com.jie.book.app.read;

import android.view.MotionEvent;

public interface MotionEventPointCollector {
	int collectPoints(MotionEvent event, float[] pts);
}
