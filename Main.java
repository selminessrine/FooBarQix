public class Main {
    // methode pour conaitre si n contient digit
    public static String convert(int number) {
        StringBuilder result = new StringBuilder();

        // Step 1: Check divisibility rules
        if (number % 3 == 0) {
            result.append("Foo");
        }
        if (number % 5 == 0) {
            result.append("Bar");
        }
        if (number % 7 == 0) {
            result.append("Qix");
        }

        // Step 2: Check each digit
        String numberStr = String.valueOf(number);
        for (char digit : numberStr.toCharArray()) {
            switch (digit) {
                case '3':
                    result.append("Foo");
                    break;
                case '5':
                    result.append("Bar");
                    break;
                case '7':
                    result.append("Qix");
                    break;
            }
        }

        // Step 3: If result is empty, return the number itself
        if (result.length() == 0) {
            result.append(numberStr);
        }

        return result.toString();
    }
    public static void main(String[] args) {
        Main test = new Main();
      // exemple 53
            System.out.println(convert(53));

    }
}