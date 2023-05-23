package day02.com.ict.edu;
class Ex05{
    public static void main(String[] args){
        int kor = 90;
        int eng = 80;
        int math = 80;

        // ����
        // int sum = 90 + 80 + 80;  << Ʋ�� �� �ƴ� but �䱸���׿� �����ϱ� �����
        int sum = kor + eng + math;
        System.out.println("sum = "+sum);

        // ���
        int avg = sum/3 ;      // �Ҽ����� ����

        // �Ҽ��� ���� ���
        double avg2 = sum/3; // �Ҽ��� ���� ������ �ȳ���  => �� ��� ��ǻ� ������ �� Ŀ�� ��
        
        double avg3 = (double)(sum/3); // �Ҽ��� ���� ������ �ȳ���, ����� ��� ���**����

        double avg4 = (double)(sum)/3;   // sum�� double�� ĳ����

        double avg5 = sum/3.0;        // ���� �� int�� �ƴ� double�� ����

        System.out.println("avg = "+avg);
        System.out.println("avg2 = "+avg2);
        System.out.printf("avg3 = %.2f\n", avg3);
        System.out.printf("avg4 = %.3f\n", avg4);    
        System.out.printf("avg5 = %.4f\n", avg5);  
        System.out.println("avg5 = "+avg5);

        // ex) 83.3333... �� 100�� ���ϸ� 8333.3333..�� �ȴ�
        // ���⿡ int�� ����ȯ�� �ϸ� 8333�� ���´�
        // ���� 8333�� 100.0�� ������ �Ҽ��� ��°�ڸ����� ���� ��, 83.33�� ��������
        // **���� : 100���� ������ �ٽ� ������ ���´�

        // avg5 ������ �Ҽ��� 2�ڸ��������ϱ�
        double avg6 = (int)(avg5*100) / 100.0;
        System.out.println("avg6 = "+avg6);

     
        // ������ ���� ���� �ݴ��� ��Ȳ������ ex) 1472
        // (int)(1472/10)*10 = 1470

        int num1 = 1472;
        int num2 = (num1/10)*10;
        System.out.println(num2);
    }
}