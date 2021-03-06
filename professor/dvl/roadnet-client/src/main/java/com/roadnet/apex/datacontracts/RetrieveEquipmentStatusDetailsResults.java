
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RetrieveEquipmentStatusDetailsResults complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveEquipmentStatusDetailsResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Items" type="{http://roadnet.com/apex/DataContracts/}ArrayOfEquipmentStatusDetails" minOccurs="0"/&gt;
 *         &lt;element name="PageIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Paged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TotalItems" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TotalPages" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveEquipmentStatusDetailsResults", propOrder = {
    "items",
    "pageIndex",
    "pageSize",
    "paged",
    "totalItems",
    "totalPages"
})
public class RetrieveEquipmentStatusDetailsResults {

    @XmlElementRef(name = "Items", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEquipmentStatusDetails> items;
    @XmlElement(name = "PageIndex")
    protected Integer pageIndex;
    @XmlElement(name = "PageSize")
    protected Integer pageSize;
    @XmlElement(name = "Paged")
    protected Boolean paged;
    @XmlElement(name = "TotalItems")
    protected Long totalItems;
    @XmlElement(name = "TotalPages")
    protected Long totalPages;

    /**
     * Obtém o valor da propriedade items.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEquipmentStatusDetails }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEquipmentStatusDetails> getItems() {
        return items;
    }

    /**
     * Define o valor da propriedade items.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEquipmentStatusDetails }{@code >}
     *     
     */
    public void setItems(JAXBElement<ArrayOfEquipmentStatusDetails> value) {
        this.items = value;
    }

    /**
     * Obtém o valor da propriedade pageIndex.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    /**
     * Define o valor da propriedade pageIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageIndex(Integer value) {
        this.pageIndex = value;
    }

    /**
     * Obtém o valor da propriedade pageSize.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Define o valor da propriedade pageSize.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageSize(Integer value) {
        this.pageSize = value;
    }

    /**
     * Obtém o valor da propriedade paged.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaged() {
        return paged;
    }

    /**
     * Define o valor da propriedade paged.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaged(Boolean value) {
        this.paged = value;
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

    /**
     * Obtém o valor da propriedade totalPages.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalPages() {
        return totalPages;
    }

    /**
     * Define o valor da propriedade totalPages.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalPages(Long value) {
        this.totalPages = value;
    }

}
