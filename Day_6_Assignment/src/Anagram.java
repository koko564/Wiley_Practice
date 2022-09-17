import java.util.Arrays;

public class Anagram {
    
    public static void anagram(String s, String s1)
    {
        
       char ch1[] = s.toCharArray();
       Arrays.sort(ch1);
       char ch2[] = s1.toCharArray();
       Arrays.sort(ch2);
       String s2=new String(ch1);
       String s3=new String(ch2);
       if(s2.equals(s3))
    	  System.out.println(s+" is an anagram of "+s1+"\n");
       else
    	   System.out.println(s+" is not an anagram of "+s1+"\n");
       
        
        
    }
 
    
    public static void main(String[] args)
    {
        
        String s = "below";
        String s2 = "elbow";
        anagram(s,s2);
        s="elephant";
        s2="elphant";
        anagram(s,s2);
       
    }
}