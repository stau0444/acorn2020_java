package test.human;

public class Man extends Person {
	

	

	public Man(Blood blood, Sex sex) {
		super(blood, sex);
		
	}

	public void seeMovie() {
		System.out.println(this.sex.getSex()+"가 영화봐요");
	}
}
