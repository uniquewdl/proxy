package com.proxy.inter;

public class ProxyTest {

	/**
	 * @Title: main
	 * @Description: TODO
	 * @param args
	 *            void
	 * @author mars
	 * @throws InterruptedException 
	 * @date 2018-8-28上午10:32:19
	 */
	public static void main(String[] args) throws InterruptedException {
		LiuDeHuaProxy proxy = new LiuDeHuaProxy();
		// 获取代理对象
		Person person = proxy.getProxy();
		String retValue = person.sing("冰雨");
		System.err.println(retValue);
		//調用跳舞
	//	Thread.sleep(1000);
		String dance = person.dance("江南");
		System.err.println(dance);
		System.err.println(new LiuDeHua().getClass().getInterfaces()[0]);
		
	}

}
