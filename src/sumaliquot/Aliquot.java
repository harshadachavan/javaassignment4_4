package sumaliquot;
/*
 * Aliquot Sequence of a number starts with itself,
 *  remaining terms of the sequence are sum of proper divisors of immediate previous term
 * */
public class Aliquot {
	
	public boolean isPerfectNumber(int num)
    {
        boolean isPerfect = false;
        int sum=1; // 1 is a proper divisor
        
        //as the perfect number starts from 6 I have discarded all numbers below it.
        if(num<6)return false;
         
        for(int i=2; i<=num/2; i++)
        {
        	// If divisors are equal, take only one
            // of them
            if(num%i == 0)
            {
            	//to calculate sum of all proper divisors
                sum += i;
            }
        }
        //to calculate sum is equal to given number only then its Perfect number 
        if(sum==num) return true;
         
        return isPerfect;
    }
}
