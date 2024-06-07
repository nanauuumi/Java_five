import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class method {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		System.out.print("数字をいれてください: ");
		int first = scanner.nextInt();
		System.out.print("数字をいれてください: ");
		int second = scanner.nextInt();
		int sum = first + second;
		System.out.println(sum);
		System.out.println();
	
		double r;
		double area;
		System.out.print("半径：");
		r = scanner.nextDouble();
		area = r * r * 3.14;
		System.out.println("円の面積：" + area);
		System.out.println();
		scanner.close();
		
		int a,b;
		 a = 10;
		 b = 60;
		 if((0 >= a)&&(0 >= b));
			if(a == b);
			int min =Math.min(a, b);
			for(int i=min; i>=2; i--) {
				if(0 == (a%i)) {
					if(0 == (b%i)) {
						break;
					}
				}
			}
			System.out.println(a + "と" + b + "最大公約数は" +(min));
		System.out.println();
		
		double positiveValue9       = 9.0;
        double negativeValue9       = -9.0;
        double positiveZero         = 0.0;
        double negativeZero         = - 0.0;
        double positiveInfinity     = Double.POSITIVE_INFINITY;
        double nanValue             = Double.NaN;
 
        System.out.println(" 9.0 の 平方根: " + Math.sqrt(positiveValue9 ));
        System.out.println(" -9.0 の 平方根: " + Math.sqrt(negativeValue9));
        System.out.println(" NaN の 平方根: " + Math.sqrt(nanValue));
        System.out.println(" 正の無限大 の 平方根: " + Math.sqrt(positiveInfinity));
        System.out.println(" 正のゼロ の 平方根: " + Math.sqrt(positiveZero));
        System.out.println(" 負のゼロ の 平方根: " + Math.sqrt(negativeZero));
        System.out.println();
        
         int[] numm = { 1, 2, 3, 4, 5, 6};
         Random r1 = new Random();
         for(int i=0 ; i<1 ; i++) {
         int sun = numm[r1.nextInt(3)];
         System.out.println(sun);
         System.out.println();
         
         String str = "A, B, C, D, E, F, G";
         System.out.println(str);
         StringBuilder strb = new StringBuilder(str);
         str = strb.reverse().toString();
         System.out.println(str);
         System.out.println();
         
         int[] nums = {2, 7, 1};
         
         double average = Arrays.stream(nums).average().getAsDouble();
         
         System.out.println(average);
         System.out.println();
         } 
	 }
}
