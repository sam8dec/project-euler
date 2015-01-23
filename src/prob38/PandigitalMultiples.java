package prob38;

public class PandigitalMultiples {
	public static void main(String args[]) {
		int i,j;
		String largestPan = "918273645";
		for(i=91;i<=99;i++) {
			int k=1;
			String pand = "";
			while(pand.length()<9) {
				pand = pand + i*k;
				k++;
			}
			if(pand.length()>9) continue;
			boolean occurred[] = new boolean[10];
			for(j=0;j<9;j++) {
				if(pand.charAt(j)=='0' || occurred[pand.charAt(j)-'0']) break;
				occurred[pand.charAt(j)-'0']=true;
			}
			if(j==9) {
				System.out.println(i+" "+k+" "+pand);
				if(Integer.parseInt(pand)>Integer.parseInt(largestPan)) largestPan = pand;
			}
		}
		for(i=912;i<=999;i++) {
			int k=1;
			String pand = "";
			while(pand.length()<9) {
				pand = pand + i*k;
				k++;
			}
			if(pand.length()>9) continue;
			boolean occurred[] = new boolean[10];
			for(j=0;j<9;j++) {
				if(pand.charAt(j)=='0' || occurred[pand.charAt(j)-'0']) break;
				occurred[pand.charAt(j)-'0']=true;
			}
			if(j==9) {
				System.out.println(i+" "+k+" "+pand);
				if(Integer.parseInt(pand)>Integer.parseInt(largestPan)) largestPan = pand;
			}
		}
		for(i=9123;i<=9999;i++) {
			int k=1;
			String pand = "";
			while(pand.length()<9) {
				pand = pand + i*k;
				k++;
			}
			if(pand.length()>9) continue;
			boolean occurred[] = new boolean[10];
			for(j=0;j<9;j++) {
				if(pand.charAt(j)=='0' || occurred[pand.charAt(j)-'0']) break;
				occurred[pand.charAt(j)-'0']=true;
			}
			if(j==9) {
				System.out.println(i+" "+k+" "+pand);
				if(Integer.parseInt(pand)>Integer.parseInt(largestPan)) largestPan = pand;
			}
		}
		System.out.println(largestPan);
	}
}
