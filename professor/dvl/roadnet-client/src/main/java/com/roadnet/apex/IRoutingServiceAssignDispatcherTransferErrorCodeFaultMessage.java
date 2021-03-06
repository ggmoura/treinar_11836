
package com.roadnet.apex;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.4
 * 2020-03-15T13:07:00.188-03:00
 * Generated source version: 3.2.4
 */

@WebFault(name = "TransferErrorCode", targetNamespace = "http://roadnet.com/apex/DataContracts/")
public class IRoutingServiceAssignDispatcherTransferErrorCodeFaultMessage extends Exception {

    private com.roadnet.apex.datacontracts.TransferErrorCode transferErrorCode;

    public IRoutingServiceAssignDispatcherTransferErrorCodeFaultMessage() {
        super();
    }

    public IRoutingServiceAssignDispatcherTransferErrorCodeFaultMessage(String message) {
        super(message);
    }

    public IRoutingServiceAssignDispatcherTransferErrorCodeFaultMessage(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public IRoutingServiceAssignDispatcherTransferErrorCodeFaultMessage(String message, com.roadnet.apex.datacontracts.TransferErrorCode transferErrorCode) {
        super(message);
        this.transferErrorCode = transferErrorCode;
    }

    public IRoutingServiceAssignDispatcherTransferErrorCodeFaultMessage(String message, com.roadnet.apex.datacontracts.TransferErrorCode transferErrorCode, java.lang.Throwable cause) {
        super(message, cause);
        this.transferErrorCode = transferErrorCode;
    }

    public com.roadnet.apex.datacontracts.TransferErrorCode getFaultInfo() {
        return this.transferErrorCode;
    }
}
