
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.UserPermissions;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetrieveUserPermissionsResult" type="{http://roadnet.com/apex/DataContracts/}UserPermissions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "retrieveUserPermissionsResult"
})
@XmlRootElement(name = "RetrieveUserPermissionsResponse")
public class RetrieveUserPermissionsResponse {

    @XmlElementRef(name = "RetrieveUserPermissionsResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<UserPermissions> retrieveUserPermissionsResult;

    /**
     * Obtém o valor da propriedade retrieveUserPermissionsResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserPermissions }{@code >}
     *     
     */
    public JAXBElement<UserPermissions> getRetrieveUserPermissionsResult() {
        return retrieveUserPermissionsResult;
    }

    /**
     * Define o valor da propriedade retrieveUserPermissionsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserPermissions }{@code >}
     *     
     */
    public void setRetrieveUserPermissionsResult(JAXBElement<UserPermissions> value) {
        this.retrieveUserPermissionsResult = value;
    }

}
