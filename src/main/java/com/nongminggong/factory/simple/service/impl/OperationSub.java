package com.nongminggong.factory.simple.service.impl;

import com.nongminggong.factory.simple.dto.OperationNumber;
import com.nongminggong.factory.simple.service.Operation;

/**
 * @author : zxliuyu
 * @date : 2022-11-25 17:01
 */
public class OperationSub implements Operation {

	public double operate(OperationNumber operationNumber) {
		return operationNumber.getFirstNumber() - operationNumber.getSecondNumber();
	}
}
