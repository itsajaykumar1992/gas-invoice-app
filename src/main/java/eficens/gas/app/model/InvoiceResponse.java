package eficens.gas.app.model;

public class InvoiceResponse {

    private String invoiceCreateDate;

    private double gasPricePerGallon;

    private double gallonsFilled;

    private double totalPrice;

    public String getInvoiceCreateDate() {
        return invoiceCreateDate;
    }

    public void setInvoiceCreateDate(String invoiceCreateDate) {
        this.invoiceCreateDate = invoiceCreateDate;
    }

    public double getGasPricePerGallon() {
        return gasPricePerGallon;
    }

    public void setGasPricePerGallon(double gasPricePerGallon) {
        this.gasPricePerGallon = gasPricePerGallon;
    }

    public double getGallonsFilled() {
        return gallonsFilled;
    }

    public void setGallonsFilled(double gallonsFilled) {
        this.gallonsFilled = gallonsFilled;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
