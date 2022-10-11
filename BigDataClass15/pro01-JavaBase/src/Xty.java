public class Xty{
	
	public static void main(String[] args){
		
		// 整数型
		// 1. 字节型 byte   (-128~127)
		// 2. 短整型 short  (-32768~32767)
		// 3. 整形   int    (-21亿多~21亿多)
		// 4. 长整型 long	(9开头的19位数字)
		
		// 浮点数型
		// 1. 单精度浮点型  float 
		// 2. 双精度浮点型  double
		
		// 单字符型 char
		
		// 布尔型 boolean
		
		// double i = 10;
		// int j = 20;
		
		// System.out.println(i + j);
		// System.out.println(i - j);
		// System.out.println(i * j);
		// System.out.println(i / j);
		
		//取余运算，% ，也叫取模
		// System.out.println(25 % 3);
		
		// double d = 10.0 / 3;
		
		// System.out.println(d);
		
		// System.out.println(0 % 10);
		
		// 字符型 char
		// char c = 'a';
		
		// 字符串型 String
		// String s = "我xx你xx，1748！";
		// 任何类型，和字符串相加，
		// 都会被连起来，转为字符串型
		
		String name = "小明";
		int age = 12;
		char sex = '男';
		double height = 1.35;
		double weight = 40.0;
		boolean isMan = false;
		
		System.out.println("他的姓名："+name);
		System.out.println("他的性别："+sex);
		System.out.println("他的年龄："+age);
		System.out.println("他的身高："+height+"米");
		System.out.println("他的体重："+weight+"公斤");
		System.out.println("他是否成年："+isMan);
	}
}