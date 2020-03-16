
package com.roadnet.apex;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.4
 * 2020-03-15T13:07:02.288-03:00
 * Generated source version: 3.2.4
 */

@WebFault(name = "ListOf_ValidationFailure", targetNamespace = "http://roadnet.com/apex/DataContracts/")
public class IAdministrationServiceToggleMatrixBuildEnabledForCustomerRegionsListOfValidationFailureFaultMessage extends Exception {

    private com.roadnet.apex.datacontracts.ArrayOfValidationFailure listOfValidationFailure;

    public IAdministrationServiceToggleMatrixBuildEnabledForCustomerRegionsListOfValidationFailureFaultMessage() {
        super();
    }

    public IAdministrationServiceToggleMatrixBuildEnabledForCustomerRegionsListOfValidationFailureFaultMessage(String message) {
        super(message);
    }

    public IAdministrationServiceToggleMatrixBuildEnabledForCustomerRegionsListOfValidationFailureFaultMessage(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public IAdministrationServiceToggleMatrixBuildEnabledForCustomerRegionsListOfValidationFailureFaultMessage(String message, com.roadnet.apex.datacontracts.ArrayOfValidationFailure listOfValidationFailure) {
        super(message);
        this.listOfValidationFailure = listOfValidationFailure;
    }

    public IAdministrationServiceToggleMatrixBuildEnabledForCustomerRegionsListOfValidationFailureFaultMessage(String message, com.roadnet.apex.datacontracts.ArrayOfValidationFailure listOfValidationFailure, java.lang.Throwable cause) {
        super(message, cause);
        this.listOfValidationFailure = listOfValidationFailure;
    }

    public com.roadnet.apex.datacontracts.ArrayOfValidationFailure getFaultInfo() {
        return this.listOfValidationFailure;
    }
}
