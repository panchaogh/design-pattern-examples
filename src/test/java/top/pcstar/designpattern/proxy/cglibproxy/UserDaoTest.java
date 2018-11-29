package top.pcstar.designpattern.proxy.cglibproxy;

import org.junit.*;

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
		UserDao target = new UserDao();
		//生成代理对象
		UserDao proxy = (UserDao) new ProxyFactory(target).getProxyInstance();
		//执行的是代理方法
		proxy.save();
	}

}
