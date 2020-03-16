
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyOptions;


/**
 * <p>Classe Java de RoutePathResultPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RoutePathResultPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompressPathPoints" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FullPath" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FullPathOptions" type="{http://roadnet.com/apex/DataContracts/}TravelPathResultPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="IsFullPathPlanned" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RemainingPath" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RemainingPathOptions" type="{http://roadnet.com/apex/DataContracts/}TravelPathResultPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="ResourceEventSet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ResourceEventSetOptions" type="{http://roadnet.com/apex/DataContracts/}ResourceEventSetPropertyOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutePathResultPropertyOptions", propOrder = {
    "compressPathPoints",
    "fullPath",
    "fullPathOptions",
    "isFullPathPlanned",
    "remainingPath",
    "remainingPathOptions",
    "resourceEventSet",
    "resourceEventSetOptions"
})
public class RoutePathResultPropertyOptions
    extends PropertyOptions
{

    @XmlElement(name = "CompressPathPoints")
    protected Boolean compressPathPoints;
    @XmlElement(name = "FullPath")
    protected Boolean fullPath;
    @XmlElementRef(name = "FullPathOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TravelPathResultPropertyOptions> fullPathOptions;
    @XmlElement(name = "IsFullPathPlanned")
    protected Boolean isFullPathPlanned;
    @XmlElement(name = "RemainingPath")
    protected Boolean remainingPath;
    @XmlElementRef(name = "RemainingPathOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TravelPathResultPropertyOptions> remainingPathOptions;
    @XmlElement(name = "ResourceEventSet")
    protected Boolean resourceEventSet;
    @XmlElementRef(name = "ResourceEventSetOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ResourceEventSetPropertyOptions> resourceEventSetOptions;

    /**
     * Obtém o valor da propriedade compressPathPoints.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompressPathPoints() {
        return compressPathPoints;
    }

    /**
     * Define o valor da propriedade compressPathPoints.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompressPathPoints(Boolean value) {
        this.compressPathPoints = value;
    }

    /**
     * Obtém o valor da propriedade fullPath.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFullPath() {
        return fullPath;
    }

    /**
     * Define o valor da propriedade fullPath.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFullPath(Boolean value) {
        this.fullPath = value;
    }

    /**
     * Obtém o valor da propriedade fullPathOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TravelPathResultPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<TravelPathResultPropertyOptions> getFullPathOptions() {
        return fullPathOptions;
    }

    /**
     * Define o valor da propriedade fullPathOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TravelPathResultPropertyOptions }{@code >}
     *     
     */
    public void setFullPathOptions(JAXBElement<TravelPathResultPropertyOptions> value) {
        this.fullPathOptions = value;
    }

    /**
     * Obtém o valor da propriedade isFullPathPlanned.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFullPathPlanned() {
        return isFullPathPlanned;
    }

    /**
     * Define o valor da propriedade isFullPathPlanned.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFullPathPlanned(Boolean value) {
        this.isFullPathPlanned = value;
    }

    /**
     * Obtém o valor da propriedade remainingPath.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemainingPath() {
        return remainingPath;
    }

    /**
     * Define o valor da propriedade remainingPath.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemainingPath(Boolean value) {
        this.remainingPath = value;
    }

    /**
     * Obtém o valor da propriedade remainingPathOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TravelPathResultPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<TravelPathResultPropertyOptions> getRemainingPathOptions() {
        return remainingPathOptions;
    }

    /**
     * Define o valor da propriedade remainingPathOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TravelPathResultPropertyOptions }{@code >}
     *     
     */
    public void setRemainingPathOptions(JAXBElement<TravelPathResultPropertyOptions> value) {
        this.remainingPathOptions = value;
    }

    /**
     * Obtém o valor da propriedade resourceEventSet.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResourceEventSet() {
        return resourceEventSet;
    }

    /**
     * Define o valor da propriedade resourceEventSet.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResourceEventSet(Boolean value) {
        this.resourceEventSet = value;
    }

    /**
     * Obtém o valor da propriedade resourceEventSetOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventSetPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ResourceEventSetPropertyOptions> getResourceEventSetOptions() {
        return resourceEventSetOptions;
    }

    /**
     * Define o valor da propriedade resourceEventSetOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResourceEventSetPropertyOptions }{@code >}
     *     
     */
    public void setResourceEventSetOptions(JAXBElement<ResourceEventSetPropertyOptions> value) {
        this.resourceEventSetOptions = value;
    }

}
