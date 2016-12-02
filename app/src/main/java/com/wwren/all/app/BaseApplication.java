package com.wwren.all.app;

import android.app.Application;

public class BaseApplication extends Application{

	public void onCreate() {
		super.onCreate();
		AppData.init(this);
	}
}