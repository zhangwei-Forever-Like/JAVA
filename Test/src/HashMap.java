
public class HashMap {
    Node2 []table;
    int size;
    final int CAPACITY=16;
    public HashMap(){
        table=new Node2[CAPACITY];
    }

    public void put(Object key,Object value){
        Node2 newnode=new Node2();
        newnode.key=key;
        newnode.value=value;
        newnode.hash=Hash(key.hashCode(),table.length);//哈希算法
        if(newnode.hash<CAPACITY) {
            Node2 temp=table[newnode.hash];
            boolean keyrepeat=false;
            if(temp==null){
                table[newnode.hash]=newnode;
            }else{
                while(temp!=null){
                    if(newnode.value==temp.value){
                        keyrepeat=true;
                        temp.value=newnode.value;
                        break;
                    }else{
                        temp=temp.next;
                    }
                }
                if(keyrepeat==false)
                    temp.next=newnode;
            }
        }else {
            Node2 newTable[]=new Node2[table.length+(table.length>>1)];
            System.arraycopy(table, 0, newTable, 0, table.length);
            table=newTable;
        }
    }

    public String toString(){
        StringBuilder sb=new StringBuilder("[");
        for(int i=0;i<table.length;i++){
            Node2 temp=table[i];
            while(temp!=null){
                sb.append(temp.key+":"+temp.value+"  ");
                temp=temp.next;
            }
        }
        sb.setCharAt(sb.length()-1, ']');
        return sb.toString();
    }

    public void remove(Object key) {
        int hash=Hash(key.hashCode(),table.length);
        if(table[hash]!=null) {
            Node2 temp=table[hash];
            Node2 temp1=temp;
            while(temp!=null) {
                if(temp.key.equals(key)) {
                    if(temp.next!=null) {
                        temp1.next=temp.next;
                    }else {
                        temp1.next=null;
                    }
                }else {
                    temp1=temp;
                    temp=temp.next;
                }
            }
        }
    }

    public Object get(Object key){
        int hash=Hash(key.hashCode(),table.length);
        Object value = null;
        if(table[hash]!=null) {
            Node2 temp=table[hash];
            while(temp!=null) {
                if(temp.key.equals(key)) {
                    value=temp.value;
                    return value;
                }else {
                    temp=temp.next;
                }
            }
        }
        return value;

    }
    public int Hash(int Hashcode,int length){
        return Hashcode&(length-1);
    }
    public static void main(String[] args) {
        HashMap map=new HashMap();
        map.put("usename","甘文博");
        map.put("password","123456");
        System.out.println(map);
        System.out.println("get方法获取value");
        System.out.println("usename:"+map.get("usename"));
        System.out.println("password:"+map.get("password"));
    }
}