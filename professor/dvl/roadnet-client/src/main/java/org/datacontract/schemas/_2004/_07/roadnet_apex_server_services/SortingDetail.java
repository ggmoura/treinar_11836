
package org.datacontract.schemas._2004._07.roadnet_apex_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SortingDetail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SortingDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Direction" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared}SortingDetail.OrderType" minOccurs="0"/&gt;
 *         &lt;element name="Property" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SortingDetail", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", propOrder = {
    "direction",
    "property"
})
public class SortingDetail {

    @XmlElement(name = "Direction")
    @XmlSchemaType(name = "string")
    protected SortingDetailOrderType direction;
    @XmlElementRef(name = "Property", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared", type = JAXBElement.class, required = false)
    protected JAXBElement<String> property;

    /**
     * Obtém o valor da propriedade direction.
     * 
     * @return
     *     possible object is
     *     {@link SortingDetailOrderType }
     *     
     */
    public SortingDetailOrderType getDirection() {
        return direction;
    }

    /**
     * Define o valor da propriedade direction.
     * 
     * @param value
     *     allowed object is
     *     {@link SortingDetailOrderType }
     *     
     */
    public void setDirection(SortingDetailOrderType value) {
        this.direction = value;
    }

    /**
     * Obtém o valor da propriedade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProperty() {
        return property;
    }

    /**
     * Define o valor da propriedade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProperty(JAXBElement<String> value) {
        this.property = value;
    }

}
