package com.nongminggong.prototype.clone.deep_serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Computer implements Serializable {
	/**
	 * 品牌
	 */
	private String color;
	/**
	 * 与颜色
	 */
	private String brand;
}