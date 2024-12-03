package arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Reversed array :");

        /*
        1.)    i = numbers.length - 1 -> dizinin son elemanı yani index[4] ü alıyor(index[4]=5'tir. 5>=0 mı evet 5 i yazacak)
        2.)    i =  numbers.length - 1 -> dizinin son elamanı index[3] yani 4 oldu. 4>=0 mı evet 4 'ü yazar
        3.)
        4.)
        5.)   i =  numbers.length - 1 -> dizinin son elamanı index[0] yani 1 oldu. 1>=0 mı evet 1'i yazar
         */
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

    }
}

