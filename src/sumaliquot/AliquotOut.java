package sumaliquot;

public class AliquotOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aliquot aq = new Aliquot();
		System.out.println("Perfect numbers from 1 - 100 are :");
		for(int i=0; i<=100;i++)
        {
            if(aq.isPerfectNumber(i))
            {
            	System.out.println(i);
            }
               // perfectNums.add(i);
        }
	}

}
