package week1.homeAssignment;

public class IsPrime {
public static void main(String[] args) {
	int n = 17;
	int count = 0;
	for (int i=1;i<=n-1;i++) {
		if (n%i ==0) {
			count++;
		}}
	if(count ==1) {
		System.out.println("Given number is a prime number");
	}
	else {
		System.out.println("Given number is not a prime number");
	}
		
		
	
	
}

}