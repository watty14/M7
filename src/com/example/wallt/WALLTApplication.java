package com.example.wallt;

import android.app.Application;

import com.parse.Parse;

public class WALLTApplication extends Application {
	
	public void onCreate() {
		  Parse.initialize(this, "Cnmqzdi7YSCSGPBixx11Mjvu6tF8mpzTZ9yObsM1",
				  "xeJa7O6dzR8oulCfD31cmUwI3frlngCFSY1jSEr8");
		}

}
