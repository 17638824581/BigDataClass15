// ѭ�����ƣ����if�������
//   break��ֱ��ֹͣ����ѭ��
//   continue����������ѭ������ʼ�´�һ��ѭ��

class CycleContiol{
	
	public static void main(String[] args){
		
		// A:for(int j=1;j<=10;j++){
			
			// ��ӡһ������
			// for(int i=1;i<=10;i++){
				
				// if(i==4){
					// break A;
				// }
				
				// System.out.println("j="+j+",i="+i);
			// }
				
		// }
		
		// for(int i=2;i<20;i+=2){
			// System.out.println(i);
		// }
		// for(int i=1;i<=10;i++){
			// for(int j=1;j<=5;j++){
				// for(int k=1;k<=5;k++){
					// System.out.println("�Ұ��㣡i="+i+",j="+j+",k="+k);
				// }
			// }
		// }
		
		
		// Ƕ��ѭ������ӡ�žų˷���
		
		for(int j=1;j<=9;j++){
			for(int i=1;i<=j;i++){
				System.out.print(j+"��"+i+"="+(i*j)+"  ");
			}
			System.out.println();
		}
		
		
		
		
		
	
	}
	
}