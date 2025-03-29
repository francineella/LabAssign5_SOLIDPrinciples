package SolidPrinciples;

public class PdfInvoiceGenerator implements InvoiceGenerator {
    @Override
    public void generateInvoice(String fileName) {
        System.err.println("Invoice generated: " + fileName);
    }
}