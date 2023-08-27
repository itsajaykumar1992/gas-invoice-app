package eficens.gas.app.controller;

import eficens.gas.app.calculate.CalculateAmount;
import eficens.gas.app.config.GasConfig;
import eficens.gas.app.model.InvoiceRequest;
import eficens.gas.app.model.InvoiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/gas")
public class GasAppController {

    @Autowired
    CalculateAmount calculateAmount;

    @PostMapping("/getInvoice")
    @ResponseBody
    public InvoiceResponse getInvoice(@RequestBody InvoiceRequest invoiceRequest) {
        InvoiceResponse invoiceResponse = new InvoiceResponse();
        invoiceResponse.setInvoiceCreateDate(calculateAmount.getCurrentDateAndTime());
        invoiceResponse.setGasPricePerGallon(GasConfig.GAS_PRICE);
        invoiceResponse.setGallonsFilled(
                invoiceRequest.getVehicleMaxGallonCapacity() - invoiceRequest.getNoOfGallonsInVehicle());
        invoiceResponse.setTotalPrice(calculateAmount.calculateTotalGasPrice(
                invoiceRequest.getNoOfGallonsInVehicle(), invoiceRequest.getVehicleMaxGallonCapacity()));
        return invoiceResponse;
    }
}
