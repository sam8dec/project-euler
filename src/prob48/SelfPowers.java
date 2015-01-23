package prob48;

public class SelfPowers {
	public static long selfPowerModuloTenBillion(long N) {
		long ret=1;
		for(long i=1;i<=N;i++) {
			ret = (ret%10000000000L*N%10000000000L)%10000000000L;
		}
		return ret;
	}
	public static long selfPowersSumModuloTenBillion(long N) {
		if(N==0) {
			return 0;
		} else {
			return (selfPowersSumModuloTenBillion(N-1)%10000000000L+selfPowerModuloTenBillion(N)%10000000000L)%10000000000L;
		}
	}
	public static void main(String[] args) {
		System.out.println(selfPowersSumModuloTenBillion(1000));
	}

}
