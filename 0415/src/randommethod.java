import java.util.Scanner;
import java.util.Random;
public class randommethod {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int r= ran.nextInt(50);
		int a;
		
		System.out.println("���� ���� �ϳ��� ���纸����(1~50)");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<51; i++){
		a= sc.nextInt();
		if(a==r){
			System.out.println("�����Դϴ�!");
		}
		else{
			System.out.println("�ٽ� ���纸����");
		}
		}
		
	}

}
