package top.linxz.java.codebase.aop.api.introduction;

public interface Lockable {
	
	void lock();

	void unlock();

	boolean locked();

}
