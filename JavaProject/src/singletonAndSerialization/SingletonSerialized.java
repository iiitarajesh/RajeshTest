package singletonAndSerialization;

import java.io.Serializable;

public class SingletonSerialized implements Serializable {
	
	private static final long serialVerionUid=-82349287492814L;
	
	public static SingletonSerialized ss=null;
	private SingletonSerialized(){}
	
	public SingletonSerialized getInstance(){
		if(ss==null){
			return new SingletonSerialized();
		}
		return ss;
	}
	protected Object readResolve(){
		return getInstance();
	}
	protected Object writeObject(){
		return  getInstance();
	}
	
	
}
