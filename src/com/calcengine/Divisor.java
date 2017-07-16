package com.calcengine;


public class Divisor extends CalculateBase {
	
	public Divisor(){}
	public Divisor (double leftVal, double rightVal){
		super(leftVal, rightVal);
	}
	
	@Override
	public void calculate(){
		double value = getLeftVal() / getRightVal();
		setResults(value);	
	}
}
