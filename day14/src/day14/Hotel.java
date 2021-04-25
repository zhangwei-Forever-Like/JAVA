package day14;

public class Hotel {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	int[][] a = new int[3][4];
	private Room[][] rooms;

	public Hotel() {
		super();
		rooms = new Room[3][10];
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {
				if (i == 0) {
					rooms[i][j] = new Room((i + 1) * 100 + j + 1, "单人间", true);
				} else if (i == 1) {
					rooms[i][j] = new Room((i + 1) * 100 + j + 1, "标准间", true);
				} else if (i == 2) {
					rooms[i][j] = new Room((i + 1) * 100 + j + 1, "总统套房", true);
				}
			}
		}
	}

	public void print() {
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {
				Room room = rooms[i][j];
				System.out.print(room);
			}
			System.out.println();
			System.out.println();
		}
	}

	public void order(int roomNo) {
		Room room = rooms[roomNo / 100 - 1][roomNo % 100 - 1];
		room.setSity(false);
		System.out.println(roomNo+"已订房");
	}

	public void exit(int roomNo) {
		Room room = rooms[roomNo / 100 - 1][roomNo % 100 - 1];
		room.setSity(true);
		System.out.println(roomNo+"已退房");
	}
}
