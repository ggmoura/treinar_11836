
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de ResetPasswordResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ResetPasswordResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Error" type="{http://roadnet.com/apex/DataContracts/}ResetPasswordResult.ErrorCode" minOccurs="0"/&gt;
 *         &lt;element name="UserEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResetPasswordResult", propOrder = {
    "error",
    "userEntityKey"
})
public class ResetPasswordResult
    extends DataTransferObject
{

    @XmlElement(name = "Error")
    @XmlSchemaType(name = "string")
    protected ResetPasswordResultErrorCode error;
    @XmlElement(name = "UserEntityKey")
    protected Long userEntityKey;

    /**
     * Obtém o valor da propriedade error.
     * 
     * @return
     *     possible object is
     *     {@link ResetPasswordResultErrorCode }
     *     
     */
    public ResetPasswordResultErrorCode getError() {
        return error;
    }

    /**
     * Define o valor da propriedade error.
     * 
     * @param value
     *     allowed object is
     *     {@link ResetPasswordResultErrorCode }
     *     
     */
    public void setError(ResetPasswordResultErrorCode value) {
        this.error = value;
    }

    /**
     * Obtém o valor da propriedade userEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUserEntityKey() {
        return userEntityKey;
    }

    /**
     * Define o valor da propriedade userEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUserEntityKey(Long value) {
        this.userEntityKey = value;
    }

}
