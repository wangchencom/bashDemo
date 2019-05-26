package 简易qq;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

 class SpeakFrame 
{
	 Frame speakFrame;
	 Button send;
	 TextArea receText;
	 TextArea sendText;
	 private static SpeakFrame sf=new SpeakFrame();
	 private SpeakFrame() 
	 {
		 chuShiHua();
	 }
	 public static SpeakFrame getFrame()
	 {
		 return sf;
	 }
	public void chuShiHua()
	{
		speakFrame=new Frame("找人聊天");
		speakFrame.setBounds(400,100,500,600);
		speakFrame.setResizable(false);
		speakFrame.setLayout(new FlowLayout());
		send=new Button("发送");
		receText=new TextArea(15,65);
		sendText=new TextArea(15,65);
		speakFrame.add(receText);
		speakFrame.add(sendText);
		speakFrame.add(send);
		speakFrame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent ge)
			{
				System.exit(0);
			}
		});
		send.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent he)
			{
				SimpleDateFormat date=new SimpleDateFormat("yy-MM-dd hh:mm:ss:SS(毫秒)");
				Date d=new Date();
				String sb=date.format(d);
				sendText.setText("");
				if(sendText.getText().length()==0)
				{
					sendText.append("输入无效");
					return ;
				}
				if(sendText.getText().equals("输入无效"))
				{
					return ;
				}
				receText.append("我  "+sb+"\r\n");
				receText.append(sendText.getText()+"\r\n");
				sendText.setText("");
			}
		});
		receText.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent yy)
			{
				if(yy.getKeyCode()==KeyEvent.VK_ESCAPE)
				{
					System.exit(0);
				}
				else
				{
					yy.consume();
				}
			}
		});
		speakFrame.setVisible(true);
	}
}
	
