
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_login;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de LicenseComplianceViolationInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LicenseComplianceViolationInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllowedVehicleLicenseViolations" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CurrentVehicleLicenseViolations" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LastVehicleLicenseViolationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="LicenseComplianceState_VehicleLicenseComplianceState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlanningVehiclesLicensed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="VehicleLicenseCompliancePeriod" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="VehicleLicenseViolationGracePeriodEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="VehiclesLicensed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseComplianceViolationInfo", propOrder = {
    "allowedVehicleLicenseViolations",
    "currentVehicleLicenseViolations",
    "lastVehicleLicenseViolationDate",
    "licenseComplianceStateVehicleLicenseComplianceState",
    "planningVehiclesLicensed",
    "vehicleLicenseCompliancePeriod",
    "vehicleLicenseViolationGracePeriodEndDate",
    "vehiclesLicensed"
})
public class LicenseComplianceViolationInfo {

    @XmlElement(name = "AllowedVehicleLicenseViolations")
    protected Integer allowedVehicleLicenseViolations;
    @XmlElement(name = "CurrentVehicleLicenseViolations")
    protected Integer currentVehicleLicenseViolations;
    @XmlElementRef(name = "LastVehicleLicenseViolationDate", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastVehicleLicenseViolationDate;
    @XmlElementRef(name = "LicenseComplianceState_VehicleLicenseComplianceState", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> licenseComplianceStateVehicleLicenseComplianceState;
    @XmlElement(name = "PlanningVehiclesLicensed")
    protected Integer planningVehiclesLicensed;
    @XmlElement(name = "VehicleLicenseCompliancePeriod")
    protected Duration vehicleLicenseCompliancePeriod;
    @XmlElementRef(name = "VehicleLicenseViolationGracePeriodEndDate", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Login.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> vehicleLicenseViolationGracePeriodEndDate;
    @XmlElement(name = "VehiclesLicensed")
    protected Integer vehiclesLicensed;

    /**
     * Obtém o valor da propriedade allowedVehicleLicenseViolations.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAllowedVehicleLicenseViolations() {
        return allowedVehicleLicenseViolations;
    }

    /**
     * Define o valor da propriedade allowedVehicleLicenseViolations.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAllowedVehicleLicenseViolations(Integer value) {
        this.allowedVehicleLicenseViolations = value;
    }

    /**
     * Obtém o valor da propriedade currentVehicleLicenseViolations.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCurrentVehicleLicenseViolations() {
        return currentVehicleLicenseViolations;
    }

    /**
     * Define o valor da propriedade currentVehicleLicenseViolations.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCurrentVehicleLicenseViolations(Integer value) {
        this.currentVehicleLicenseViolations = value;
    }

    /**
     * Obtém o valor da propriedade lastVehicleLicenseViolationDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastVehicleLicenseViolationDate() {
        return lastVehicleLicenseViolationDate;
    }

    /**
     * Define o valor da propriedade lastVehicleLicenseViolationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastVehicleLicenseViolationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastVehicleLicenseViolationDate = value;
    }

    /**
     * Obtém o valor da propriedade licenseComplianceStateVehicleLicenseComplianceState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLicenseComplianceStateVehicleLicenseComplianceState() {
        return licenseComplianceStateVehicleLicenseComplianceState;
    }

    /**
     * Define o valor da propriedade licenseComplianceStateVehicleLicenseComplianceState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLicenseComplianceStateVehicleLicenseComplianceState(JAXBElement<String> value) {
        this.licenseComplianceStateVehicleLicenseComplianceState = value;
    }

    /**
     * Obtém o valor da propriedade planningVehiclesLicensed.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlanningVehiclesLicensed() {
        return planningVehiclesLicensed;
    }

    /**
     * Define o valor da propriedade planningVehiclesLicensed.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlanningVehiclesLicensed(Integer value) {
        this.planningVehiclesLicensed = value;
    }

    /**
     * Obtém o valor da propriedade vehicleLicenseCompliancePeriod.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getVehicleLicenseCompliancePeriod() {
        return vehicleLicenseCompliancePeriod;
    }

    /**
     * Define o valor da propriedade vehicleLicenseCompliancePeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setVehicleLicenseCompliancePeriod(Duration value) {
        this.vehicleLicenseCompliancePeriod = value;
    }

    /**
     * Obtém o valor da propriedade vehicleLicenseViolationGracePeriodEndDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getVehicleLicenseViolationGracePeriodEndDate() {
        return vehicleLicenseViolationGracePeriodEndDate;
    }

    /**
     * Define o valor da propriedade vehicleLicenseViolationGracePeriodEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setVehicleLicenseViolationGracePeriodEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.vehicleLicenseViolationGracePeriodEndDate = value;
    }

    /**
     * Obtém o valor da propriedade vehiclesLicensed.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVehiclesLicensed() {
        return vehiclesLicensed;
    }

    /**
     * Define o valor da propriedade vehiclesLicensed.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVehiclesLicensed(Integer value) {
        this.vehiclesLicensed = value;
    }

}
