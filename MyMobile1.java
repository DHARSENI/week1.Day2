package week1.day2;

public class MyMobile1 {
	String brandName  ;
	float size =20.9f;
	
	public void makeCall()
	{
		System.out.println("making call");
	}
	public void picture()
	{
		System.out.println("picture");
	}
	private void recharge()
	{
		System.out.println("recharge");
	}
	public static void main(String[] args) {
		MyMobile1 obj= new MyMobile1();
		obj.brandName = "apple";
		obj.makeCall();
		obj.picture();
		obj.recharge();
		System.out.println(obj.brandName);
		System.out.println(obj.size);
	}

}
