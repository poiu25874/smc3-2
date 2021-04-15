import java.util.*;
public class caswitch {
	public static void main(String[] args) {
		
		int user=0;
		int com=(int)(Math.random()*3); // 0,1,2

		Scanner scan=new Scanner(System.in);
		System.out.println("===========가위바위보 게임을 시작합니다============");
		System.out.println("가위(0), 바위(1), 보(2) 입력 : ");
		user=scan.nextInt();
		String[] str= {"가위","바위","보"};
		System.out.println("컴퓨터 :"+str[com]+
				",사용자:"+str[user]);
		switch(com-user)
		{
		case 2: case -1:
			System.out.println("사용자 Win");
			break;
		case 1: case -2:
			System.out.println("컴퓨터 Win");
			break;
		default :
			System.out.println("비겼습니다.");
			break;	
		}
		
	}
}