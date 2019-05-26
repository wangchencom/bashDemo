package cn.itcast.dao;

import cn.itcast.pojo.User;

/**
 * 用户操作接口
 * 
 * @author itcast
 * 
 */
public interface UserDao {

	/**
	 * 这是用户登录的功能
	 * 
	 * @param username
	 *            用户名
	 * @param password
	 *            密码
	 * @return 返回登录是否成功
	 */
	public abstract boolean isLogin(String username, String password);

	/**
	 * 这是用户注册的功能
	 * 
	 * @param user
	 *            要注册的用户
	 */
	public abstract void regist(User user);
}