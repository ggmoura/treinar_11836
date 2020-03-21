
package com.roadnet.apex;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.4
 * 2020-03-15T13:06:56.034-03:00
 * Generated source version: 3.2.4
 */

@WebFault(name = "TransferErrorCode", targetNamespace = "http://roadnet.com/apex/DataContracts/")
public class IRoutingServiceUpdateActivePassTransferErrorCodeFaultMessage extends Exception {

    private com.roadnet.apex.datacontracts.TransferErrorCode transferErrorCode;

    public IRoutingServiceUpdateActivePassTransferErrorCodeFaultMessage() {
        super();
    }

    public IRoutingServiceUpdateActivePassTransferErrorCodeFaultMessage(String message) {
        super(message);
    }

    public IRoutingServiceUpdateActivePassTransferErrorCodeFaultMessage(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public IRoutingServiceUpdateActivePassTransferErrorCodeFaultMessage(String message, com.roadnet.apex.datacontracts.TransferErrorCode transferErrorCode) {
        super(message);
        this.transferErrorCode = transferErrorCode;
    }

    public IRoutingServiceUpdateActivePassTransferErrorCodeFaultMessage(String message, com.roadnet.apex.datacontracts.TransferErrorCode transferErrorCode, java.lang.Throwable cause) {
        super(message, cause);
        this.transferErrorCode = transferErrorCode;
    }

    public com.roadnet.apex.datacontracts.TransferErrorCode getFaultInfo() {
        return this.transferErrorCode;
    }
}