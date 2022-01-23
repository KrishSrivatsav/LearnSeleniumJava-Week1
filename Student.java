package week1.day1;

public class Student {
	
	//Week1Day1Assignment1
	
	//Globalvariable..
	String name = "Krish";
	int rollNo = 3241;
	
	public String College()
	{
		String collegeName = "St.Joseph's";
		//System.out.println(collegeName);
		return collegeName;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating objects..
		Student stu = new Student();
		String collegeDetails = stu.College();
		System.out.println(collegeDetails);
		String output = stu.name;
		System.out.println(output);
		int output1 = stu.rollNo;
		System.out.println(output1);

	}

}
