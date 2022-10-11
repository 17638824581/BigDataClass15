// 循环控制，结合if语句来用
//   break：直接停止整个循环
//   continue：结束本次循环，开始下次一次循环

class CycleContiol{
	
	public static void main(String[] args){
		
		// A:for(int j=1;j<=10;j++){
			
			// 打印一行数字
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
					// System.out.println("我爱你！i="+i+",j="+j+",k="+k);
				// }
			// }
		// }
		
		
		// 嵌套循环，打印九九乘法表
		
		for(int j=1;j<=9;j++){
			for(int i=1;i<=j;i++){
				System.out.print(j+"×"+i+"="+(i*j)+"  ");
			}
			System.out.println();
		}
		
		
		
		
		
	
	}
	
}