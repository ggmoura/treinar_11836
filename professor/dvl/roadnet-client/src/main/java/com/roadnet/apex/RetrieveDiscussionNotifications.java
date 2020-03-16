
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfEntityType;


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
 *         &lt;element name="typesToRetrieve" type="{http://roadnet.com/apex/DataContracts/}ArrayOfEntityType" minOccurs="0"/&gt;
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
    "typesToRetrieve"
})
@XmlRootElement(name = "RetrieveDiscussionNotifications")
public class RetrieveDiscussionNotifications {

    @XmlElementRef(name = "typesToRetrieve", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEntityType> typesToRetrieve;

    /**
     * Obtém o valor da propriedade typesToRetrieve.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEntityType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEntityType> getTypesToRetrieve() {
        return typesToRetrieve;
    }

    /**
     * Define o valor da propriedade typesToRetrieve.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEntityType }{@code >}
     *     
     */
    public void setTypesToRetrieve(JAXBElement<ArrayOfEntityType> value) {
        this.typesToRetrieve = value;
    }

}
