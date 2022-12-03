package com.nongminggong.prototype.clone.deep_serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

/**
 * @author : zxliuyu
 * @date : 2022-12-03 20:38
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Serializable {
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 职业
	 */
	private String occupation;
	private Computer computer;

	public Person deepClone() {
		// 声明流对象
		ByteArrayOutputStream bos = null;
		ByteArrayInputStream bis = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		try {
			// 创建序列化流
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			// 将当前对象以对象流的方式输出
			oos.writeObject(this);
			// 创建反序化流
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			// 将流对象反序列化，实现类的深拷贝。
			return (Person) ois.readObject();

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				// 关闭资源
				bos.close();
				bis.close();
				oos.close();
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
