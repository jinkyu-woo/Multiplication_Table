import java.util.Scanner;

public class Multiplication_Finish {

	public static void main(String[] args) {
		System.out.println("����� �Է��� �������� ����?:");
	    Scanner scanner = new Scanner(System.in);
	    int number = scanner.nextInt();
	    System.out.println("����ڰ� �Է��� ��:"+ number);
	    if(number<2) {
	    	System.out.println("�߸��� ���� �Է��Ͽ����ϴ�.");
	    }
	    else if(number>10) {
	    	System.out.println("�߸��� ���� �Է��Ͽ����ϴ�.");
	    }
	    else {
	    	for(int i =1; i<10; i++){
	    		System.out.println (number * i);
	    	}
	    	
	    }
	

	}

}
