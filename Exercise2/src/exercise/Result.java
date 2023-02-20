package exercise;

public class Result {

	public static void main(String[] args) {
		
		GoogleChrome chromeobject=new GoogleChrome();
		chromeobject.setPermission(true,false,true);
		System.out.println("Location Access :"+chromeobject.isLocationAccessible);
		System.out.println("Camera Access:"+chromeobject.isCameraAccessible);
		System.out.println("Microphone Access:"+chromeobject.isMicrophoneAccessible);
		System.out.println("\n\n");
		System.out.println("Version number:"+chromeobject.versionNumber);
				Browser tabOne= new GoogleChrome();
				Browser tabTwo= new Firefox();
				Browser tabThree= new Firefox();
				Browser tabFour= new GoogleChrome();
				Browser tabFive= new GoogleChrome();
				Browser[] allBrowsers = new Browser[5]; 
				System.out.println("\n\n");
				System.out.println("GoogleChrome object count:"+tabOne.count+"\n");
		MultipleAccountContainers browser= new Firefox();
		browser.addContainer("facebookContainer");
		browser.addContainer("Mails"); 
		browser.addContainer("PrivateBrowsing");     
		String[] containers = browser.viewAllcontainer();
		browser.leaveContainer("Mails");
		containers=browser.viewAllcontainer();
		
	}

}
