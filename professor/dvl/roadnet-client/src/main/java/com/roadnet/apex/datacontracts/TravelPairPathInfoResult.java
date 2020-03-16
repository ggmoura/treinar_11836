
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de TravelPairPathInfoResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TravelPairPathInfoResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cost" type="{http://roadnet.com/apex/DataContracts/}TravelCost" minOccurs="0"/&gt;
 *         &lt;element name="DestinationAddress" type="{http://roadnet.com/apex/DataContracts/}Address" minOccurs="0"/&gt;
 *         &lt;element name="DestinationCoordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="OriginAddress" type="{http://roadnet.com/apex/DataContracts/}Address" minOccurs="0"/&gt;
 *         &lt;element name="OriginCoordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelPairPathInfoResult", propOrder = {
    "cost",
    "destinationAddress",
    "destinationCoordinate",
    "originAddress",
    "originCoordinate"
})
public class TravelPairPathInfoResult
    extends DataTransferObject
{

    @XmlElementRef(name = "Cost", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TravelCost> cost;
    @XmlElementRef(name = "DestinationAddress", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Address> destinationAddress;
    @XmlElementRef(name = "DestinationCoordinate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> destinationCoordinate;
    @XmlElementRef(name = "OriginAddress", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Address> originAddress;
    @XmlElementRef(name = "OriginCoordinate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> originCoordinate;

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
     * Obtém o valor da propriedade destinationAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public JAXBElement<Address> getDestinationAddress() {
        return destinationAddress;
    }

    /**
     * Define o valor da propriedade destinationAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public void setDestinationAddress(JAXBElement<Address> value) {
        this.destinationAddress = value;
    }

    /**
     * Obtém o valor da propriedade destinationCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getDestinationCoordinate() {
        return destinationCoordinate;
    }

    /**
     * Define o valor da propriedade destinationCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setDestinationCoordinate(JAXBElement<Coordinate> value) {
        this.destinationCoordinate = value;
    }

    /**
     * Obtém o valor da propriedade originAddress.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public JAXBElement<Address> getOriginAddress() {
        return originAddress;
    }

    /**
     * Define o valor da propriedade originAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Address }{@code >}
     *     
     */
    public void setOriginAddress(JAXBElement<Address> value) {
        this.originAddress = value;
    }

    /**
     * Obtém o valor da propriedade originCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getOriginCoordinate() {
        return originCoordinate;
    }

    /**
     * Define o valor da propriedade originCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setOriginCoordinate(JAXBElement<Coordinate> value) {
        this.originCoordinate = value;
    }

}
