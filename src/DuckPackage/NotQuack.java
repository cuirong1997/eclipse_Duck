package DuckPackage;

public class NotQuack implements QuackBehavior {
	public void quack(){
		System.out.print("鸭子的叫声为：");
		System.out.println("该种类鸭子不会叫");
	}

}
