
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.NetworkRestrictedPathPropertyOptions;
import com.roadnet.apex.datacontracts.NetworkTravelPolygonPropertyOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyInclusionMode;


/**
 * <p>Classe Java de RetrieveRestrictedPathsAndPolygonsOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveRestrictedPathsAndPolygonsOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TravelPathPropertyInclusionMode" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyInclusionMode" minOccurs="0"/&gt;
 *         &lt;element name="TravelPathPropertyOptions" type="{http://roadnet.com/apex/DataContracts/}NetworkRestrictedPathPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="TravelPolygonPropertyInclusionMode" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyInclusionMode" minOccurs="0"/&gt;
 *         &lt;element name="TravelPolygonPropertyOptions" type="{http://roadnet.com/apex/DataContracts/}NetworkTravelPolygonPropertyOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveRestrictedPathsAndPolygonsOptions", propOrder = {
    "travelPathPropertyInclusionMode",
    "travelPathPropertyOptions",
    "travelPolygonPropertyInclusionMode",
    "travelPolygonPropertyOptions"
})
public class RetrieveRestrictedPathsAndPolygonsOptions {

    @XmlElement(name = "TravelPathPropertyInclusionMode")
    @XmlSchemaType(name = "string")
    protected PropertyInclusionMode travelPathPropertyInclusionMode;
    @XmlElementRef(name = "TravelPathPropertyOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkRestrictedPathPropertyOptions> travelPathPropertyOptions;
    @XmlElement(name = "TravelPolygonPropertyInclusionMode")
    @XmlSchemaType(name = "string")
    protected PropertyInclusionMode travelPolygonPropertyInclusionMode;
    @XmlElementRef(name = "TravelPolygonPropertyOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkTravelPolygonPropertyOptions> travelPolygonPropertyOptions;

    /**
     * Obtém o valor da propriedade travelPathPropertyInclusionMode.
     * 
     * @return
     *     possible object is
     *     {@link PropertyInclusionMode }
     *     
     */
    public PropertyInclusionMode getTravelPathPropertyInclusionMode() {
        return travelPathPropertyInclusionMode;
    }

    /**
     * Define o valor da propriedade travelPathPropertyInclusionMode.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyInclusionMode }
     *     
     */
    public void setTravelPathPropertyInclusionMode(PropertyInclusionMode value) {
        this.travelPathPropertyInclusionMode = value;
    }

    /**
     * Obtém o valor da propriedade travelPathPropertyOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkRestrictedPathPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<NetworkRestrictedPathPropertyOptions> getTravelPathPropertyOptions() {
        return travelPathPropertyOptions;
    }

    /**
     * Define o valor da propriedade travelPathPropertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkRestrictedPathPropertyOptions }{@code >}
     *     
     */
    public void setTravelPathPropertyOptions(JAXBElement<NetworkRestrictedPathPropertyOptions> value) {
        this.travelPathPropertyOptions = value;
    }

    /**
     * Obtém o valor da propriedade travelPolygonPropertyInclusionMode.
     * 
     * @return
     *     possible object is
     *     {@link PropertyInclusionMode }
     *     
     */
    public PropertyInclusionMode getTravelPolygonPropertyInclusionMode() {
        return travelPolygonPropertyInclusionMode;
    }

    /**
     * Define o valor da propriedade travelPolygonPropertyInclusionMode.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyInclusionMode }
     *     
     */
    public void setTravelPolygonPropertyInclusionMode(PropertyInclusionMode value) {
        this.travelPolygonPropertyInclusionMode = value;
    }

    /**
     * Obtém o valor da propriedade travelPolygonPropertyOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkTravelPolygonPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<NetworkTravelPolygonPropertyOptions> getTravelPolygonPropertyOptions() {
        return travelPolygonPropertyOptions;
    }

    /**
     * Define o valor da propriedade travelPolygonPropertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkTravelPolygonPropertyOptions }{@code >}
     *     
     */
    public void setTravelPolygonPropertyOptions(JAXBElement<NetworkTravelPolygonPropertyOptions> value) {
        this.travelPolygonPropertyOptions = value;
    }

}
