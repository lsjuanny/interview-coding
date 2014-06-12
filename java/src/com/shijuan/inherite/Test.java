package com.shijuan.inherite;

public class Test{
	public static void main(String[] args){
		go(new MyBase());
	}
	static void go(Base base){
		base.add(8);
	}
}
class Base {
	int i;
	Base() {
		add(1);
		System.out.println(i + "---base");
	}
	public void add(int v){
		i+=v;
		System.out.println(i);
	}
	void print(){
		System.out.println(i);
	}
}

class MyBase extends Base{
	 MyBase() {
	   add(2);
	   System.out.println(i + "---mybase");
	}
	public void add(int v){
	 i+=v*2;
	 System.out.println(i);
	}
}
