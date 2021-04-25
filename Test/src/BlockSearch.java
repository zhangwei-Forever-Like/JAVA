import java.util.ArrayList;

//�ֿ����
public class BlockSearch {

  //���ڴ���ٽ��
  private int[] index;
  //���ڴ�Ÿ������������ĵ�ַ
  private ArrayList[] list;

  //�вι��췽��
  public BlockSearch(int[] index) {
      if (null != index && index.length != 0) {
          this.index = index;
          this.list = new ArrayList[index.length + 1];
          for (int i = 0; i < list.length; i++) {
              list[i] = new ArrayList();//��ʼ������
          }
      }
  }

  //��������
  public void insert(int value) {
      //ͨ�����ֲ��ҿ��ٶ�λ���������Ŀ������0,1,2,3
      int i = binarySearch(value);
      list[i].add(value);
  }

  //���ַ�����
  private int binarySearch(int value) {
      //index������ʼ�Ǳ�Ϊ0
      int start = 0;
      //index������ֹ�Ǳ�Ϊ2
      int end = index.length - 1;
      int mid = -1;
      //Ŀ��ֵӦ�ô�ŵ�����
      int fenqushu = -1;
      while (start <= end) {
          mid = (start + end) / 2;
          if (index[mid] > value) {
              end = mid - 1;
              //��start==end�����С��index[mid]��end = mid - 1;֮�󲻷�������
              fenqushu = start;
          } else {
              //�����ȣ��������
              start = mid + 1;
              //��start==end���������index[mid]��start = mid + 1;֮�󲻷�������
              fenqushu = start;
          }
      }
      return fenqushu;
  }

  //����Ԫ��
  public boolean search(int data) {
      //ȷ����Ԫ�����ĸ�����
      int i = binarySearch(data);
      //�����÷�����Ԫ�ؽ��в���
      for (int j = 0; j < list[i].size(); j++) {
          if (data == (int) list[i].get(j)) {
              System.out.println(String.format("����Ԫ��Ϊ��: %d��  ��%d�� Ԫ��", i, j));
              return true;
          }
      }
      return false;
  }

  //��ӡÿ���Ԫ��
  public void printAll() {
      for (int i = 0; i < list.length; i++) {
          ArrayList l = list[i];
          System.out.print("ArrayList[" + i + "]:");

          for (int j = 0; j < l.size(); j++) {
              System.out.print(l.get(j) + "    ");
          }
          System.out.println("\n");
      }
  }

  //����
  public static void main(String[] args) {
      //���������ֽ�㣬�ĸ�����
      int[] index = {10, 20, 30};
      //���ù��췽����������������䣬���ڴ�ŷ��ϸ����������
      BlockSearch blocksearch = new BlockSearch(index);
      //�������ݣ���������ݵĴ�С�������Ӧ������
      blocksearch.insert(1);
      blocksearch.insert(11);
      blocksearch.insert(21);
      blocksearch.insert(2);
      blocksearch.insert(12);
      blocksearch.insert(22);
      blocksearch.insert(5);
      blocksearch.insert(15);
      blocksearch.insert(25);
      blocksearch.insert(31);

      //������������е�ֵ
      blocksearch.printAll();

      //����ֵ�Ƿ����
      System.out.println("����ֵ15   ���" + blocksearch.search(15) + "\n");
      System.out.println("����ֵ29   ���" + blocksearch.search(29) + "\n");
  }
}
