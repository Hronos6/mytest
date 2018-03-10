package cn.itcast;

public class test1 {

	

	public static void main(String[] args) {
		Integer var1 =new Integer(1);
		Integer var2=var1;
		doSomething(var2);
		System.out.println(var1.intValue());
		System.out.println(var1==var2);
		
		
	}
	
	
	public static void doSomething(Integer integer){
		integer=new Integer(2);
	}
}
