import java.util.Scanner;
public class TestExam {

	public static void main(String[] args) {
		int a;
		System.out.println("500 이하의 자연수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		a=sc.nextInt();
		
		
			for(int i=0; a>=i; i++){
				if(a%3==0 && a/2!=0){
				System.out.println();
				}
			}
			
		

		System.out.println("500 이하의 자연수를 입력하세");
	}

}
