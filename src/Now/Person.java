package Now;

public class Person {
	public int public_age=20;
	int default_shuju;
	char c='дя';
	public  char public_sex;
	protected  int  protected_mymoney;
	private String private_myhobbys;
	public static  String allpeoplehome="earth";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("hello world");
	}
	public static void eat()
	{
		System.out.println("all people like eat");
	   
	}
	public  int  getAge()
	{
		System.out.println("my age is"+this.public_age);
		return this.public_age;
	}
	protected  String getMyhobbys()
	{
		return this.private_myhobbys;
		
	}
	private void setAge(int age)
	{
		this.public_age=age;
	}
}
	
	