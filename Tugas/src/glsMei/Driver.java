package glsMei;

public class Driver extends BaseCharacter implements IDriver {

	public Driver() {
		super("Driver", "seorang yang bisa menyetir");
	}

	public void drive() {
		System.out.println(name + " menyetir");
	}

}
