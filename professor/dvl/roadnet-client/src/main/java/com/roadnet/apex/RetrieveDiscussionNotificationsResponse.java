
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfNotificationResult;


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
 *         &lt;element name="RetrieveDiscussionNotificationsResult" type="{http://roadnet.com/apex/DataContracts/}ArrayOfNotificationResult" minOccurs="0"/&gt;
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
    "retrieveDiscussionNotificationsResult"
})
@XmlRootElement(name = "RetrieveDiscussionNotificationsResponse")
public class RetrieveDiscussionNotificationsResponse {

    @XmlElementRef(name = "RetrieveDiscussionNotificationsResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNotificationResult> retrieveDiscussionNotificationsResult;

    /**
     * Obtém o valor da propriedade retrieveDiscussionNotificationsResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNotificationResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNotificationResult> getRetrieveDiscussionNotificationsResult() {
        return retrieveDiscussionNotificationsResult;
    }

    /**
     * Define o valor da propriedade retrieveDiscussionNotificationsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNotificationResult }{@code >}
     *     
     */
    public void setRetrieveDiscussionNotificationsResult(JAXBElement<ArrayOfNotificationResult> value) {
        this.retrieveDiscussionNotificationsResult = value;
    }

}
