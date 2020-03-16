
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Classe Java de SearchOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SearchOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaxAge" type="{http://roadnet.com/apex/DataContracts/}RelativeDateTime" minOccurs="0"/&gt;
 *         &lt;element name="RetrieveRelatedEntities" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TypeFilter" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchOptions", propOrder = {
    "maxAge",
    "retrieveRelatedEntities",
    "typeFilter"
})
public class SearchOptions {

    @XmlElementRef(name = "MaxAge", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RelativeDateTime> maxAge;
    @XmlElement(name = "RetrieveRelatedEntities")
    protected Boolean retrieveRelatedEntities;
    @XmlElementRef(name = "TypeFilter", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> typeFilter;

    /**
     * Obtém o valor da propriedade maxAge.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RelativeDateTime }{@code >}
     *     
     */
    public JAXBElement<RelativeDateTime> getMaxAge() {
        return maxAge;
    }

    /**
     * Define o valor da propriedade maxAge.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RelativeDateTime }{@code >}
     *     
     */
    public void setMaxAge(JAXBElement<RelativeDateTime> value) {
        this.maxAge = value;
    }

    /**
     * Obtém o valor da propriedade retrieveRelatedEntities.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetrieveRelatedEntities() {
        return retrieveRelatedEntities;
    }

    /**
     * Define o valor da propriedade retrieveRelatedEntities.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetrieveRelatedEntities(Boolean value) {
        this.retrieveRelatedEntities = value;
    }

    /**
     * Obtém o valor da propriedade typeFilter.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getTypeFilter() {
        return typeFilter;
    }

    /**
     * Define o valor da propriedade typeFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setTypeFilter(JAXBElement<ArrayOfstring> value) {
        this.typeFilter = value;
    }

}
