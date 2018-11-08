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
                boolean done1 = false;
                while (!done1) {
                    try {
                        System.out.println(
                                "Enter sequence of integer numbers. Separate by using spaces, do not use other characters.");
                        Scanner scanner = new Scanner(System.in);
                        int[] ints = ArrayUtil.parseCustomInputToArray(scanner.nextLine());
                        ArrayUtil.printArray(ints);
                        sortingStrategy.setSort(new InsertionSort());
                        ArrayUtil.printArray(sortingStrategy.sort(ints));
                        done1 = true;
                    } catch (Exception e) {
                        System.out.println("Wrong array, please try again");
                    }
                }
                break;
            case 2:try {
                System.out.println("You choose Counting Sort");
                Scanner scanner = new Scanner( System.in );
                System.out.println("Enter number of Integer elements" );
                int number = scanner.nextInt();
                int arr[] = new int[number];
                System.out.println("\nEnter "+ number +" integer elements");
                for (int i = 0; i < arr.length; i++){
                    arr[i] = scanner.nextInt();}
                CountingSorter countingSorter = new CountingSorter();
                countingSorter.sort(arr);
                System.out.println("\nElements after sorting ");
                for (int i = 0; i < number; i++)
                    System.out.print(arr[i]+" ");
                System.out.println();
            }
            catch (Exception e){
                System.out.println("ssssss");
            }
                break;
            case 3:
                boolean done3 = false;
                while (!done3) {
                    try {
                        System.out.println(
                                "Enter sequence of integer numbers. Separate by using spaces, do not use other characters.");
                        Scanner scanner = new Scanner(System.in);
                        int[] ints = ArrayUtil.parseCustomInputToArray(sc.nextLine());
                        ArrayUtil.printArray(ints);
                        sortingStrategy.setSort(new QuickSort());
                        ArrayUtil.printArray(sortingStrategy.sort(ints));
                        done3 = true;
                    } catch (Exception e) {
                        System.out.println("Wrong array, please try again");
                    }
                }
                break;
            case 4:
                break;
            case 5:
                boolean done5 = false;
                while (!done5) {
                    try {
                        System.out.println(
                                "Enter sequence of integer numbers. Separate by using spaces, do not use other characters.");
                        Scanner scanner = new Scanner(System.in);
                        int[] ints = ArrayUtil.parseCustomInputToArray(sc.nextLine());
                        ArrayUtil.printArray(ints);
                        sortingStrategy.setSort(new MergeSort());
                        ArrayUtil.printArray(sortingStrategy.sort(ints));
                        done5 = true;
                    } catch (Exception e) {
                        System.out.println("Wrong array, please try again");
                    }
                }
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
                System.out.println("U picked: Ways to sum to N using array elements with repetition");
                boolean done5 = true;
                while (done5) {
                    try {
                        System.out.println("Enter array of integer possitive numbers. Separate by using spaces, do not use other characters.");
                        Scanner scanner1 = new Scanner(System.in);
                        int[] ints = ArrayUtil.parseCustomInputToArray(scanner1.nextLine());
                        System.out.println("Enter number of sum");
                        int number = scanner1.nextInt();
                        System.out.println("Result is : " + AlgorithmsClass.WaysToSumToNUsingArrayElementsWithRepetition(ints, number));
                        done5 = false;
                    } catch (Exception e) {
                        System.out.println("Wrong symbol. Enter Integer\n" + " ");
                    }
                }


                break;
            case 6:
                System.out.println("U picked: Ways to write n as sum of two or more positive integers");
                boolean done6 = true;
                while (done6) {
                    try {
                        System.out.println("Enter one positive integer.");
                        Scanner scanner6 = new Scanner(System.in);
                        int N = scanner6.nextInt();
//                        System.out.println("Result is : " + WaysToWriteNAsSumOfTwoOrMorePositiveIntegers(N));
                        done6 = false;
                    } catch (Exception e) {
                        System.out.println("Wrong symbol. Enter Integer\n" + " ");
                    }
                }
                break;
            case 7:
                System.out.println("U picked: Ways to cover in 3 steps. Enter a distance: ");
                boolean done7 = true;
                while (done7) {
                    try {
                        Scanner innerScan = new Scanner(System.in);
                        int distance = innerScan.nextInt();
                        System.out.println(
                                "Result is : " + AlgorithmsClass.waysToCoverIn3StepsAlgorithm(distance) + "\n" + " ");
                        done7 = false;
                    } catch (Exception e) {
                        System.out.println("Wrong symbol. Enter Integer\n" + " ");
                    }
                }
                break;
            case 8:
                break;
            case 9:
                AlgorithmsClass.start9();

                break;


            case 10:
                System.out.println("U picked: The longest palindromic subsequence. Enter a string :");
                try {
                    Scanner poliScan = new Scanner(System.in);
                    String poliString = poliScan.nextLine();
                    System.out.println(
                            "The longest polindrome : " + AlgorithmsClass.longestPalindromeSubseq(poliString) + "\n" + " ");
                } catch (Exception e) {
                    System.out.println("Wrong symbol. Enter String\n" + "\n" + " ");
                }
                break;
            case 11:
			 System.out.println("U picked: Friend Pairs");
                boolean done11 = true;
                while (done11) {
                    try {
                        System.out.println("Enter number of friends - one positive integer.");
                        Scanner scanner11 = new Scanner(System.in);
                        int N = scanner11.nextInt();
//                        System.out.println("Result is : " + FriendPairs(N));
                        done11 = false;
                    } catch (Exception e) {
                        System.out.println("Wrong symbol. Enter Integer\n" + " ");
                    }
                }
                break;
            case 12:

                boolean done12 = false;
                while (!done12) {
                    try {
                        System.out.println("Enter n and m. Both n and m are positive integers and 2 < = m.");
                        System.out.println("n = ");
                        Scanner scanner = new Scanner(System.in);
                        int n = scanner.nextInt();
                        System.out.println("m = ");
                        int m = scanner.nextInt();
                        System.out.println("Number of ways to tile " + AlgorithmsClass.countWaysToTileTheFloor(n, m));
                        done12 = true;
                    } catch (Exception e) {
                        System.out.println("Wrong number, please try again");
                    }
                }

                break;
            case 13:
                break;
            case 14:
                AlgorithmsClass.start14();
                break;

            default:
                System.out.println("Wrong number");
                break;
        }

    }
}
