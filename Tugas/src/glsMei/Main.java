package glsMei;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	ArrayList<BaseCharacter> list = new ArrayList<>();
	Scanner scan = new Scanner(System.in);

	void clear() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}

	public Main() {
		list.add(new Artist());
		list.add(new Mascot());
		list.add(new JackOfAllTrades());
		list.add(new Chef());
		list.add(new Worker());
		list.add(new Driver());

		String active = "Y";
		do {
			clear();
			System.out.println("+----+----------------------+");
			System.out.println("| ID |          Name        |");
			System.out.println("+----+----------------------+");
			for (int i = 0; i < list.size(); i++) {
				System.out.printf("| %2d | %-20s |\n", i, list.get(i).name);
			}
			System.out.println("+----+----------------------+");

			String command = "";

			do {
				System.out.print("Input Command < Info | Cook | Drive | Work | Paint > < ID > : ");
				command = scan.nextLine();
			} while (!command.contains(" "));

			String action = command.substring(0, command.indexOf(" "));
			String characterID = command.substring(command.indexOf(" "));

			System.out.println("");
			for (int i = 1; i < characterID.length(); i++) {
				if(characterID.charAt(i)<'0' || characterID.charAt(i)>'9') continue;
				if(characterID.charAt(i)>='0'+list.size()) {
					System.out.println("Character not found");
					continue;
				}
				Integer id = Integer.parseInt(characterID.substring(i, i + 1));
				switch (action) {
				case "Info": {
					list.get(id).getInfo();
					break;
				}
				case "Cook": {
					if (list.get(id) instanceof IChef) {
						((IChef) list.get(id)).cook();
					} else {
						System.out.println("Karakter tidak bisa melakukan aksi");
					}

					break;
				}
				case "Drive": {
					if (list.get(id) instanceof IDriver) {
						((IDriver) list.get(id)).drive();
					} else {
						System.out.println("Karakter tidak bisa melakukan aksi");
					}

					break;
				}
				case "Work": {
					if (list.get(id) instanceof IWorker) {
						((IWorker) list.get(id)).work();
					} else {
						System.out.println("Karakter tidak bisa melakukan aksi");
					}

					break;
				}
				case "Paint": {
					if (list.get(id) instanceof IArtist) {
						((IArtist) list.get(id)).paint();
					} else {
						System.out.println("Karakter tidak bisa melakukan aksi");
					}

					break;
				}
				default: {
					System.out.println("Aksi tidak dapat ditemukan");
					break;
				}
				}
			}
			System.out.print("\n\nInput <N> to exit the program: ");
			active = scan.nextLine();
		} while (!active.equalsIgnoreCase("N"));
	}

	public static void main(String[] args) {
		new Main();
	}
}
