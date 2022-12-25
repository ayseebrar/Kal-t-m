package Final;

public class Fish extends Animal implements Pet{
	
	protected Fish(int legs) {
		super(legs);
		
	}

	

	@Override
	public void getName() {
		this.getName();
		
	}

	@Override
	public void setName() {
		this.setName();
		
	}

	@Override
	public void play() {
		System.out.println("balıklar suda oyun oynar");
	}

	@Override
	public void eat() {
		System.out.println("balıkalar yem yer");
		
	}

	public void walk() {
		System.out.println("balıklar yürüyemez yüzerler");
	}
}
