import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        /*System.out.println("  0: (Binary) " + toBinary(0) + " (Octal) " + toOctal(0) + " (Hexadecimal) " + toHex(0));
        System.out.println("  1: (Binary) " + toBinary(1) + " (Octal) " + toOctal(1) + " (Hexadecimal) " + toHex(1));
        System.out.println(" 63: (Binary) " + toBinary(63) + " (Octal) " + toOctal(63) + " (Hexadecimal) " + toHex(63));
        System.out.println("127: (Binary) " + toBinary(127) + " (Octal) " + toOctal(127) + " (Hexadecimal) " + toHex(127));
        System.out.println("255: (Binary) " + toBinary(255) + " (Octal) " + toOctal(255) + " (Hexadecimal) " + toHex(255));
        System.out.println("256: (Binary) " + toBinary(256) + " (Octal) " + toOctal(256) + " (Hexadecimal) " + toHex(256));*/
        System.out.println("Binary (0, 1, 63, 127, 255, and 256, respectively):");
        toBinary(0);
        toBinary(1);
        toBinary(63);
        toBinary(127);
        toBinary(255);
        toBinary(256);
        System.out.println("Octal (0, 1, 63, 127, 255, and 256, respectively):");
        toOctal(0);
        toOctal(1);
        toOctal(63);
        toOctal(127);
        toOctal(255);
        toOctal(256);
        System.out.println("Hexadecimal (0, 1, 63, 127, 255, and 256, respectively):");
        toHex(0);
        toHex(1);
        toHex(63);
        toHex(127);
        toHex(255);
        toHex(256);
    }
    public static ArrayList<Integer> toBinary(int dec){
        ArrayList<Integer> binary = new ArrayList<>();
        binary.add(0);
        binary.add(0);
        binary.add(0);
        binary.add(0);
        binary.add(0);
        binary.add(0);
        binary.add(0);
        binary.add(0);
        binary.add(0);
        int preBinary;
        for (int i = 8; i >= 0; i--) {
            preBinary = dec % 2;
            binary.set(i, preBinary);
            dec = dec / 2;
        }
        for (int i = 0; i <= 8; i++) {
            int result = binary.get(i);
            System.out.print(result);
        }
        System.out.println();
        return binary;
    }
    public static ArrayList<Integer> toOctal(int dec){
        ArrayList<Integer> octal = new ArrayList<>();
        octal.add(0);
        octal.add(0);
        octal.add(0);
        octal.add(0);
        octal.add(0);
        octal.add(0);
        octal.add(0);
        octal.add(0);
        octal.add(0);
        int preOctal;
        for (int i = 8; i >= 0; i--) {
            preOctal = dec % 8;
            octal.set(i, preOctal);
            dec = dec / 8;
        }
        for (int i = 0; i <= 8; i++) {
            int result = octal.get(i);
            System.out.print(result);
        }
        System.out.println();
        return octal;
    }
    public static ArrayList<Integer> toHex(int dec) {
        ArrayList<Integer> hex = new ArrayList<>();
        hex.add(0);
        hex.add(0);
        hex.add(0);
        hex.add(0);
        hex.add(0);
        hex.add(0);
        hex.add(0);
        hex.add(0);
        hex.add(0);
        int preHex;
        for (int i = 8; i >= 0; i--) {
            preHex = dec % 16;
            hex.set(i, preHex);
            dec = dec / 16;
        }
        for (int i = 0; i <= 8; i++) {
            int result = hex.get(i);
            System.out.print(result);
        }
        System.out.println();        return hex;
    }
}
