package eficens.gas.app.calculate;

import eficens.gas.app.config.GasConfig;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class CalculateAmount {

    public double calculateTotalGasPrice(double noOfGallonsInVehicle, double vehicleMaxGallonCapacity) {
        return (vehicleMaxGallonCapacity-noOfGallonsInVehicle) * GasConfig.GAS_PRICE;
    }

    public String getCurrentDateAndTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy - hh:mm a");
        String formattedDateTime = currentDateTime.format(formatter);
        return formattedDateTime;
    }
}
