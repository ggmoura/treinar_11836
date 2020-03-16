
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.roadnet.apex.datacontracts.DailyTimePeriod;


/**
 * <p>Classe Java de RestrictedEquipmentHoursDescriptor complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RestrictedEquipmentHoursDescriptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions}ResourceExceptionSpecialDescriptor"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsOriginDepartureViolation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsViolationActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedEquipmentHoursType_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ViolatedDepotDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ViolatedDepotIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ViolatedDepotOpenCloseWindow" type="{http://roadnet.com/apex/DataContracts/}DailyTimePeriod" minOccurs="0"/&gt;
 *         &lt;element name="ViolatedRegionRestrictedOperatingTimes" type="{http://roadnet.com/apex/DataContracts/}DailyTimePeriod" minOccurs="0"/&gt;
 *         &lt;element name="ViolationTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestrictedEquipmentHoursDescriptor", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", propOrder = {
    "isOriginDepartureViolation",
    "isViolationActive",
    "restrictedEquipmentHoursTypeType",
    "violatedDepotDescription",
    "violatedDepotIdentifier",
    "violatedDepotOpenCloseWindow",
    "violatedRegionRestrictedOperatingTimes",
    "violationTimestamp"
})
public class RestrictedEquipmentHoursDescriptor
    extends ResourceExceptionSpecialDescriptor
{

    @XmlElement(name = "IsOriginDepartureViolation")
    protected Boolean isOriginDepartureViolation;
    @XmlElement(name = "IsViolationActive")
    protected Boolean isViolationActive;
    @XmlElementRef(name = "RestrictedEquipmentHoursType_Type", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", type = JAXBElement.class, required = false)
    protected JAXBElement<String> restrictedEquipmentHoursTypeType;
    @XmlElementRef(name = "ViolatedDepotDescription", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", type = JAXBElement.class, required = false)
    protected JAXBElement<String> violatedDepotDescription;
    @XmlElementRef(name = "ViolatedDepotIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", type = JAXBElement.class, required = false)
    protected JAXBElement<String> violatedDepotIdentifier;
    @XmlElementRef(name = "ViolatedDepotOpenCloseWindow", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", type = JAXBElement.class, required = false)
    protected JAXBElement<DailyTimePeriod> violatedDepotOpenCloseWindow;
    @XmlElementRef(name = "ViolatedRegionRestrictedOperatingTimes", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", type = JAXBElement.class, required = false)
    protected JAXBElement<DailyTimePeriod> violatedRegionRestrictedOperatingTimes;
    @XmlElement(name = "ViolationTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar violationTimestamp;

    /**
     * Obtém o valor da propriedade isOriginDepartureViolation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOriginDepartureViolation() {
        return isOriginDepartureViolation;
    }

    /**
     * Define o valor da propriedade isOriginDepartureViolation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOriginDepartureViolation(Boolean value) {
        this.isOriginDepartureViolation = value;
    }

    /**
     * Obtém o valor da propriedade isViolationActive.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsViolationActive() {
        return isViolationActive;
    }

    /**
     * Define o valor da propriedade isViolationActive.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsViolationActive(Boolean value) {
        this.isViolationActive = value;
    }

    /**
     * Obtém o valor da propriedade restrictedEquipmentHoursTypeType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRestrictedEquipmentHoursTypeType() {
        return restrictedEquipmentHoursTypeType;
    }

    /**
     * Define o valor da propriedade restrictedEquipmentHoursTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRestrictedEquipmentHoursTypeType(JAXBElement<String> value) {
        this.restrictedEquipmentHoursTypeType = value;
    }

    /**
     * Obtém o valor da propriedade violatedDepotDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getViolatedDepotDescription() {
        return violatedDepotDescription;
    }

    /**
     * Define o valor da propriedade violatedDepotDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setViolatedDepotDescription(JAXBElement<String> value) {
        this.violatedDepotDescription = value;
    }

    /**
     * Obtém o valor da propriedade violatedDepotIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getViolatedDepotIdentifier() {
        return violatedDepotIdentifier;
    }

    /**
     * Define o valor da propriedade violatedDepotIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setViolatedDepotIdentifier(JAXBElement<String> value) {
        this.violatedDepotIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade violatedDepotOpenCloseWindow.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DailyTimePeriod }{@code >}
     *     
     */
    public JAXBElement<DailyTimePeriod> getViolatedDepotOpenCloseWindow() {
        return violatedDepotOpenCloseWindow;
    }

    /**
     * Define o valor da propriedade violatedDepotOpenCloseWindow.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DailyTimePeriod }{@code >}
     *     
     */
    public void setViolatedDepotOpenCloseWindow(JAXBElement<DailyTimePeriod> value) {
        this.violatedDepotOpenCloseWindow = value;
    }

    /**
     * Obtém o valor da propriedade violatedRegionRestrictedOperatingTimes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DailyTimePeriod }{@code >}
     *     
     */
    public JAXBElement<DailyTimePeriod> getViolatedRegionRestrictedOperatingTimes() {
        return violatedRegionRestrictedOperatingTimes;
    }

    /**
     * Define o valor da propriedade violatedRegionRestrictedOperatingTimes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DailyTimePeriod }{@code >}
     *     
     */
    public void setViolatedRegionRestrictedOperatingTimes(JAXBElement<DailyTimePeriod> value) {
        this.violatedRegionRestrictedOperatingTimes = value;
    }

    /**
     * Obtém o valor da propriedade violationTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getViolationTimestamp() {
        return violationTimestamp;
    }

    /**
     * Define o valor da propriedade violationTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setViolationTimestamp(XMLGregorianCalendar value) {
        this.violationTimestamp = value;
    }

}
