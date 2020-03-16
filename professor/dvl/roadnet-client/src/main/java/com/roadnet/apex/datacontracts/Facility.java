
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de Facility complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Facility"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}AggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExternalEndpointInfo" type="{http://roadnet.com/apex/DataContracts/}FacilityEndpointInfo" minOccurs="0"/&gt;
 *         &lt;element name="FacilityType_FacilityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InternalEndpointInfo" type="{http://roadnet.com/apex/DataContracts/}FacilityEndpointInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Facility", propOrder = {
    "externalEndpointInfo",
    "facilityTypeFacilityType",
    "identifier",
    "internalEndpointInfo"
})
public class Facility
    extends AggregateRootEntity
{

    @XmlElementRef(name = "ExternalEndpointInfo", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<FacilityEndpointInfo> externalEndpointInfo;
    @XmlElementRef(name = "FacilityType_FacilityType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> facilityTypeFacilityType;
    @XmlElementRef(name = "Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElementRef(name = "InternalEndpointInfo", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<FacilityEndpointInfo> internalEndpointInfo;

    /**
     * Obtém o valor da propriedade externalEndpointInfo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FacilityEndpointInfo }{@code >}
     *     
     */
    public JAXBElement<FacilityEndpointInfo> getExternalEndpointInfo() {
        return externalEndpointInfo;
    }

    /**
     * Define o valor da propriedade externalEndpointInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FacilityEndpointInfo }{@code >}
     *     
     */
    public void setExternalEndpointInfo(JAXBElement<FacilityEndpointInfo> value) {
        this.externalEndpointInfo = value;
    }

    /**
     * Obtém o valor da propriedade facilityTypeFacilityType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFacilityTypeFacilityType() {
        return facilityTypeFacilityType;
    }

    /**
     * Define o valor da propriedade facilityTypeFacilityType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFacilityTypeFacilityType(JAXBElement<String> value) {
        this.facilityTypeFacilityType = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentifier(JAXBElement<String> value) {
        this.identifier = value;
    }

    /**
     * Obtém o valor da propriedade internalEndpointInfo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FacilityEndpointInfo }{@code >}
     *     
     */
    public JAXBElement<FacilityEndpointInfo> getInternalEndpointInfo() {
        return internalEndpointInfo;
    }

    /**
     * Define o valor da propriedade internalEndpointInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FacilityEndpointInfo }{@code >}
     *     
     */
    public void setInternalEndpointInfo(JAXBElement<FacilityEndpointInfo> value) {
        this.internalEndpointInfo = value;
    }

}
