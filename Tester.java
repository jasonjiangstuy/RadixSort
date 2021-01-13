public class Tester{
    public static void main(String[] args) {
        System.out.println("Test Nth");
        // nth(123,1) -> 2
        tester("nth", 123, 1,  2);
        tester("nth", 123, 2,  1);
        tester("nth", 123, 0,  3);
        System.out.println("Test length");
        tester("length", 0, 1);
        tester("length", 15, 2);
        tester("length", -10, 2);
        tester("length", 5112, 4);

    }

    private static void tester(Object... values) {
        if (values[0].equals("nth")){
            // System.out.println(Radix.nth((int)values[1], (int)values[2]));
            System.out.println(Radix.nth((int)values[1], (int)values[2])==(int)values[3]);
        }
        if (values[0].equals("length")){
            // System.out.println(Radix.length((int)values[1]));
            System.out.println(Radix.length((int)values[1])==(int)values[2]);
        }


    }
    
}