import java.util.Scanner;
class Exercises{
	
	public static void main(String[] args){
		// һ�����㵥ϸ����ֳ����
		//count ��ʾϸ��������
		// int count = 1;
		
		
		// for(int i=1;i<=9;i++){
			//ÿѭ��һ�Σ�ϸ����ֳһ��
			// count*=2;
		// }
		
		// System.out.println("��ʮ�������е�ϸ������Ϊ��"+count);
	
	
		// ����
		// 1. ����һ��ֵ
		// Scanner s = new Scanner(System.in);
		// System.out.println("��������һ��������");
		// int num = s.nextInt();
		
		// 2. �����ֵ����֮��������
		// 3. �ж� ���֮��ĺͣ��������100��������������ظ���2��
		
		// int i= num+1;
		// for(;num<=100;i++){
			// num += i;
		// }
		
		// 4. ��ӡ����Щ���ĺͣ��Լ����ӵ����Ǹ�����ֵ
		// System.out.println("��Щ���ĺ�Ϊ��"+num);
		// System.out.println("���ӵ�������"+(i-1));
		
		// �������ݿ��Գɼ��жϵȼ�
		
		// �ġ�����С����
		
		
		// С��߶�
		// double height = 80;
		
		// ��¼С�򾭹��ľ���
		// double length = 0;
		
		// ��¼С����صĴ���
		// int count = 0;
		
		// while(true){
			// 1. ������
			// length += height; // С�����侭���� height
			
			// С�����
			// count++;
			
			// if (count == 6){
				// System.out.println("С���������أ������ˣ�"+length);
				// height /= 2;  //С������֮��ĸ߶�
				// System.out.println("С������ε�����"+height);
				// break;
			// }
			
			// 2. ��������
			// height /= 2;  //С������֮��ĸ߶�
			
			// length += height; // С���������� height
		// }

		
		
		
		// ��������
		// int count = 1;
		// A:for(int i=1;i<=8;i++){
			// for(int j=1;j<=8;j++){
				// if(i==2 && j==5){
					// break A;
				// }
				// System.out.println("��"+i+"��,��"+j+"�У�"+count);
				// count++;
			// }
		// }
		
		
		// A:for(int i=1;i<=4;i++){
			// for(int j=1;j<=10;j++){
				// if(i==3 && j==6){
					// System.out.println("��"+i+"�ţ���"+j+"�����յ�");
					// break A;
				// }else{
					// System.out.println("��"+i+"�ţ���"+j+"�����г�");
				// }
			// }
		// }
		

		// for(int i=1;i<=4;i++){
			// for(int j=1;j<=10;j++){
				// if(j!=1 && j!=10){
					// System.out.println("��"+i+"�ţ���"+j+"��������");
				// }
			// }
		// }
		
		
		// for(int i=1;i<=4;i++){
			// for(int j=1;j<=4;j++){
				// if((i==1&&j==3) || (i==3&&j==2)){
					// System.out.println("��"+i+"�ţ���"+j+"������ռ��");
				// }else{
					// System.out.println("��"+i+"�ţ���"+j+"�����յ�");
				// }
			// }
		// }
		
		
		// ��ţ����
		
		// ��ţ���ĸ߶�
		// int height = 0;
		// int day = 1;
		
		// while(true){
			// ����������
			// height+=2;
			
			// �ж��Ƿ񵽴ﾮ�� 
			// if(height>=10){
				// break;
			// }
			
			// ������һ��
			// height-=1;
			
			// day++;
		// }
		
		// System.out.println("��ţ����"+day);
		
		
		// for(int i=1;i<=9;i++){
			// for(int j=1;j<=9;j++){
				
				// if(i>j){
					// System.out.print("       \t");
				// }else{
					// System.out.print(i+"��"+j+"="+(i*j)+"\t");
				// }
			// }
			// System.out.println();
		// }
		
		 
		// ��һ����������� a
		// �ҳ������е��������ܹ�����a������
		
		// Scanner sc = new Scanner(System.in);
		
		// ����һ����
		// System.out.println("��������һ��������");
		// int num = sc.nextInt();
		
		for(int num=1;num<=1000;num++){
			// ����֮��
			int sum = 0;
			
			// �� num ������
			for(int i=1; i<num; i++){
				if(num % i==0){
					// System.out.println(num+"��������"+i);
					// �������ӵ� sum ��
					sum+=i;
				}
			}
			
			// �ж� sum �� num �벻���
			if(sum==num){
				System.out.println(num+"������");
			}
		}
		
		
		
		
	}
}