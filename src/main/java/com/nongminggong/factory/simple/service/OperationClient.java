package com.nongminggong.factory.simple.service;

import com.nongminggong.factory.simple.OperationFactory;
import com.nongminggong.factory.simple.dto.OperationNumber;

/**
 * @author : zxliuyu
 * @date : 2022-11-25 17:11
 */
public class OperationClient {

	public static void main(String[] args) {
		OperationNumber operationNumber = new OperationNumber(10, 5);
		// 加法
		Operation operationAdd = OperationFactory.createOperation("+");
		double addResult = operationAdd.operate(operationNumber);
		System.out.println("加法结果" + addResult);
		// 减法
		Operation operationSub = OperationFactory.createOperation("-");
		double subResult = operationSub.operate(operationNumber);
		System.out.println("减法结果" + subResult);
		// 乘法
		Operation operationMul = OperationFactory.createOperation("*");
		double mulResult = operationMul.operate(operationNumber);
		System.out.println("乘法结果" + mulResult);
		// 除法
		Operation operationDiv = OperationFactory.createOperation("/");
		double divResult = operationDiv.operate(operationNumber);
		System.out.println("除法结果" + divResult);
	}
}
