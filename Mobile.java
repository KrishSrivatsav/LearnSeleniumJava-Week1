package week1.day1;

public class Mobile {
	//Week1Day1Assignment2
	
	public void sendMsg()
	{
		System.out.println("HelloKrish");
	}
	
	private int makeCall()
	{
		int calling = 97978989;
		return calling;
	}
	
	void saveContact(String contactdetails)
	{
		System.out.println(contactdetails);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mob = new Mobile();
		mob.sendMsg();
		int output = mob.makeCall();
		System.out.println(output);
		mob.saveContact("Krish");

	}

}
