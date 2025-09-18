public static int getsumofstack(Stack <int> st)
{     
    Stack <int> st2 = new Stack<>();
    int sum =0;
    while(!st.isEmpty())
    {
        sum+=st.pop();
      st2.push(st.pop());
    }
    while(!st2.isEmpty())
    {
        st.push(st2.pop()); 
    }
    return sum;
}
public static int GetStackLastValue(Stack<int> st)
{   int lastvalue=0;
    Stack <int> st2 = new Stack<>();
    while(!st.isEmpty())
    {
    st2.push(st.pop());
    }
    lastvalue=st2.top();
    while(!st2.isEmpty())
    {
        st.push(st2.pop());
    }
    return lastvalue;
    
}
public static boolean isZugi(Stack<int>st)
{
    Stack<int> st2= new Stack<>();
    int sum =0;
    while(!st.isEmpty())
    {
        st2.push(st.pop())
        sum++;
    }
     while(!st2.isEmpty())
    {
        st.push(st2.pop)
    }
    if(sum%2 !=0)
    return false;

         return true;
}
public static Stack<int> Doit(Node <Stack<int>> chain)
{   
    Stack<int> newstack =new Stack<> ();
    while(chain.getNext()!=null)//להוסיף איך לגשת אל המחסנית
    { 
        if(isZugi(stack))
        newstack.push(getsumofstack(stack));
        else
        newstack.push(GetStackLastValue(stack));
        chain = chain.getNext();
    }

    return newstack;
}
