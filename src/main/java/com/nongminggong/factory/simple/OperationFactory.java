package com.nongminggong.factory.simple;


import com.nongminggong.factory.simple.service.Operation;
import com.nongminggong.factory.simple.service.impl.OperationAdd;
import com.nongminggong.factory.simple.service.impl.OperationDiv;
import com.nongminggong.factory.simple.service.impl.OperationMul;
import com.nongminggong.factory.simple.service.impl.OperationSub;
import lombok.SneakyThrows;

/**
 * @author : zxliuyu
 * @date : 2022-11-25 16:54
 */
public class OperationFactory {

	@SneakyThrows
	public static Operation createOperation(String operate) {
		switch (operate) {
			case "+":
				return new OperationAdd();
			case "-":
				return new OperationSub();
			case "*":
				return new OperationMul();
			case "/":
				return new OperationDiv();
			default:
				throw new Exception("请输入正确的运算符!");
		}
	}
}
