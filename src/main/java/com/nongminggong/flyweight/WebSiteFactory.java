package com.nongminggong.flyweight;

import java.util.HashMap;

/**
 * @author : zxliuyu
 * @date : 2023-03-02 23:15
 */
public class WebSiteFactory {
	HashMap<String, WebSite> flyweight = new HashMap<>();

	public WebSite getWebSite(String key){
		if (!flyweight.containsKey(key)) {
			flyweight.put(key, new ConcreteWebSite(key));
		}
		return flyweight.get(key);
	}

	public int countWebSite(){
		return flyweight.size();
	}
}
