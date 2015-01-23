package prob19;

public class CountingSundays {
	public static int numberOfDays(int year, int month) {
		int[] mdays = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(month==2) {
			if(year%4==0) {
				return 29;
			} else {
				return 28;
			}
		} else {
			return mdays[month];
		}
	}
	public static void main(String[] args) {
		int y,m,d=1,count=0;
		for(y=1901;y<=2000;y++) {
			for(m=1;m<=12;m++) {
				if(d==6) count++;
				System.out.println(y+" "+m+" "+numberOfDays(y,m)+" "+d);
				d=(d+numberOfDays(y,m)%7)%7;
			}
		}
		System.out.println(count);
	}

}
