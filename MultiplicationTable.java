package Problemslvl1;

public class MultiplicationTable {
	
		public static void headerofproject() {
			System.out.println("\t\t Multiplication from table 1 to 10\n");
			for (int i = 1; i <= 10; i++) {
				System.out.print("\t" + i);
			}
			System.out.println();
			System.out.println(
					"----------------------------------------------------------------------------------------------");
		}

		public static void printfirstline(int i) {
			if (i < 10) {
				System.out.print(i + "    |");
			} else
				System.out.print(i + "   |");
		}

		public static void fullcontrole() {
			headerofproject();

			for (int i = 1; i <= 10; i++) {
				printfirstline(i);

				for (int j = 1; j <= 10; j++) {
						System.out.print("\t"+i*j);

				}
				System.out.println();
			}
		}

		public static void main(String[] args) {
			fullcontrole();
		}
	}


