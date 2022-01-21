class Compare 
{  
public static void main(String[] args) 
{          
        Integer num1 = 10;  
        Integer num2 = 20;  
        Integer num3 = 10;  
        Integer num4 = 30;
        Integer num5 = -30;		
        // as num1<num2, Output will be a value less than zero  
        System.out.println(num1.compareTo(num2));          
        // as num1 = num3, Output will be zero  
        System.out.println(num1.compareTo(num3));   
        // as num4 > num2, Output will be a value greater than zero  
        System.out.println(num4.compareTo(num2));  
        
        System.out.println(num1.compareTo(num5));	

        System.out.println(num4.compareTo(num5));		
}  
}  