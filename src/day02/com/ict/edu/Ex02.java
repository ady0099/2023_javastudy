package day02.com.ict.edu;
class Ex02{
    public static void main(String[] args){
       // ���� : �� ���ڸ� ���Ѵ�
       //          ���ڸ� ����ϴ� ����� "Ȭ����ǥ�� ����ϴ� ���"
       //          char ���� ��� 
       //          ���ڴ� ���ڷ� ����ȴ�.

       //  char ����
        char c1;
    
        // ����
        c1 = 97;

        char c65535 = 65535;
        char c0 = 0;

        System.out.println("" + c1 + c0 + c65535);
        System.out.println("===================");
        // ����� ������ �ѹ���
        char c2 = 'a';
        char c20 = 'a' - 32;
        char c21 = (char)(c2 - 32);
        System.out.println("c20="+c21);
        System.out.println("char���� int�� ��������� int���̹Ƿ� char������ �ٽ� ����ȯ�� ���־���Ѵ�");
        char c3 = '0';
        // 0�� �����ϴ� �� �ƴ϶� �ƽ�Ű�ڵ� 48�� �ǹ��ϴ� 0�̴�

        char c4 = '국';
        System.out.println(c2);
        System.out.println(c20);
        System.out.println(c3);
        System.out.println(c3+c3);
        System.out.println((char)(c3+c3));
        System.out.println(c4);
    }
}