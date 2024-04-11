
public class RedGames extends Thread {

	private MegaSena mega;

	public RedGames(MegaSena mega) {
		this.mega = mega;
	}

	@Override
	public void run() {
		for (int i = 0; i < MegaSena.NUMBER_OF_GAMES; i++) {
			System.err.println("Red in");
			mega.play(System.err);
			System.err.println("Red out");
		}
	}
}
