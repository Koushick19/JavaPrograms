package Treeset;

public class Employees implements Comparable
{
	String name;
	int empid;
	
	public Employees(String name,int empid) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.empid=empid;
	}
	
	public String toString()
	{
		return name + "-->" + empid;
	}
	

	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		int empid1 = this.empid;
		Employees e =(Employees)obj;
		int empid2 = e.empid;
		if(empid1<empid2)
		{
		return -1;
		}
		else if(empid1>empid2)
		{
			return +1;
		}
		else
		{
			return 0;
		}
	}
	
	

}
