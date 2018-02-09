package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest {
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Order ord= new Order(5,"Rajesh");
		Class cls=ord.getClass();
		System.out.println(cls.getName());
		Constructor[] con=cls.getConstructors();
		for (Constructor constructor : con) {
			System.out.println(constructor);
		}
		Method[] met=cls.getMethods();
		for (Method method : met) {
			//System.out.println(method.getName());
			method.invoke(method, null);
		}
		System.out.println(cls.getClassLoader().hashCode());
	}
}
