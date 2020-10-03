
public class Solution {
    public static int solution(int[] stones, int k) 
    {
        int answer = 0;
       
        long left = 0;
        int len = stones.length;
        long right = 200000001;

        long erase = 0;
        long max = 0;
        while(left <= right)
        {        	
        	erase = 0;
        	max = 0;
        	long mid = (left + right) /2;
        	for(int i = 0; i < len; i++)
        	{
        		if(stones[i] < mid)
        			erase++;
        		else
        		{
        			max = Math.max(max, erase);
        			erase = 0;
        		}
        	}
			max = Math.max(max, erase);

        	if(max >= k) // ¸ø°Ç³Í´Ù!
        	{
        		right = mid-1;
        	}
        	else
        	{
        		answer = (int)Math.max(answer, mid);
        		left = mid+1;
        	}
        }
        
        return answer;
    }
    public static void main(String[] args)
    {
    	int[] s1 = {2, 4, 5, 3, 2, 1, 4, 2, 5, 1};
    	int[] s = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
    	int k = 3;
//    	System.out.println(solution(s,k));
    	System.out.println(solution(s1,k));

    }
}
