/**
 * Parent class TicketOrder initializes the super constructor TicketOrder()
 * defining values through children class constructors.
 * defines explicit Abstract Method print().
 */
public abstract class TicketOrder
{
  protected String viewDay;
  protected String ticketType;
  protected int ticketPrice;
  protected int ticketAmount;
  protected int endPrice;
/**
 * Parent Class Constructor implements specification of a unique ticket child
 * for reference and operation within the Main Class and Method.
 */
  public TicketOrder(String viewDay, int ticketAmount, int ticketPrice, String ticketType, int endPrice)
  {
    this.viewDay = viewDay;
    this.ticketAmount = ticketAmount;
    this.ticketPrice = ticketPrice;
    this.ticketType = ticketType;
    this.endPrice = endPrice;
  }

/**
 * Abstract Method print() is implemented to provide a Method for
 * printing children object constructor specification.
 */
  public abstract void print();

}
