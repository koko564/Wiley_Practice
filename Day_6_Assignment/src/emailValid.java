import java.util.regex.*;    
import java.util.*;    
public class emailValid{  
    public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();  
        emails.add("mandarmjog@gmail.com");  
        emails.add("gagan##@.com");  
        emails.add("wiley@g@.com");  
        emails.add("priya_89@mail.com");  
        //Regular Expression   
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";  
         
        Pattern pattern = Pattern.compile(regex);  
        
        for(String email : emails){  
            //instance of matcher   
            Matcher matcher = pattern.matcher(email); 
            if(matcher.matches())
            System.out.println(email +" : VALID\n");  
            else
            	System.out.println(email +" : INVALID\n"); 
            	
            
        }  
    }  
}  