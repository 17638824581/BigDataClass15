import java.util.Random;
import java.util.Scanner;

class GetRandom{
	public static void main(String[] args){
		
		
		// �����ֵ�С��Ϸ
		
		// 1. ����һ�� [1~100] �������
		Random r = new Random();
		int number = r.nextInt(100) + 1;
		
		// 2. ���û�����²������
		Scanner s = new Scanner(System.in);
		
		for(int i=1;i<=5;i++){
			System.out.println("��������²�����֣�0~100����");
			int input = s.nextInt();
			
			// 3. �ж��û��²�Ľ��,������Ӧ����ʾ
			if(number == input){
				System.out.println("�¶��ˣ�");
				break;
			}else if(input > number){
				System.out.println("�´��ˣ�");
			}else{
				System.out.println("��С�ˣ�");
			}
		}
		
		System.out.println("��ȷ���ǣ�"+number);
		
		
	}
}