import java.util.Scanner;
class Exercises{
	
	public static void main(String[] args){
		// 一、计算单细胞繁殖数量
		//count 表示细菌的数量
		// int count = 1;
		
		
		// for(int i=1;i<=9;i++){
			//每循环一次，细菌繁殖一代
			// count*=2;
		// }
		
		// System.out.println("第十代菌落中的细菌数量为："+count);
	
	
		// 二、
		// 1. 输入一个值
		// Scanner s = new Scanner(System.in);
		// System.out.println("请您输入一个整数：");
		// int num = s.nextInt();
		
		// 2. 让这个值和它之后的数相加
		// 3. 判断 相加之后的和，如果大于100，则结束，否则重复第2步
		
		// int i= num+1;
		// for(;num<=100;i++){
			// num += i;
		// }
		
		// 4. 打印，这些数的和，以及最后加到的那个数的值
		// System.out.println("这些数的和为："+num);
		// System.out.println("最后加到的数："+(i-1));
		
		// 三、根据考试成绩判断等级
		
		// 四、计算小球弹跳
		
		
		// 小球高度
		// double height = 80;
		
		// 记录小球经过的距离
		// double length = 0;
		
		// 记录小球落地的次数
		// int count = 0;
		
		// while(true){
			// 1. 先下落
			// length += height; // 小球下落经历了 height
			
			// 小球落地
			// count++;
			
			// if (count == 6){
				// System.out.println("小球第六次落地，经过了："+length);
				// height /= 2;  //小球弹起来之后的高度
				// System.out.println("小球第六次弹起来"+height);
				// break;
			// }
			
			// 2. 反弹起来
			// height /= 2;  //小球弹起来之后的高度
			
			// length += height; // 小球弹起起经历了 height
		// }

		
		
		
		// 六、报数
		// int count = 1;
		// A:for(int i=1;i<=8;i++){
			// for(int j=1;j<=8;j++){
				// if(i==2 && j==5){
					// break A;
				// }
				// System.out.println("第"+i+"排,第"+j+"列："+count);
				// count++;
			// }
		// }
		
		
		// A:for(int i=1;i<=4;i++){
			// for(int j=1;j<=10;j++){
				// if(i==3 && j==6){
					// System.out.println("第"+i+"排，第"+j+"个：空的");
					// break A;
				// }else{
					// System.out.println("第"+i+"排，第"+j+"个：有车");
				// }
			// }
		// }
		

		// for(int i=1;i<=4;i++){
			// for(int j=1;j<=10;j++){
				// if(j!=1 && j!=10){
					// System.out.println("第"+i+"排，第"+j+"个：可售");
				// }
			// }
		// }
		
		
		// for(int i=1;i<=4;i++){
			// for(int j=1;j<=4;j++){
				// if((i==1&&j==3) || (i==3&&j==2)){
					// System.out.println("第"+i+"排，第"+j+"个：被占了");
				// }else{
					// System.out.println("第"+i+"排，第"+j+"个：空的");
				// }
			// }
		// }
		
		
		// 蜗牛爬井
		
		// 蜗牛爬的高度
		// int height = 0;
		// int day = 1;
		
		// while(true){
			// 白天上两米
			// height+=2;
			
			// 判断是否到达井口 
			// if(height>=10){
				// break;
			// }
			
			// 晚上落一米
			// height-=1;
			
			// day++;
		// }
		
		// System.out.println("蜗牛爬了"+day);
		
		
		// for(int i=1;i<=9;i++){
			// for(int j=1;j<=9;j++){
				
				// if(i>j){
					// System.out.print("       \t");
				// }else{
					// System.out.print(i+"×"+j+"="+(i*j)+"\t");
				// }
			// }
			// System.out.println();
		// }
		
		 
		// 给一个任意的整数 a
		// 找出它所有的因数（能够整除a的数）
		
		// Scanner sc = new Scanner(System.in);
		
		// 输入一个数
		// System.out.println("请您输入一个整数：");
		// int num = sc.nextInt();
		
		for(int num=1;num<=1000;num++){
			// 因数之和
			int sum = 0;
			
			// 找 num 的因数
			for(int i=1; i<num; i++){
				if(num % i==0){
					// System.out.println(num+"的因数："+i);
					// 把因数加到 sum 中
					sum+=i;
				}
			}
			
			// 判断 sum 与 num 想不想等
			if(sum==num){
				System.out.println(num+"是完数");
			}
		}
		
		
		
		
	}
}