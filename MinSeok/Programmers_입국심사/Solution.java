import java.util.Arrays;

public class Solution {
	public static long solution(int n, int[] times)
	{	
		long min = 1;
		Arrays.sort(times);
		long max = (long)times[times.length-1]*(long)n;
		long answer = max;
		long possible = 0;
		while(min <= max)
		{
			long mid = (min+max)/(long)2;			
			possible = 0;
			for(int t : times)
			{
				possible += (long)mid/(long)t;
			}
			if(possible >= n)
			{
				if(answer > mid)
					answer = mid;
				max = mid-1;
			}
			else
			{
				min = mid+1;
			}
		}
		return answer;
	}
	public static void main(String[] args)
	{
		int n = 3;
		int[] t = {7,10,2};
		System.out.println(solution(n,t));
	}
}
