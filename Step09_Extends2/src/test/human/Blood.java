package test.human;
/*
 * 필드를 선언하고 나서 get을 타이핑후 ctrl+space 키를 누르면
 * 이클립스가 getter 메소드를 자동으로 만들어 줄 준비를 한다.
 */
public class Blood {
	
	private String rh;
	private String type;
	
	//생성자
	public Blood(String rh,String type) {
		this.rh=rh;
		this.type=type;
	}
	//필드에 저장된 rh를 리턴해주는 getter메소드
	public String getRh() {
		return rh;
	}
	//필드에 저장된 type을 리턴해주는 getter메소드
	public String getType() {
		return type;
	}

	public void setRh(String rh) {
		this.rh = rh;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
//외부에서 get Rh를 요청하면 this.rh를 리턴해준다.
//private의 범위는 static 일경우 클래스 안을 말하고
//아닐경우 생성한 객체안을 말한다.