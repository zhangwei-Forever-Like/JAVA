package day19;


import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new TreeMap();
		Emp e1 = new Emp("001","张三");
		Emp e2 = new Emp("003","李四");
		Emp e3 = new Emp("005","王一");
		Emp e4 = new Emp("007","赵六");
		Emp e5 = new Emp("009","黄芪");
		Emp e6 = new Emp("011","孙八");
		Emp e7 = new Emp("013","郭嘉");
		Emp e8 = new Emp("015","刘旧");
		Emp e9 = new Emp("017","衡器");
		map.put(e1.getId(), e1.getName());
		map.put(e2.getId(), e1.getName());
		map.put(e3.getId(), e3.getName());
		map.put(e4.getId(), e4.getName());
		map.put(e5.getId(), e5.getName());
		map.put(e6.getId(), e6.getName());
		map.put(e7.getId(), e7.getName());
		map.put(e8.getId(), e8.getName());
		map.put(e9.getId(), e9.getName());
		map.remove("015");
		Set set=map.keySet();
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

class Emp {
	public Emp(String id,String name) {
		this.id = id;
		this.name=name;
	}

	private String id;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return id;
	}
}