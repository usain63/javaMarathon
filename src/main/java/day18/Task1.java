package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};

        System.out.println(recursionSum(array, array.length));
    }
    
    public static int recursionSum (int[] array, int arrayLenght){
        if(arrayLenght == 0)
            return 0;
        return array[arrayLenght -1] + recursionSum(array, arrayLenght -1);
    }
        
}

    

