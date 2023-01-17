
public class Demo {

	public static void main(String[] args) {
		// float : 32 bit IEEE 754 floating number
		float f1 = Float.MIN_VALUE; 
		float f2 = Float.MAX_VALUE; 

		System.out.println("float data type size is between " + f1 + " to " + f2);
		
		// double : 64 bit IEEE 754 floating number
		double d1 = Double.MIN_VALUE; 
		double d2 = Double.MAX_VALUE; 

		System.out.println("double data type size is between " + d1 + " to " + d2);
		
		System.out.println("\n\nExample:");
		float f = 1212.0f;
		double d =21345435432.2;
		
		System.out.println("float "+f);
		System.out.println("double "+d);
	}

}
