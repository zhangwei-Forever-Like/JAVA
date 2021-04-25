package day06;

public class Room {
	private int id;
	private String type;
	private boolean style;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isStyle() {
		return style;
	}

	public void setStyle(boolean style) {
		this.style = style;
	}

	public Room(int id, String type, boolean style) {
		super();
		this.id = id;
		this.type = type;
		this.style = style;
	}

	public boolean equals(Object obj) {
		if(obj ==null||!(obj instanceof Room))return false;
		if(this==obj)return true;
		Room room=(Room)obj;
		return this.getId()==room.getId();
	}

	@Override
	public String toString() {
		return "["+id+","+type+","+(style?"空闲":"占用")+"]";
	}
	

}
