package 简易qq;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class QqFrameDome {
	private Frame landFrame;
	private Label user;
	private Label password;
	private TextField userText;
	private TextField passwordText;
	private Button land;
	private Button register;
	private File peiZhiFile;

	QqFrameDome() {
		start();
	}

	public void start() {
		peiZhiFile = new File(
				"配置文件.txt");
		if (!peiZhiFile.exists()) {
			try {
				peiZhiFile.createNewFile();
			} catch (IOException lll) {
				throw new RuntimeException("配置文件创建失败");
			}
		}
		landFrame = new Frame("老马的盗版QQ");
		landFrame.setBounds(400, 300, 300, 200);
		landFrame.setResizable(false);
		landFrame.setLayout(new FlowLayout());
		user = new Label("用户");
		password = new Label("密码");
		userText = new TextField(30);
		passwordText = new TextField(30);
		passwordText.setEchoChar('*');
		land = new Button("登陆");
		register = new Button("注册");
		landFrame.add(user);
		landFrame.add(userText);
		landFrame.add(password);
		landFrame.add(passwordText);
		landFrame.add(land);
		landFrame.add(register);
		myEvent();
		landFrame.setVisible(true);
	}

	public void myEvent() {
		landFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		land.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (peiZhiFile.length() == 0) {
					final Dialog tiShi2 = new Dialog(landFrame, "提示", true);
					tiShi2.setBounds(475, 350, 150, 100);
					tiShi2.setLayout(new FlowLayout());
					Label la2 = new Label(
							"用户" + userText.getText() + "不存在，请注册", Label.CENTER);
					Button ok2 = new Button("确定");
					tiShi2.add(la2);
					tiShi2.add(ok2);
					tiShi2.addWindowListener(new WindowAdapter() {
						public void windowClosing(WindowEvent be) {
							tiShi2.setVisible(false);
						}
					});
					ok2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent fe) {
							tiShi2.setVisible(false);
						}
					});
					tiShi2.setVisible(true);
				} else {
					FileReader fr = null;
					try {
						fr = new FileReader(peiZhiFile);
						Properties pro = new Properties();
						pro.load(fr);
						Set<Object> set = pro.keySet();
						Iterator<Object> it = set.iterator();
						String st = null;
						while (it.hasNext()) {
							st = (String) it.next();
							if (userText.getText().equals(st)) {
								break;
							}
						}
						if (userText.getText().equals(st)) {
							if (passwordText.getText().equals(
									pro.getProperty(st))) {
								landFrame.setVisible(false);

								new ThreadDome();
							} else {
								final Dialog tiShi1 = new Dialog(landFrame,
										"提示", true);
								tiShi1.setBounds(475, 350, 150, 100);
								tiShi1.setLayout(new FlowLayout());
								Label la1 = new Label("密码错误，请重新输入",
										Label.CENTER);
								Button ok1 = new Button("确定");
								tiShi1.add(la1);
								tiShi1.add(ok1);
								tiShi1.addWindowListener(new WindowAdapter() {
									public void windowClosing(WindowEvent je) {
										tiShi1.setVisible(false);
									}
								});
								ok1.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent ke) {
										tiShi1.setVisible(false);
									}
								});
								tiShi1.setVisible(true);
							}
						} else {
							final Dialog tiShi = new Dialog(landFrame, "提示",
									true);
							tiShi.setBounds(475, 350, 150, 100);
							tiShi.setLayout(new FlowLayout());
							Label la = new Label("用户" + userText.getText()
									+ "不存在，请注册", Label.CENTER);
							Button ok = new Button("确定");
							tiShi.add(la);
							tiShi.add(ok);
							tiShi.addWindowListener(new WindowAdapter() {
								public void windowClosing(WindowEvent be) {
									tiShi.setVisible(false);
								}
							});
							ok.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent fe) {
									tiShi.setVisible(false);
								}
							});
							tiShi.setVisible(true);
						}
					} catch (IOException ce) {
						throw new RuntimeException("配置文件peiZhiFile不存在");
					} finally {
						if (fr != null) {
							try {
								fr.close();
							} catch (IOException kkk) {
								throw new RuntimeException("关闭读取配置文件读取流失败");
							}
						}
					}
				}
			}
		});
		register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ie) {
				landFrame.setVisible(false);
				final Frame registerFrame = new Frame("小王简易QQ,注册");
				registerFrame.setBounds(400, 300, 200, 300);
				registerFrame.setResizable(false);
				registerFrame.setLayout(new FlowLayout());
				Label user1 = new Label("用户");
				Label password1 = new Label("输入密码");
				Label password2 = new Label("确认密码");
				final TextField userText1 = new TextField(20);
				final TextField passwordText1 = new TextField(20);
				final TextField passwordText2 = new TextField(20);
				Button put = new Button("提交");
				registerFrame.add(user1);
				registerFrame.add(userText1);
				registerFrame.add(password1);
				registerFrame.add(passwordText1);
				registerFrame.add(password2);
				registerFrame.add(passwordText2);
				registerFrame.add(put);
				registerFrame.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}
				});
				put.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent fe) {
						FileReader fr1 = null;
						try {
							fr1 = new FileReader(peiZhiFile);
							Properties pro1 = new Properties();
							pro1.load(fr1);
							Set<Object> set1 = pro1.keySet();
							Iterator<Object> it1 = set1.iterator();
							while (it1.hasNext()) {
								String st1 = (String) it1.next();
								if (userText1.getText().equals(st1)) {
									final Dialog tiShi2 = new Dialog(
											registerFrame, "提示", true);
									tiShi2.setBounds(475, 350, 150, 100);
									tiShi2.setLayout(new FlowLayout());
									Label la2 = new Label("用户名已成在，请重新输入",
											Label.CENTER);
									Button ok2 = new Button("确定");
									tiShi2.add(la2);
									tiShi2.add(ok2);
									tiShi2.addWindowListener(new WindowAdapter() {
										public void windowClosing(WindowEvent be) {
											tiShi2.setVisible(false);
										}
									});
									ok2.addActionListener(new ActionListener() {
										public void actionPerformed(
												ActionEvent fe) {
											tiShi2.setVisible(false);
										}
									});
									tiShi2.setVisible(true);
								}
							}
						} catch (IOException hhh) {
							throw new RuntimeException("配置文件不存在异常");
						} finally {
							if (fr1 != null) {
								try {
									fr1.close();
								} catch (IOException bbbb) {
									throw new RuntimeException("配置文件读取流关闭失败");
								}
							}
						}
						if (userText1.getText().length() == 0) {
							final Dialog tiShi3 = new Dialog(registerFrame,
									"提示", true);
							tiShi3.setBounds(475, 350, 150, 100);
							tiShi3.setLayout(new FlowLayout());
							Label la3 = new Label("请输入用户名", Label.CENTER);
							Button ok3 = new Button("确定");
							tiShi3.add(la3);
							tiShi3.add(ok3);
							tiShi3.addWindowListener(new WindowAdapter() {
								public void windowClosing(WindowEvent bea) {
									tiShi3.setVisible(false);
								}
							});
							ok3.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent fea) {
									tiShi3.setVisible(false);
								}
							});
							tiShi3.setVisible(true);
						}
						if (passwordText1.getText().equals(
								passwordText2.getText())
								&& passwordText2.getText().length() != 0) {
							BufferedWriter bfw = null;
							try {
								bfw = new BufferedWriter(new FileWriter(
										peiZhiFile, true));
								bfw.write(userText1.getText() + "="
										+ passwordText1.getText());
								bfw.newLine();
								bfw.flush();
								registerFrame.setVisible(false);
								landFrame.setVisible(true);
							} catch (IOException ccc) {
								throw new RuntimeException("配置文件不存在");
							} finally {
								if (bfw != null) {
									try {
										bfw.close();
									} catch (IOException mm) {
										throw new RuntimeException(
												"注册文件写入流关闭失败");
									}
								}
							}
						} else {
							final Dialog tiShi4 = new Dialog(registerFrame,
									"提示", true);
							tiShi4.setBounds(475, 350, 150, 100);
							tiShi4.setLayout(new FlowLayout());
							Label la4 = new Label("两次输入密码不一致，请重新输入",
									Label.CENTER);
							Button ok4 = new Button("确定");
							tiShi4.add(la4);
							tiShi4.add(ok4);
							tiShi4.addWindowListener(new WindowAdapter() {
								public void windowClosing(WindowEvent bec) {
									tiShi4.setVisible(false);
								}
							});
							ok4.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent fec) {
									tiShi4.setVisible(false);
								}
							});
							tiShi4.setVisible(true);
						}
					}
				});
				registerFrame.setVisible(true);
			}
		});
	}

	public static void main(String[] args) {
		new QqFrameDome();
	}

}
