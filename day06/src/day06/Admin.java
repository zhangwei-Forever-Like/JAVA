package day06;

public class Admin {
	 Room[][] rooms;

	public Room[][] getRooms() {
		return rooms;
	}

	public void setRooms(Room[][] rooms) {
		this.rooms = rooms;
	}

	public Admin() {
		super();
		this.rooms = new Room[3][10];
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {
				if(i==0) {
					rooms[i][j]=new Room((i+1)*100+j+1,"单人间",true);
				}else if(i==1){
					rooms[i][j]=new Room((i+1)*100+j+1,"双人间",true);
				}else if(i==2) {
					rooms[i][j]=new Room((i+1)*100+j+1,"总统间",true);
				}
			}
		}
	}
	public void print() {
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {
				System.out.print(rooms[i][j]);
			}
			System.out.println();
		}
	}
	public void order(int id) {
	    Room room=rooms[id/100-1][id%100-1];
	    room.setStyle(false);
	    System.out.println(id+"已订房");
	}
	public void exit(int id) {
		 Room room=rooms[id/100-1][id%100-1];
		    room.setStyle(true);
		    System.out.println(id+"已退房");
	}
	public void type() {
        
	}
}
