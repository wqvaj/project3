package zero;

public class Person {
	
	public  Person(){
		System.out.println("对象被创建了");
	}
	public void finalize(){
		System.out.println("对象被销毁了");
	}
}
