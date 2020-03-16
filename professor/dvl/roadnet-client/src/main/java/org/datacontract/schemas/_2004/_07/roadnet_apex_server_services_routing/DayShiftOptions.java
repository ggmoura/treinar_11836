
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de DayShiftOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DayShiftOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssignManualLoadDistribution" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AssignNewServicePatternSet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DayOfWeekFlags_ValidDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShiftBackwards" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShiftByOverride" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ShiftNonServiceableStops" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DayShiftOptions", propOrder = {
    "assignManualLoadDistribution",
    "assignNewServicePatternSet",
    "dayOfWeekFlagsValidDays",
    "shiftBackwards",
    "shiftByOverride",
    "shiftNonServiceableStops"
})
public class DayShiftOptions
    extends DataTransferObject
{

    @XmlElement(name = "AssignManualLoadDistribution")
    protected Boolean assignManualLoadDistribution;
    @XmlElement(name = "AssignNewServicePatternSet")
    protected Boolean assignNewServicePatternSet;
    @XmlElementRef(name = "DayOfWeekFlags_ValidDays", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dayOfWeekFlagsValidDays;
    @XmlElement(name = "ShiftBackwards")
    protected Boolean shiftBackwards;
    @XmlElementRef(name = "ShiftByOverride", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> shiftByOverride;
    @XmlElement(name = "ShiftNonServiceableStops")
    protected Boolean shiftNonServiceableStops;

    /**
     * Obtém o valor da propriedade assignManualLoadDistribution.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssignManualLoadDistribution() {
        return assignManualLoadDistribution;
    }

    /**
     * Define o valor da propriedade assignManualLoadDistribution.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssignManualLoadDistribution(Boolean value) {
        this.assignManualLoadDistribution = value;
    }

    /**
     * Obtém o valor da propriedade assignNewServicePatternSet.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssignNewServicePatternSet() {
        return assignNewServicePatternSet;
    }

    /**
     * Define o valor da propriedade assignNewServicePatternSet.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssignNewServicePatternSet(Boolean value) {
        this.assignNewServicePatternSet = value;
    }

    /**
     * Obtém o valor da propriedade dayOfWeekFlagsValidDays.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDayOfWeekFlagsValidDays() {
        return dayOfWeekFlagsValidDays;
    }

    /**
     * Define o valor da propriedade dayOfWeekFlagsValidDays.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDayOfWeekFlagsValidDays(JAXBElement<String> value) {
        this.dayOfWeekFlagsValidDays = value;
    }

    /**
     * Obtém o valor da propriedade shiftBackwards.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShiftBackwards() {
        return shiftBackwards;
    }

    /**
     * Define o valor da propriedade shiftBackwards.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShiftBackwards(Boolean value) {
        this.shiftBackwards = value;
    }

    /**
     * Obtém o valor da propriedade shiftByOverride.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getShiftByOverride() {
        return shiftByOverride;
    }

    /**
     * Define o valor da propriedade shiftByOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setShiftByOverride(JAXBElement<Integer> value) {
        this.shiftByOverride = value;
    }

    /**
     * Obtém o valor da propriedade shiftNonServiceableStops.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShiftNonServiceableStops() {
        return shiftNonServiceableStops;
    }

    /**
     * Define o valor da propriedade shiftNonServiceableStops.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShiftNonServiceableStops(Boolean value) {
        this.shiftNonServiceableStops = value;
    }

}
