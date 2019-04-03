package com.Class12;

public class Phone {

	
		
		
		String screen ;
		boolean camera;
		int botton, pad;
		
		public static void main(String[] args) {
		
		Phone iphone=new Phone();
		
		iphone.screen="touchScreen";
		iphone.camera=true;
		iphone.botton=4;
		iphone.pad=1;
		
		
		iphone.tapeVideo();
		iphone.sendMessage();
		iphone.takePicture();
		
        Phone Android=new Phone();
		
		Android.screen="touchScreen";
		Android.camera=true;
		Android.botton=4;
		Android.pad=1;
		
		
		Android.tapeVideo();
		Android.sendMessage();
		Android.takePicture();
		
		
		 Phone Nokia=new Phone();
			
			Nokia.screen="touchScreen";
			Nokia.camera=true;
			Nokia.botton=4;
			Nokia.pad=1;
			
			
			Nokia.tapeVideo();
			Nokia.sendMessage();
			Nokia.takePicture();
		}
		
		void tapeVideo() {
			
			System.out.println("we can tape a vidoe");
		}
		
		void sendMessage() {
			System.out.println("we can send messages");	
		}
		void takePicture() {
			System.out.println("we can take picture");
		}

}
