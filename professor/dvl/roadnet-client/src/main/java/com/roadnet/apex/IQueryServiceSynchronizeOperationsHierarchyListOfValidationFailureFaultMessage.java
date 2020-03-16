
package com.roadnet.apex;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.4
 * 2020-03-15T13:07:05.050-03:00
 * Generated source version: 3.2.4
 */

@WebFault(name = "ListOf_ValidationFailure", targetNamespace = "http://roadnet.com/apex/DataContracts/")
public class IQueryServiceSynchronizeOperationsHierarchyListOfValidationFailureFaultMessage extends Exception {

    private com.roadnet.apex.datacontracts.ArrayOfValidationFailure listOfValidationFailure;

    public IQueryServiceSynchronizeOperationsHierarchyListOfValidationFailureFaultMessage() {
        super();
    }

    public IQueryServiceSynchronizeOperationsHierarchyListOfValidationFailureFaultMessage(String message) {
        super(message);
    }

    public IQueryServiceSynchronizeOperationsHierarchyListOfValidationFailureFaultMessage(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public IQueryServiceSynchronizeOperationsHierarchyListOfValidationFailureFaultMessage(String message, com.roadnet.apex.datacontracts.ArrayOfValidationFailure listOfValidationFailure) {
        super(message);
        this.listOfValidationFailure = listOfValidationFailure;
    }

    public IQueryServiceSynchronizeOperationsHierarchyListOfValidationFailureFaultMessage(String message, com.roadnet.apex.datacontracts.ArrayOfValidationFailure listOfValidationFailure, java.lang.Throwable cause) {
        super(message, cause);
        this.listOfValidationFailure = listOfValidationFailure;
    }

    public com.roadnet.apex.datacontracts.ArrayOfValidationFailure getFaultInfo() {
        return this.listOfValidationFailure;
    }
}
