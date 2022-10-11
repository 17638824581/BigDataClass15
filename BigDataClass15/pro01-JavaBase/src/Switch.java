import java.util.Scanner;

class Switch{
	
	public static void main(String[] args){
		
		// 某个超市，举行抽奖活动
		
		// 抽中 1号球，打一折
		// 抽中 2、3号球，打四折
		// 抽中 4、5号球，打八折
		// 抽中 6、7、8号球，送小礼品
		// 抽中 9、10号球，谢谢回顾
		// 
		Scanner sc = new Scanner(System.in);
		
		// 让用户自己输入，消费金额
		double money;
		System.out.println("请您输入您消费金额：");
		money = sc.nextDouble();
		
		// 让用户自己输入，抽中了几号球
		int number;
		System.out.println("请输入您抽中了几号球（1~10）：");
		number = sc.nextInt();
		
		
		// 也可以使用 switch 语句 实现多分支的效果
		// switch 效率更高
		// switch 穿透特性，在分支中，只要没有遇见 break，代码会继续往下执行
		switch(number){
			case 1:
				System.out.println("您抽中了"+number+"号球，打一折！您实际需要支付："+(money*0.1));
				break;
			case 2:
			case 3:
				System.out.println("您抽中了"+number+"号球，打四折！您实际需要支付："+(money*0.4));
				break;
			case 4:
			case 5:
				System.out.println("您抽中了"+number+"号球，打八折！您实际需要支付："+(money*0.8));
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("您抽中了"+number+"号球，送您小礼品！您实际需要支付："+ money);
				break;
			case 9:
			case 10:
				System.out.println("您抽中了"+number+"号球，感谢惠顾！您实际需要支付："+ money);
				break;
			default:
				System.out.println("您抽到的球号不存在！");
				break;
		}
		
	}
	
}