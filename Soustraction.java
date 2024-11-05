public class Soustraction extends Operation {
    public Soustraction(Expression op1, Expression op2) {
        super(op1, op2);
    }


    public double valeur() throws ArithmeticException {
        return getOperande1().valeur() - getOperande2().valeur();
    }


    public String toString() {
        return getOperande1() + " - " + getOperande2();
    }
}
