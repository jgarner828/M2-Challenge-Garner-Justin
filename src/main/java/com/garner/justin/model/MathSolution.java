package com.garner.justin.model;

import java.util.Objects;


public class MathSolution {

    private int operand1;
    private int operand2;
    private String operation;
    private int answer;

    public MathSolution(){}

    public MathSolution(int operand1, int operand2){
        this.operand1 = operand1;
        this.operand2 = operand2;
    }


    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer() {
            switch(this.operation) {
                case "add": this.answer = this.operand1 + this.operand2; break;
                case "subtract": this.answer = this.operand1 - this.operand2; break;
                case "multiply": this.answer = this.operand1 * this.operand2; break;
                case "divide": this.answer = this.operand1 / this.operand2; break;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathSolution that = (MathSolution) o;
        return operand1 == that.operand1 && operand2 == that.operand2 && Double.compare(that.answer, answer) == 0 && Objects.equals(operation, that.operation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operand1, operand2, operation, answer);
    }

    @Override
    public String toString() {
        return "MathSolution{" +
                "operand1=" + operand1 +
                ", operand2=" + operand2 +
                ", operation='" + operation + '\'' +
                ", answer=" + answer +
                '}';
    }
}

