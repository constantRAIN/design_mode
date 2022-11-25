package com.nongminggong.factory.method.service.impl;

import com.nongminggong.factory.method.dto.OperationNumber;
import com.nongminggong.factory.method.service.Operation;

/**
 * @author : zxliuyu
 * @date : 2022-11-25 17:01
 */
public class OperationMul implements Operation {

	public double operate(OperationNumber operationNumber) {
		return operationNumber.getFirstNumber() * operationNumber.getSecondNumber();
	}
}
