import java.util.Scanner;
public class Prob_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����,����,��������� 3���� ���� �Է� >>");
		Grade me = new Grade();
		me.mathscore = sc.nextInt();
		me.sncscore  = sc.nextInt();
		me.engscore  = sc.nextInt();
		System.out.println("���: "+me.avg());
	}

}



class Grade{
	
	int mathscore;
	int engscore;
	int sncscore;
	public int avg(){
		return((mathscore+engscore+sncscore)/3);
	}
	
}


