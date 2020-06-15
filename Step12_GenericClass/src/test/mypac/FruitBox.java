package test.mypac;

/*<generic type>
//타입을 그때그떄 바꿀수있게 지정할수있다 
//
//public class FruitBox {
//	//필드 
//	private Apple item;
//	public void push(Apple item) {
//		this.item=item;
//	}
//	public Apple pull() {
//		return item;
//	}
 * 클래스를 정의 할 때 generic type을 지정해서 특정 type을 동적으로 지정할 수 있
*/
public class FruitBox<T>{
	//필드 
	private T item;
	public void push(T item) {
		this.item=item;
	}
	public T pull() {
		return item;
	}
}

