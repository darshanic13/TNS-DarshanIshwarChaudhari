package ControlStatements;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char x = 'a';
		
		switch (x)
		{
		case 'l':
		case 'L':
			System.out.println(x + " is a leader");
			break;
		case 'd':
		case 'D':
			System.out.println(x+ " is a Darshan");
			break;
		case 'w':
		case 'W':
			System.out.println(x+ " is a Work");
			break;
		case 's':
		case 'S':
			System.out.println(x+ " is a Smart");	
			break;
			
			default :
				System.out.println(x+" is other than letters provide ");
				break;
		}

	}

}
