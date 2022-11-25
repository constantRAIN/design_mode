package com.nongminggong.factory.simple.service.impl;

import com.nongminggong.factory.simple.dto.OperationNumber;
import com.nongminggong.factory.simple.service.Operation;
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
