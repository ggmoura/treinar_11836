
package com.roadnet.apex;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.4
 * 2020-03-15T13:07:03.838-03:00
 * Generated source version: 3.2.4
 */

@WebFault(name = "ListOf_ValidationFailure", targetNamespace = "http://roadnet.com/apex/DataContracts/")
public class IQueryServiceRetrieveRouteSignaturesListOfValidationFailureFaultMessage extends Exception {

    private com.roadnet.apex.datacontracts.ArrayOfValidationFailure listOfValidationFailure;

    public IQueryServiceRetrieveRouteSignaturesListOfValidationFailureFaultMessage() {
        super();
    }

    public IQueryServiceRetrieveRouteSignaturesListOfValidationFailureFaultMessage(String message) {
        super(message);
    }

    public IQueryServiceRetrieveRouteSignaturesListOfValidationFailureFaultMessage(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public IQueryServiceRetrieveRouteSignaturesListOfValidationFailureFaultMessage(String message, com.roadnet.apex.datacontracts.ArrayOfValidationFailure listOfValidationFailure) {
        super(message);
        this.listOfValidationFailure = listOfValidationFailure;
    }

    public IQueryServiceRetrieveRouteSignaturesListOfValidationFailureFaultMessage(String message, com.roadnet.apex.datacontracts.ArrayOfValidationFailure listOfValidationFailure, java.lang.Throwable cause) {
        super(message, cause);
        this.listOfValidationFailure = listOfValidationFailure;
    }

    public com.roadnet.apex.datacontracts.ArrayOfValidationFailure getFaultInfo() {
        return this.listOfValidationFailure;
    }
}
