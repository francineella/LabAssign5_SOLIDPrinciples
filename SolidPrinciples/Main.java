package SolidPrinciples;

public class Main {
    public static void main(String[] args) {
        Order order = new OrderProcessor();
        double total = order.calculateTotal(200.0,2);
        System.out.println("Order total: P" + total);

        order.placeOrder("Francine Ella Macabales", "321 Eme St., Brgy. New Era, Manila");

        InvoiceGenerator invoiceGenerator = new PdfInvoiceGenerator();
        invoiceGenerator.generateInvoice("order_010.pdf");

        NotificationService notificationService = new EmailNotificationService();
        notificationService.sendNotification("francescaeya@gmail.com");
    }
}