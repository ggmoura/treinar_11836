
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de FacilityPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="FacilityPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExternalEndpointInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExternalEndpointInfoOptions" type="{http://roadnet.com/apex/DataContracts/}FacilityEndpointInfoPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="FacilityType_FacilityType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InternalEndpointInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InternalEndpointInfoOptions" type="{http://roadnet.com/apex/DataContracts/}FacilityEndpointInfoPropertyOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityPropertyOptions", propOrder = {
    "description",
    "externalEndpointInfo",
    "externalEndpointInfoOptions",
    "facilityTypeFacilityType",
    "identifier",
    "internalEndpointInfo",
    "internalEndpointInfoOptions"
})
public class FacilityPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "ExternalEndpointInfo")
    protected Boolean externalEndpointInfo;
    @XmlElementRef(name = "ExternalEndpointInfoOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<FacilityEndpointInfoPropertyOptions> externalEndpointInfoOptions;
    @XmlElement(name = "FacilityType_FacilityType")
    protected Boolean facilityTypeFacilityType;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "InternalEndpointInfo")
    protected Boolean internalEndpointInfo;
    @XmlElementRef(name = "InternalEndpointInfoOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<FacilityEndpointInfoPropertyOptions> internalEndpointInfoOptions;

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDescription(Boolean value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade externalEndpointInfo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExternalEndpointInfo() {
        return externalEndpointInfo;
    }

    /**
     * Define o valor da propriedade externalEndpointInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExternalEndpointInfo(Boolean value) {
        this.externalEndpointInfo = value;
    }

    /**
     * Obtém o valor da propriedade externalEndpointInfoOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FacilityEndpointInfoPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<FacilityEndpointInfoPropertyOptions> getExternalEndpointInfoOptions() {
        return externalEndpointInfoOptions;
    }

    /**
     * Define o valor da propriedade externalEndpointInfoOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FacilityEndpointInfoPropertyOptions }{@code >}
     *     
     */
    public void setExternalEndpointInfoOptions(JAXBElement<FacilityEndpointInfoPropertyOptions> value) {
        this.externalEndpointInfoOptions = value;
    }

    /**
     * Obtém o valor da propriedade facilityTypeFacilityType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFacilityTypeFacilityType() {
        return facilityTypeFacilityType;
    }

    /**
     * Define o valor da propriedade facilityTypeFacilityType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFacilityTypeFacilityType(Boolean value) {
        this.facilityTypeFacilityType = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdentifier(Boolean value) {
        this.identifier = value;
    }

    /**
     * Obtém o valor da propriedade internalEndpointInfo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInternalEndpointInfo() {
        return internalEndpointInfo;
    }

    /**
     * Define o valor da propriedade internalEndpointInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInternalEndpointInfo(Boolean value) {
        this.internalEndpointInfo = value;
    }

    /**
     * Obtém o valor da propriedade internalEndpointInfoOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FacilityEndpointInfoPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<FacilityEndpointInfoPropertyOptions> getInternalEndpointInfoOptions() {
        return internalEndpointInfoOptions;
    }

    /**
     * Define o valor da propriedade internalEndpointInfoOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FacilityEndpointInfoPropertyOptions }{@code >}
     *     
     */
    public void setInternalEndpointInfoOptions(JAXBElement<FacilityEndpointInfoPropertyOptions> value) {
        this.internalEndpointInfoOptions = value;
    }

}
