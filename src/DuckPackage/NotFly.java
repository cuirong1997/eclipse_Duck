package DuckPackage;

public class NotFly implements FlyBehavior{
	public void fly(){
		System.out.print("鸭子的起飞方式为：");
		System.out.println("此品种鸭子不会飞");
	}

}
