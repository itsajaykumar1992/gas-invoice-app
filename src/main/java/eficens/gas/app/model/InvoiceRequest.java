package eficens.gas.app.model;

public class InvoiceRequest {

    private double noOfGallonsInVehicle;

    private double vehicleMaxGallonCapacity;

    public double getNoOfGallonsInVehicle() {
        return noOfGallonsInVehicle;
    }

    public void setNoOfGallonsInVehicle(double noOfGallonsInVehicle) {
        this.noOfGallonsInVehicle = noOfGallonsInVehicle;
    }

    public double getVehicleMaxGallonCapacity() {
        return vehicleMaxGallonCapacity;
    }

    public void setVehicleMaxGallonCapacity(double vehicleMaxGallonCapacity) {
        this.vehicleMaxGallonCapacity = vehicleMaxGallonCapacity;
    }
}
