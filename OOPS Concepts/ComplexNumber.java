//Write a Java program to perform operator overloading using a class ComplexNumber. The class should support the addition of two complex numbers using a method called add. Each complex number consists of a real part and an imaginary part.

class ComplexNumber {
    private int real;   // Real part of the complex number
    private int imaginary; // Imaginary part of the complex number

    // Constructor to initialize a complex number
    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Display method for easy output
    public void display() {
        System.out.println(real + " + " + imaginary + "i");
    }

    public static void main(String[] args) {
        // Create two complex numbers
        ComplexNumber num1 = new ComplexNumber(2, 3); // 2 + 3i
        ComplexNumber num2 = new ComplexNumber(4, 5); // 4 + 5i
        // Add the two complex numbers
        ComplexNumber result = num1.add(num2);

        // Display the results
        System.out.print("First Complex Number: ");
        num1.display();
        System.out.print("Second Complex Number: ");
        num2.display();
        System.out.print("Sum of Complex Numbers: ");
        result.display();
    }
}
