import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Roman_to_Integer{
    public static int Map(char c)
    {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        return (map.get(c));
    }
    
    public static int romanToInt(String s) 
    {
        int i=0;
        int l=s.length();
        int sum=0;
        while(i<l)
        {
            if(i>0 && (Map(s.charAt(i))>Map(s.charAt(i-1))))
            sum+= Map(s.charAt(i))-2*Map(s.charAt(i-1));
            else
            sum+= Map(s.charAt(i));            
            i++;
        }
        return(sum);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        int num = romanToInt(str);
        System.out.println(num);
        sc.close();
    }
}