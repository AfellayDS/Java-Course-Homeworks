public class Main {
    public static void main(String[] args) {
        System.out.println("1.1 Logical NOT: !true = " + !true);
        System.out.println("1.2 Logical AND: true && false = " + (true && false));
        System.out.println("1.3 Logical OR: true || false = " + (true || false));
        System.out.println();

        double x = -13.8;
        double y = 6.78;
        double max = x > y ? x : y;
        System.out.println("2. Maximum(x,y)=" + max);
        System.out.println();

        int a = 0b00010111; // a = 23
        int b = 0b10100011; // b = 163
        Print(a, b, ~a & 0xFF, "3.1 Bitwise Complement Operation (~):");
        Print(a, b, a & b, "3.2 Bitwise AND Operation (&):");
        Print(a, b, a | b, "3.3 Bitwise OR Operation (|):");
        Print(a, b, a ^ b, "3.4 Bitwise XOR Operation (^):");
        System.out.println();

        int num = 0b00001100;
        System.out.println("4.1 0b00001100 >> 2 = " + "0b" + toBinary(num >> 2));
        System.out.println("4.2 0b00001100 << 3 = " + "0b" + toBinary(num << 3));
        System.out.println();

        // The unsigned right-shift operator is a special type of right-shift operator
        // that doesn't use the sign bit for filling the trailing position.
        // The unsigned right-shift operator always fills the trialing position by 0.
        System.out.println("4.3 Unsigned right-shift:");
        int n = -8;
        String s1 = Integer.toBinaryString(n);
        String s2 = Integer.toBinaryString(n >> 1);
        String s3 = Integer.toBinaryString(n >>> 1);
        System.out.println("      n = 0b" + s1 + " = " + n);
        System.out.println(" n >> 1 = 0b" + s2 + " = " + (n >> 1));
        System.out.println("n >>> 1 = 0b0" + s3 + " = " + (n >>> 1));
    }

    // Return the binary code of the LSB byte of an integer
    static String toBinary(int x) {
        String binaryCode = String.format("%8s", Integer.toBinaryString(x & 0xFF));
        binaryCode = binaryCode.replace(" ", "0");
        return binaryCode;
    }

    // Demonstrate tables of bitwise operations for single-byte numbers
    static void Print(int x, int y, int z, String title) {
        System.out.println(title);
        System.out.println(toBinary(x) + " = " + x);
        if (!title.contains("~"))
            System.out.println(toBinary(y) + " = " + y);
        System.out.println("--------");
        System.out.println(toBinary(z) + " = " + z);
        System.out.println();
    }
}