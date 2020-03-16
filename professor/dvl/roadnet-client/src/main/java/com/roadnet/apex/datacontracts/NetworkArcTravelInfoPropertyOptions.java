
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyOptions;


/**
 * <p>Classe Java de NetworkArcTravelInfoPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkArcTravelInfoPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Importance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsLoadable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsTollRoad" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NominalSpeed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TravelDirection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TravelRules" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WeeklyTravelSpeeds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkArcTravelInfoPropertyOptions", propOrder = {
    "importance",
    "isEnabled",
    "isLoadable",
    "isTollRoad",
    "nominalSpeed",
    "travelDirection",
    "travelRules",
    "weeklyTravelSpeeds"
})
public class NetworkArcTravelInfoPropertyOptions
    extends PropertyOptions
{

    @XmlElement(name = "Importance")
    protected Boolean importance;
    @XmlElement(name = "IsEnabled")
    protected Boolean isEnabled;
    @XmlElement(name = "IsLoadable")
    protected Boolean isLoadable;
    @XmlElement(name = "IsTollRoad")
    protected Boolean isTollRoad;
    @XmlElement(name = "NominalSpeed")
    protected Boolean nominalSpeed;
    @XmlElement(name = "TravelDirection")
    protected Boolean travelDirection;
    @XmlElement(name = "TravelRules")
    protected Boolean travelRules;
    @XmlElement(name = "WeeklyTravelSpeeds")
    protected Boolean weeklyTravelSpeeds;

    /**
     * Obtém o valor da propriedade importance.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImportance() {
        return importance;
    }

    /**
     * Define o valor da propriedade importance.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImportance(Boolean value) {
        this.importance = value;
    }

    /**
     * Obtém o valor da propriedade isEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEnabled() {
        return isEnabled;
    }

    /**
     * Define o valor da propriedade isEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnabled(Boolean value) {
        this.isEnabled = value;
    }

    /**
     * Obtém o valor da propriedade isLoadable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLoadable() {
        return isLoadable;
    }

    /**
     * Define o valor da propriedade isLoadable.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLoadable(Boolean value) {
        this.isLoadable = value;
    }

    /**
     * Obtém o valor da propriedade isTollRoad.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTollRoad() {
        return isTollRoad;
    }

    /**
     * Define o valor da propriedade isTollRoad.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTollRoad(Boolean value) {
        this.isTollRoad = value;
    }

    /**
     * Obtém o valor da propriedade nominalSpeed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNominalSpeed() {
        return nominalSpeed;
    }

    /**
     * Define o valor da propriedade nominalSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNominalSpeed(Boolean value) {
        this.nominalSpeed = value;
    }

    /**
     * Obtém o valor da propriedade travelDirection.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTravelDirection() {
        return travelDirection;
    }

    /**
     * Define o valor da propriedade travelDirection.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTravelDirection(Boolean value) {
        this.travelDirection = value;
    }

    /**
     * Obtém o valor da propriedade travelRules.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTravelRules() {
        return travelRules;
    }

    /**
     * Define o valor da propriedade travelRules.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTravelRules(Boolean value) {
        this.travelRules = value;
    }

    /**
     * Obtém o valor da propriedade weeklyTravelSpeeds.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeeklyTravelSpeeds() {
        return weeklyTravelSpeeds;
    }

    /**
     * Define o valor da propriedade weeklyTravelSpeeds.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeeklyTravelSpeeds(Boolean value) {
        this.weeklyTravelSpeeds = value;
    }

}
