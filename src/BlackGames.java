
public class BlackGames extends Thread {
	
	private MegaSena mega;
	
	public BlackGames(MegaSena mega) {
		this.mega = mega;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < MegaSena.NUMBER_OF_GAMES; i++) {
			System.out.println("Black in");
			mega.play(System.out);
			System.out.println("Black out");
		}
	}
}
