package prob30;

public class DigitFifthPowers {

	public static void main(String[] args) {
		int ts = 0;
		for(int i=10;i<999999;i++) {
			int N=i,sofp=0;
			while(N>0) {
				sofp+=(N%10)*(N%10)*(N%10)*(N%10)*(N%10);
				N/=10;
			}
			if(sofp==i) {
				System.out.println(i);
				ts+=sofp;
			}
		}
		System.out.println(ts);
	}

}
