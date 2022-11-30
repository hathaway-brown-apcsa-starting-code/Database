
/**
 * Used to test the Item class.
 *
 * @author  APCS-A @ HB section 1\
 * @version 2022-09-20
 */
public class ItemTester
{
    public static void main(String[] args)
    {
        Item item1 = new Item("banana", 66, 0.39);
        Item item2 = new Item("cookies and cream ice cream", 10, 5.49);
        
        System.out.println(item1.toString());
        System.out.println(item2.toString());
        
        double grandTotal = item1.getTotalCost() + item2.getTotalCost();
        System.out.println("Grand total: $" + grandTotal);
        
        item1.setQuantity(12);
        item2.setQuantity(4);
        
        System.out.println("\n\n");
        System.out.println(item1.toString());
        System.out.println(item2.toString());
        
        grandTotal = item1.getTotalCost() + item2.getTotalCost();
        System.out.println("Grand total: $" + grandTotal);
    }
}
