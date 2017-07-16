package com.calcengine;


public class CalculateHelper {
	
	private static final char ADD_SYMBOL = '+';
	private static final char SUBTRACT_SYMBOL = '-';
	private static final char MULTIPLY_SYMBOL = '*';
	private static final char DIVIDE_SYMBOL = '/';

	private double leftVal;
	private double rightVal;
	private double result;
	MathCommand operator;
	
	public void process(String statements) throws InvalidStatementException{
		String[] parts = statements.split(" ");
		
		if (parts.length != 3) throw new InvalidStatementException ("Incorrect number of fields" , statements); 
		
		String command = parts[0];
		
		try{
			this.leftVal =  Double.parseDouble(parts[1]);
			this.rightVal =  Double.parseDouble(parts[2]);	
		}catch(NumberFormatException e){
			throw new InvalidStatementException ("Non numeric data" , statements, e); 
		}
		setOperatorFromString(command);
		
		if(operator==null) throw new InvalidStatementException ("Invalid Command" , statements); 
		
		CalculateBase calculator = null; // cannot instantiate abstract class
		switch(operator){
			case Add:
				calculator= new Adder(leftVal,rightVal);
				break;
			case Subtract:
				calculator= new Subtracter(leftVal,rightVal);
				break;
			case Multiply:
				calculator= new Multiplier(leftVal,rightVal);
				break;
			case Divide:
				calculator= new Divisor(leftVal,rightVal);
				break;
		}
		calculator.calculate();
		result = calculator.getResults();
		
	}
	private void setOperatorFromString(String command){
		if (command.equalsIgnoreCase(MathCommand.Add.toString())){
			operator = MathCommand.Add;			
		}
		else if (command.equalsIgnoreCase(MathCommand.Subtract.toString())){
			operator = MathCommand.Subtract;			
		}
		else if (command.equalsIgnoreCase(MathCommand.Multiply.toString())){
			operator = MathCommand.Multiply;			
		}
		else if (command.equalsIgnoreCase(MathCommand.Divide.toString())){
			operator = MathCommand.Divide;			
		}
		
	}
	
	public String toString(){
		char symbol = ' ';
		switch(operator){
			case Add:
				symbol = ADD_SYMBOL;
				break;
			case Subtract:
				symbol = SUBTRACT_SYMBOL;
				break;
			case Multiply:
				symbol = MULTIPLY_SYMBOL;
				break;
			case Divide:
				symbol = DIVIDE_SYMBOL;
				break;
		
		}
		StringBuilder sb = new StringBuilder(20);
		sb.append(leftVal);
		sb.append(' ');
		sb.append(symbol);
		sb.append(' ');
		sb.append(rightVal);
		sb.append('=');
		sb.append(result);
		
		return sb.toString();
	}
	

}
