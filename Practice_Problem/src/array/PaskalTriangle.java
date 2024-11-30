package array;

public class PaskalTriangle {
	public static void main(String[] args) {
		int[] [] arr = new int[5][];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[i + 1];
			arr[i][0] = arr[i][i] = 1;
			for (int j = 1; j < i; j++) {
				arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
			}
		}
		int space = 4;
        for (int[] row : arr) {
        	for (int i = 0; i <= space; i++) System.out.print(" ");
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
            space--;
        }
	}
}
