
public class MiGong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] map = new int[8][7];
		map[3][1] = 1;
		map[3][2] = 1;
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				map[0][j] = 1;
				map[i][0] = 1;
				map[7][j] = 1;
				map[i][6] = 1;
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		setWay(map,1,1);
		System.out.println("递归后的结果");
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[i].length;j++) {
				System.out.printf(map[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static boolean setWay(int[][] map, int i, int j) {
		if(map[6][5]==2) {
			return true;
		}else {
			if(map[i][j]==0) {
				map[i][j]=2;
				if(setWay(map,i+1,j)) {
					return true;
				}else if(setWay(map,i,j+1)) {
					return true;
				}else if(setWay(map,i-1,j)) {
					return true;
				}else if(setWay(map,i,j-1)) {
					return true;
				}else {
					map[i][j]=3;
					return false;
				}
			}else {
				return false;
			}
		}
	}
}
