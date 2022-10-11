class Operator{

	// 主方法
	public static void main(String[] args){
		
		// 要运行的代码，写在主方法里面
		// int a = 10;
		// int b = 20;
		
		
		// System.out.println("a = "+a);
		// System.out.println("b = "+b);
		// System.out.println("a > b = "+(a > b));
		// System.out.println("a < b = "+(a < b));
		// System.out.println("a >= b = "+(a >= b));
		// System.out.println("a <= b = "+(a <= b));
		
		
		// System.out.println("a == b = "+(a == b));
		// System.out.println("a != b = "+(a != b));
		
		
		// int age = 18;
		// System.out.println("是否成年？"+(age>=18));
		
		// System.out.println(b > a);
		
		// int number = 8;
		
		// 判断number是不是偶数，双数
		
		// boolean isEven = number % 2 == 0;
		
		// System.out.println(number + "是否为偶数：" + isEven);
		
		
		// 找对象，
		// 1.得是个女的
		// 2.年龄得>=18
		
		
		// 写一个 空姐招聘条件
		
		// int age = 25;
		// double height = 1.79;
		// double weight = 55;
		// char sex = '女';
		
		// 1. 年龄大于 18 小于等于 35
		// 2. 身高大于 1.8米
		// 3. 性别是女
		// 4. 体重小于 60 公斤
		
		// boolean isPass = 18 < age & age <= 35 & height > 1.8 & weight < 60 & sex == '女';
		
		// System.out.println("性别："+sex+"，年龄是："+age+"，身高是："+height+"，体重是："+weight);
		// System.out.println("是否通过："+isPass);
		
		// int age = 10;
		// char sex = '女';
		
		// boolean isPass = age >= 18 & sex == '女';
		
		
		// System.out.println("这个人是"+age+"岁，性别是"+sex+",是否满足要求："+isPass);
		
		
		// 逻辑 或： |
		
		// String food1 = "米饭";
		// String food2 = "面条";
		// String food3 = "饺子";
		
		
		
		// String eatFood = food3;
		
		//吃米饭或者饺子
		// boolean isEat = eatFood == "米饭" | eatFood == "饺子";
		
		// System.out.println("给你的食物是"+eatFood+",是否要吃："+ isEat);
		
		// int age = 18;
		
		// 判断age不等于18
		// System.out.println( ! (age == 18));
		
		
		// 逻辑运算符
		// 1. 逻辑与  &：两边都为 true，结果就是 true
		// 2. 逻辑或  |：两边都为 false，结果就是 false
		// 3. 逻辑非  !：true 变 false，false 变 true
		
		// int a = 10;
		// int b = 20;
		
		// 一元运算符：操作数只有一个  ！true
		// 二元运算符：操作数有两个  5 + 10
		// System.out.println(true | ! true);
		
		// boolean c = t | true & false;
		
		// System.out.println(c);
		
		// 逻辑异或 ^ 两个值相同为 flase，不同为 true
		
		// System.out.println(true ^ true);
		
		// 短路逻辑运算符： 
		// &&：短路与，效果和 & 相同，具有短路效果
		// ||：短路或,
		
		// int a = 10;
		
		// System.out.println(a*2 >= 10 || a/0 == 0);
		
		// int a = 25;
		// int b = 25;
		// int c = 20;
		
		
		// int min = a<b ? (a<c ? a : c) : (b<c ? b : c);
		
		
		// System.out.println("最小值是:"+min);
		
		
		// 通过计算，找出 a 、b 之间最大的那个
		
		
		// 我们可以通过 三元表达式 来找到最大值
		
		// a>b ? a : b 
		// 如果 a>b 满足，结果就是 a, 否则结果就是 b
		
		// System.out.println("最大值是："+ (a>b ? a : b));
		
		
		// int tager1 = 200;
		// int tager2 = 200;
		
		// System.out.println("两只老虎体重是否相同："+(tager1==tager2 ? "相同" : "不相同"));
		
		// int height1 = 150;
		// int height2 = 210;
		// int height3 = 165;
		
		// int maxHeight = height1 > height2 ? (height1 > height3 ? height1 : height3) : (height2 > height3 ? height2 : height3);
		
		// System.out.println("最高身高是："+maxHeight);
		
		// int a = 10;
		// 左移位 <<
		// 每左移位1位，就乘以2
		
		
		// int a = 10;  // 10  ->  1010
		
		// int b = a >> 2;  // 101 右移位 1 位  
		
		// 右移位 >>
		// 每右移位1位，就除以2
		// System.out.println(a << 5);  // a 左移位 5 位，就是乘以 2的5次方
		
		
		
		// 位运算符 是计算  2进制数  的
		// 按位与    &：两个数都为1，结果是1,否则为0
		// 按位或    |：两个数都是0，结果未0，否则为1
		// 按位取反  ~：1变0，0变1
		// 按位异或  ^: 两个数相同为0，不同为1
		
		// 打印输出语句
		// System.out.println(5 ^ 10);
		
		// 数据输入
		
		
		
		
	} 
}