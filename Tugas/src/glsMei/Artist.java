package glsMei;

public class Artist extends BaseCharacter implements IArtist {

	public Artist() {
		super("Artist", "seorang yang bisa melukis");
	}

	public void paint() {
		System.out.println(name + " melukis");
	}

}
