package cn.itcast_03;

/**
 * �����û���
 * 
 * @author itcast
 */
public class User {
	// �û���
	private String username;
	// ����
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

	// �ж��û���¼�Ƿ�ɹ�
	/*
	 * �������ͣ�boolean ������String username,String password
	 */

	/**
	 * �����ж��û���¼�Ƿ�ɹ��ķ���
	 * 
	 * @param username
	 *            �û���
	 * @param password
	 *            ����
	 * @return ��¼�Ƿ�ɹ�
	 */
	public boolean isLogin(String username, String password) {
		return this.username.equals(username) && this.password.equals(password);
	}
}
