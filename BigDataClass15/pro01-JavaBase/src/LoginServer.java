import java.util.Scanner;

class LoginServer{
	
	public static void main(String[] args){
		
		// Ԥ���û�����Ϊ  654321
		String realPassword = "654321";
		
		// ��֤�û���¼
		
		// 1. ��������һ������
		// 2. ��֤�����Ƿ���ȷ
			// �������ȷ�����ص�һ��
			// �����ȷ����½�ɹ�
			
		Scanner sc = new Scanner(System.in);
		String inputPassword;
		do{
			
			System.out.println("���������룺");
			inputPassword = sc.next();
			
			
			System.out.println("������������ǣ�"+inputPassword);
			
		// a.equals(b)  => true
		// a �� b �����ַ������Ա� a �� b �����ַ��������Ƿ�һ��
		}while(!inputPassword.equals(realPassword));
		
		System.out.println("��¼�ɹ���");
		
	}
}