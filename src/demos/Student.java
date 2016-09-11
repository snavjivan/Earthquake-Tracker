package demos;

/** A class to store information about a Student
 */
public class Student extends Person
{
	public Student(String name)  {
		super(name);
	}

	public boolean isAsleep( int hr ) // override 
	{ 
		return 2 < hr && 8 > hr; 
	}
	
	public static void main(String[] args)
	{
		Person p;
		p = new Student("Sally");
		p.status(1);
	}
}
