//1. ����Scanner��
import java.util.Scanner;

class Calculator{
	
	// ������
	public static void main(String[] args){
		// �������������������������� �ӡ������ˡ�����ģ������
		
		// 2.���� Scanner �����
		Scanner sc = new Scanner(System.in);
		
		// ��ӡ��ʾ
		System.out.println("�������һ������");
		// 3. ʹ��sc��������
		double a = sc.nextDouble();
		
		System.out.println("������ڶ�������");
		double b = sc.nextDouble();
		
		// �õ�����������������
		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.println(a+" - "+b+" = "+(a-b));
		System.out.println(a+" * "+b+" = "+(a*b));
		System.out.println(a+" / "+b+" = "+(a/b));
		System.out.println(a+" % "+b+" = "+(a%b));
		
	}
}