package concepts;

public class P03_Knapsack3_Memoization {
	static int knapsack(int wt[],int val[],int w,int n) {
		int t[][]=new int[n+1][w+1];
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<w+1;j++) {
				t[i][j]=-1;
			}
		}
		
		if(n==0 || w==0) {
			return 0;
		}
		if(t[w][n]==-1) {
			return t[w][n];
		}
		if (wt[n-1]<=w) {
			return t[n][w]=Math.max(val[n-1]+knapsack(wt, val, w-wt[n-1], n-1),knapsack(wt, val, w, n-1));
			
		}else { 
			return t[n][w]=knapsack(wt, val, w, n-1);
		}
	}
	
	 
	public static void main(String args[]) {
		int weight[]=new int[] {10, 20, 30};
		int val[]=new int[]  {60, 100, 120};
		int w=50;
		int n=val.length;
		System.out.println("Maximum profit is:"+knapsack(weight, val, w, n));
		;
		}
}
