import java.util.Scanner;

class Branch{
	
	public static void main(String[] args){
		// �ж��������������������ż��
		// Scanner sc = new Scanner(System.in);

		// 1. ���û�������������
		// System.out.println("�������������������");
		// int number = sc.nextInt();

		// 1. ����ʹ�� if
		// 2. ʹ�� if-else
		// 3. ʹ�� if-else if-else


		// if(number == 0){
			// System.out.println("number����");
		// }else if(number % 2 == 0){
			// System.out.println("number��ż��");
		// }else{
			// System.out.println("number������");
		// }
		
		// System.out.println("���������");
		
		
		
		// ���û���������
		
		// ���������ж�������� 
		//Ӥ����0~2�꣩��
		//��ͯ��3~12�꣩��
		//���꣨13~17����
		//���꣨18~40����
		//���꣨41~65����
		//���꣨����65��
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���������������䣺");
		// �����û����������
		int age = sc.nextInt();
		
		
		// ������� 0<=age<=2
		if(age < 0){
			System.out.println("����������������⣡");
		}else if(age <= 2){
			System.out.println("��Ӥ��");
		}else if(age <= 12){
			System.out.println("�Ƕ�ͯ");
		}else if(age <= 17){
			System.out.println("������");
		}else if(age <= 40){
			System.out.println("�ǳ���");
		}else if(age <= 65){
			System.out.println("������");
		}else{
			System.out.println("������");
		}
		
		System.out.println("���������");
	}
}