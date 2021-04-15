import java.util.Scanner;
import java.util.Random;
public class randommethod {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int r= ran.nextInt(50);
		int a;
		
		System.out.println("랜덤 숫자 하나를 맞춰보세요(1~50)");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<51; i++){
		a= sc.nextInt();
		if(a==r){
			System.out.println("정답입니다!");
		}
		else{
			System.out.println("다시 맞춰보세요");
		}
		}
		
	}

}
