package test.human;

public class Woman extends Person {
	
	public Woman(Blood blood, Sex sex) {
		super(blood, sex);
		
	}

	public void reading() {
		System.out.println(this.sex.getSex()+"가 책읽어요");
	}


}
