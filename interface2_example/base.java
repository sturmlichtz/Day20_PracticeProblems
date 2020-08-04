package interface2_example;

public class base implements InterfaceA, InterfaceB {
	@Override
	public void sub() {
		System.out.println("Interface B sub method");
	}

	@Override
	public void add() {
		InterfaceA.super.add();
		InterfaceB.super.add();
		
	}

}
