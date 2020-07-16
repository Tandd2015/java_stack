import java.io.Serializable;

class Calculator implements Serializable{
    private double operandOne;
    private String operatation;
    private double operandTwo;
    private double results;
    
    // constructors
    public Calculator() {
    }

    public Calculator(double operandOne, String operation, double operandTwo) {
        this.operandOne = operandOne;
        this.operatation = operation;
        this.operandTwo = operandTwo;
    }

    // getters
    public double getOperandOne() {
        return operandOne;
    }
    public String getOperation() {
        return operatation;
    }
    public double getOperandTwo() {
        return operandTwo;
    }
    public double getResults() {
        System.out.println(results);
        return results;
    }
    // setters
    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }
    public void setOperation(String operation) {
        this.operatation = operation;
    }
    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }

    public void performOperation() {
        if(this.operatation.equals("+")) {
            results = operandOne + operandTwo;
        }
        if(this.operatation.equals("-")) {
            results = operandOne - operandTwo;
        }
    }

}