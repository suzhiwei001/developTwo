package com.szw.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.http.HttpServletResponse;

import com.szw.controller.ExportExcelController;
import com.szw.service.ConcreteClass;
import com.szw.service.ProxyHandler;
import com.szw.service.TargetInterface;

public class MainTest {
	public static void main(String[] args) {
        ConcreteClass c=new ConcreteClass();//元对象(被代理对象)  
        InvocationHandler ih=new ProxyHandler(c);//代理实例的调用处理程序。  
        //创建一个实现业务接口的代理类,用于访问业务类(见代理模式)。  
        //返回一个指定接口的代理类实例，该接口可以将方法调用指派到指定的调用处理程序，如ProxyHandler。  
        TargetInterface targetInterface=  
            (TargetInterface)Proxy.newProxyInstance(c.getClass().getClassLoader(),c.getClass().getInterfaces(),ih);  
        //调用代理类方法,Java执行InvocationHandler接口的方法.  
        int i=targetInterface.targetMethodA(5);  
        System.out.println(i);  
        System.out.println();  
        int j=targetInterface.targetMethodB(15);  
        System.out.println(j); 
        
        Set<Object> hashSet = new HashSet<>();
        hashSet.add(123);
        hashSet.add(666);
        hashSet.add(123);
        hashSet.add(123);
        hashSet.add(124);
        hashSet.add(121);
        hashSet.add(97);
        hashSet.add(99);
        hashSet.add(98);
        System.out.println("set中的数据："+hashSet.toString());
/*        List<Integer> list = new ArrayList<>();
        for (final Integer setVal : hashSet) {
        	list.add(setVal);
		}
        System.out.println("List中的数据："+list.toString());
        Collections.sort(list);
        System.out.println("排序后的List中的数据："+list.toString());*/
        TreeSet<Object> treeSet = new TreeSet<Object>(hashSet);
        System.out.println(treeSet.toString());
         int a = 0xFFFFFFF1;
         int b = ~a;
         System.out.println(a);
         System.out.println(b);

	
	}
	public void ss (HttpServletResponse response) {
        ExportExcelController exportExcelController = new ExportExcelController();
        exportExcelController.exportList(response,"1");
	}
}
