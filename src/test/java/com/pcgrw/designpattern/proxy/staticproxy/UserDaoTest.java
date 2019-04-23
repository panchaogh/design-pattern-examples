package com.pcgrw.designpattern.proxy.staticproxy;

import org.junit.*;
import com.pcgrw.designpattern.proxy.staticproxy.impl.UserDaoImpl;
import com.pcgrw.designpattern.proxy.staticproxy.impl.UserDaoImplProxy;

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
		//代理对象
		UserDaoImplProxy proxy = new UserDaoImplProxy(target);
		//执行的是代理方法
		proxy.save();
	}

}
