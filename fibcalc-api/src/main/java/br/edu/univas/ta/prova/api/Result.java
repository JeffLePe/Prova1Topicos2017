package br.edu.univas.ta.prova.api;

public class Result {
	
	int number;
	int fibonacci;
	
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
	
	public int getFibonacci() {
		return fibonacci;
	}
	
	public void setFibonacci(int fibonacci) {
		this.fibonacci = fibonacci;
	}
	
	public Result withFibonacci(int fibonacci) {
		this.fibonacci = fibonacci;
		return this;
	}

}
