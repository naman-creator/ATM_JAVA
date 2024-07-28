import java.util.Scanner;

public class ATMmacine {
    public static void main(String agr[]){
        
        long cardnumbernaman = 65229408;
       
        long cardnumbernaveen = 65228116;
      
        long cardnumberarchana = 65229407;
      
        long i;

        int j;

        int n;

        int choise;

        int pinnaman=2004;

        int pinnaveen=1234;

        int pinarchana=4567;

        int pin,oldpin,newpin;

        int MAINAMOUNT=1000,deposite;


        int AMOUNT;
      
        System.out.println("WELCOME");

        // SELCET YOUR LANGUAGE

        do
        {
            System.out.println("ENTER 1 FOR ENGLISH\nENTER 2 FOR HINDI");
      
            Scanner sc = new Scanner(System.in);

            j = sc.nextInt();

            if(j==1)
            {
            System.out.println("YOU SELECT ENGLISH LANGUAGE");
            }
            else{
            System.out.println("YOU SELECT HINDI LANGUAGE");
            System.out.println("BUT HINDI LANGUAGE IS NOT VALID FOR MY MACINE SO YOU CAN USE ONLY ENGLISH");
            }

      
           // CHECK CARDNUMBER AND USER DETAILS
      
            System.out.println("ENTER YOUR CARD NUMBER");
      
            Scanner sc1 = new Scanner(System.in);
      
            i = sc1.nextLong();

            if ( i==cardnumbernaman || i==cardnumbernaveen || i==cardnumberarchana){
            System.out.println("HELLO USER");

            //SELECT ONE OPTION

            System.out.println("SELECT 1 FOR WITHDRAWL\nSELECT 2 FOR BALANCE CHECK\nSELECT 3 FOR  RESET PIN\nSELECT4 FOR RECIPT\nSELECT 5 for deposite");
 
            Scanner sc2 = new Scanner(System.in);
      
            choise = sc2.nextInt();

            switch (choise) {
                case 1:
                System.out.println("YOU CHOOSE WITHDTRAWL OPTION");
                    
                //enter your pin

                System.out.println("enter your pin");
                Scanner sc3 = new Scanner(System.in);
      
                pin = sc3.nextInt();

                if(pin==pinnaman || pin==pinnaveen  || pin==pinarchana){
                    System.out.println("ENTER YOUR AMOUNT");
                    Scanner sc4 = new Scanner(System.in);
      
                    AMOUNT = sc4.nextInt();

                    if(AMOUNT<MAINAMOUNT){
                        System.out.println("AMOUNT IS WITHDRAWL:");
                    System.out.println(AMOUNT);
                    }
                    else{
                    System.out.println("TERA BAAP YAHA CHHOR KE GYA HAI YA TERI MAA");
                    }
                  }
                  else{

                   System.out.println("YOU ENTER WRONG PIN");

                   }
                  break;

                  case 2:

                   System.out.println("YOU CHOOSE BALANCE CHECK OPTION");

                    System.out.println("YOUR CURRENT BALANCE IS:");
                    System.out.println(MAINAMOUNT);

                    break;


                    case 3:

                    System.out.println("YOU CHOOSE RESET PIN OPTION");
            
                    System.out.println("enter old pin:");
                    Scanner sc6 = new Scanner(System.in);
                    oldpin = sc6.nextInt();
                    if(oldpin==pinnaman || oldpin==pinnaveen  || oldpin==pinarchana){
                    System.out.println("enter new pin:");
                    Scanner sc7 = new Scanner(System.in);
                    newpin = sc7.nextInt();
                    pinnaman=newpin;
                    pinarchana=newpin;
                    pinnaveen=newpin;
                }
                else{
                    System.out.println("you enter wrong oldpin");
                }


                    break;


                    case 4:

                    System.out.println("YOU CHOOSE RECIPT OPTION");

                    System.out.println("SORRY USER I M UNABLE TO GIVE YOU RECIPT :(");

                    break;
                    
                    case 5:

                    System.out.println("YOU CHOOSE deposite OPTION");
                    System.out.println("enter amount to be deposite");
                    Scanner sc8 = new Scanner(System.in);
                    deposite = sc8.nextInt();
                    MAINAMOUNT=MAINAMOUNT+deposite;
                    System.out.println("enter your pin");
                    Scanner sc5 = new Scanner(System.in);
      
                    pin = sc5.nextInt();

                    if(pin==pinnaman || pin==pinnaveen  || pin==pinarchana){
                    System.out.println("YOU MAINAMOUNT IS:");
                    System.out.println(MAINAMOUNT);
                    }
                    break;

                   default:

                   System.out.println("SORRY USER YOU INPUT WRONG CASE PLEASE CHECK :(");

                 break;
            }
            }
            else{

            System.out.println("YOU ENTER WRONG CARD NUMBER");

            }

            System.out.println("enter 1 for repit and enter 0 for exit");
            Scanner sc5 = new Scanner(System.in);
      
                    n = sc5.nextInt();

        }while (n == 1);
    }
}
