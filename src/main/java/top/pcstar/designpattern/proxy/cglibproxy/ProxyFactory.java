package top.pcstar.designpattern.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理工厂（Cglib子类代理工厂）
 * 对UserDao在内存中动态构建一个子类对象
 * @author panchao
 *
 */
public class ProxyFactory implements MethodInterceptor {
	//维护目标对象
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

	//给目标对象创建一个代理对象
	/**
	 * @return
	 */
	public Object getProxyInstance(){
		//1工具类
		Enhancer enhancer = new Enhancer();
		//2设置父类
		enhancer.setSuperclass(target.getClass());
		//3设置回调函数
		enhancer.setCallback(this);
		//4创建子类（代理对象）
		return enhancer.create();
	}

	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		System.out.println("开始事务(cglib代理)...");
		//执行目标对象方法
		Object returnValue = arg1.invoke(target, arg2);
		System.out.println("提交事务(cglib代理)...");
		return returnValue;
	}

}
