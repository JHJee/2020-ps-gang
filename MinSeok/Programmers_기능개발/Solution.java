import java.util.*;
public class Solution {
	public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        LinkedList<Integer> list = new LinkedList<Integer>();
        int before = -1;
        int idx = -1;
        for(int i = 0 ; i < progresses.length; i++)
        {
        	int t = 0;
        	if((100-progresses[i])%speeds[i] == 0)
        	{
        		 t = (100 - progresses[i]) / speeds[i];
        	}
        	else
        	{
        		 t = (100 - progresses[i]) / speeds[i] + 1;
        	}
        	if(before >= t)
        	{
        		int v = list.get(idx);
        		list.remove(idx);
        		list.add(idx,v+1);
        	}
        	else
        	{
        		idx++;
                list.add(1);
        		before = t;
        	}

        }
        Iterator it = list.iterator();
        answer = new int[list.size()];
        int idx2 = 0;
        while(it.hasNext())
        {
        	answer[idx2++] = (int) it.next();
        }
        return answer;
    }
	public static void main(String[] args)
	{
		int[] p = {93,30,55};
		int[] s = {1,30,5};
		int[] a = solution(p,s);
		for(int i : a)
		{
			System.out.println(i);
		}
	}
}