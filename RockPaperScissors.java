package Adventure;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	static Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	String ask = "";

	public static int choose() {
		int randomValue = random.nextInt(3) +1;
		return randomValue;
	}
}
