public class IntsCalculator implements CalculatingInt {
    protected final Calculator targetCalculator;

    public IntsCalculator() {
        this.targetCalculator = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        return createFormula(arg0, arg1)
                .calculate(Calculator.Operation.SUM)
                .result
                .intValue();
    }



    @Override
    public int mult(int arg0, int arg1) {
        return createFormula(arg0, arg1)
                .calculate(Calculator.Operation.MULT)
                .result
                .intValue();
    }

    @Override
    public double pow(int a, int b) {
        return  createFormula(a, b)
                .calculate(Calculator.Operation.POW)
                .result
                .intValue();
    }

    private Calculator.Formula createFormula(int arg0, int arg1) {
        return targetCalculator.newFormula()
                .addOperand(arg0)
                .addOperand(arg1);

    }
}
