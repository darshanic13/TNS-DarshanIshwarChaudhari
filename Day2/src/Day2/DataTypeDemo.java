package Day2;

public class DataTypeDemo {

	public static void main(String[] args) {
        
		int value1 = 9/2;
		
		float value2 = 100f/ 3f;
		
		double value3= 100d/3d;
		float value4 = 100/3;
		
		System.out.println("value 1 ="+value1);
		System.out.println("value 2 ="+value2);
		System.out.println("value 3 ="+value3);
		System.out.println("value 4 ="+value4);
		
		int marker = 512;
		
		//assigning expression to variables
		double percentage = marker * 0.46f;
		System.out.println("percentage is :"+ percentage);
		
		int side=2;
		int area=side*side;
		System.out.println("Area of square is :"+area);
		
		double pie = 3.14;
		int radius = 5;
		double circlearea = pie*radius*radius;
		System.out.println("Area od circle is:"+circlearea);
		
		int len = 5;
		int bre = 10;
		int recarea = len*bre;
		System.out.println("Area of Rectangle is:"+recarea);
		

	}

}
