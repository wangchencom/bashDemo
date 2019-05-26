package ¼òÒ×qq;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class SendSocket implements Runnable 
{
	public void run()
	{
		SpeakFrame sfr=SpeakFrame.getFrame();
		try
		{
			DatagramSocket sendSocket=new DatagramSocket();
			String line=sfr.sendText.getText();
			byte []buf=new byte[1024];
			buf=line.getBytes();
			DatagramPacket data=new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.27.45"),40001);
			sendSocket.send(data);
			System.out.println(sendSocket.getLocalAddress().getHostAddress());
			sendSocket.close();
		}
		catch(Exception  e)
		{
			throw new RuntimeException(e.toString());
		}
	}
}

