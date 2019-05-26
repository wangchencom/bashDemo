package cn.itcast.dao;

import cn.itcast.pojo.User;

/**
 * �û������ӿ�
 * 
 * @author itcast
 * 
 */
public interface UserDao {

	/**
	 * �����û���¼�Ĺ���
	 * 
	 * @param username
	 *            �û���
	 * @param password
	 *            ����
	 * @return ���ص�¼�Ƿ�ɹ�
	 */
	public abstract boolean isLogin(String username, String password);

	/**
	 * �����û�ע��Ĺ���
	 * 
	 * @param user
	 *            Ҫע����û�
	 */
	public abstract void regist(User user);
}