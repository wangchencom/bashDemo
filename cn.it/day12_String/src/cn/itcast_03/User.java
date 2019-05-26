package cn.itcast_03;

/**
 * 这是用户类
 * 
 * @author itcast
 */
public class User {
	// 用户名
	private String username;
	// 密码
	private String password;

	public User() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// 判断用户登录是否成功
	/*
	 * 返回类型：boolean 参数：String username,String password
	 */

	/**
	 * 这是判断用户登录是否成功的方法
	 * 
	 * @param username
	 *            用户名
	 * @param password
	 *            密码
	 * @return 登录是否成功
	 */
	public boolean isLogin(String username, String password) {
		return this.username.equals(username) && this.password.equals(password);
	}
}
