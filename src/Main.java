public class Main {
    public static void main(String[] args) {
        //For loop to print pattern a.
        for(int i = 0; i < 10; i++){
            int counter = 0;
            while(counter <= i){
                System.out.print("*");
                counter++;
            }
            System.out.println();
        }
        //Creates a space between pattern a. and b.
        System.out.println();
        //For loop to print pattern b.
        for(int i = 9; i+1 > 0; i--){
            int counter = 0;
            while(counter <= i){
                System.out.print("*");
                counter++;
            }
            System.out.println();
        }
        //For loop to print pattern c.
        System.out.println();
        for(int i = 9; i+1 > 0; i--){
            int sCounter = 0;
            int counter = 0;
            while(sCounter < 9 - i){
                System.out.print(" ");
                sCounter++;
            }
            while(counter <= i){
                System.out.print("*");
                counter++;
            }
            System.out.println();
        }
        System.out.println();
        //For loop to print pattern d.
        for(int i = 0; i < 10; i++){
            int sCounter = 0;
            int counter = 0;
            while(sCounter < 9 - i){
                System.out.print(" ");
                sCounter++;
            }
            while(counter <= i){
                System.out.print("*");
                counter++;
            }
            System.out.println();
        }
    }
}