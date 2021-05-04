package studentinformation;

	public class Studentdetails
	{
	  public void getStudentInfo(int id)
	  {
	    System.out.println("Student Id  is :"+id);		
	  }
	  public void getStudentInfo(int id,String name)
	  {
		  System.out.println("Student ID  : " +id);
		  System.out.println("Student Name  : " +name);
	  }
	  public void getStudentInfo(String email,long phnum)
	  { 
		  System.out.println("Email  : "+email);
		  System.out.println("Phone Number  :"+phnum);
	  }
	  public static void main(String args[])
	  {
		  Studentdetails sdetails=new Studentdetails();
		  sdetails.getStudentInfo(27);
		  sdetails.getStudentInfo(23,"suba");
		  sdetails.getStudentInfo("laksmhi.pers@gmail.com",989477177);
		  
	  }
	}