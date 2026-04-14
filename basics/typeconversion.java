public class typeconversion {
    public static void main(String[] args) {

        // Widening (Implicit) type conversion
        byte a=10;
        System.out.println("Original byte value: " + a);
        short b=a; // Automatic conversion from byte to short
        System.out.println("Implicit type conversion (byte to short): " + b);
        int c=b; // Automatic conversion from short to int
        System.out.println("Implicit type conversion (byte to int): " + c);
        long d=c; // Automatic conversion from int to long
        System.out.println("Implicit type conversion (byte to long): " + d);
        float e=d; // Automatic conversion from long to float
        System.out.println("Implicit type conversion (byte to float): " + e);
        double f=e; // Automatic conversion from float to double
        System.out.println("Implicit type conversion (byte to double): " + f);

        //Narrowing (Explicit) type conversion
        double myDouble2 = 12424.5632; // Original double value
        System.out.println("Original double value: " + myDouble2);
        float myFloat2 = (float) myDouble2; // Manual conversion from double to float
        System.out.println("Explicit type conversion (double to float): " + myFloat2);
        long myLong2 = (long) myDouble2; // Manual conversion from double to long
        System.out.println("Explicit type conversion (double to long): " + myLong2);
        int myInt2 = (int) myDouble2; // Manual conversion from double to int
        System.out.println("Explicit type conversion (double to int): " + myInt2);

    }
}
