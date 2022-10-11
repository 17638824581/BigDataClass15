import java.util.Scanner;

class Branch{
	
	public static void main(String[] args){
		// 判断输入的数，是奇数还是偶数
		// Scanner sc = new Scanner(System.in);

		// 1. 让用户输入任意整数
		// System.out.println("请您输入任意的整数：");
		// int number = sc.nextInt();

		// 1. 单独使用 if
		// 2. 使用 if-else
		// 3. 使用 if-else if-else


		// if(number == 0){
			// System.out.println("number是零");
		// }else if(number % 2 == 0){
			// System.out.println("number是偶数");
		// }else{
			// System.out.println("number是奇数");
		// }
		
		// System.out.println("程序结束！");
		
		
		
		// 让用户输入年龄
		
		// 根据年龄判断这个人是 
		//婴儿（0~2岁）、
		//儿童（3~12岁）、
		//少年（13~17）、
		//成年（18~40）、
		//中年（41~65）、
		//老年（大于65）
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请您输入您的年龄：");
		// 接收用户输入的整数
		int age = sc.nextInt();
		
		
		// 如果年龄 0<=age<=2
		if(age < 0){
			System.out.println("您输入的年龄有问题！");
		}else if(age <= 2){
			System.out.println("是婴儿");
		}else if(age <= 12){
			System.out.println("是儿童");
		}else if(age <= 17){
			System.out.println("是少年");
		}else if(age <= 40){
			System.out.println("是成年");
		}else if(age <= 65){
			System.out.println("是中年");
		}else{
			System.out.println("是老年");
		}
		
		System.out.println("程序结束！");
	}
}