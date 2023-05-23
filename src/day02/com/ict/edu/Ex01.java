package day02.com.ict.edu;
class Ex01{
    public static void main(String[] args){
      // �ּ� : ���������� �ʴ� ��, ������ ������ ������ �� ���

      // ���� : ���α׷��� ���� ������ �������� ���� �� �ִ»���
      // ���� :    �ڷ���   ���� �̸� ;
      //                �����̸� = �� ������ ;

      // �� �ڷ����� ���� 
      boolean b1 ;
      b1 = true ;

      // b1�� ȣ���غ���
      // **�̸��� ȣ���ϸ� �����Ͱ� ���´�. 
      System.out.println(b1);

      // b1�� ���¸� true���� false�� ��������
      // boolean b1;  // ������ �ѹ��� ����
      b1 = false;
      System.out.println(b1);

      if(b1==false){
         b1 = true;
         System.out.println(!b1+"�� "+"b1�� "+b1+"�� �����մϴ�.\nb1="+b1);
      }else{
         System.out.println("�����Դϴ�.");
      }

      // ����� ������ �ѹ���
      boolean b2=true;
      System.out.println("b2="+b2);

      b2 = false ; 

      // boolean b3 = 10.0;
    }
}