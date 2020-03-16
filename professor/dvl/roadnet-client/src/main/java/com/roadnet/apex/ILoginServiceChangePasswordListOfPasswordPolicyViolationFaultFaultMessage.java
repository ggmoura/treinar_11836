
package com.roadnet.apex;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.4
 * 2020-03-15T13:07:05.897-03:00
 * Generated source version: 3.2.4
 */

@WebFault(name = "ArrayOfPasswordPolicyViolation", targetNamespace = "http://roadnet.com/apex/DataContracts/")
public class ILoginServiceChangePasswordListOfPasswordPolicyViolationFaultFaultMessage extends Exception {

    private com.roadnet.apex.datacontracts.ArrayOfPasswordPolicyViolation arrayOfPasswordPolicyViolation;

    public ILoginServiceChangePasswordListOfPasswordPolicyViolationFaultFaultMessage() {
        super();
    }

    public ILoginServiceChangePasswordListOfPasswordPolicyViolationFaultFaultMessage(String message) {
        super(message);
    }

    public ILoginServiceChangePasswordListOfPasswordPolicyViolationFaultFaultMessage(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public ILoginServiceChangePasswordListOfPasswordPolicyViolationFaultFaultMessage(String message, com.roadnet.apex.datacontracts.ArrayOfPasswordPolicyViolation arrayOfPasswordPolicyViolation) {
        super(message);
        this.arrayOfPasswordPolicyViolation = arrayOfPasswordPolicyViolation;
    }

    public ILoginServiceChangePasswordListOfPasswordPolicyViolationFaultFaultMessage(String message, com.roadnet.apex.datacontracts.ArrayOfPasswordPolicyViolation arrayOfPasswordPolicyViolation, java.lang.Throwable cause) {
        super(message, cause);
        this.arrayOfPasswordPolicyViolation = arrayOfPasswordPolicyViolation;
    }

    public com.roadnet.apex.datacontracts.ArrayOfPasswordPolicyViolation getFaultInfo() {
        return this.arrayOfPasswordPolicyViolation;
    }
}
