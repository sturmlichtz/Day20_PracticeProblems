package interface2_example;

public interface InterfaceB {
	default void add() {
		System.out.println("add method from Interface B");
	}
	
	void sub();
}
