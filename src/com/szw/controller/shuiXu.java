package com.szw.controller;


public class shuiXu {
	public shuiXu() {
		System.out.println("构造方法");
	}
	static {
		System.out.println("静态代码块");
	}
	public void aa() {
		System.out.println("普通方法");
	}
	{
		System.out.println("非静态代码块");
	}
}
