import java.util.Scanner;
class ForLoop{
	
	public static void main(String[] args){
		
		// for ѭ��
		
		
		// һֱ��ѭ����ͣ������
		// ��ѭ��
		// for(;;){
			// �ظ�ִ��������
			// System.out.println("����û�У�");
		// }
		
		
		// ����ͨ��ѭ�� ��ӡ���� 1~100
		// Ҳ����ͨ��ѭ�� ��ӡ���� 100~1
		
		// ��ӡ 1~100 ���ڵ�����ż��
		
		// ���� 1~100 �������е�ż��֮��
		
		// int sum = 0;
		
		// for(int i=2 ; i<=100 ; i+=2){
			// �� i ��ֵ �ӵ� sum ��
			// sum += i;
		// }
		
		// System.out.println(" 1~100 �������е�ż��֮��:" + sum);
		
		// 1. ���� 1~100 �������� 3 �ı���֮��
		// 2. ���� 1~100 �������� 5 �ı���֮��
		
		// int sum3 = 0;
		// int sum5 = 0;
		
		// for(int i=1;i<=100;i++){
			
			// ���� 3 �ı��� 
			// if(i % 3 == 0){
				// sum3 += i;
			// }
			
			// ���� 5 �ı���
			// if(i % 5 ==0){
				// sum5 += i;
			// }
			
		// }
		
		// System.out.println(" 3 �ı���֮��: "+ sum3);
		// System.out.println(" 5 �ı���֮�ͣ�" + sum5);
		
		
		// �� 7 �������ܺ���������7 �Լ� 7�ı�������
		
//		�ó�����ģ���� ��7����Ϸ
//		�� 1 ���� 100
		for(int i=1;i<=1000;i++){
			
//			�ж� 7 �ı���
			if(i % 7 ==0){
				System.out.println(i+"�ǵı���������");
			}
			// �ж� ��λ�� �Ƿ�Ϊ 7
			else if(i/100 == 7 || i/10%10 == 7){
				System.out.println(i+"����7������");
			}
			else{
				System.out.println(i);
			}
			
		}
		
		
		// ��ӡ ˮ�ɻ���
		
		// 1. ����λ��
		// 2. ����  ��λ��^3+ʮλ��^3+��λ��^ == �����
		
		// int count = 0;
		
		// for(int i=100;i<=999;i++){
			
			//��i�ĸ�λ��
			// int ge = i % 10;
			
			//��i��ʮλ��
			// int shi = i / 10 % 10;
			
			//��i�İ�λ��
			// int bai = i / 100;
			
			
			// if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i){
				// count ++;
			// }
		// }
		
		// System.out.println("�м���ˮ�ɻ�����"+count);
		
		// int i=0;
		// for(; i<10 ; i++){
			// System.out.println(i);
		// }
		
		// System.out.println("----------");
		// System.out.println(i);
		
		
		
		// ����һ�� ����С����
		
		// дһ��ѭ�������û����빺�����Ʒ�ļ۸�
		// ѭ��5��
		// ��ӡ�ܼ�
		
		
		// ѭ��5�ε�ѭ��
			// 1. ���û����빺����Ʒ�۸�
			// 2. �������Ʒ�ļ۸�ӵ� �ܼ���
		// ��ӡ�ܼ�
		
		// Scanner sc = new Scanner(System.in);
		
		// double sumMoney = 0;
		
		// for(int i=0;i < 5;i++){
			
			// System.out.println("���������"+(i+1)+"����Ʒ�ļ۸�:");
			// double price = sc.nextDouble();
			
			// sumMoney += price;
		// }
		
		// System.out.println("�����ѵ��ܶ��ǣ�"+sumMoney);
		
		
		
		int a = 10;
		
		
		if(a > 20){
			System.out.println(20);
		}else if(a > 5){
			System.out.println(30);
		}else if(a/0==0){
			System.out.println(40);
		}else if(a > 50){
			System.out.println(50);
		}
		
	}
	
}