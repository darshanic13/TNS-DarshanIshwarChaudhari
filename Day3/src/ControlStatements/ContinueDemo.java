package ControlStatements;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int k=5; k<15; k++)
		{
			//odd no are skipped
			
			if (k%2 !=0)
				continue;
			
			//Even number are printed 
			System.out.println(k + "");
		}

	}

}
