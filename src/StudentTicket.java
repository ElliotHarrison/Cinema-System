/**
 * Child class StudentTicket initializes a Child Class Constructor StudentTicket()
 * defining values with this ticket type for passing to super Constructor.
 * Implements explicit Abstract Method print() from parent Class TicketOrder.
 */
public class StudentTicket extends TicketOrder
{
  protected int price = 6;
  protected String ticketType = "Student";

/**
 * Child Class Constructor StudentTicket() implements specification of the ticket
 * is then passed through super constructor.
 */
  public StudentTicket(String viewDay, int ticketAmount, int price, String ticketType, int endPrice)
  {
    super(viewDay, ticketAmount, price, ticketType, endPrice);
  }

/**
 * Method print() checks for "Wednesday" ticket discount and applies per ticket cost
 * otherwise will pass through total without discount.
 */
  public void print()
  {
    if(viewDay.equals("Wednesday"))
    {
      int r = price - 2;
      System.out.print("\n view day: " + viewDay + "\n Amount of tickets: " + ticketAmount + "\n Price per ticket: \u00a3" + price + "\n Type: " + ticketType + "\n Total to pay: \u00a3" + ticketAmount * r);
    }
    else
    {
      System.out.print("\n view day: " + viewDay + "\n Amount of tickets: " + ticketAmount + "\n Price per ticket: \u00a3" + price + "\n Type: " + ticketType + "\n Total to pay: \u00a3" + ticketAmount * price);
    }
  }
}
