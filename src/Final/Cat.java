package Final;

public  class Cat extends Animal implements Pet {

	protected Cat(int legs) {
		super(legs);
		
	}

	public void legs() {
		System.out.println("kediler 4 bacağa sahiptir");
	}

	@Override
	public void getName() {
		this.getName();
		System.out.println("kedimin ismi pamuk");
	}

	

	@Override
	public void setName( ) {
		this.setName() ;
		
	}

	@Override
	public void play() {
		System.out.println("kediler oyun oynar");
	}

	@Override
	public void eat() {
		System.out.println("kediler fare yer");
		
	}

	
}
