
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.UserSettings;


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
 *         &lt;element name="RetrieveUserSettingsResult" type="{http://roadnet.com/apex/DataContracts/}UserSettings" minOccurs="0"/&gt;
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
    "retrieveUserSettingsResult"
})
@XmlRootElement(name = "RetrieveUserSettingsResponse")
public class RetrieveUserSettingsResponse {

    @XmlElementRef(name = "RetrieveUserSettingsResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<UserSettings> retrieveUserSettingsResult;

    /**
     * Obtém o valor da propriedade retrieveUserSettingsResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserSettings }{@code >}
     *     
     */
    public JAXBElement<UserSettings> getRetrieveUserSettingsResult() {
        return retrieveUserSettingsResult;
    }

    /**
     * Define o valor da propriedade retrieveUserSettingsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserSettings }{@code >}
     *     
     */
    public void setRetrieveUserSettingsResult(JAXBElement<UserSettings> value) {
        this.retrieveUserSettingsResult = value;
    }

}
