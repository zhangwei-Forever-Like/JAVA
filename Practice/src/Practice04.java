
public class Practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 } };
		// *********Found********
		int i, j, sum = 0;
		for (i = 0; i < 5; i++)
			for (j = 0; j < 5; j++)
				// *********Found********
				if (j + i == 4)
					sum += arr[i][j];
		System.out.println(sum);
	}

}
