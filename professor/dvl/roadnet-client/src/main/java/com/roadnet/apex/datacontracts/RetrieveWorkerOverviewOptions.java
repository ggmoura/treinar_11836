
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.ArrayOfSortingDetail;


/**
 * <p>Classe Java de RetrieveWorkerOverviewOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveWorkerOverviewOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DutyStatusList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/&gt;
 *         &lt;element name="ExcludeActiveRoutes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExcludeInactiveRoutes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FavoriteEntityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="PageIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SmartSearchText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SortOrder" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared}ArrayOfSortingDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveWorkerOverviewOptions", propOrder = {
    "dutyStatusList",
    "excludeActiveRoutes",
    "excludeInactiveRoutes",
    "favoriteEntityKeys",
    "pageIndex",
    "pageSize",
    "smartSearchText",
    "sortOrder"
})
public class RetrieveWorkerOverviewOptions {

    @XmlElementRef(name = "DutyStatusList", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> dutyStatusList;
    @XmlElement(name = "ExcludeActiveRoutes")
    protected Boolean excludeActiveRoutes;
    @XmlElement(name = "ExcludeInactiveRoutes")
    protected Boolean excludeInactiveRoutes;
    @XmlElementRef(name = "FavoriteEntityKeys", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> favoriteEntityKeys;
    @XmlElement(name = "PageIndex")
    protected Integer pageIndex;
    @XmlElement(name = "PageSize")
    protected Integer pageSize;
    @XmlElementRef(name = "SmartSearchText", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> smartSearchText;
    @XmlElementRef(name = "SortOrder", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSortingDetail> sortOrder;

    /**
     * Obtém o valor da propriedade dutyStatusList.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getDutyStatusList() {
        return dutyStatusList;
    }

    /**
     * Define o valor da propriedade dutyStatusList.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setDutyStatusList(JAXBElement<ArrayOfint> value) {
        this.dutyStatusList = value;
    }

    /**
     * Obtém o valor da propriedade excludeActiveRoutes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeActiveRoutes() {
        return excludeActiveRoutes;
    }

    /**
     * Define o valor da propriedade excludeActiveRoutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeActiveRoutes(Boolean value) {
        this.excludeActiveRoutes = value;
    }

    /**
     * Obtém o valor da propriedade excludeInactiveRoutes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeInactiveRoutes() {
        return excludeInactiveRoutes;
    }

    /**
     * Define o valor da propriedade excludeInactiveRoutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeInactiveRoutes(Boolean value) {
        this.excludeInactiveRoutes = value;
    }

    /**
     * Obtém o valor da propriedade favoriteEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getFavoriteEntityKeys() {
        return favoriteEntityKeys;
    }

    /**
     * Define o valor da propriedade favoriteEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setFavoriteEntityKeys(JAXBElement<ArrayOflong> value) {
        this.favoriteEntityKeys = value;
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
     * Obtém o valor da propriedade smartSearchText.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSmartSearchText() {
        return smartSearchText;
    }

    /**
     * Define o valor da propriedade smartSearchText.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSmartSearchText(JAXBElement<String> value) {
        this.smartSearchText = value;
    }

    /**
     * Obtém o valor da propriedade sortOrder.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSortingDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSortingDetail> getSortOrder() {
        return sortOrder;
    }

    /**
     * Define o valor da propriedade sortOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSortingDetail }{@code >}
     *     
     */
    public void setSortOrder(JAXBElement<ArrayOfSortingDetail> value) {
        this.sortOrder = value;
    }

}
