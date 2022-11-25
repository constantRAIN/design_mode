package com.nongminggong.factory.method.service.impl;

import com.nongminggong.factory.method.dto.OperationNumber;
import com.nongminggong.factory.method.service.Operation;
import lombok.SneakyThrows;

/**
 * @author : zxliuyu
 * @date : 2022-11-25 17:01
 */
public class OperationDiv implements Operation {

	@SneakyThrows
	public double operate(OperationNumber operationNumber) {
		if (operationNumber.getSecondNumber() == 0) {
			throw new Exception("除数不能为0！");
		}
		return operationNumber.getFirstNumber() / operationNumber.getSecondNumber();
	}
}
