package concepts;

public class P01_Factorial_Memoization_Top_DOwn {
static int F[]=new int[505];
public static int fib(int n) {
	if(n<=1 ) {
		return n;
	}
	if(F[n]!=-1) {
		return F[n];
	}
	
	F[n]= fib(n-1)+fib(n-2);
	return F[n];
}
public static void main(String args[]) {
	for(int i=0;i<51;i++) {
		F[i]=-1;
	}
	int n=10;
	System.out.println(fib(n));
}
	
	
}