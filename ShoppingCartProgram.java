import java.util.Scanner;

public class ShoppingCartProgram {
    public static void main(String[] args){

        Scanner inputVangurathu = new Scanner(System.in);

        System.out.println("********** Welcome to Saravana stores **********");
        int n;
        System.out.print("Enter the number of Items in your cart: ");
        n = inputVangurathu.nextInt();

        String[] itemList = {"Note","Pen","Chocolate","Eraser","Pencil"};
        int temp, value=0,result=0;

        for(int i=1;i<=itemList.length;i++){
            System.out.print("Enter the quantity of "+itemList[i-1]+": ");
            temp = inputVangurathu.nextInt();
            value = switch (i) {
                case 1 -> 30;
                case 2 -> 10;
                case 3 -> 5;
                case 4 -> 2;
                case 5 -> 6;
                default -> value;
            };
            result += (value*temp);
        }
        System.out.println("Total amount is: "+result+"₹");

        inputVangurathu.close();

    }
}
