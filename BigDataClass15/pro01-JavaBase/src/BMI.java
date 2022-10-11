import java.util.Scanner;

class BMI{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 输入身高（m）
		System.out.println("请您输入身高（m）：");
		double height = sc.nextDouble();
		
		// 2. 输入体重（kg）
		System.out.println("请您输入体重（kg）：");
		double weight = sc.nextDouble();
		
		// 3. 计算 BMI = 体重 / 身高^2
		double bmi = weight / (height * height);
		
		// 4. 打印 BMI 值
		System.out.println("您的bmi值为："+bmi);
		
	}
}