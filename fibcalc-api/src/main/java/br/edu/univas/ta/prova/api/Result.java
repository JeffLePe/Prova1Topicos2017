package br.edu.univas.ta.prova.api;

public class Result {
	
	int number;
	int result;
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public Result withNumber(int number) {
		this.number = number;
		return this;
	}
	
	public int getResult() {
		return result;
	}
	
	public void setResult(int result) {
		this.result = result;
	}
	
	public Result withResult(int result) {
		this.result = result;
		return this;
	}

}
