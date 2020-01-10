package Tubes;

public class main {

	public static void main(String argv[]) {
		Queens queens = new Queens(8);
		queens.solve();

		System.out.println(queens);
	}
}