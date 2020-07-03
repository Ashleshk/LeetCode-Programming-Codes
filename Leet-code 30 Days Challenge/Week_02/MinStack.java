package Week_02;

import java.util.*;

class MinStack {
	 
    /** initialize your data structure here. */
    private int min=Integer.MAX_VALUE;
    private  ArrayList<Integer>al=new ArrayList<Integer>();
    public MinStack() 
    { 
        
    }
    public void push(int x) {
       if(al.size()!=0)
       {
           al.add(0,x);
           return;
       }
        else{
            al.add(x);
            return;
        }
    }
    public void pop() 
    {
        min=Integer.MAX_VALUE;
        if(al.size()==0)
        {
             return;
        }
        else{
            al.remove(0);
        }
    }
    
    public int top()
    {
        if(al.size()==0)
        {
            return -1;
        }
        return al.get(0);
    }
    public int getMin() 
    {
        for(int i:al)
        {
            if(i<min)
            {
                min=i;
            }
        }
        return min;
    }
 
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */