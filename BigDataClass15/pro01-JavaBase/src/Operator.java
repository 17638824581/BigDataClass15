class Operator{

	// ������
	public static void main(String[] args){
		
		// Ҫ���еĴ��룬д������������
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
		// System.out.println("�Ƿ���ꣿ"+(age>=18));
		
		// System.out.println(b > a);
		
		// int number = 8;
		
		// �ж�number�ǲ���ż����˫��
		
		// boolean isEven = number % 2 == 0;
		
		// System.out.println(number + "�Ƿ�Ϊż����" + isEven);
		
		
		// �Ҷ���
		// 1.���Ǹ�Ů��
		// 2.�����>=18
		
		
		// дһ�� �ս���Ƹ����
		
		// int age = 25;
		// double height = 1.79;
		// double weight = 55;
		// char sex = 'Ů';
		
		// 1. ������� 18 С�ڵ��� 35
		// 2. ��ߴ��� 1.8��
		// 3. �Ա���Ů
		// 4. ����С�� 60 ����
		
		// boolean isPass = 18 < age & age <= 35 & height > 1.8 & weight < 60 & sex == 'Ů';
		
		// System.out.println("�Ա�"+sex+"�������ǣ�"+age+"������ǣ�"+height+"�������ǣ�"+weight);
		// System.out.println("�Ƿ�ͨ����"+isPass);
		
		// int age = 10;
		// char sex = 'Ů';
		
		// boolean isPass = age >= 18 & sex == 'Ů';
		
		
		// System.out.println("�������"+age+"�꣬�Ա���"+sex+",�Ƿ�����Ҫ��"+isPass);
		
		
		// �߼� �� |
		
		// String food1 = "�׷�";
		// String food2 = "����";
		// String food3 = "����";
		
		
		
		// String eatFood = food3;
		
		//���׷����߽���
		// boolean isEat = eatFood == "�׷�" | eatFood == "����";
		
		// System.out.println("�����ʳ����"+eatFood+",�Ƿ�Ҫ�ԣ�"+ isEat);
		
		// int age = 18;
		
		// �ж�age������18
		// System.out.println( ! (age == 18));
		
		
		// �߼������
		// 1. �߼���  &�����߶�Ϊ true��������� true
		// 2. �߼���  |�����߶�Ϊ false��������� false
		// 3. �߼���  !��true �� false��false �� true
		
		// int a = 10;
		// int b = 20;
		
		// һԪ�������������ֻ��һ��  ��true
		// ��Ԫ�������������������  5 + 10
		// System.out.println(true | ! true);
		
		// boolean c = t | true & false;
		
		// System.out.println(c);
		
		// �߼���� ^ ����ֵ��ͬΪ flase����ͬΪ true
		
		// System.out.println(true ^ true);
		
		// ��·�߼�������� 
		// &&����·�룬Ч���� & ��ͬ�����ж�·Ч��
		// ||����·��,
		
		// int a = 10;
		
		// System.out.println(a*2 >= 10 || a/0 == 0);
		
		// int a = 25;
		// int b = 25;
		// int c = 20;
		
		
		// int min = a<b ? (a<c ? a : c) : (b<c ? b : c);
		
		
		// System.out.println("��Сֵ��:"+min);
		
		
		// ͨ�����㣬�ҳ� a ��b ֮�������Ǹ�
		
		
		// ���ǿ���ͨ�� ��Ԫ���ʽ ���ҵ����ֵ
		
		// a>b ? a : b 
		// ��� a>b ���㣬������� a, ���������� b
		
		// System.out.println("���ֵ�ǣ�"+ (a>b ? a : b));
		
		
		// int tager1 = 200;
		// int tager2 = 200;
		
		// System.out.println("��ֻ�ϻ������Ƿ���ͬ��"+(tager1==tager2 ? "��ͬ" : "����ͬ"));
		
		// int height1 = 150;
		// int height2 = 210;
		// int height3 = 165;
		
		// int maxHeight = height1 > height2 ? (height1 > height3 ? height1 : height3) : (height2 > height3 ? height2 : height3);
		
		// System.out.println("�������ǣ�"+maxHeight);
		
		// int a = 10;
		// ����λ <<
		// ÿ����λ1λ���ͳ���2
		
		
		// int a = 10;  // 10  ->  1010
		
		// int b = a >> 2;  // 101 ����λ 1 λ  
		
		// ����λ >>
		// ÿ����λ1λ���ͳ���2
		// System.out.println(a << 5);  // a ����λ 5 λ�����ǳ��� 2��5�η�
		
		
		
		// λ����� �Ǽ���  2������  ��
		// ��λ��    &����������Ϊ1�������1,����Ϊ0
		// ��λ��    |������������0�����δ0������Ϊ1
		// ��λȡ��  ~��1��0��0��1
		// ��λ���  ^: ��������ͬΪ0����ͬΪ1
		
		// ��ӡ������
		// System.out.println(5 ^ 10);
		
		// ��������
		
		
		
		
	} 
}