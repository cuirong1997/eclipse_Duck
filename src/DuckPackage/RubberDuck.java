package DuckPackage;

public class RubberDuck extends Duck{
	public RubberDuck(){
		quackBehavior=new NotQuack();
		flyBehavior=new NotFly();
	}

}
