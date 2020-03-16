
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.Coordinate;
import com.roadnet.apex.datacontracts.RegionContext;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.CalculateDistanceByJurisdictionOptions;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="regionContext" type="{http://roadnet.com/apex/DataContracts/}RegionContext" minOccurs="0"/&gt;
 *         &lt;element name="fromCoordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="toCoordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="options" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}CalculateDistanceByJurisdictionOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "regionContext",
    "fromCoordinate",
    "toCoordinate",
    "options"
})
@XmlRootElement(name = "CalculateDistanceByJurisdiction")
public class CalculateDistanceByJurisdiction {

    @XmlElementRef(name = "regionContext", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegionContext> regionContext;
    @XmlElementRef(name = "fromCoordinate", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> fromCoordinate;
    @XmlElementRef(name = "toCoordinate", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> toCoordinate;
    @XmlElementRef(name = "options", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<CalculateDistanceByJurisdictionOptions> options;

    /**
     * Obtém o valor da propriedade regionContext.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegionContext }{@code >}
     *     
     */
    public JAXBElement<RegionContext> getRegionContext() {
        return regionContext;
    }

    /**
     * Define o valor da propriedade regionContext.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegionContext }{@code >}
     *     
     */
    public void setRegionContext(JAXBElement<RegionContext> value) {
        this.regionContext = value;
    }

    /**
     * Obtém o valor da propriedade fromCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getFromCoordinate() {
        return fromCoordinate;
    }

    /**
     * Define o valor da propriedade fromCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setFromCoordinate(JAXBElement<Coordinate> value) {
        this.fromCoordinate = value;
    }

    /**
     * Obtém o valor da propriedade toCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getToCoordinate() {
        return toCoordinate;
    }

    /**
     * Define o valor da propriedade toCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setToCoordinate(JAXBElement<Coordinate> value) {
        this.toCoordinate = value;
    }

    /**
     * Obtém o valor da propriedade options.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CalculateDistanceByJurisdictionOptions }{@code >}
     *     
     */
    public JAXBElement<CalculateDistanceByJurisdictionOptions> getOptions() {
        return options;
    }

    /**
     * Define o valor da propriedade options.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CalculateDistanceByJurisdictionOptions }{@code >}
     *     
     */
    public void setOptions(JAXBElement<CalculateDistanceByJurisdictionOptions> value) {
        this.options = value;
    }

}
