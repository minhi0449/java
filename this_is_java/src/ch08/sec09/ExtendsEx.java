package ch08.sec09;

public class ExtendsEx {
	public static void main(String[] args) {
		InterfaceImpl impl = new InterfaceImpl();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodC();
		System.out.println();
		
	}
}
