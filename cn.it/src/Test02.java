public class Test02 {

	public static void main(String[] args) {
		Player p1 = new PingpangPlayer();
		p1.play();
		p1.speak();
		Player p2 = new BasketballPlayer();
		p2.play();
		p2.speak();
		Coach c1 = new PingpangCoach();
		c1.trainning();
		c1.speak();
		Coach c2 = new BasketballCoach();
		c2.trainning();
		c2.speak();

	}

}

class PingpangPlayer extends Player implements SpeakEnglish,Play{
	public void speak(){
		System.out.println("speak English");
	}
	public void play(){
		System.out.println("play PingpangBall");
	}
}

class BasketballPlayer extends Player implements SpeakEnglish,Play{
	public void speak(){
		System.out.println("speak English");
	}
	public void play(){
		System.out.println("play Basketball");
	}
}

class PingpangCoach extends Coach implements SpeakEnglish,Trainning{
	public void speak(){
		System.out.println("speak English");
	}
	public void trainning(){
		System.out.println("trainning Pingpang");
	}
}

class BasketballCoach extends Coach implements SpeakEnglish,Trainning{
	public void speak(){
		System.out.println("speak English");
	}
	public void trainning(){
		System.out.println("trainning Basketball");
	}
}

abstract class Player implements SpeakEnglish{
	public abstract void play();
}

abstract class Coach implements SpeakEnglish{
	public abstract void trainning();
}

interface SpeakEnglish{
	public abstract void speak();
}

interface Trainning{
	public abstract void trainning();
}

interface Play{
	public abstract void play();
}

