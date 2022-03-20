public class ArrayAsignment1 {

	public static void main(String[] args) {
		double[] values = {25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};
			
		double max = 0;
		int count = 0;
			
		for(double x: values)
		{
			//checking maximum value
			if(max < x)
			{
				max = x;
			}
			//checking negative value
			if(x < 0)
			{
				count++;
			}
		
		}
			
		// printing all the elements in a row separated by space
		for(double x: values)
		{
			System.out.print(x + " ");
		}
		
		//printing out single row separated by spaces
		System.out.println();
		//printing the max number
		System.out.println("The max is: " +max);
		//printing number of negative
		System.out.println("The number of negative numbers: " +count);
	
			
	}
			
}