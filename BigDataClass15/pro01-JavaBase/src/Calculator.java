//1. 导入Scanner类
import java.util.Scanner;

class Calculator{
	
	// 主方法
	public static void main(String[] args){
		// 输入两个数，让这两个数进行 加、减、乘、除、模等运算
		
		// 2.创建 Scanner 类对象
		Scanner sc = new Scanner(System.in);
		
		// 打印提示
		System.out.println("请输入第一个数：");
		// 3. 使用sc接收输入
		double a = sc.nextDouble();
		
		System.out.println("请输入第二个数：");
		double b = sc.nextDouble();
		
		// 拿到两个数，进行运算
		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.println(a+" - "+b+" = "+(a-b));
		System.out.println(a+" * "+b+" = "+(a*b));
		System.out.println(a+" / "+b+" = "+(a/b));
		System.out.println(a+" % "+b+" = "+(a%b));
		
	}
}