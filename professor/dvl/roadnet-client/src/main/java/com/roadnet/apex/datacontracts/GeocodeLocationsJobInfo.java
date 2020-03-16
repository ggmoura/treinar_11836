
package com.roadnet.apex.datacontracts;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;


/**
 * <p>Classe Java de GeocodeLocationsJobInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GeocodeLocationsJobInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}JobInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FailedLocationEntityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="GeocodeLocationsJobStage_JobStage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationsTypeGeocoded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumberofLocationsGeocoded" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PercentComplete" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeocodeLocationsJobInfo", propOrder = {
    "failedLocationEntityKeys",
    "geocodeLocationsJobStageJobStage",
    "locationsTypeGeocoded",
    "numberofLocationsGeocoded",
    "percentComplete"
})
public class GeocodeLocationsJobInfo
    extends JobInfo
{

    @XmlElementRef(name = "FailedLocationEntityKeys", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> failedLocationEntityKeys;
    @XmlElementRef(name = "GeocodeLocationsJobStage_JobStage", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> geocodeLocationsJobStageJobStage;
    @XmlElementRef(name = "LocationsTypeGeocoded", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationsTypeGeocoded;
    @XmlElement(name = "NumberofLocationsGeocoded")
    protected Long numberofLocationsGeocoded;
    @XmlElement(name = "PercentComplete")
    protected BigDecimal percentComplete;

    /**
     * Obtém o valor da propriedade failedLocationEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getFailedLocationEntityKeys() {
        return failedLocationEntityKeys;
    }

    /**
     * Define o valor da propriedade failedLocationEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setFailedLocationEntityKeys(JAXBElement<ArrayOflong> value) {
        this.failedLocationEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade geocodeLocationsJobStageJobStage.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGeocodeLocationsJobStageJobStage() {
        return geocodeLocationsJobStageJobStage;
    }

    /**
     * Define o valor da propriedade geocodeLocationsJobStageJobStage.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGeocodeLocationsJobStageJobStage(JAXBElement<String> value) {
        this.geocodeLocationsJobStageJobStage = value;
    }

    /**
     * Obtém o valor da propriedade locationsTypeGeocoded.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationsTypeGeocoded() {
        return locationsTypeGeocoded;
    }

    /**
     * Define o valor da propriedade locationsTypeGeocoded.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationsTypeGeocoded(JAXBElement<String> value) {
        this.locationsTypeGeocoded = value;
    }

    /**
     * Obtém o valor da propriedade numberofLocationsGeocoded.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberofLocationsGeocoded() {
        return numberofLocationsGeocoded;
    }

    /**
     * Define o valor da propriedade numberofLocationsGeocoded.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberofLocationsGeocoded(Long value) {
        this.numberofLocationsGeocoded = value;
    }

    /**
     * Obtém o valor da propriedade percentComplete.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentComplete() {
        return percentComplete;
    }

    /**
     * Define o valor da propriedade percentComplete.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentComplete(BigDecimal value) {
        this.percentComplete = value;
    }

}
