import java.util.*;
public class caswitch {
	public static void main(String[] args) {
		
		int user=0;
		int com=(int)(Math.random()*3); // 0,1,2

		Scanner scan=new Scanner(System.in);
		System.out.println("===========���������� ������ �����մϴ�============");
		System.out.println("����(0), ����(1), ��(2) �Է� : ");
		user=scan.nextInt();
		String[] str= {"����","����","��"};
		System.out.println("��ǻ�� :"+str[com]+
				",�����:"+str[user]);
		switch(com-user)
		{
		case 2: case -1:
			System.out.println("����� Win");
			break;
		case 1: case -2:
			System.out.println("��ǻ�� Win");
			break;
		default :
			System.out.println("�����ϴ�.");
			break;	
		}
		
	}
}