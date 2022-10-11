import java.util.Random;
import java.util.Scanner;

class GetRandom{
	public static void main(String[] args){
		
		
		// 猜数字的小游戏
		
		// 1. 生成一个 [1~100] 随机整数
		Random r = new Random();
		int number = r.nextInt(100) + 1;
		
		// 2. 让用户输入猜测的数字
		Scanner s = new Scanner(System.in);
		
		for(int i=1;i<=5;i++){
			System.out.println("请您输入猜测的数字（0~100）：");
			int input = s.nextInt();
			
			// 3. 判断用户猜测的结果,给出对应的提示
			if(number == input){
				System.out.println("猜对了！");
				break;
			}else if(input > number){
				System.out.println("猜大了！");
			}else{
				System.out.println("猜小了！");
			}
		}
		
		System.out.println("正确答案是："+number);
		
		
	}
}