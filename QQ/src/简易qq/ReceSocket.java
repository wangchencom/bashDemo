package ¼òÒ×qq;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
public class ReceSocket implements Runnable {
	public void run()
	{
		SpeakFrame sfr=SpeakFrame.getFrame();
		try
		{
			@SuppressWarnings("resource")
			DatagramSocket receSocket=new DatagramSocket(40001);
			while(true)
			{
				byte []buf=new byte[1024];
				DatagramPacket data=new DatagramPacket(buf,buf.length);
				receSocket.receive(data);
				String line=new String(buf,0,buf.length);
				sfr.receText.append(line);
				System.out.println(receSocket.getLocalAddress().getHostAddress());
			} 
		}
		catch(Exception  e)
		{
			throw new RuntimeException(e.toString());
		}
	}
}

