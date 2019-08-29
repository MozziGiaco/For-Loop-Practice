import java.util.Scanner;

public class Donuts
	{
		static int lowerBound;
		static int upperBound;

		public static void main(String[] args)
			{

				// printDonuts();
				// ascendAndDescend();
				// printMultiplesOfFive();
				// sumAllNumbers();
				// sumUpperAndLowerBound();
				printRectangle();
			}

		private static void printDonuts()
			{
				for (int i = 1; i <= 5; i++)
					{
						System.out.println("I love Donuts");
					}
			}

		private static void ascendAndDescend()
			{
				for (int i = 1; i <= 5; i++)
					{
						System.out.println(i);
					}
				for (int i = 5; i >= 1; i--)
					{
						System.out.println(i);
					}

			}

		private static void printMultiplesOfFive()
			{
				for (int i = 5; i <= 100; i += 5)
					{
						System.out.println(i);
					}
			}

		private static void sumAllNumbers()
			{
				int sum = 0;

				for (int i = 5; i <= 100; i += 5)
					{
						sum += i;
						System.out.println(i);

					}
				System.out.println("Your total is " + sum);

			}

		private static void sumUpperAndLowerBound()
			{
				System.out.println("Give me a lowerbound number to start counting from.");
				Scanner lower = new Scanner(System.in);
				lowerBound = lower.nextInt();

				System.out.println("Now give me an upper bound to stop at.");
				Scanner upper = new Scanner(System.in);
				upperBound = upper.nextInt();
				int sum = 0;
				for (int i = lowerBound; i <= upperBound; i++)
					{
						sum += i;
					}
				System.out.println("Your total is " + sum);
			}

		private static void printRectangle()
			{
				for (int i = 1; i <= 9; i++)
					{
						System.out.print("*");
						
					}
			}

	}
