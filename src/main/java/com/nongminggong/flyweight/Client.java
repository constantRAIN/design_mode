package com.nongminggong.flyweight;

/**
 * @author : zxliuyu
 * @date : 2023-03-02 23:17
 */
public class Client {
	public static void main(String[] args) {
		WebSiteFactory factory = new WebSiteFactory();

		WebSite fx = factory.getWebSite("产品展示");
		fx.use(new User("张老板"));

		WebSite fy = factory.getWebSite("产品展示");
		fy.use(new User("狗蛋"));

		WebSite fz = factory.getWebSite("博客");
		fz.use(new User("小刘"));

		System.out.println("网站分类总数为" + factory.countWebSite());
	}
}
