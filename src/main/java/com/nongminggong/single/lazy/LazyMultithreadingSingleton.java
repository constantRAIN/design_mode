package com.nongminggong.single.lazy;

/**
 * @author : zxliuyu
 * @date : 2022-12-03 15:35
 */
public class LazyMultithreadingSingleton {
	/**
	 *  1：使用 volatile定义的变量，将会保证对所有线程的可见性。
	 *  2：禁止指令重排序优化。
	 * 由于 volatile禁止对象创建时指令之间重排序，所以其他线程不会访问到一个未初始化的对象，从而保证安全性。
	 * 对象的创建可能发生指令的重排序，使用 volatile可以禁止指令的重排序，保证多线程环境内的系统安全。
	 */
	private volatile static LazyMultithreadingSingleton instance;
	/**
	 * 同步锁对象
	 */
	private static Object object;

	/**
	 * 私有化构造方法，防止用户通过构造器创建对象
	 */
	private LazyMultithreadingSingleton() {
	}

	public static LazyMultithreadingSingleton getInstance() {
		// 验证对象是否已经存在，如果直接返回，提高代码效率，减少线程竞争同步锁的机会
		if (instance == null) {
			// 添加同步锁，防止多线程请求，创建多个对象
			synchronized (object) {
				// 二次验证对象是否为空，是为了防止多个线程走到等待锁的时候对象还为null，
				// 当获取到锁后，需要验证当前对象是否已经初始化，如果已经初始化则直接返回，要不然这里有可能会多次创建对象，就不是单例的了
				if (instance == null) {
					// 创建对象 jvm实际是有三部
					// 1.分配内存
					// 2.初始化对象
					// 3.将内存地址指向对象
					instance = new LazyMultithreadingSingleton();
				}
			}
		}
		return instance;
	}
}
