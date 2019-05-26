package ¼òÒ×qq;

public class ThreadDome 
{
	ThreadDome()
	{

		ReceSocket re=new ReceSocket();
		SendSocket se=new SendSocket();
		Thread sendThread=new Thread(se);
		Thread receThread=new Thread(re);
		sendThread.start();
		receThread.start();
	}
}
