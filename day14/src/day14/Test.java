package day14;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room room = new Room(101, "單人間", true);
		System.out.println(room.toString());
		Room room1 = new Room(101, "單人間", true);
		System.out.println(room.equals(room1));
	}

}

class Room extends Object{
	private int id;
	private String style;

	public Room(int id, String style, boolean sity) {
		super();
		this.id = id;
		this.style = style;
		this.sity = sity;
	}

	public Room() {
		super();
	}

	private boolean sity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public boolean isSity() {
		return sity;
	}

	public void setSity(boolean sity) {
		this.sity = sity;
	}

	public String toString() {
		return "[" + id + "," + style + "," + (sity ? "空閑" : "占用") + "]";
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Room))
			return false;
		if (this == obj)
			return true;
		Room room = (Room) obj;
		return this.getId() == room.getId();
	}
}