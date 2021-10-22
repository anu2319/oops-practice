package Complex;

 class ComplexNumber
 {

    Double real;
    Double imaginary;


    public ComplexNumber(Double real, Double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber c2) {
        ComplexNumber sum = new ComplexNumber(0.0, 0.0);
        sum.real = this.real + c2.real;
        sum.imaginary = this.imaginary + c2.imaginary;
        return sum;
    }

    public ComplexNumber sub(ComplexNumber c2) {
        ComplexNumber subtract = new ComplexNumber(0.0, 0.0);
        subtract.real = this.real - c2.real;
        subtract.imaginary = this.imaginary - c2.imaginary;
        return subtract;
    }

    public ComplexNumber multiply(ComplexNumber c2) {
        ComplexNumber mul = new ComplexNumber((double) 0, 0.0);
        mul.real = (this.real * c2.real) - (this.imaginary * c2.imaginary);
        mul.imaginary = (this.real * c2.imaginary) + (this.imaginary * c2.real);
        return mul;
    }

    void print() 
    {
        System.out.println(this.real + " " + "+" + " " + this.imaginary + "i");
    }

 }

    class complex
    {
        public static void main(String[] args)
        {
            ComplexNumber c1 = new ComplexNumber(1.0, 4.0);
            ComplexNumber c2 = new ComplexNumber(3.0, 2.0);
            ComplexNumber c3 = c1.add(c2);
            c3.print();
            ComplexNumber c4 = c1.sub(c2);
            c4.print();
            ComplexNumber c5 = c1.multiply(c2);
            c5.print();
        }
    }
