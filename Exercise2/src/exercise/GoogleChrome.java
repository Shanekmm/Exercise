package exercise;

public class GoogleChrome extends Browser {
	final String versionNumber ="1.0";
	boolean isLocationAccessible;
	boolean isCameraAccessible;
	boolean isMicrophoneAccessible;
	public GoogleChrome() {
		// TODO Auto-generated constructor stub
		super.count++;
	}
	public void whoAmI() {
		System.out.println("I am Google chrome");
	}
	public void setPermission(boolean isLocationAccessible,boolean isCameraAccessible,boolean isMicrophoneAccessible)
	{
		this.isCameraAccessible=isCameraAccessible;
		this.isLocationAccessible=isLocationAccessible;
		this.isMicrophoneAccessible=isMicrophoneAccessible;
	}
	public void setPermission(boolean Access)
	{
		this.isCameraAccessible=Access;
		this.isLocationAccessible=Access;
		this.isMicrophoneAccessible=Access;
	}

}
