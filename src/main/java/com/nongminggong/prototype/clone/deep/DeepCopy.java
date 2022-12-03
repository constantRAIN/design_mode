package com.nongminggong.prototype.clone.deep;

/**
 * @author : zxliuyu
 * @date : 2022-12-03 20:37
 */
public class DeepCopy {
	public static void main(String[] args) {
		Computer computer = new Computer("red", "xiaomi");
		Person person = new Person("张三", "程序员", computer);
		Person clonePerson = (Person) person.clone();

		System.out.println(person);
		System.out.println(clonePerson);

		// 使用克隆对象修改 电脑属性值
		clonePerson.getComputer().setBrand("huawei");
		clonePerson.getComputer().setColor("black");
		clonePerson.setName("李四");

		System.out.println("克隆对象修改值后");
		System.out.println(person);
		System.out.println(clonePerson);
	}
}
