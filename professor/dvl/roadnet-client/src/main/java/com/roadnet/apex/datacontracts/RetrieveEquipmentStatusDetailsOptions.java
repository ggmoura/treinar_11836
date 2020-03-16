
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.ArrayOfSortingDetail;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.SortingDetail;


/**
 * <p>Classe Java de RetrieveEquipmentStatusDetailsOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveEquipmentStatusDetailsOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RetrieveEquipmentStatusOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Order" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared}SortingDetail" minOccurs="0"/&gt;
 *         &lt;element name="PageIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Paged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SortingDetails" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared}ArrayOfSortingDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveEquipmentStatusDetailsOptions", propOrder = {
    "order",
    "pageIndex",
    "pageSize",
    "paged",
    "sortingDetails"
})
public class RetrieveEquipmentStatusDetailsOptions
    extends RetrieveEquipmentStatusOptions
{

    @XmlElementRef(name = "Order", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<SortingDetail> order;
    @XmlElement(name = "PageIndex")
    protected Integer pageIndex;
    @XmlElement(name = "PageSize")
    protected Integer pageSize;
    @XmlElement(name = "Paged")
    protected Boolean paged;
    @XmlElementRef(name = "SortingDetails", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSortingDetail> sortingDetails;

    /**
     * Obtém o valor da propriedade order.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SortingDetail }{@code >}
     *     
     */
    public JAXBElement<SortingDetail> getOrder() {
        return order;
    }

    /**
     * Define o valor da propriedade order.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SortingDetail }{@code >}
     *     
     */
    public void setOrder(JAXBElement<SortingDetail> value) {
        this.order = value;
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
     * Obtém o valor da propriedade sortingDetails.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSortingDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSortingDetail> getSortingDetails() {
        return sortingDetails;
    }

    /**
     * Define o valor da propriedade sortingDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSortingDetail }{@code >}
     *     
     */
    public void setSortingDetails(JAXBElement<ArrayOfSortingDetail> value) {
        this.sortingDetails = value;
    }

}
