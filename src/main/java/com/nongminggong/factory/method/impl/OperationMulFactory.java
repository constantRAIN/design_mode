package com.nongminggong.factory.method.impl;


import com.nongminggong.factory.method.OperationFactory;
import com.nongminggong.factory.method.service.Operation;
import com.nongminggong.factory.method.service.impl.OperationMul;
import com.nongminggong.factory.method.service.impl.OperationSub;

/**
 * @author : zxliuyu
 * @date : 2022-11-25 16:54
 */
public class OperationMulFactory implements OperationFactory {

	@Override
	public Operation createOperation() {
		return new OperationMul();
	}
}
