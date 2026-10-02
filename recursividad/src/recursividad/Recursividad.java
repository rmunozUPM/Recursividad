package recursividad;

public class Recursividad {
    public int FiboRecur(int n) throws Exception{
    	if(n<0)
    		throw new Exception ();
    	if(n== 0)
    		return 0;
    	if(n==1)
    		return 1;
    	return FiboRecur(n-1)+FiboRecur(n-2);
    			
    }
}
