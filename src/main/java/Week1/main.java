package Week1;

public class main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.add("1,2");

        String test = "//g\n10g10g10\n10,10";

        String delimiter = " ";
        String splitter[] = new String[test.length()];
        if (test.contains("//")) {
            splitter = test.split("\n");
            delimiter = splitter[0].replaceAll("//", "");
        }

        for (String a : splitter) {
            System.out.println(a);

        }

    }




}
