package com;

public class Inheritance {
	void food() {
		System.out.println("hello");
	}
}
	class inr1 extends Inheritance{
		void display() {
			System.out.println("hi");
		}
	}
	class inhr2 extends inr1 {
		void work() {
			System.out.println("working");
		}
	}
class MainClass{
	public static void main(String[] args) {
		inhr2 obj=new inhr2();
		obj.display();

	}

}
