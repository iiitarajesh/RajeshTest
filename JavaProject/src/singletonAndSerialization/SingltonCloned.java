package singletonAndSerialization;

public class SingltonCloned implements Cloneable{
	public static SingltonCloned sc=new SingltonCloned();
	@Override
	public Object clone() throws CloneNotSupportedException{
		throw	new CloneNotSupportedException("Singleton, Not created");
	}
}
