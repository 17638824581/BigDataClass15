import java.util.Scanner;

class Switch{
	
	public static void main(String[] args){
		
		// ĳ�����У����г齱�
		
		// ���� 1���򣬴�һ��
		// ���� 2��3���򣬴�����
		// ���� 4��5���򣬴����
		// ���� 6��7��8������С��Ʒ
		// ���� 9��10����лл�ع�
		// 
		Scanner sc = new Scanner(System.in);
		
		// ���û��Լ����룬���ѽ��
		double money;
		System.out.println("�������������ѽ�");
		money = sc.nextDouble();
		
		// ���û��Լ����룬�����˼�����
		int number;
		System.out.println("�������������˼�����1~10����");
		number = sc.nextInt();
		
		
		// Ҳ����ʹ�� switch ��� ʵ�ֶ��֧��Ч��
		// switch Ч�ʸ���
		// switch ��͸���ԣ��ڷ�֧�У�ֻҪû������ break��������������ִ��
		switch(number){
			case 1:
				System.out.println("��������"+number+"���򣬴�һ�ۣ���ʵ����Ҫ֧����"+(money*0.1));
				break;
			case 2:
			case 3:
				System.out.println("��������"+number+"���򣬴����ۣ���ʵ����Ҫ֧����"+(money*0.4));
				break;
			case 4:
			case 5:
				System.out.println("��������"+number+"���򣬴���ۣ���ʵ����Ҫ֧����"+(money*0.8));
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("��������"+number+"��������С��Ʒ����ʵ����Ҫ֧����"+ money);
				break;
			case 9:
			case 10:
				System.out.println("��������"+number+"���򣬸�л�ݹˣ���ʵ����Ҫ֧����"+ money);
				break;
			default:
				System.out.println("���鵽����Ų����ڣ�");
				break;
		}
		
	}
	
}