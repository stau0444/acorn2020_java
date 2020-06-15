package test.mypac;

//메소드를 하나만쓰도록 강제한다.
@FunctionalInterface
public interface Joinner {
	public String join(String first, String second);
}
