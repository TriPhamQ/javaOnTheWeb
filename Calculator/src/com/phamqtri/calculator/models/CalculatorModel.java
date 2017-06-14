package com.phamqtri.calculator.models;

import java.util.ArrayList;

public class CalculatorModel {
	private static float result = 0;
	private static ArrayList<Float> resultsHistory = new ArrayList<Float>();
	private static String current = "";

	public CalculatorModel() {

	}

	public float getResult() {
		return result;
	}

	public void setResult(float result) {
		CalculatorModel.result = result;
	}

	public ArrayList<Float> getResultsHistory() {
		return resultsHistory;
	}

	public void setResultsHistory(ArrayList<Float> resultsHistory) {
		CalculatorModel.resultsHistory = resultsHistory;
	}

	public String getCurrent() {
		return current;
	}

	public void setCurrent(String current) {
		CalculatorModel.current = current;
	}  

	public float division(float input) {
		CalculatorModel.result = CalculatorModel.result / input;
		return CalculatorModel.result;
	}

	public float multiplication(float input) {
		CalculatorModel.result = CalculatorModel.result * input;
		return CalculatorModel.result;
	}

	public float subtraction(float input) {
		CalculatorModel.result = CalculatorModel.result - input;
		return CalculatorModel.result;
	}

	public float addition(float input) {
		CalculatorModel.result = CalculatorModel.result + input;
		return CalculatorModel.result;
	}

	public ArrayList<Float> getEqualResult() {
		System.out.println(CalculatorModel.result);
		CalculatorModel.resultsHistory.add(CalculatorModel.result);
		System.out.println(CalculatorModel.resultsHistory);
		return CalculatorModel.resultsHistory;
	}

	public void reset() {
		CalculatorModel.result = 0;
		CalculatorModel.current = "";
		CalculatorModel.resultsHistory.clear();
	}
}
