package com.Class28;

public interface WebDriver {
	
	
	 void openBrowser();
	 void closeBrowser();
	 void maximizeWindows();
	 void findElement();
}
	
class chromeDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("1");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("2");
	}

	@Override
	public void maximizeWindows() {
		System.out.println("3");
		
	}

	@Override
	public void findElement() {
		System.out.println("4");
		
	}
	
}
	class FireFoxDriver implements WebDriver{

		@Override
		public void openBrowser() {
			System.out.println("5");
			
		}

		@Override
		public void closeBrowser() {
			System.out.println("6");
			
		}

		@Override
		public void maximizeWindows() {
			System.out.println("7");
		}

		@Override
		public void findElement() {
			System.out.println("8");
			
		}
		
}