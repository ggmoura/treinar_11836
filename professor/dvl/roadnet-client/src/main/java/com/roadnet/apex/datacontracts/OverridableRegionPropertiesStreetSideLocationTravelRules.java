
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de OverridableRegionProperties.StreetSideLocationTravelRules complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OverridableRegionProperties.StreetSideLocationTravelRules"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplyToLocalRoads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LeftSideAvoidanceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LeftSidePenalty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RightSideAvoidanceTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RightSidePenalty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverridableRegionProperties.StreetSideLocationTravelRules", propOrder = {
    "applyToLocalRoads",
    "leftSideAvoidanceTime",
    "leftSidePenalty",
    "rightSideAvoidanceTime",
    "rightSidePenalty"
})
public class OverridableRegionPropertiesStreetSideLocationTravelRules
    extends DataTransferObject
{

    @XmlElement(name = "ApplyToLocalRoads")
    protected Boolean applyToLocalRoads;
    @XmlElement(name = "LeftSideAvoidanceTime")
    protected Boolean leftSideAvoidanceTime;
    @XmlElement(name = "LeftSidePenalty")
    protected Boolean leftSidePenalty;
    @XmlElement(name = "RightSideAvoidanceTime")
    protected Boolean rightSideAvoidanceTime;
    @XmlElement(name = "RightSidePenalty")
    protected Boolean rightSidePenalty;

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
     *     {@link Boolean }
     *     
     */
    public Boolean isLeftSideAvoidanceTime() {
        return leftSideAvoidanceTime;
    }

    /**
     * Define o valor da propriedade leftSideAvoidanceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeftSideAvoidanceTime(Boolean value) {
        this.leftSideAvoidanceTime = value;
    }

    /**
     * Obtém o valor da propriedade leftSidePenalty.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLeftSidePenalty() {
        return leftSidePenalty;
    }

    /**
     * Define o valor da propriedade leftSidePenalty.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeftSidePenalty(Boolean value) {
        this.leftSidePenalty = value;
    }

    /**
     * Obtém o valor da propriedade rightSideAvoidanceTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRightSideAvoidanceTime() {
        return rightSideAvoidanceTime;
    }

    /**
     * Define o valor da propriedade rightSideAvoidanceTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRightSideAvoidanceTime(Boolean value) {
        this.rightSideAvoidanceTime = value;
    }

    /**
     * Obtém o valor da propriedade rightSidePenalty.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRightSidePenalty() {
        return rightSidePenalty;
    }

    /**
     * Define o valor da propriedade rightSidePenalty.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRightSidePenalty(Boolean value) {
        this.rightSidePenalty = value;
    }

}
