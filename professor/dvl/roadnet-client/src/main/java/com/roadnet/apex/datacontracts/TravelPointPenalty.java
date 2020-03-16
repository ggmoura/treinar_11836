
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de TravelPointPenalty complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TravelPointPenalty"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplyToLocalRoads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LeftTurnExtraTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="LeftTurnPenalty" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="RightTurnExtraTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="RightTurnPenalty" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelPointPenalty", propOrder = {
    "applyToLocalRoads",
    "leftTurnExtraTime",
    "leftTurnPenalty",
    "rightTurnExtraTime",
    "rightTurnPenalty"
})
public class TravelPointPenalty
    extends DataTransferObject
{

    @XmlElement(name = "ApplyToLocalRoads")
    protected Boolean applyToLocalRoads;
    @XmlElementRef(name = "LeftTurnExtraTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> leftTurnExtraTime;
    @XmlElementRef(name = "LeftTurnPenalty", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> leftTurnPenalty;
    @XmlElementRef(name = "RightTurnExtraTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> rightTurnExtraTime;
    @XmlElementRef(name = "RightTurnPenalty", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> rightTurnPenalty;

    /**
     * Obtém o valor da propriedade applyToLocalRoads.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplyToLocalRoads() {
        return applyToLocalRoads;
    }

    /**
     * Define o valor da propriedade applyToLocalRoads.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyToLocalRoads(Boolean value) {
        this.applyToLocalRoads = value;
    }

    /**
     * Obtém o valor da propriedade leftTurnExtraTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getLeftTurnExtraTime() {
        return leftTurnExtraTime;
    }

    /**
     * Define o valor da propriedade leftTurnExtraTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setLeftTurnExtraTime(JAXBElement<Duration> value) {
        this.leftTurnExtraTime = value;
    }

    /**
     * Obtém o valor da propriedade leftTurnPenalty.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getLeftTurnPenalty() {
        return leftTurnPenalty;
    }

    /**
     * Define o valor da propriedade leftTurnPenalty.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setLeftTurnPenalty(JAXBElement<Duration> value) {
        this.leftTurnPenalty = value;
    }

    /**
     * Obtém o valor da propriedade rightTurnExtraTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getRightTurnExtraTime() {
        return rightTurnExtraTime;
    }

    /**
     * Define o valor da propriedade rightTurnExtraTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setRightTurnExtraTime(JAXBElement<Duration> value) {
        this.rightTurnExtraTime = value;
    }

    /**
     * Obtém o valor da propriedade rightTurnPenalty.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getRightTurnPenalty() {
        return rightTurnPenalty;
    }

    /**
     * Define o valor da propriedade rightTurnPenalty.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setRightTurnPenalty(JAXBElement<Duration> value) {
        this.rightTurnPenalty = value;
    }

}
