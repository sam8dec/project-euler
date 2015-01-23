package prob26;

public class ReciprocalCycles {
	public static int cycleLength(int d) {
		int[] remainderTimeStamp = new int[d]; // records the time stamp at which a particular
		// remainder occurs
		int t=1,n=10,rem;
		while(true) {
			rem=n%d;
			if(rem==0) return 0;
			else if(remainderTimeStamp[rem]!=0) {
				return t-remainderTimeStamp[rem];
			} 
			remainderTimeStamp[rem]=t++;
			n=rem*10;
		}
	}
	public static void main(String[] args) {
		int maxCL=0,maxD=0;
		for(int d=1;d<1000;d++) if(cycleLength(d)>maxCL) {maxCL=cycleLength(d);maxD=d;}
		System.out.println(maxD+" "+maxCL);
	}
}
