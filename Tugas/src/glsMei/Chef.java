package glsMei;

public class Chef extends BaseCharacter implements IChef, IWorker {

	public Chef() {
		super("Chef", "seorang koki restoran");
	}

	public void cook() {
		System.out.println(name + " memasak");
	}

	public void work() {
		System.out.println(name + " bekerja");
	}

}
