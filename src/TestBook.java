import java.util.Scanner;

public class TestBook{
    public static void main (String[]args){

        Scanner input = new Scanner (System.in);

        //The Book List
        System.out.println("The Book List");
        System.out.println("1)How to do programming 12th Edition by Liang.\n2)Malaysian Food Recipe by Nadia Bt Mahmud.\n3)What is Islam by Ustad Manzoor Malik.\n4)Urban Legend by Christine R.M.\n5)Fundamental of Calculus by Prof. Abu.\n6)How to raise your kids by Salsabila\n");
        System.out.println("Choose your book number to know the price: ");
        int option = input.nextInt();

        // invoke the option to get the price
        Book b1 = new Book(theOption(option);
        System.out.println("The price is: "+ b1.getPrice());


    }
    //Method option
    public static int theOption(int option){
        return option;
    }
}