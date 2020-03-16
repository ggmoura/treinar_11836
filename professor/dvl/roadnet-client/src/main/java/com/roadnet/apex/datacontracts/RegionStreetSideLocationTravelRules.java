
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de Region.StreetSideLocationTravelRules complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Region.StreetSideLocationTravelRules"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplyToLocalRoads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LeftSideAvoidanceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="LeftSidePenalty" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="RightSideAvoidanceTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="RightSidePenalty" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Region.StreetSideLocationTravelRules", propOrder = {
    "applyToLocalRoads",
    "leftSideAvoidanceTime",
    "leftSidePenalty",
    "rightSideAvoidanceTime",
    "rightSidePenalty"
})
public class RegionStreetSideLocationTravelRules
    extends DataTransferObject
{

    @XmlElement(name = "ApplyToLocalRoads")
    protected Boolean applyToLocalRoads;
    @XmlElement(name = "LeftSideAvoidanceTime")
    protected Duration leftSideAvoidanceTime;
    @XmlElement(name = "LeftSidePenalty")
    protected Duration leftSidePenalty;
    @XmlElement(name = "RightSideAvoidanceTime")
    protected Duration rightSideAvoidanceTime;
    @XmlElement(name = "RightSidePenalty")
    protected Duration rightSidePenalty;

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
     * Obtém o valor da propriedade leftSideAvoidanceTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getLeftSideAvoidanceTime() {
        return leftSideAvoidanceTime;
    }

    /**
     * Define o valor da propriedade leftSideAvoidanceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setLeftSideAvoidanceTime(Duration value) {
        this.leftSideAvoidanceTime = value;
    }

    /**
     * Obtém o valor da propriedade leftSidePenalty.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getLeftSidePenalty() {
        return leftSidePenalty;
    }

    /**
     * Define o valor da propriedade leftSidePenalty.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setLeftSidePenalty(Duration value) {
        this.leftSidePenalty = value;
    }

    /**
     * Obtém o valor da propriedade rightSideAvoidanceTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getRightSideAvoidanceTime() {
        return rightSideAvoidanceTime;
    }

    /**
     * Define o valor da propriedade rightSideAvoidanceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setRightSideAvoidanceTime(Duration value) {
        this.rightSideAvoidanceTime = value;
    }

    /**
     * Obtém o valor da propriedade rightSidePenalty.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getRightSidePenalty() {
        return rightSidePenalty;
    }

    /**
     * Define o valor da propriedade rightSidePenalty.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setRightSidePenalty(Duration value) {
        this.rightSidePenalty = value;
    }

}
