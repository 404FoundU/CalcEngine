package com.calcengine.myapp;

import com.calcengine.*;

public class Main {
	
	 

	public static void main(String[] args) {	
				
//		useMathEquation(); // A static method invoked without the need for creating an instance of a class. 
//		useCalaculatorBase();	
		
		String[] statements = {
				"add 1.0",
				"add xx 15.0",
				"addx 15.0 27.0",
				"divide 30.0 20.0",
				"multiply 30.0 20.0",
				"add 30.0 20.0",
				"subtract 30.0 20.0"
		};
		
		CalculateHelper helper = new CalculateHelper();
		for(String processstatements :statements){
			try {
				helper.process(processstatements);
				System.out.println(helper);
			} catch (InvalidStatementException e) {
				System.out.println(e.getMessage());
				if (e.getCause() != null)
					System.out.println("Original exception cause" +  e.getCause().getMessage());
			} 
			
		}
		
		
	}
	
//	private static void useCalaculatorBase() {
//		System.out.println("________Inheritance__________");
//		CalculateBase[] calculators = {
//				new Adder(10.0d,20.0d),
//				new Subtracter(10.0d,20.0d),
//				new Multiplier(10.0d,20.0d),
//				new Divisor(10.0d,20.0d)
//		};
//		
//		for(CalculateBase calculator: calculators){
//			calculator.calculate();
//			System.out.println("Results ="+calculator.getResults());
//		}
//	}
//
//
//	public static  void useMathEquation(){
//		MathEquation[] equations = new MathEquation[4];
//		
//		equations[0] = new MathEquation(50.0d, 60.0d, 'a');
//		equations[1] = new MathEquation(70.0d, 80.0d, 's');
//		equations[2] = new MathEquation(90.0d, 10.0d, 'm');
//		equations[3] = new MathEquation(20.0d, 30.0d, 'd');
//		
//		for( MathEquation equation: equations){
//			equation.execute();
//			System.out.println("Result = " + equation.getResults());
//		}
//		
//		double left = 2.0d;
//		double right = 3.0d;
//		
//		MathEquation equationOverload = new MathEquation('a');
//			equationOverload.execute(left , right);
//			System.out.println("Result 2 ="+ equationOverload.getResults());
//	}
	
	
//	public static MathEquation create(double leftVal, double rightVal, char opCode){
//		MathEquation equation = new MathEquation();
//		equation.setLeftVal(leftVal);
//		equation.setRightVal(rightVal);
//		equation.setOpCode(opCode);
//		
//		return equation;
//	}
}
