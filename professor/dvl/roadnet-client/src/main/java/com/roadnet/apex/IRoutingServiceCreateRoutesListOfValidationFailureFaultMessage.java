
package com.roadnet.apex;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.4
 * 2020-03-15T13:07:01.549-03:00
 * Generated source version: 3.2.4
 */

@WebFault(name = "ListOf_ValidationFailure", targetNamespace = "http://roadnet.com/apex/DataContracts/")
public class IRoutingServiceCreateRoutesListOfValidationFailureFaultMessage extends Exception {

    private com.roadnet.apex.datacontracts.ArrayOfValidationFailure listOfValidationFailure;

    public IRoutingServiceCreateRoutesListOfValidationFailureFaultMessage() {
        super();
    }

    public IRoutingServiceCreateRoutesListOfValidationFailureFaultMessage(String message) {
        super(message);
    }

    public IRoutingServiceCreateRoutesListOfValidationFailureFaultMessage(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public IRoutingServiceCreateRoutesListOfValidationFailureFaultMessage(String message, com.roadnet.apex.datacontracts.ArrayOfValidationFailure listOfValidationFailure) {
        super(message);
        this.listOfValidationFailure = listOfValidationFailure;
    }

    public IRoutingServiceCreateRoutesListOfValidationFailureFaultMessage(String message, com.roadnet.apex.datacontracts.ArrayOfValidationFailure listOfValidationFailure, java.lang.Throwable cause) {
        super(message, cause);
        this.listOfValidationFailure = listOfValidationFailure;
    }

    public com.roadnet.apex.datacontracts.ArrayOfValidationFailure getFaultInfo() {
        return this.listOfValidationFailure;
    }
}
