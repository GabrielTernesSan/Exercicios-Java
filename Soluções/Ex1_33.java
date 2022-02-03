package internet;

public class Ex1_33 {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			System.out.printf("A tabuada do %d :", i);
			System.out.println();
			for(int j = 1; j <= 10; j++) {
				int result = i * j;
				System.out.printf("%d X %d = %d",i, j, result);
				System.out.println();
			}
		}
	}
}
