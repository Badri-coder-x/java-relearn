import java.util.Scanner;

public class ShoppingCartProgram {
    public static void main(String[] args){

        Scanner inputVangurathu = new Scanner(System.in);

        System.out.println("********** Welcome to Saravana stores **********");
        int n;
        System.out.print("Enter the number of Items in your cart: ");
        n = inputVangurathu.nextInt();

        String[] itemList = {"Note","Pen","Chocolate","Eraser","Pencil"};
        int temp=0, value=0,result=0;

        for(int i=1;i<=itemList.length;i++){
            System.out.print("Enter the quantity of "+itemList[i-1]+": ");
            temp = inputVangurathu.nextInt();
            switch (i){
                case 1:
                    value= 30;
                    break;
                case 2:
                    value = 10;
                    break;
                case 3:
                    value = 5;
                    break;
                case 4:
                    value = 2;
                    break;
                case 5:
                    value = 6;
                    break;

            }
            result += (value*temp);
        }
        System.out.println("Total amount is: "+result+"₹");

        inputVangurathu.close();

    }
}
