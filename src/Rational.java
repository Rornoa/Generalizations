class Rational implements Comparable<Rational> {
    private int numerator;   //делимое
    private int denominator; //делитель

    public Rational(int a, int b) {
        numerator = a;
        denominator = b;
        if (denominator == 0) throw new IllegalArgumentException();

        if (denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
        int nod = greatestCommonDivisor(Math.abs(numerator), denominator);
        numerator = numerator / nod;
        denominator = denominator / nod;
    }

    public int compareTo(Rational rational) {
        return (this.denominator * rational.numerator - rational.denominator * this.numerator);
    }

    private int greatestCommonDivisor(int a, int b) { //nod - наибольший общий делитель
        int tmp;
        do {
            tmp = a % b;
            a = b;
            b = tmp;
        } while (tmp != 0);
        return a;
    }

    public String toString() {
        if (numerator == 0) return "0";

        String str = "";
        int a = Math.abs(numerator);
        if (numerator < 0) str += "-";

        if (a > denominator) str += a / denominator + " ";

        if (a % denominator == 0) return str;

        str += a % denominator + "/" + denominator + "  ";
        return str;
    }
}

