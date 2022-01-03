package Week1;

public class Calculator {

    public int add(String numbers){

        switch (numbers.length()){
            case 0:
                break;
            case 1:
                return Integer.parseInt(numbers);
            case 3:
                String workstring[] = new String[2];

                if (numbers.contains(","))
                    workstring = numbers.split(",");
                else if (numbers.contains("\n"))
                    workstring =numbers.split("\n");

                return Integer.parseInt(workstring[0]) + Integer.parseInt(workstring[1]);

        }


        return 0;
    }

}
