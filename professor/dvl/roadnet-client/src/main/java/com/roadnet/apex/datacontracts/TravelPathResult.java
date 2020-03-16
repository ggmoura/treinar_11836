
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de TravelPathResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TravelPathResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArcEndpointIDs" type="{http://roadnet.com/apex/DataContracts/}ArrayOfNetworkArcEndpointID" minOccurs="0"/&gt;
 *         &lt;element name="CompressedPath" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="Cost" type="{http://roadnet.com/apex/DataContracts/}TravelCost" minOccurs="0"/&gt;
 *         &lt;element name="DestinationPathErrors" type="{http://roadnet.com/apex/DataContracts/}ArrayOfTravelPathErrorCode" minOccurs="0"/&gt;
 *         &lt;element name="DestinationPointIndices" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/&gt;
 *         &lt;element name="DirectionPointIndices" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/&gt;
 *         &lt;element name="Directions" type="{http://roadnet.com/apex/DataContracts/}ArrayOfTravelDirectionsStep" minOccurs="0"/&gt;
 *         &lt;element name="Path" type="{http://roadnet.com/apex/DataContracts/}PointPath" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelPathResult", propOrder = {
    "arcEndpointIDs",
    "compressedPath",
    "cost",
    "destinationPathErrors",
    "destinationPointIndices",
    "directionPointIndices",
    "directions",
    "path"
})
public class TravelPathResult
    extends DataTransferObject
{

    @XmlElementRef(name = "ArcEndpointIDs", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNetworkArcEndpointID> arcEndpointIDs;
    @XmlElementRef(name = "CompressedPath", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> compressedPath;
    @XmlElementRef(name = "Cost", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TravelCost> cost;
    @XmlElementRef(name = "DestinationPathErrors", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTravelPathErrorCode> destinationPathErrors;
    @XmlElementRef(name = "DestinationPointIndices", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> destinationPointIndices;
    @XmlElementRef(name = "DirectionPointIndices", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> directionPointIndices;
    @XmlElementRef(name = "Directions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTravelDirectionsStep> directions;
    @XmlElementRef(name = "Path", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PointPath> path;

    /**
     * Obtém o valor da propriedade arcEndpointIDs.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkArcEndpointID }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNetworkArcEndpointID> getArcEndpointIDs() {
        return arcEndpointIDs;
    }

    /**
     * Define o valor da propriedade arcEndpointIDs.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkArcEndpointID }{@code >}
     *     
     */
    public void setArcEndpointIDs(JAXBElement<ArrayOfNetworkArcEndpointID> value) {
        this.arcEndpointIDs = value;
    }

    /**
     * Obtém o valor da propriedade compressedPath.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getCompressedPath() {
        return compressedPath;
    }

    /**
     * Define o valor da propriedade compressedPath.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setCompressedPath(JAXBElement<byte[]> value) {
        this.compressedPath = value;
    }

    /**
     * Obtém o valor da propriedade cost.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TravelCost }{@code >}
     *     
     */
    public JAXBElement<TravelCost> getCost() {
        return cost;
    }

    /**
     * Define o valor da propriedade cost.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TravelCost }{@code >}
     *     
     */
    public void setCost(JAXBElement<TravelCost> value) {
        this.cost = value;
    }

    /**
     * Obtém o valor da propriedade destinationPathErrors.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTravelPathErrorCode }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTravelPathErrorCode> getDestinationPathErrors() {
        return destinationPathErrors;
    }

    /**
     * Define o valor da propriedade destinationPathErrors.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTravelPathErrorCode }{@code >}
     *     
     */
    public void setDestinationPathErrors(JAXBElement<ArrayOfTravelPathErrorCode> value) {
        this.destinationPathErrors = value;
    }

    /**
     * Obtém o valor da propriedade destinationPointIndices.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getDestinationPointIndices() {
        return destinationPointIndices;
    }

    /**
     * Define o valor da propriedade destinationPointIndices.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setDestinationPointIndices(JAXBElement<ArrayOfint> value) {
        this.destinationPointIndices = value;
    }

    /**
     * Obtém o valor da propriedade directionPointIndices.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getDirectionPointIndices() {
        return directionPointIndices;
    }

    /**
     * Define o valor da propriedade directionPointIndices.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setDirectionPointIndices(JAXBElement<ArrayOfint> value) {
        this.directionPointIndices = value;
    }

    /**
     * Obtém o valor da propriedade directions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTravelDirectionsStep }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTravelDirectionsStep> getDirections() {
        return directions;
    }

    /**
     * Define o valor da propriedade directions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTravelDirectionsStep }{@code >}
     *     
     */
    public void setDirections(JAXBElement<ArrayOfTravelDirectionsStep> value) {
        this.directions = value;
    }

    /**
     * Obtém o valor da propriedade path.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PointPath }{@code >}
     *     
     */
    public JAXBElement<PointPath> getPath() {
        return path;
    }

    /**
     * Define o valor da propriedade path.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PointPath }{@code >}
     *     
     */
    public void setPath(JAXBElement<PointPath> value) {
        this.path = value;
    }

}
