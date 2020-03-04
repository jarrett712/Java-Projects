public class Main {
   public static void main(String[] args) {
      int invoice invoice1 = new invoice("1234", "Hammer", 2, 14.95);
 
      // display invoice1
      System.out.println("Original invoice information");
      System.out.printf("Part number: %s%n", invoice1.getPartNumber());
      System.out.printf("Description: %s%n", invoice1.getPartDescription());
      System.out.printf("Quantity: %d%n", invoice1.getQuantity());
      System.out.printf("Price: %.2f%n", invoice1.getPricePerItem());
      System.out.printf("Invoice amount: %.2f%n", invoice1.getInvoiceAmount());

      // change invoice1's data
      invoice1.setPartNumber("001234");
      invoice1.setPartDescription("Yellow Hammer");
      invoice1.setQuantity(3);
      invoice1.setPricePerItem(19.49);

      // display invoice1 with new data
      System.out.printf("%nUpdated invoice information%n");
      System.out.printf("Part number: %s%n", invoice1.getPartNumber());
      System.out.printf("Description: %s%n", invoice1.getPartDescription());
      System.out.printf("Quantity: %d%n", invoice1.getQuantity());
      System.out.printf("Price: %.2f%n", invoice1.getPricePerItem());
      System.out.printf("Invoice amount: %.2f%n", invoice1.getInvoiceAmount());

      invoice invoice2 = new invoice("5678", "Paint Brush", -5, -9.99);
 
      // display invoice2
      System.out.printf("%nOriginal invoice information%n");
      System.out.printf("Part number: %s%n", invoice2.getPartNumber());
      System.out.printf("Description: %s%n", invoice2.getPartDescription());
      System.out.printf("Quantity: %d%n", invoice2.getQuantity());
      System.out.printf("Price: %.2f%n", invoice2.getPricePerItem());
      System.out.printf("Invoice amount: %.2f%n", invoice2.getInvoiceAmount());

      // change invoice2's data
      invoice2.setQuantity(3);
      invoice2.setPricePerItem(9.49);

      // display invoice2 with new data
      System.out.printf("%nUpdated invoice information%n");
      System.out.printf("Part number: %s%n", invoice2.getPartNumber());
      System.out.printf("Description: %s%n", invoice2.getPartDescription());
      System.out.printf("Quantity: %d%n", invoice2.getQuantity());
      System.out.printf("Price: %.2f%n", invoice2.getPricePerItem());
      System.out.printf("Invoice amount: %.2f%n", invoice2.getInvoiceAmount());
   } // end main
} // end class InvoiceTest
