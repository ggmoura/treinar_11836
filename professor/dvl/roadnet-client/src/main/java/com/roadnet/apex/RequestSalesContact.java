
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.RequestSalesContactInfo;


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
 *         &lt;element name="info" type="{http://roadnet.com/apex/DataContracts/}RequestSalesContactInfo" minOccurs="0"/&gt;
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
    "info"
})
@XmlRootElement(name = "RequestSalesContact")
public class RequestSalesContact {

    @XmlElementRef(name = "info", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestSalesContactInfo> info;

    /**
     * Obtém o valor da propriedade info.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RequestSalesContactInfo }{@code >}
     *     
     */
    public JAXBElement<RequestSalesContactInfo> getInfo() {
        return info;
    }

    /**
     * Define o valor da propriedade info.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RequestSalesContactInfo }{@code >}
     *     
     */
    public void setInfo(JAXBElement<RequestSalesContactInfo> value) {
        this.info = value;
    }

}
