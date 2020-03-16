
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de CalculateDistanceByJurisdictionResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CalculateDistanceByJurisdictionResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JurisdictionDistances" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}ArrayOfJurisdictionDistance" minOccurs="0"/&gt;
 *         &lt;element name="TravelPathErrorCode_DestinationPathError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculateDistanceByJurisdictionResult", propOrder = {
    "jurisdictionDistances",
    "travelPathErrorCodeDestinationPathError"
})
public class CalculateDistanceByJurisdictionResult
    extends DataTransferObject
{

    @XmlElementRef(name = "JurisdictionDistances", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfJurisdictionDistance> jurisdictionDistances;
    @XmlElementRef(name = "TravelPathErrorCode_DestinationPathError", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> travelPathErrorCodeDestinationPathError;

    /**
     * Obtém o valor da propriedade jurisdictionDistances.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJurisdictionDistance }{@code >}
     *     
     */
    public JAXBElement<ArrayOfJurisdictionDistance> getJurisdictionDistances() {
        return jurisdictionDistances;
    }

    /**
     * Define o valor da propriedade jurisdictionDistances.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfJurisdictionDistance }{@code >}
     *     
     */
    public void setJurisdictionDistances(JAXBElement<ArrayOfJurisdictionDistance> value) {
        this.jurisdictionDistances = value;
    }

    /**
     * Obtém o valor da propriedade travelPathErrorCodeDestinationPathError.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTravelPathErrorCodeDestinationPathError() {
        return travelPathErrorCodeDestinationPathError;
    }

    /**
     * Define o valor da propriedade travelPathErrorCodeDestinationPathError.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTravelPathErrorCodeDestinationPathError(JAXBElement<String> value) {
        this.travelPathErrorCodeDestinationPathError = value;
    }

}
