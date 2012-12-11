package com.example.servicelifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends Service {

	@Override
	public void onCreate () {
		System.out.println("venky oncreate");

		super.onCreate();
	}

	@Override
	public void onStart (Intent intent, int startId) {
		System.out.println("venky onstart");
		super.onStart(intent, startId);
	}

	@Override
	public void onDestroy () {
		System.out.println("venky destroy");
		super.onDestroy();
	}

	@Override
	public void onRebind (Intent intent) {
		System.out.println("venky onrebind");
		super.onRebind(intent);
	}

	@Override
	public int onStartCommand (Intent intent, int flags, int startId) {
		System.out.println("venky onstartcommand");
		return super.onStartCommand(intent, flags, startId);
	}

	/*
	 * @Override public void onTrimMemory (int level) { // TODO Auto-generated method stub super.onTrimMemory(level); }
	 * 
	 * @Override public void onTaskRemoved (Intent rootIntent) { // TODO Auto-generated method stub super.onTaskRemoved(rootIntent); }
	 */
	@Override
	public boolean onUnbind (Intent intent) {
		System.out.println("venky onubind");
		return super.onUnbind(intent);
	}

	@Override
	public void onLowMemory () {
		System.out.println("venky onlow memory");
		super.onLowMemory();
	}

	@Override
	public IBinder onBind (Intent intent) {
		System.out.println("venky onbind");
		return null;
	}

}
