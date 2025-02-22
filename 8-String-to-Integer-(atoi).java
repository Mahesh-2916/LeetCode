class Solution {
    public int myAtoi(String s) {
        int res=0;
        int sign=1;
        s=s.trim();
        int i=0;
        if(s.length()==0) return 0;
        if(s.charAt(0)=='-') 
        {
            sign=-1;
            i++;
        }
        else if(s.charAt(0)=='+')
        {
            sign=1;
            i++;
        }
        while(i<s.length())
        {
            if(Character.isDigit(s.charAt(i)))
            {
                int d=Character.getNumericValue(s.charAt(i));
                if(res>(Integer.MAX_VALUE-d)/10)
                    return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
                res=res*10+d;
            }
            else break;
            i++;
        }
        return sign*res;
    }
}