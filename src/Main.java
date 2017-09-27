import java.util.Scanner;

/**
 * Instantiates Class Main to contain the Main Method
 * To instantiate and operate on Object References of the Parent Class and its children.
 */
public class Main
{
  private static TicketOrder[] orderSpec = new TicketOrder[150];
  private static int adultTicketAmount;
  private static int childTicketAmount;
  private static int studentTicketAmount;
  private static int OAPTicketAmount;
  private static int endPrice = 0;
  private static String viewDay;

/**
 * Main method taking user input for ticket preferences
 * Passing this specification within an array through the Class inheritance hierarchy Constructors, for operation.
 */
  public static void main(String[] args)
  {
     try
     {
       System.out.print("Welcome to the Cinema Ticket Order System.\n");

       System.out.print("Define a viewing day\n");
       Scanner o = new Scanner(System.in);
       viewDay = o.next();

       System.out.print("How many adult tickets?\n");
       Scanner j = new Scanner(System.in);
       adultTicketAmount = j.nextInt();

       System.out.print("How many child tickets?\n");
       Scanner k = new Scanner(System.in);
       childTicketAmount = k.nextInt();

       System.out.print("How many student tickets?\n");
       Scanner p = new Scanner(System.in);
       studentTicketAmount = p.nextInt();

       System.out.print("How many OAP tickets?\n");
       Scanner u = new Scanner(System.in);
       OAPTicketAmount = u.nextInt();

       orderSpec[0] = new StandardTicket(viewDay, adultTicketAmount, 0, "", endPrice);
       orderSpec[1] = new StudentTicket(viewDay, studentTicketAmount, 0, "", endPrice);
       orderSpec[2] = new ChildTicket(viewDay, childTicketAmount, 0, "", endPrice);
       orderSpec[3] = new OAPTicket(viewDay, OAPTicketAmount, 0, "", endPrice);

       while (true)
       {
         for (int i = 0; i < 4; i++)
         {
           orderSpec[i].print();
           System.out.print("\n");
         }
           System.out.print("\n Confirm ticket purchases Y/N \n");
           Scanner checkPurchase = new Scanner(System.in);
           String buyTickets = checkPurchase.next();

           if(buyTickets.equals("Y") | buyTickets.equals("y"))
           {
             System.out.print("Confirmed purchase, Thank you.");
             break;
           } else {
             System.out.print("Declined purchase, Thank you.");
             break;
         }
       }
     }
     catch(Exception e) {System.err.println(e.getMessage());}
  }
}







