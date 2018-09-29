package com.szw.controller;

import java.util.ArrayList;
import java.util.HashMap;

public class ss {
	public static void main(String[] args) {
		try {
/*			shuiXu shuiXu = new shuiXu();
			shuiXu.aa();
			ArrayList<Object> arrayList = new ArrayList<>();
			arrayList.add("index-0-的元素");
			System.out.println(arrayList.get(0));
			System.out.println(arrayList.get(5));//测试有异常会不会报错
			System.out.println(arrayList.get(0));*/
/*		String ss[] = {"a","c","a","b","a","a","f","f","c","v","r","b","b"};
		HashMap<String, ArrayList<Object>> hashMap = new HashMap<>();
		for (int i = 0; i < ss.length; i++) {
			ArrayList<Object> arrayList = new ArrayList<>();
			for (int j = 0; j < ss.length; j++) {
				if(ss[i]==ss[j]) {
					arrayList.add(j);
					hashMap.put(ss[i],arrayList);
				}
			}
		}*/
		//System.out.println(hashMap.toString());	
			final StringBuffer stringBuffer = new StringBuffer();
			stringBuffer.append("dsfsdf");
			stringBuffer.append(123);
			System.out.println(stringBuffer);
			final String aa = new String("fsdfds");
			System.out.println(aa);
		} catch (Exception e) {
			System.out.println("有异常");
		}
	}
}
