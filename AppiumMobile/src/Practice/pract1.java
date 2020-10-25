package Practice;

import java.lang.*;
//import java.util.Random;

public class pract1 
{
     
	public static void main(String[] args)
    {
       Student s1= new Student("Navin",23);
       Student s2= new Student("Naveen",26);
       Student s3= new Student("Sonu",28);
       Student s4= new Student("tinu",16);
       Student[] stud=new Student[4];
       stud[0]=s1;
       stud[1]=s2;
       stud[2]=s3;
       stud[3]=s4;
       for (Student s:stud)
       {
    	   System.out.println(s);
       }
//       Random r= new Random();
//       int a[]=new int[30];
//       for(int i=0;i<a.length;i++)
//       {
//    	   a[i]=r.nextInt(30);
//       }
//       for (int i:a)
//       {
//    	   System.out.println(i);
//       }
        int x[]= {3,4,5,6};
        int y[]= {4,5,6,7};
        int z[]= {9,8,6,4};
        int  p[][]= {
        		{3,4,5,6},
        		{4,5,6,7},
        		{9,8,6,4}
        		};
        for (int i=0;i<3;i++)
        {
        	for (int j=0;j<4;j++)
        	{
        		System.out.print(p[i][j]+" ");
        	}
			   System.out.println();
        }
        
        
     }
}

class Student 
{
	String sname;
	int rollno;
	 
	public Student(String sname,int rollno)
	{
		this.sname=sname;
		this.rollno=rollno;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + ", rollno=" + rollno + "]";
	}
	

   public static void arraycopy() {}
}

