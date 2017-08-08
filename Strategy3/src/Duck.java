
public abstract class Duck {
	Flybehavior flybehavior;//ตัวแปรคลาส Flybehavior
	Quackbehavior quackbehavior;//ตัวแปรคลาส Quackbehavior
	void performQuack(){
		quackbehavior.quack();
	}
	void performFly(){
		flybehavior.fly();
	}
	void swim(){
		System.out.println("I'm swimming");
	}
	void setFlybehavior(Flybehavior fb){
		flybehavior = fb;
	}
	void setQuackbehavior(Quackbehavior qb){
		quackbehavior =qb;
	}
	abstract void display();
}
