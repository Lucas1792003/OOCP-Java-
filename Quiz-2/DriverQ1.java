public class DriverQ1 {
    public static void main(String[] args) {
        AnInt[] myInt = {new AnInt(-4123), new AnInt(1234), new AnInt(-1000), new AnInt(3), new AnInt(-34129)};
        for (int i = 0; i < myInt.length; i++) {
            myInt[i].swap();
            System.out.println("AnInt (" + String.valueOf(i) +"): "+ myInt[i].getNumber()); // 0, 1, -1
            System.out.println("Double AnInt (" + String.valueOf(i) +"): "+2 * myInt[i].getNumber());
        }

        AString[] myString = {new AString("Hello"), new AString("a"), new AString("bye bye!"), new AString("ABCD")};

        for (int i = 0; i < myString.length; i++) {
            myString[i].swap();
            System.out.println("AString (" + String.valueOf(i) +"): "+ myString[i].getStr()); // 0, 1, -
        }

    }
}