import java.util.Scanner;

class LoginServer{
	
	public static void main(String[] args){
		
		// 预设用户密码为  654321
		String realPassword = "654321";
		
		// 验证用户登录
		
		// 1. 先让输入一次密码
		// 2. 验证密码是否正确
			// 如果不正确，返回第一步
			// 如果正确，登陆成功
			
		Scanner sc = new Scanner(System.in);
		String inputPassword;
		do{
			
			System.out.println("请输入密码：");
			inputPassword = sc.next();
			
			
			System.out.println("您输入的密码是："+inputPassword);
			
		// a.equals(b)  => true
		// a 和 b 都是字符串，对比 a 和 b 两个字符串内容是否一致
		}while(!inputPassword.equals(realPassword));
		
		System.out.println("登录成功！");
		
	}
}