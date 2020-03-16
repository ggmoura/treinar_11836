
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de RouteJurisdictionPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RouteJurisdictionPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DistanceTraveled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EntryOdometer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EntryTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExitOdometer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExitTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Jurisdiction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteJurisdictionPropertyOptions", propOrder = {
    "distanceTraveled",
    "entryOdometer",
    "entryTime",
    "exitOdometer",
    "exitTime",
    "jurisdiction"
})
public class RouteJurisdictionPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "DistanceTraveled")
    protected Boolean distanceTraveled;
    @XmlElement(name = "EntryOdometer")
    protected Boolean entryOdometer;
    @XmlElement(name = "EntryTime")
    protected Boolean entryTime;
    @XmlElement(name = "ExitOdometer")
    protected Boolean exitOdometer;
    @XmlElement(name = "ExitTime")
    protected Boolean exitTime;
    @XmlElement(name = "Jurisdiction")
    protected Boolean jurisdiction;

    /**
     * Obtém o valor da propriedade distanceTraveled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDistanceTraveled() {
        return distanceTraveled;
    }

    /**
     * Define o valor da propriedade distanceTraveled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDistanceTraveled(Boolean value) {
        this.distanceTraveled = value;
    }

    /**
     * Obtém o valor da propriedade entryOdometer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEntryOdometer() {
        return entryOdometer;
    }

    /**
     * Define o valor da propriedade entryOdometer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEntryOdometer(Boolean value) {
        this.entryOdometer = value;
    }

    /**
     * Obtém o valor da propriedade entryTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEntryTime() {
        return entryTime;
    }

    /**
     * Define o valor da propriedade entryTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEntryTime(Boolean value) {
        this.entryTime = value;
    }

    /**
     * Obtém o valor da propriedade exitOdometer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExitOdometer() {
        return exitOdometer;
    }

    /**
     * Define o valor da propriedade exitOdometer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExitOdometer(Boolean value) {
        this.exitOdometer = value;
    }

    /**
     * Obtém o valor da propriedade exitTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExitTime() {
        return exitTime;
    }

    /**
     * Define o valor da propriedade exitTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExitTime(Boolean value) {
        this.exitTime = value;
    }

    /**
     * Obtém o valor da propriedade jurisdiction.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJurisdiction() {
        return jurisdiction;
    }

    /**
     * Define o valor da propriedade jurisdiction.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJurisdiction(Boolean value) {
        this.jurisdiction = value;
    }

}
