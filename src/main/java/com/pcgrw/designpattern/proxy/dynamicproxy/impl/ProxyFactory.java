package com.pcgrw.designpattern.proxy.dynamicproxy.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理工厂（利用JDK的API）
 * @author panchao
 *
 */
public class ProxyFactory {
	//维护一个目标对象
	private Object target;

	public ProxyFactory(Object target) {
		super();
		this.target = target;
	}

	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}
	
	//给目标对象生成一个代理对象
	public Object getProxyInstance(){
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("事务开始(动态代理)...");
				//执行目标对象方法
				Object returnValue = method.invoke(target, args);
				System.out.println("提交事务(动态代理)...");
				return returnValue;
			}
		});
	}
}
