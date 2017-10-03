package br.edu.univas.ta.prova.core;

import br.edu.univas.ta.prova.api.Result;
import br.edu.univas.ta.prova.api.fibcalcService;
import br.edu.univas.ta.prova.lib.FibonattiCalculation;

public class fibcalcServiceImpl implements fibcalcService{

	@Override
	public Result fib(int num) {
		int result = FibonattiCalculation.fibonacci(num);
		return new Result().withNumber(num).withResult(result);
	}

}
