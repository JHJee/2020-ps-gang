import java.util.*;

public class Solution {
    public static int solution(String numbers) {
        int answer = 0;
        HashSet<Integer> set = new HashSet();
        permutation(set,"",numbers);
        Iterator it = set.iterator();
        while(it.hasNext())
        {
        	if(prim((int)it.next()))
        	{
        		answer++;
        	}
        }
        return answer;
    }
    public static boolean prim(int num)
    {
    	if(num == 0 || num == 1)
    		return false;
    	if(num == 2)
    		return true;
    	for(int i = 2; i <= Math.sqrt(num); i++)
    	{
        	if(num % i == 0)
        		return false;
    	}
    	return true;
    }
    public static void permutation(HashSet<Integer> set, String made, String remain)
    {
    	char[] remain_to_char = remain.toCharArray();
    	if(!made.equals(""))
    		set.add(Integer.parseInt(made));
    	for(int i = 0; i < remain.length(); i++)
    	{
    		String sub_remain = remain.substring(0,i)+remain.substring(i+1);
    		permutation(set,made+remain_to_char[i],sub_remain);
    	}    	
    }
    
    public static void main(String[] args)
    {
    	String num = "17";
    	System.out.println(solution(num));
    }
}
