public class DeBug {
    public static void main(String[] args) {

        // 计算 1~100 的偶数的和

        int sum = 0;

        for (int i = 1; i <= 100 ; i++) {
            if (i % 2==0){
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
