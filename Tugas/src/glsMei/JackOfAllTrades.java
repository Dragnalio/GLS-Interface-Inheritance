package glsMei;

public class JackOfAllTrades extends BaseCharacter implements IChef, IDriver, IWorker, IArtist {

	public JackOfAllTrades() {
		super("Jack of All Trades", "seorang yang ahli dalam semua hal");
	}

	public void cook() {
		System.out.println(name + " memasak");
	}

	public void drive() {
		System.out.println(name + " menyetir");
	}

	public void work() {
		System.out.println(name + " bekerja");
	}

	public void paint() {
		System.out.println(name + " melukis");
	}

}
