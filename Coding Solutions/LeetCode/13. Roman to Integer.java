class Solution {
    public int Map(char c)
    {
        int map[][]= {{'I','V','X','L','C','D','M'},{'1','5',10,50,100,500,1000}};
        for(int i=0;i<7;i++)
        {
            if(map[1][i]==c)
                return map[2][i];
        }
        return 0;
    }
    
    public int romanToInt(String s) 
    {
        
        int i=0;
        int l=s.length();
        int sum=0;
        while(i<l)
        {
            if(i==(l-1))
            {
                sum+= Map(s.charAt(i));
                break;
            }
            else
            {
                int c1,c2;
                c1=Map(s.charAt(i));
                c2=Map(s.charAt(i+1));
                if(c1>c2)
                sum+= c2+c1;
                else
                sum+= c2-c1;
            }             
        }
        return(sum);
    }
}