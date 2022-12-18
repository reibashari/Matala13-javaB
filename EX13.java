
/**
 * build 3 methods maxDigit , noOfLetters and minOps . 
 * @Rei Bashari , 315522623 . 
 * @08-05-2021 
 */
public class Ex13
{
    /**
     * Returns the maximal digit int the number . 
     * @return The maximal digit . 
     * @param n - int n .
     */
    public static int maxDigit(int n) 
    {
        if(n < 0)
        {
            n = n * -1 ;
        }
        if ( n == 0 ) 
        { 
            return 0 ; 
        }
        int digit = n%10 ; 
        n /= 10 ; 
        return Math.max(digit , maxDigit(n) ) ; 
    }
    
    /**
     * Return the road has the lowest number of steps way from number X to number Y .   
     * @return The lowest way. 
     * @param x - from x  .
     * @param y - to y . 
     */
    public static int minOps(int x , int y) 
    {
        if(x > y) 
        {
            return Integer.MAX_VALUE ; 
        }
        if(x == y) 
        {
            return 0 ; 
        }
        return Math.min(minOps(x+1 , y) , minOps(x*2 , y) ) +1 ; 
    }
    
    /**
     * Return the number of letters in english in string str by using the 
     * private methods noOfLetters + isLetter .
     * @return the number of chars in english . 
     * @param str - the string we get. 
    */
   
    public static int noOfLetters(String str) 
    {
        if (str.length() == 0 ) 
        {
            return 0 ; 
        }
        str = str.toLowerCase() ; 
        char ch = str.charAt(0) ; 
        str = noOfLetters(str , ch) ; 
        return noOfLetters(str) + (isLetter(ch) ? 1:0 ) ; 
    }
    
    private static String noOfLetters(String str , char ch) 
    {
        if ( str.length() == 0 ) 
        {
            return "" ;
        } 
        if (str.charAt(0) == ch || !isLetter(str.charAt(0) ) ) 
        {
            return noOfLetters(str.substring(1) , ch ) ; 
        }
        return str.charAt(0) + noOfLetters(str.substring(1) , ch) ; 
    }
    
    private static boolean isLetter(char ch) 
    {
        return ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z' )) ; 
    }
    
    
    }
    
