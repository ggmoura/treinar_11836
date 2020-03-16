
package com.roadnet.apex;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.4
 * 2020-03-15T13:07:01.232-03:00
 * Generated source version: 3.2.4
 */

@WebFault(name = "ListOf_ValidationFailure", targetNamespace = "http://roadnet.com/apex/DataContracts/")
public class IRoutingServiceSendTextMessageToDriversListOfValidationFailureFaultMessage extends Exception {

    private com.roadnet.apex.datacontracts.ArrayOfValidationFailure listOfValidationFailure;

    public IRoutingServiceSendTextMessageToDriversListOfValidationFailureFaultMessage() {
        super();
    }

    public IRoutingServiceSendTextMessageToDriversListOfValidationFailureFaultMessage(String message) {
        super(message);
    }

    public IRoutingServiceSendTextMessageToDriversListOfValidationFailureFaultMessage(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public IRoutingServiceSendTextMessageToDriversListOfValidationFailureFaultMessage(String message, com.roadnet.apex.datacontracts.ArrayOfValidationFailure listOfValidationFailure) {
        super(message);
        this.listOfValidationFailure = listOfValidationFailure;
    }

    public IRoutingServiceSendTextMessageToDriversListOfValidationFailureFaultMessage(String message, com.roadnet.apex.datacontracts.ArrayOfValidationFailure listOfValidationFailure, java.lang.Throwable cause) {
        super(message, cause);
        this.listOfValidationFailure = listOfValidationFailure;
    }

    public com.roadnet.apex.datacontracts.ArrayOfValidationFailure getFaultInfo() {
        return this.listOfValidationFailure;
    }
}
