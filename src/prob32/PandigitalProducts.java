package prob32;

public class PandigitalProducts {

	public static void main(String[] args) {
		int sum=0;
		for(int a=1;a<9999;a++) {
			for(int b=a+1;b<=9999;b++) {
				int[] freq = new int[10];
				int c=a*b;
				int a1=a,b1=b,c1=c;
				while(a1>0) {freq[a1%10]++;a1/=10;}
				while(b1>0) {freq[b1%10]++;b1/=10;}
				while(c1>0) {freq[c1%10]++;c1/=10;}
				int i;
				for(i=1;i<=9;i++) {if(freq[i]!=1) break;}
				if(i==10 && freq[0]==0) {
					System.out.println(a+" "+b+" "+c);
					sum+=c;
				}
			}
		}
		System.out.println(sum);
	}

}
