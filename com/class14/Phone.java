package com.class14;

public class Phone {
	boolean touchscreen,keyboard, camera;
	int screensize, memory;
	String brand,browser;
	
	public static void main (String [] args) {
		Phone ph1=new Phone();
		ph1.touchscreen=true;
		ph1.keyboard=true;
		ph1.camera=true;
		ph1.screensize=4;
		ph1.memory=16;
		ph1.brand="Apple";
		ph1.browser="Safari";
		ph1.makeCalls();
		ph1.playMusic();
		ph1.downloadVideos();
		
			
		Phone ph2=new Phone();
		ph2.touchscreen=true;
		ph2.keyboard=true;
		ph2.camera=true;
		ph2.screensize=4;
		ph2.memory=16;
		ph2.brand="Samsung";
		ph2.browser="Google Chrome";
		ph2.makeCalls();
		ph2.playMusic();
		ph2.downloadVideos();
		
		
		Phone ph3=new Phone();
		ph3.touchscreen=false;
		ph3.keyboard=true;
		ph3.camera=true;
		ph3.screensize=4;
		ph3.memory=16;
		ph3.brand="Nokia";
		ph3.browser="Unknown";
		ph3.makeCalls();
		ph3.playMusic();
		ph3.downloadVideos();
		
	}
	void makeCalls() {
		System.out.println("We can make calls with our phone "+brand);
	}
	void playMusic() {
		System.out.println("We can play music on our phone "+brand);
	}
	void downloadVideos() {
		System.out.println("We can download videos on our phone  "+brand);
	}
	
		
		
		
	}
	



