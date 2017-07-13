package singletonAndSerialization;

public class SingletonNormal {
	private static SingletonNormal sn = null;

	private SingletonNormal() {
	}

	public SingletonNormal getInstance() {
		if (sn == null) {
			return new SingletonNormal();
		}
		return sn;
	}
}
