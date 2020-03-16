
package com.roadnet.apex;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.4
 * 2020-03-15T13:07:05.015-03:00
 * Generated source version: 3.2.4
 */

@WebFault(name = "TransferErrorCode", targetNamespace = "http://roadnet.com/apex/DataContracts/")
public class IQueryServiceRetrievePerformanceMonitoringInfoTransferErrorCodeFaultMessage extends Exception {

    private com.roadnet.apex.datacontracts.TransferErrorCode transferErrorCode;

    public IQueryServiceRetrievePerformanceMonitoringInfoTransferErrorCodeFaultMessage() {
        super();
    }

    public IQueryServiceRetrievePerformanceMonitoringInfoTransferErrorCodeFaultMessage(String message) {
        super(message);
    }

    public IQueryServiceRetrievePerformanceMonitoringInfoTransferErrorCodeFaultMessage(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public IQueryServiceRetrievePerformanceMonitoringInfoTransferErrorCodeFaultMessage(String message, com.roadnet.apex.datacontracts.TransferErrorCode transferErrorCode) {
        super(message);
        this.transferErrorCode = transferErrorCode;
    }

    public IQueryServiceRetrievePerformanceMonitoringInfoTransferErrorCodeFaultMessage(String message, com.roadnet.apex.datacontracts.TransferErrorCode transferErrorCode, java.lang.Throwable cause) {
        super(message, cause);
        this.transferErrorCode = transferErrorCode;
    }

    public com.roadnet.apex.datacontracts.TransferErrorCode getFaultInfo() {
        return this.transferErrorCode;
    }
}
