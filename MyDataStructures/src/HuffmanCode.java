import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HuffmanCode {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String content = "i like like like java do you like a java";
		byte[] bytes = content.getBytes();
		System.out.println(bytes.length);
//		System.out.println(getNodes(bytes));
//		createHuffmanTree(getNodes(bytes)).preOrder();
		getCodes(createHuffmanTree(getNodes(bytes)),"",stringBuilder);
		for (Map.Entry<Byte, String> entry : huffmanCodes.entrySet()) {
			System.out.println(entry.getKey()+"-->"+entry.getValue());
		}
		byte[] b=zip(bytes,huffmanCodes);
		System.out.println(Arrays.toString(b));
	}
	static StringBuilder stringBuilder = new StringBuilder();
    static Map<Byte,String> huffmanCodes=new HashMap<>();
    public static void getCodes(Node02 node,String code,StringBuilder stringBuilder) {
    	StringBuilder stringBuilder2=new StringBuilder(stringBuilder);
    	stringBuilder2.append(code);
    	if(node!=null) {
    		if(node.data==null) {
    			getCodes(node.left,"0",stringBuilder2);
    			getCodes(node.right,"1",stringBuilder2);
    		}else {
    			huffmanCodes.put(node.data, stringBuilder2.toString());
    		}
    	}
    }
    public static byte[] zip(byte[] bytes,Map<Byte,String> huffmanCodes) {
    	StringBuilder stringBuilder=new StringBuilder();
    	for(byte b:bytes) {
    		stringBuilder.append(huffmanCodes.get(b));
    	}
    	int len;
    	if(stringBuilder.length()%8==0) {
    		len=stringBuilder.length()/8;
    	}else {
    		len=stringBuilder.length()/8+1;
    	}
    	byte[] b=new byte[len];
    	int index=0;
    	for(int i=0;i<stringBuilder.length();i+=8) {
    		String strByte;
    		if(i+8>stringBuilder.length()) {
    			strByte=stringBuilder.substring(i);
    		}else {
    			strByte=stringBuilder.substring(i,i+8);
    		}
    		b[index]=(byte)Integer.parseInt(strByte,2);
    		index++;
    	}
    	return b;
    }
	public static List<Node02> getNodes(byte[] bytes) {
		ArrayList<Node02> nodes = new ArrayList<Node02>();
		Map<Byte, Integer> counts = new HashMap<Byte, Integer>();
		for (byte b : bytes) {
			Integer count = counts.get(b);
			if (count == null) {
				counts.put(b, 1);
			} else {
				counts.put(b, count + 1);
			}
		}
		for (Map.Entry<Byte, Integer> entry : counts.entrySet()) {
			nodes.add(new Node02(entry.getKey(), entry.getValue()));
		}
		return nodes;
	}

	public static Node02 createHuffmanTree(List<Node02> nodes) {
		while (nodes.size() > 1) {
			Collections.sort(nodes);
			Node02 leftNode02 = nodes.get(0);
			Node02 rightNode02 = nodes.get(1);
			Node02 parsent = new Node02(null, leftNode02.weight + rightNode02.weight);
			parsent.left = leftNode02;
			parsent.right = rightNode02;
			nodes.remove(leftNode02);
			nodes.remove(rightNode02);
			nodes.add(parsent);
		}
		return nodes.get(0);
	}
}

class Node02 implements Comparable<Node02> {
	Byte data;
	int weight;
	Node02 left;
	Node02 right;

	public Node02(Byte data, int weight) {
		super();
		this.data = data;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Node02 [data=" + data + ", weight=" + weight + "]";
	}

	@Override
	public int compareTo(Node02 o) {
		// TODO Auto-generated method stub
		return this.weight - o.weight;
	}

	public void preOrder() {
		System.out.println(this);
		if (this.left != null) {
			this.left.preOrder();
		}
		if (this.right != null) {
			this.right.preOrder();
		}
	}
}