
public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] chessArr1 = new int[11][11];
		chessArr1[1][2] = 1;
		chessArr1[2][3] = 2;
		chessArr1[3][5] = 2;
		for(int i=0;i<chessArr1.length;i++) {
			for(int j=0;j<chessArr1.length;j++) {
				System.out.printf("%d\t",chessArr1[i][j]);
			}
			System.out.println();
		}
	}

}
