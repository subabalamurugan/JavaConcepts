
package abstractclass;

public  class Desktop implements SoftWare,HardWare
{

	public void softwareResource()
	{		
		System.out.println("Software Resource");
	}

	public void hardwareResource() 
	{		
		System.out.println("Hardware Resource");
	}

	public void desktopModel()
	{
	   System.out.println("Desktop Model");
	}
  public static void main(String[] args)
  {
	Desktop d = new Desktop();
	d.hardwareResource();
	d.softwareResource();
	d.desktopModel();
  }	
} 