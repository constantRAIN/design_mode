package com.nongminggong.decorator;

import lombok.Data;

/**
 * @author : zxliuyu
 * @date : 2023-03-02 19:30
 */
@Data
public class Changer implements Transform {
	private Transform transform;

	@Override
	public void move() {
		transform.move();
	}
}
