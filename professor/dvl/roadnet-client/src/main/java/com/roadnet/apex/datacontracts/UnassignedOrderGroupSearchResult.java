
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;


/**
 * <p>Classe Java de UnassignedOrderGroupSearchResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UnassignedOrderGroupSearchResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}SearchResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="LocationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderEntityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnassignedOrderGroupSearchResult", propOrder = {
    "entityKey",
    "locationDescription",
    "locationIdentifier",
    "orderEntityKeys",
    "version"
})
public class UnassignedOrderGroupSearchResult
    extends SearchResult
{

    @XmlElement(name = "EntityKey")
    protected Long entityKey;
    @XmlElementRef(name = "LocationDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationDescription;
    @XmlElementRef(name = "LocationIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationIdentifier;
    @XmlElementRef(name = "OrderEntityKeys", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> orderEntityKeys;
    @XmlElement(name = "Version")
    protected Long version;

    /**
     * Obtém o valor da propriedade entityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEntityKey() {
        return entityKey;
    }

    /**
     * Define o valor da propriedade entityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEntityKey(Long value) {
        this.entityKey = value;
    }

    /**
     * Obtém o valor da propriedade locationDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationDescription() {
        return locationDescription;
    }

    /**
     * Define o valor da propriedade locationDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationDescription(JAXBElement<String> value) {
        this.locationDescription = value;
    }

    /**
     * Obtém o valor da propriedade locationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationIdentifier() {
        return locationIdentifier;
    }

    /**
     * Define o valor da propriedade locationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationIdentifier(JAXBElement<String> value) {
        this.locationIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade orderEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getOrderEntityKeys() {
        return orderEntityKeys;
    }

    /**
     * Define o valor da propriedade orderEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setOrderEntityKeys(JAXBElement<ArrayOflong> value) {
        this.orderEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade version.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVersion() {
        return version;
    }

    /**
     * Define o valor da propriedade version.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVersion(Long value) {
        this.version = value;
    }

}
