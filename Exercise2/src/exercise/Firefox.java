package exercise;

public class Firefox extends  Browser implements MultipleAccountContainers{
	String url=new String();
	String [] contents=new String[10];
	int i;
	public Firefox() {
		//super.count++;
		// TODO Auto-generated constructor stub
	}
	public void whoAmI() {
		System.out.println("I am Firefox");
	}
	public void addContainer(String url)
	{
		this.url=url;
		contents[i]=url;
		i++;
	}
	public void leaveContainer(String url) {
		for(int j=0;j<i;j++)
		{
			if(url==contents[j])
			{
				for(int k=j+1;k<i;k++)
				{
					contents[k-1]=contents[k];
				}
				System.out.println("Deleted Content:"+url+"\n");
				i--;
			}
		}
	}
	public String[] viewAllcontainer()
	{
		System.out.println("Contents in Container are:");
		for(int j=0;j<i ;j++)
		{
			System.out.println(contents[j]);
		}
	System.out.println();
		return contents;
				
	}
}
