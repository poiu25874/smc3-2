import java.util.Scanner;

public class ArrayExam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = new int[5];
        int max=0;
        int count=0;

        for(int i=0; i<5; i++){
            System.out.println(i+1+"�� �Է� :");
            arr[i]=sc.nextInt();
            if(max<arr[i]){
                max=arr[i];
                count=i+1;
            }

        }
        System.out.println("���� ū ���� "+count+"��° ������"+max);
    }

}