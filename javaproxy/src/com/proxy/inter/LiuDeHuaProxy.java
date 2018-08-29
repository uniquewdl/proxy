package com.proxy.inter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.cert.LDAPCertStoreParameters;

public class LiuDeHuaProxy {
		// TODO Auto-generated constructor stu
		LiuDeHua ldh=new LiuDeHua();
	/**
	 * 設計自方法生成代理對象
	* @Title: getProxy 
	* @Description: TODO 
	* @return Person
	* @author mars
	* @date 2018-8-28上午10:25:00
	 */
	public Person getProxy(){
		return (Person) Proxy.newProxyInstance(LiuDeHuaProxy.class.getClassLoader(),ldh.getClass().getInterfaces(),new InvocationHandler() {
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				if(method.getName().equals("sing")){
					System.out.println("调用sing方法我是他的经纪人，唱歌先给十万元 ");
					return method.invoke(ldh, args);
				}
				if(method.getName().equals("dance")){
					System.out.println("调用dance方法我是他经纪人，跳舞要给二十万");
					return method.invoke(ldh, args);
				}
				return null;
			}
		});
}
}
