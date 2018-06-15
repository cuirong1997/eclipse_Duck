package DuckPackage;

public class RedHeadDuck extends Duck{
	public RedHeadDuck(){
		quackBehavior=new Squack();
		flyBehavior=new FlyWithRocket();
	}

}
