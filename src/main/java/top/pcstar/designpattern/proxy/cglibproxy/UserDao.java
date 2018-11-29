package top.pcstar.designpattern.proxy.cglibproxy;
/**
 * 目标类,实现任何接口
 * @author panchao
 *
 */
public class UserDao {
	public void save() {
		System.out.println("用户信息保存！");
	}
}
