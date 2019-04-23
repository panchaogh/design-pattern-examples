package com.pcgrw.designpattern.proxy.dynamicproxy;

import org.junit.*;
import com.pcgrw.designpattern.proxy.dynamicproxy.impl.ProxyFactory;
import com.pcgrw.designpattern.proxy.dynamicproxy.impl.UserDaoImpl;

public class UserDaoTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSave() {
		//目标对象
		UserDaoImpl target = new UserDaoImpl();
		//生成代理对象
		UserDao proxy = (UserDao) new ProxyFactory(target).getProxyInstance();
		//执行的是代理方法
		proxy.save();
	}

}
