package concepts;

public class P03_Knapsnack_Recursive {
	 static int max(int a, int b)
	    {
	      return (a > b) ? a : b;
	    }
	 

static int knapsack(int wt[],int val[],int w,int n) {
	if(n==0 || w==0) {
		return 0;
	}
	
	if (wt[n-1]<=w) {
		return Math.max(val[n-1]+knapsack(wt, val, w-wt[n-1], n-1),knapsack(wt, val, w, n-1));
		
	}else { 
		return knapsack(wt, val, w, n-1);
	}
}

public static void main(String args[]) {
int weight[]=new int[] {10, 20, 30};
int val[]=new int[]{60, 100, 120};
int w=50;
int n=val.length;
System.out.println("Maximum profit is:"+knapsack(weight, val, w, n));
//System.out.println(knapSack(w, weight, val, n));
}
}
