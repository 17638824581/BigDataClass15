import java.util.Scanner;
class ForLoop{
	
	public static void main(String[] args){
		
		// for 循环
		
		
		// 一直在循环，停不下来
		// 死循环
		// for(;;){
			// 重复执行这句代码
			// System.out.println("有人没有！");
		// }
		
		
		// 可以通过循环 打印出来 1~100
		// 也可以通过循环 打印出来 100~1
		
		// 打印 1~100 以内的所有偶数
		
		// 计算 1~100 以内所有的偶数之和
		
		// int sum = 0;
		
		// for(int i=2 ; i<=100 ; i+=2){
			// 将 i 的值 加到 sum 中
			// sum += i;
		// }
		
		// System.out.println(" 1~100 以内所有的偶数之和:" + sum);
		
		// 1. 计算 1~100 以内所有 3 的倍数之和
		// 2. 计算 1~100 以内所有 5 的倍数之和
		
		// int sum3 = 0;
		// int sum5 = 0;
		
		// for(int i=1;i<=100;i++){
			
			// 挑出 3 的倍数 
			// if(i % 3 == 0){
				// sum3 += i;
			// }
			
			// 挑出 5 的倍数
			// if(i % 5 ==0){
				// sum5 += i;
			// }
			
		// }
		
		// System.out.println(" 3 的倍数之和: "+ sum3);
		// System.out.println(" 5 的倍数之和：" + sum5);
		
		
		// 逢 7 过，不能喊出，带有7 以及 7的倍数的数
		
//		用程序来模拟玩 逢7过游戏
//		从 1 喊到 100
		for(int i=1;i<=1000;i++){
			
//			判断 7 的倍数
			if(i % 7 ==0){
				System.out.println(i+"是的倍数，喊过");
			}
			// 判断 百位数 是否为 7
			else if(i/100 == 7 || i/10%10 == 7){
				System.out.println(i+"含有7，喊过");
			}
			else{
				System.out.println(i);
			}
			
		}
		
		
		// 打印 水仙花数
		
		// 1. 是三位数
		// 2. 它的  个位数^3+十位数^3+百位数^ == 这个数
		
		// int count = 0;
		
		// for(int i=100;i<=999;i++){
			
			//求i的个位数
			// int ge = i % 10;
			
			//求i的十位数
			// int shi = i / 10 % 10;
			
			//求i的百位数
			// int bai = i / 100;
			
			
			// if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i){
				// count ++;
			// }
		// }
		
		// System.out.println("有几个水仙花数："+count);
		
		// int i=0;
		// for(; i<10 ; i++){
			// System.out.println(i);
		// }
		
		// System.out.println("----------");
		// System.out.println(i);
		
		
		
		// 制作一个 收银小程序
		
		// 写一个循环，让用户输入购买的商品的价格
		// 循环5次
		// 打印总价
		
		
		// 循环5次的循环
			// 1. 让用户输入购买商品价格
			// 2. 把这件商品的价格加到 总价中
		// 打印总价
		
		// Scanner sc = new Scanner(System.in);
		
		// double sumMoney = 0;
		
		// for(int i=0;i < 5;i++){
			
			// System.out.println("请您输入第"+(i+1)+"件商品的价格:");
			// double price = sc.nextDouble();
			
			// sumMoney += price;
		// }
		
		// System.out.println("您消费的总额是："+sumMoney);
		
		
		
		int a = 10;
		
		
		if(a > 20){
			System.out.println(20);
		}else if(a > 5){
			System.out.println(30);
		}else if(a/0==0){
			System.out.println(40);
		}else if(a > 50){
			System.out.println(50);
		}
		
	}
	
}