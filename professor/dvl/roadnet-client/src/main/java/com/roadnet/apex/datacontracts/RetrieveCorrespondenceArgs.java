
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Classe Java de RetrieveCorrespondenceArgs complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveCorrespondenceArgs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BoundByField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastItemCreateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LowerBoundValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SortAscending" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SortProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="UpperBoundValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveCorrespondenceArgs", propOrder = {
    "boundByField",
    "lastItemCreateTime",
    "lowerBoundValue",
    "pageSize",
    "sortAscending",
    "sortProperties",
    "upperBoundValue"
})
public class RetrieveCorrespondenceArgs {

    @XmlElementRef(name = "BoundByField", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> boundByField;
    @XmlElementRef(name = "LastItemCreateTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastItemCreateTime;
    @XmlElementRef(name = "LowerBoundValue", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> lowerBoundValue;
    @XmlElement(name = "PageSize")
    protected Integer pageSize;
    @XmlElement(name = "SortAscending")
    protected Boolean sortAscending;
    @XmlElementRef(name = "SortProperties", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> sortProperties;
    @XmlElementRef(name = "UpperBoundValue", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> upperBoundValue;

    /**
     * Obtém o valor da propriedade boundByField.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBoundByField() {
        return boundByField;
    }

    /**
     * Define o valor da propriedade boundByField.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBoundByField(JAXBElement<String> value) {
        this.boundByField = value;
    }

    /**
     * Obtém o valor da propriedade lastItemCreateTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastItemCreateTime() {
        return lastItemCreateTime;
    }

    /**
     * Define o valor da propriedade lastItemCreateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastItemCreateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastItemCreateTime = value;
    }

    /**
     * Obtém o valor da propriedade lowerBoundValue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getLowerBoundValue() {
        return lowerBoundValue;
    }

    /**
     * Define o valor da propriedade lowerBoundValue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setLowerBoundValue(JAXBElement<Object> value) {
        this.lowerBoundValue = value;
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
     * Obtém o valor da propriedade sortAscending.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSortAscending() {
        return sortAscending;
    }

    /**
     * Define o valor da propriedade sortAscending.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSortAscending(Boolean value) {
        this.sortAscending = value;
    }

    /**
     * Obtém o valor da propriedade sortProperties.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getSortProperties() {
        return sortProperties;
    }

    /**
     * Define o valor da propriedade sortProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setSortProperties(JAXBElement<ArrayOfstring> value) {
        this.sortProperties = value;
    }

    /**
     * Obtém o valor da propriedade upperBoundValue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getUpperBoundValue() {
        return upperBoundValue;
    }

    /**
     * Define o valor da propriedade upperBoundValue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setUpperBoundValue(JAXBElement<Object> value) {
        this.upperBoundValue = value;
    }

}
