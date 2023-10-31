import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

        //1

        System.out.println("Enter a number");
        int num = input.nextInt();
        if(num%2 == 0){
            System.out.println("The number is even");
        }  if (num%2 != 0) {
            System.out.println("the number is odd");
        }


        //2

        int sum = 0;
        int numbers;
        do {
            System.out.println("Enter numbers, -1 to exit ");
            numbers = input.nextInt();
            if (numbers > 0) {
                sum += numbers;
            }
        }while (numbers != -1);
        System.out.println("Sum of the entered numbers = "+sum);


        //3

        int [] arr = {10,-21,30,31,-25};

        for (int n:arr) {
            if (n >0){
                System.out.println(" "+n+"  is a positive number");
        }
            if (n<0){
                System.out.println(n+"  is a negative number");

            }
        }


        //4

        String[] arr2 = {"Tuwaiq","Bootcamp","Student","Java"};
        int j = 1;
        String temp ="";
        for (int i = 0; i <arr2.length ; i++) {
            if ( arr2[i].length()  < arr2[j].length()){
                temp = arr2[i];
                j++;
            }
            else if ( arr2[j].length() < arr2[i].length() ) {
                temp = arr2[j];
                i++;
            }
        }
        System.out.println(temp);

    }
}