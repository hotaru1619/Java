package day08;

import day07.Animal;

public class Test01 {
	public static void main(String[] args) {
		Animal a = new Animal();
		//System.out.println(a.kind);
		//a.kind 접근불가 default=> same package에서만
		//public 붙이면  public String kind라면 접근 가능
	}
}

class Dog2 extends Animal{
	public void print(){
		//System.out.println(super.kind); 
		//Animal class에서 String kind인 상태에선 접근 불가
		//protected String kind라면 접근 가능
	}
}