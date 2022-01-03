package Week1;

public class Calculator {

    public int add(String numbers){
        int value =0;

        switch (numbers.length()){
            case 0:
                break;
            case 1:
                value = Integer.parseInt(numbers);
                return value;
            case 3:
                numbers.split(",");


        }


        return 0;
    }

}
