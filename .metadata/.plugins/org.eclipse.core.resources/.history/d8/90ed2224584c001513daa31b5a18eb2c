
public class App {
	public static void main(String[] args) {
		
		byte byteValue = 20;
		short shortValue = 55;
		int intValue = 888;
		long longValue = 23355;
		
		float floatValue = 8834.8f;
		//can do it this way instead of adding 'f' to the end
		float floatValue2 = (float)99.3;
		double doubleValue = 32.4;
		
		System.out.println(Double.MAX_VALUE);
		
		//intValue is an int, so put that type in parantheses in front of value casting to
		intValue = (int)longValue;
		
		//prints out the value stored in longValue
		System.out.println(intValue);
		
		//converts but adds a .0 to the end
		doubleValue = intValue;
		System.out.println(doubleValue);
		
		intValue = (int)floatValue;
		//note it doesn't round up, it chops off the .8. it prints 8834
		//need to use Math.round
		System.out.println(intValue);
		
		//you can cast a number to an appropriate type
		//the following won't work correctly tho, because a byte can't hold a number that big
		byteValue = (byte)128;
		System.out.println(byteValue);
	}
}
