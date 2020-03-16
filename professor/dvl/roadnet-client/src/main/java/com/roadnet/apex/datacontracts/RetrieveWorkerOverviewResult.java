
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RetrieveWorkerOverviewResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveWorkerOverviewResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Items" type="{http://roadnet.com/apex/DataContracts/}ArrayOfWorkerOverview" minOccurs="0"/&gt;
 *         &lt;element name="TotalItems" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveWorkerOverviewResult", propOrder = {
    "items",
    "totalItems"
})
public class RetrieveWorkerOverviewResult {

    @XmlElementRef(name = "Items", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfWorkerOverview> items;
    @XmlElement(name = "TotalItems")
    protected Long totalItems;

    /**
     * Obtém o valor da propriedade items.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWorkerOverview }{@code >}
     *     
     */
    public JAXBElement<ArrayOfWorkerOverview> getItems() {
        return items;
    }

    /**
     * Define o valor da propriedade items.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWorkerOverview }{@code >}
     *     
     */
    public void setItems(JAXBElement<ArrayOfWorkerOverview> value) {
        this.items = value;
    }

    /**
     * Obtém o valor da propriedade totalItems.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalItems() {
        return totalItems;
    }

    /**
     * Define o valor da propriedade totalItems.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalItems(Long value) {
        this.totalItems = value;
    }

}
