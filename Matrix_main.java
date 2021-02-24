import java.util.*;

public class Matrix_main {
	public void MatMult(int A[][], int B[][], int ra, int ca, int rb, int cb) {
		int[][] C = new int[ra][ca];
		for (int i = 0; i < ra; i++) {
			for (int j = 0; j < cb; j++) {
				C[i][j] = 0;
				for (int k = 0; k < ca; k++) {
					C[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		for (int i = 0; i < ra; i++) {
			for (int j = 0; j < cb; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public void MatSqr(int A[][], int ra, int ca) {
		int[][] C = new int[ra][ca];
		for (int i = 0; i < ra; i++) {
			for (int j = 0; j < ca; j++) {
				C[i][j] = 0;
				for (int k = 0; k < ca; k++) {
					C[i][j] += A[i][k] * A[k][j];
				}
			}
		}
		for (int i = 0; i < ra; i++) {
			for (int j = 0; j < ra; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int ra, ca, rb, cb;
		System.out.println("Enter rows and columns of  Matrix A");
		ra = cin.nextInt();
		ca = cin.nextInt();
		int[][] A = new int[ra][ca];
		System.out.println("Enter Matrix A row by row");
		for (int i = 0; i < ra; i++) {
			for (int j = 0; j < ca; j++) {
				A[i][j] = cin.nextInt();
			}
		}
		System.out.println("Enter rows and columns of  Matrix b");
		rb = cin.nextInt();
		cb = cin.nextInt();
		int[][] B = new int[rb][cb];
		System.out.println("Enter Matrix B row by row");
		for (int i = 0; i < rb; i++) {
			for (int j = 0; j < cb; j++) {
				B[i][j] = cin.nextInt();
			}
		}
		int c = -1;
		Matrix_main m = new Matrix_main();
		do {
			System.out.println("Enter choice: 0.Exit 1.Multiply");
			c = cin.nextInt();
			switch (c) {
			case 1:
				if (ca == rb)
					m.MatMult(A, B, ra, ca, rb, cb);
				else
					System.out.println("Invalid Matrix size");
				break;
			}
		} while (c != 0);
	}
}

