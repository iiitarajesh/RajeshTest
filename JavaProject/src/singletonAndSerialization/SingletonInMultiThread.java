package singletonAndSerialization;

public class SingletonInMultiThread {
	public volatile SingletonInMultiThread sim = null;

	private SingletonInMultiThread() {
	}

	public SingletonInMultiThread getInstance() {
		if (sim == null) {
			synchronized (this) {
				if (sim == null) {
					return new SingletonInMultiThread();
				}
			}
		}
		return sim;
	}
}
