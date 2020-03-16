
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de LockOrderResults.LockOrderFailure complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LockOrderResults.LockOrderFailure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorCode" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}LockOrderResults.LockOrderFailure.LockOrderErrorCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LockOrderResults.LockOrderFailure", propOrder = {
    "errorCode"
})
@XmlSeeAlso({
    LockOrderResultsLockOrdersForStopFailure.class,
    LockOrderResultsLockOrdersForRouteFailure.class
})
public class LockOrderResultsLockOrderFailure {

    @XmlElement(name = "ErrorCode")
    @XmlSchemaType(name = "string")
    protected LockOrderResultsLockOrderFailureLockOrderErrorCode errorCode;

    /**
     * Obtém o valor da propriedade errorCode.
     * 
     * @return
     *     possible object is
     *     {@link LockOrderResultsLockOrderFailureLockOrderErrorCode }
     *     
     */
    public LockOrderResultsLockOrderFailureLockOrderErrorCode getErrorCode() {
        return errorCode;
    }

    /**
     * Define o valor da propriedade errorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link LockOrderResultsLockOrderFailureLockOrderErrorCode }
     *     
     */
    public void setErrorCode(LockOrderResultsLockOrderFailureLockOrderErrorCode value) {
        this.errorCode = value;
    }

}
