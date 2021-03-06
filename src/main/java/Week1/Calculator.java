package Week1;

public class Calculator {

    public int add(String numbers) {

        String delimiter = " ";
        String splitter[];
        if (numbers.contains("//")) {
            splitter = numbers.split("\n");
            delimiter = splitter[0].replaceAll("//", "");

            String clearDelimiter = "//"+delimiter+"\n";
            numbers = numbers.replaceFirst(clearDelimiter, "");
        }
        String allDelimiters = ",|\n|" + delimiter;

        if (numbers.equals("")){
            return 0;

        }else if(numbers.contains(",") | numbers.contains("\n") | numbers.contains(delimiter)) { //Tjek for delimiters, aka flere tal

            String workstring[] = numbers.split(allDelimiters);

            int sum =0;

            for (String a : workstring) {
                int aNumber = Integer.parseInt(a);
                if (aNumber < 0){
                    System.out.println("Error negative number: " +aNumber);
                    continue;
                }

                sum+= aNumber;
            }
            return sum;

        }else { //Hvis der inge delimiter er, så er der kun 1 tal
            return Integer.parseInt(numbers);
        }
    }
}
