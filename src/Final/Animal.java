package Final;

public abstract class Animal {
protected int legs;

protected Animal(int legs) {
	super();
	this.legs = legs;
}
public void walk() {
	System.out.println("bazı hayvanlar bacakları ile yürür");
}
public abstract void eat() ;
	

}
