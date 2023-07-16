package basicArray;

public class frequenciesofelement {
	
	public static void printfreq(int a[]) {
		int n = a.length;
		int freq= 1;
		int i =1;
		while(i<n) {
		while(i<n&& a[i]==a[i-1]) {
			freq++;
			i++;
		}
		System.out.println(a[i-1]+ " " + freq);
		freq = 1;
		i++;
		}
		if(n==1|| a[n-1]!=a[n-2]) {
			System.out.println(a[i]+ " "+ 1);
		}
		}
	

	public static void main(String[] args) {
		int a[] = {10,10,20,20,23,4,5,5,67};
		printfreq(a);

	}

}
