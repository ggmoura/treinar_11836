
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RestrictedStop complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RestrictedStop"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}NonServiceableStop"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RestrictedLocationAddress" type="{http://roadnet.com/apex/DataContracts/}Address" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedLocationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedLocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedLocationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedLocationIsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestrictedStop", propOrder = {
    "restrictedLocationAddress",
    "restrictedLocationDescription",
    "restrictedLocationEntityKey",
    "restrictedLocationIdentifier",
    "restrictedLocationIsDeleted"
})
public class RestrictedStop
    extends NonServiceableStop
{

    @XmlElementRef(name = "RestrictedLocationAddress", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Address> restrictedLocationAddress;
    @XmlElementRef(name = "RestrictedLocationDescription", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> restrictedLocationDescription;
    @XmlElement(name = "RestrictedLocationEntityKey")
    protected Long restrictedLocationEntityKey;
    @XmlElementRef(name = "RestrictedLocationIdentifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> restrictedLocationIdentifier;
    @XmlElement(name = "RestrictedLocationIsDeleted")
    protected Boolean restrictedLocationIsDeleted;

    /**
     * Obtém o valor da propriedade restrictedLocationAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public JAXBElement<Address> getRestrictedLocationAddress() {
        return restrictedLocationAddress;
    }

    /**
     * Define o valor da propriedade restrictedLocationAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public void setRestrictedLocationAddress(JAXBElement<Address> value) {
        this.restrictedLocationAddress = value;
    }

    /**
     * Obtém o valor da propriedade restrictedLocationDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRestrictedLocationDescription() {
        return restrictedLocationDescription;
    }

    /**
     * Define o valor da propriedade restrictedLocationDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRestrictedLocationDescription(JAXBElement<String> value) {
        this.restrictedLocationDescription = value;
    }

    /**
     * Obtém o valor da propriedade restrictedLocationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRestrictedLocationEntityKey() {
        return restrictedLocationEntityKey;
    }

    /**
     * Define o valor da propriedade restrictedLocationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRestrictedLocationEntityKey(Long value) {
        this.restrictedLocationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade restrictedLocationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRestrictedLocationIdentifier() {
        return restrictedLocationIdentifier;
    }

    /**
     * Define o valor da propriedade restrictedLocationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRestrictedLocationIdentifier(JAXBElement<String> value) {
        this.restrictedLocationIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade restrictedLocationIsDeleted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictedLocationIsDeleted() {
        return restrictedLocationIsDeleted;
    }

    /**
     * Define o valor da propriedade restrictedLocationIsDeleted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictedLocationIsDeleted(Boolean value) {
        this.restrictedLocationIsDeleted = value;
    }

}
