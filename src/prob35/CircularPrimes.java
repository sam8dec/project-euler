package prob35;

public class CircularPrimes {
	public static boolean sieve[] = new boolean[1000000];
	public static String getNextRotation(String N) {
		N = (N+N.charAt(0)).substring(1);
		return N;
	}
	public static void main(String[] args) {
		int i,j,c=0;
		for(i=2;i<1000000;i++) {
			if(!sieve[i]) {
				for(j=i*2;j<1000000;j+=i) {
					sieve[j]=true;
				}
			}
		}
		for(i=2;i<1000000;i++) {
			//System.out.println(i);
			if(!sieve[i]) {
				String k=""+i;
				while(Integer.parseInt(k = getNextRotation(k))!=i) {
					if(sieve[Integer.parseInt(k)]) break;
					sieve[Integer.parseInt(k)]=true;
				}
				if(Integer.parseInt(k)==i) {
					System.out.println(i);
					c+=(int)Math.log10(i)+1;
					//c++;
				}//Increase by number of digits
			}
		}
		System.out.println(c);
	}
}
