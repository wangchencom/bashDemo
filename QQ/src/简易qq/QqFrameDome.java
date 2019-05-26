package ����qq;

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
				"�����ļ�.txt");
		if (!peiZhiFile.exists()) {
			try {
				peiZhiFile.createNewFile();
			} catch (IOException lll) {
				throw new RuntimeException("�����ļ�����ʧ��");
			}
		}
		landFrame = new Frame("����ĵ���QQ");
		landFrame.setBounds(400, 300, 300, 200);
		landFrame.setResizable(false);
		landFrame.setLayout(new FlowLayout());
		user = new Label("�û�");
		password = new Label("����");
		userText = new TextField(30);
		passwordText = new TextField(30);
		passwordText.setEchoChar('*');
		land = new Button("��½");
		register = new Button("ע��");
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
					final Dialog tiShi2 = new Dialog(landFrame, "��ʾ", true);
					tiShi2.setBounds(475, 350, 150, 100);
					tiShi2.setLayout(new FlowLayout());
					Label la2 = new Label(
							"�û�" + userText.getText() + "�����ڣ���ע��", Label.CENTER);
					Button ok2 = new Button("ȷ��");
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
										"��ʾ", true);
								tiShi1.setBounds(475, 350, 150, 100);
								tiShi1.setLayout(new FlowLayout());
								Label la1 = new Label("�����������������",
										Label.CENTER);
								Button ok1 = new Button("ȷ��");
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
							final Dialog tiShi = new Dialog(landFrame, "��ʾ",
									true);
							tiShi.setBounds(475, 350, 150, 100);
							tiShi.setLayout(new FlowLayout());
							Label la = new Label("�û�" + userText.getText()
									+ "�����ڣ���ע��", Label.CENTER);
							Button ok = new Button("ȷ��");
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
						throw new RuntimeException("�����ļ�peiZhiFile������");
					} finally {
						if (fr != null) {
							try {
								fr.close();
							} catch (IOException kkk) {
								throw new RuntimeException("�رն�ȡ�����ļ���ȡ��ʧ��");
							}
						}
					}
				}
			}
		});
		register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ie) {
				landFrame.setVisible(false);
				final Frame registerFrame = new Frame("С������QQ,ע��");
				registerFrame.setBounds(400, 300, 200, 300);
				registerFrame.setResizable(false);
				registerFrame.setLayout(new FlowLayout());
				Label user1 = new Label("�û�");
				Label password1 = new Label("��������");
				Label password2 = new Label("ȷ������");
				final TextField userText1 = new TextField(20);
				final TextField passwordText1 = new TextField(20);
				final TextField passwordText2 = new TextField(20);
				Button put = new Button("�ύ");
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
											registerFrame, "��ʾ", true);
									tiShi2.setBounds(475, 350, 150, 100);
									tiShi2.setLayout(new FlowLayout());
									Label la2 = new Label("�û����ѳ��ڣ�����������",
											Label.CENTER);
									Button ok2 = new Button("ȷ��");
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
							throw new RuntimeException("�����ļ��������쳣");
						} finally {
							if (fr1 != null) {
								try {
									fr1.close();
								} catch (IOException bbbb) {
									throw new RuntimeException("�����ļ���ȡ���ر�ʧ��");
								}
							}
						}
						if (userText1.getText().length() == 0) {
							final Dialog tiShi3 = new Dialog(registerFrame,
									"��ʾ", true);
							tiShi3.setBounds(475, 350, 150, 100);
							tiShi3.setLayout(new FlowLayout());
							Label la3 = new Label("�������û���", Label.CENTER);
							Button ok3 = new Button("ȷ��");
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
								throw new RuntimeException("�����ļ�������");
							} finally {
								if (bfw != null) {
									try {
										bfw.close();
									} catch (IOException mm) {
										throw new RuntimeException(
												"ע���ļ�д�����ر�ʧ��");
									}
								}
							}
						} else {
							final Dialog tiShi4 = new Dialog(registerFrame,
									"��ʾ", true);
							tiShi4.setBounds(475, 350, 150, 100);
							tiShi4.setLayout(new FlowLayout());
							Label la4 = new Label("�����������벻һ�£�����������",
									Label.CENTER);
							Button ok4 = new Button("ȷ��");
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
