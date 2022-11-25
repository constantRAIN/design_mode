package com.nongminggong.factory.method.service;

import com.nongminggong.factory.method.OperationFactory;
import com.nongminggong.factory.method.dto.OperationNumber;
import com.nongminggong.factory.method.impl.OperationAddFactory;
import com.nongminggong.factory.method.impl.OperationDivFactory;
import com.nongminggong.factory.method.impl.OperationMulFactory;
import com.nongminggong.factory.method.impl.OperationSubFactory;

/**
 * @author : zxliuyu
 * @date : 2022-11-25 17:11
 */
public class OperationClient {

	public static void main(String[] args) {
		OperationNumber operationNumber = new OperationNumber(10, 5);
		// 加法
		OperationFactory operationAddFactory = new OperationAddFactory();
		Operation operationAdd = operationAddFactory.createOperation();
		double addResult = operationAdd.operate(operationNumber);
		System.out.println("加法结果" + addResult);
		// 减法
		OperationFactory operationSubFactory = new OperationSubFactory();
		Operation operationSub = operationSubFactory.createOperation();
		double subResult = operationSub.operate(operationNumber);
		System.out.println("减法结果" + subResult);
		// 乘法
		OperationFactory operationMulFactory = new OperationMulFactory();
		Operation operationMul = operationMulFactory.createOperation();
		double mulResult = operationMul.operate(operationNumber);
		System.out.println("乘法结果" + mulResult);
		// 除法
		OperationFactory operationDivFactory = new OperationDivFactory();
		Operation operationDiv = operationDivFactory.createOperation();
		double divResult = operationDiv.operate(operationNumber);
		System.out.println("除法结果" + divResult);
	}
}
