
package com.roadnet.apex;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.4
 * 2020-03-15T13:07:06.152-03:00
 * Generated source version: 3.2.4
 */

@WebFault(name = "ArrayOfPasswordPolicyViolation", targetNamespace = "http://roadnet.com/apex/DataContracts/")
public class ILoginServiceChangeAdminPasswordListOfPasswordPolicyViolationFaultFaultMessage extends Exception {

    private com.roadnet.apex.datacontracts.ArrayOfPasswordPolicyViolation arrayOfPasswordPolicyViolation;

    public ILoginServiceChangeAdminPasswordListOfPasswordPolicyViolationFaultFaultMessage() {
        super();
    }

    public ILoginServiceChangeAdminPasswordListOfPasswordPolicyViolationFaultFaultMessage(String message) {
        super(message);
    }

    public ILoginServiceChangeAdminPasswordListOfPasswordPolicyViolationFaultFaultMessage(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public ILoginServiceChangeAdminPasswordListOfPasswordPolicyViolationFaultFaultMessage(String message, com.roadnet.apex.datacontracts.ArrayOfPasswordPolicyViolation arrayOfPasswordPolicyViolation) {
        super(message);
        this.arrayOfPasswordPolicyViolation = arrayOfPasswordPolicyViolation;
    }

    public ILoginServiceChangeAdminPasswordListOfPasswordPolicyViolationFaultFaultMessage(String message, com.roadnet.apex.datacontracts.ArrayOfPasswordPolicyViolation arrayOfPasswordPolicyViolation, java.lang.Throwable cause) {
        super(message, cause);
        this.arrayOfPasswordPolicyViolation = arrayOfPasswordPolicyViolation;
    }

    public com.roadnet.apex.datacontracts.ArrayOfPasswordPolicyViolation getFaultInfo() {
        return this.arrayOfPasswordPolicyViolation;
    }
}
