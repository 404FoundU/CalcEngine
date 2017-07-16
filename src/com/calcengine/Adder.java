package com.calcengine;

public class Adder extends CalculateBase {
	
	public Adder(){}
	public Adder (double leftVal, double rightVal){
		super(leftVal, rightVal);
	}
	
	@Override
	public void calculate(){
		double value = getLeftVal() + getRightVal();
		setResults(value);	

	}
}
