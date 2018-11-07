package console;

import java.util.Scanner;

public class SimpleConsole {
	public static boolean loopRun = true;
	public static int numberForChooseMenu;
	public static SortingStrategy sortingStrategy = new SortingStrategy();
	
	public static void main(String[] args) {
		while (loopRun) {
			chooseMenu();
		}

	}

	public static void chooseMenu() {
		System.out.println("Hello !");
		System.out.println("");
		System.out.println("What are we going to do today?");
		System.out.println("Press 1 to enter menu with sorting methods.");
		System.out.println("Press 2 to enter menu with algorithms.");
		System.out.println("Press 0 to exit");
		Scanner sc = new Scanner(System.in);
		try {
			numberForChooseMenu = sc.nextInt();
			if (numberForChooseMenu == 1) {
				sortingMenu();
			} else if (numberForChooseMenu == 2) {
				algorithmsMenu();
			} else if (numberForChooseMenu == 0) {
				loopRun = false;
				System.out.println("U enter wrong number");
			}
		} catch (Exception e) {
			System.out.println("Oops! Looks like u enter wrong symbol. Bye");
		}
		

	}

	public static void sortingMenu() {
		System.out.println("Welcome to sort menu. We got a few sort methods for u. Choose one :");
		System.out.println("Press 1 to pick Insertion Sort");
		System.out.println("Press 2 to pick Counting Sort");
		System.out.println("Press 3 to pick Quick Sort");
		System.out.println("Press 4 to pick Bucket Sort");
		System.out.println("Press 5 to pick Merge Sort");
		System.out.println("Press 0 to exit");
		Scanner sc = new Scanner(System.in);
		switch (sc.nextInt()) {
		case 0:
			loopRun = false;
		case 1:
			System.out.println("Enter sequence of integer numbers. Separate by using spaces, do not use other characters.");
			int[] ints = ArrayUtil.parseCustomInputToArray();
			ArrayUtil.printArray(ints);
			sortingStrategy.setSort(new InsertionSort());
			int[] sort = sortingStrategy.sort(ints);
			ArrayUtil.printArray(sort);
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:

			break;
		default:
			System.out.println("Wrong number");
			break;
		}
		
	}

	public static void algorithmsMenu() {
		System.out.println("Welcome to algorithm menu. We got a few algorithm methods for u. Choose one :");
		System.out.println("Press 1 to pick Fibonacci");
		System.out.println("Press 2 to pick Modification Fibonacci");
		System.out.println("Press 3 to pick Interesting row Virtual programming lab");
		System.out.println("Press 4 to pick Longest subsequence with difference one");
		System.out.println("Press 5 to pick Ways to sum to N using array elements with repetition");
		System.out.println("Press 6 to pick Ways to write n as sum of two or more positive integers");
		System.out.println("Press 7 to pick Ways to cover in 3 steps");
		System.out.println("Press 8 to pick Paths without crossing");
		System.out.println("Press 9 to pick Work to be with High-effort or with Low-effort");
		System.out.println("Press 10 to pick The longest palindromic subsequence");
		System.out.println("Press 11 to pick Friend pairs");
		System.out.println("Press 12 to pick Ways to tile the floor");
		System.out.println("Press 13 to pick Painting the fence");
		System.out.println("Press 14 to pick Optimized painting fence: use one variable instead of a table");
		System.out.println("Press 0 to exit");
		Scanner sc = new Scanner(System.in);
		switch (sc.nextInt()) {
		case 0:
			loopRun = false;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			break;
		case 10:
			break;
		case 11:
			break;
		case 12:
			break;
		case 13:
			break;
		case 14:
			break;
		

		default:
			System.out.println("Wrong number");
			break;
		}
		
	}
}
