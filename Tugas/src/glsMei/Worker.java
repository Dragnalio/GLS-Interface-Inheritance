package glsMei;

public class Worker extends BaseCharacter implements IWorker {

	public Worker() {
		super("Worker", "seorang pekerja kantoran");
	}

	public void work() {
		System.out.println(name + " bekerja");
	}

}
