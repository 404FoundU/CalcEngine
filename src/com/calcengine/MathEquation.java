package com.calcengine;

public class MathEquation {
	
	private double leftVal ;
	private double rightVal ;
	private char opCode ;
	private double results ;
	
	
	public double getLeftVal() {
		return leftVal;
	}


	public void setLeftVal(double leftVal) {
		this.leftVal = leftVal;
	}


	public double getRightVal() {
		return rightVal;
	}


	public void setRightVal(double rightVal) {
		this.rightVal = rightVal;
	}


	public char getOpCode() {
		return opCode;
	}


	public void setOpCode(char opCode) {
		this.opCode = opCode;
	}


	public double getResults() {
		return results;
	}


	public MathEquation (){}
	
	public MathEquation (char opCode){
		this.opCode = opCode;
	}
	
	public MathEquation (double leftVal, double rightVal, char opCode ){
		this(opCode);
		this.leftVal = leftVal;
		this.rightVal = rightVal;
	}
	public void execute(double leftVal, double rightVal){
		this.leftVal = leftVal;
		this.rightVal = rightVal;
		execute();
	}
	
	public void execute(){
		
		switch (opCode){
		
			case 'a': 
				 results = leftVal + rightVal;
				 break;
			case 's': 
				 results = leftVal - rightVal;
				 break;
			case 'm': 
				 results = leftVal * rightVal;
				 break;
			case 'd': 
				 results = rightVal != 0.0d ?  leftVal / rightVal : 0.0d;
				 break;
			default: 
				System.out.println("Invalid opcode " );
				 results = 0.0d;
	
		}
	}
}
