import java.util.Scanner;

class BMI{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		// 1. ������ߣ�m��
		System.out.println("����������ߣ�m����");
		double height = sc.nextDouble();
		
		// 2. �������أ�kg��
		System.out.println("�����������أ�kg����");
		double weight = sc.nextDouble();
		
		// 3. ���� BMI = ���� / ���^2
		double bmi = weight / (height * height);
		
		// 4. ��ӡ BMI ֵ
		System.out.println("����bmiֵΪ��"+bmi);
		
	}
}