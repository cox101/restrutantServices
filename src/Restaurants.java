import java.util.Scanner;


public class Restaurants {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean quit= false;
        int sum=0;
        int wine=200,nyamaChoma=2000,bear=400,juice=100;
        String order="";

        do{
            System.out.println("ITEM"+"\t\tPrice");
            System.out.println("1.Wine"+"\t\t"+"200");
            System.out.println("2.Nyamachoma"+"\t"+"2000");
            System.out.println("3.Bean"+"\t\t"+"400");
            System.out.println("4.Juice"+"\t\t"+"100");
            System.out.println("5.Quit");

            int choice=input.nextInt();

            switch(choice){
                case 1:System.out.println("Wine"+"\n");
                    sum=sum+wine;
                    order=order.concat("wine"+"\n");

                    break;
                case 2:
                    System.out.println("Chapati");
                    sum=sum+nyamaChoma;
                    order=order.concat("Chapati"+"\n");

                    break;
                case 3:
                    System.out.println("Bear");
                    sum=sum+bear;
                    order=order.concat("Bear"+"\n");
                    break;
                case 4:
                    System.out.println("Juice");
                    sum=sum+juice;
                    order=order.concat("Juice"+"\n");
                    break;
                case 5:
                    quit=true;

                    break;
                default:
                    System.out.println("Wrong input");
            }

        }while(!quit);

        System.out.println("Your Orders are:\n"+order);
        System.out.println("Your total bill="+sum);
        

        System.out.println("Thank you");





    }

}
