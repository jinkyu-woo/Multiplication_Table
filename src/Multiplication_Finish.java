import java.util.Scanner;

public class Multiplication_Finish {

	public static void main(String[] args) {
		System.out.println("당신이 입력할 구구단의 값은?:");
	    Scanner scanner = new Scanner(System.in);
	    int number = scanner.nextInt();
	    System.out.println("사용자가 입력한 값:"+ number);
	    if(number<2) {
	    	System.out.println("잘못된 값을 입력하였습니다.");
	    }
	    else if(number>10) {
	    	System.out.println("잘못된 값을 입력하였습니다.");
	    }
	    else {
	    	for(int i =1; i<10; i++){
	    		System.out.println (number * i);
	    	}
	    	
	    }
	

	}

}
