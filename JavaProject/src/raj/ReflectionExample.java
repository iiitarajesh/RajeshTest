package raj;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//it is a way of getting class names at runtime and creating objects of that class.
//Java Reflection is a process of examining or modifying the run time behavior of a class at run time.

//class MyClass{}

public class ReflectionExample {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		MyClass mc = null;
		Method me=mc.getClass().getMethod("nonStatMethod", null);
		me.invoke(mc, null);
	}
}
