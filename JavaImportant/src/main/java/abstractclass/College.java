package abstractclass;

public class College extends University{

public static void main(String[] args) {
	College col= new College();
			col.ug();
	        col.pg();
}

@Override
public void ug() 
 {	
	System.out.println("UG :Under Graduate Degree");
 }
}