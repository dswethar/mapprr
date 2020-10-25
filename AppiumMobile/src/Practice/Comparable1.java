package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

 class Stud implements Comparable<Stud>
{
	int rollno,marks;
	String name;
	public Stud(int rollno, String name, int marks) 
	{
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() 
	{
		return "Stud [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Stud s) 
	{
		
		return marks>s.marks?1:-1;
	}
	
}


public class Comparable1
{

	public static void main(String[] args) 
	{
		List<Stud> stud = new ArrayList<Stud>();
		stud.add(new Stud(23,"Ravi",533));
		stud.add(new Stud(26,"Sudharavi",453));
		stud.add(new Stud(24,"Swetha",999));
		stud.add(new Stud(29,"t2",876));
		stud.add(new Stud(25,"ramya",643));
		Collections.sort(stud);
		for (Stud s:stud)
		{
			System.out.println(s);
		}

	}

}


