package com.exception.demo;

class InvalidMonthException extends Exception{

	InvalidMonthException(String s){
		super(s);
	}
	
}

class TestCustomException extends InvalidMonthException{

	TestCustomException(String s) {
		super(s);
	}

	static void validateMonth(int Month) throws InvalidMonthException {

		if (Month >=1 && Month<=12) {
			System.out.println("Valid month");
		} else {
			throw new InvalidMonthException("Invalid month");
		}
	}

	public static void main(String[] args) {

		try {
			validateMonth(16);
		} catch (Exception e) {
			System.out.println("Exception is occured : " + e);
		}

	}

}
