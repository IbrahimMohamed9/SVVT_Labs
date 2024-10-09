package Lab1;

import java.util.Arrays;

public class Calculator {
    public int add(int x, int y){return x + y;}
    public int subtract(int x, int y){return x - y;}
    public int divide(int x, int y){
        if (y == 0) {
            throw new IllegalArgumentException();
        }
        return x / y;
    }
    public int multiply(int x, int y){ return x * y;}

    public int factory(int num){
        int result = 1;
        for(int i = 1; i <= num; i++){
            result *= i;
        }
        return result;
    }

    public String[] splitStringToArray(String str){
        return (str == null)? null : str.split(" ");
    }

    public int[] sortIntegersArray(int[] arr){
        return Arrays.stream(arr).sorted().toArray();
    }
}
