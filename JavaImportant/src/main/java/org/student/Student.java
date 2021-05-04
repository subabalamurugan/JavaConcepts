package org.student;
import org.department.Department;
public class Student extends Department
{
	public static void main(String[] args)
	{
		   Student s=new Student();  
		   studentName();
		   studentDept();
		   studentId();
		   s.deptName();
		   s.collegeName();
		   s.collegeCode();
		   s.collegeRank();		   	   
    }
	public static void studentName()
	{
		System.out.println("Student Name : Subbulaksmi");
	}
	public static void studentDept()
	{
		System.out.println("Department Name : MCA ");
	}
	public static void studentId()
	{
		System.out.println("Department Id : 0325 ");
	}
}