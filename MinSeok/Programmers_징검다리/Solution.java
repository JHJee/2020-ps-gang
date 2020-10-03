import java.util.Arrays;

public class Solution {
	public static int solution(int distance, int[] rocks, int n)
	{
		int answer = 0;
		int min = 1;
		int max = distance;
		int remove = 0;
		int prev = 0;
		Arrays.sort(rocks);
		while(min <= max)
		{
			int temp_min = Integer.MAX_VALUE;

			int mid = (min+max)/2;
			remove = 0;
			prev = 0;
			for(int i = 0; i < rocks.length; i++)
			{
				if(rocks[i] - prev < mid)
				{
					remove++;
				}
				else
				{
					temp_min = Math.min(temp_min, rocks[i]-prev);
					prev = rocks[i];
				}
			}
			if(distance-prev < mid)
			{
				remove++;
			}
			else
			{
				temp_min = Math.min(temp_min, distance-prev);
			}
			if(remove <= n)
			{
				answer = Math.max(answer,temp_min);
				min = mid+1;
			}			
			else
			{
				max = mid-1;
			}
		}
		return answer;
	}
	public static void main(String[] args)
	{
		int d = 25;
		int[] r= {2,14,11,21,17};
		int n = 2;
		System.out.println(solution(d,r,n));
		
	}
}
