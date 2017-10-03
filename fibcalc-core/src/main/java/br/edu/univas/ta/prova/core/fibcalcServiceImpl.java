package br.edu.univas.ta.prova.core;

import br.edu.univas.ta.prova.api.Result;
import br.edu.univas.ta.prova.api.fibcalcService;
import br.edu.univas.ta.prova.lib.FibonacciCalculation;

public class fibcalcServiceImpl implements fibcalcService{

	@Override
	public Result fib(int num) {
		int result = FibonacciCalculation.fibonacci(num);
		return new Result().withNumber(num).withFibonacci(result);
	}

}
