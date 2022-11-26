
//Interface 
public interface Features 
{
  void fly();
  void run();
  void sing();
  void dance();
}

//partially Implementing class so it becomes Abstract
public abstarct class IIT implements Features {
	@Override
	public void fly() {
		System.out.println("flying....");
	}

	@Override
	public void run() {
		System.out.println("running....");
	}
}

//Inherting the abstarct class to implemnet unimplemeneted methods
public class MIT extends IIT
{
  @Override
	public void sing() {
		System.out.println("sing.....");
	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		System.out.println("dance...");
	}
}

//Driver class
public class Control
{
  public static Features obj=null;     
	public static void main(String[] args) 
  {
		// TODO Auto-generated method stub
	  obj = new MIT();
		obj.fly();
		obj.run();
		obj.sing();
		obj.dance();
	}

}
