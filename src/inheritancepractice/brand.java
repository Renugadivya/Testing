package inheritancepractice;
//child class
public class brand extends mobile {
	public void brandName() {
		System.out.println("apple");
	}
public static void main(String args[]) {
	//className objectName=new className();
	brand a=new brand();
	//objectname.methodname();
	a.brandName();
	a.mobileName();
}
}
