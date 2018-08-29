package com.proxy.inter;

public class LiuDeHua implements Person {

	public String sing(String name) {
		// TODO Auto-generated method stub
		System.err.println("刘德华唱歌"+name);
		return "完毕，谢谢大家";
	}

	public String dance(String name) {
		System.err.println("刘德华跳舞"+name);
		return "完毕谢谢大家 ";
	}

}
