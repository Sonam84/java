package constructor;

public class EmployeeP {
	
	int id;
	String name;
	String designation;
	String location;
	
	EmployeeP (int i, String n, String d, String l)
	{
		id=i;
		name=n;
		designation=d;
		location=l;
				
	}
	
	void display() 
	{
		System.out.println(id+" " +name+" "+designation+" "+location); 
		
		}
	public static void main(String []args) {
		EmployeeP e =new EmployeeP (863,  "Pooja Rawat",  "QA",  "Pune");
		EmployeeP e1 =new EmployeeP (866,  "Bhavna Rawat",  "QA",  "Mumbai");
               
		e.display();
		e1.display();		
	}

}
