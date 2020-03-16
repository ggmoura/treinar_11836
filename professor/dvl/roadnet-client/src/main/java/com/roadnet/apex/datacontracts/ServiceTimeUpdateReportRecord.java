
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
 * <p>Classe Java de ServiceTimeUpdateReport.Record complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceTimeUpdateReport.Record"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcceptedDeliveries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Bulk" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ComputedFixedTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="ComputedVariableTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FixedTimePercentChange" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Helper" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="PercentAcceptedDeliveries" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PreviousFixedTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="PreviousVariableTime" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLocationCategory" type="{http://roadnet.com/apex/DataContracts/}ServiceLocationCategory" minOccurs="0"/&gt;
 *         &lt;element name="ServiceTimeUpdateReport_ErrorCode_Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceTimeUpdateReport_RejectCode_UpdateStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalDeliveries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="VariableTimePercentChange" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceTimeUpdateReport.Record", propOrder = {
    "acceptedDeliveries",
    "bulk",
    "computedFixedTime",
    "computedVariableTime",
    "description",
    "fixedTimePercentChange",
    "helper",
    "identifier",
    "locationEntityKey",
    "percentAcceptedDeliveries",
    "previousFixedTime",
    "previousVariableTime",
    "serviceLocationCategory",
    "serviceTimeUpdateReportErrorCodeStatus",
    "serviceTimeUpdateReportRejectCodeUpdateStatus",
    "totalDeliveries",
    "variableTimePercentChange"
})
public class ServiceTimeUpdateReportRecord
    extends DataTransferObject
{

    @XmlElement(name = "AcceptedDeliveries")
    protected Integer acceptedDeliveries;
    @XmlElement(name = "Bulk")
    protected Boolean bulk;
    @XmlElement(name = "ComputedFixedTime")
    protected Duration computedFixedTime;
    @XmlElement(name = "ComputedVariableTime")
    protected Duration computedVariableTime;
    @XmlElementRef(name = "Description", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "FixedTimePercentChange")
    protected Double fixedTimePercentChange;
    @XmlElement(name = "Helper")
    protected Boolean helper;
    @XmlElementRef(name = "Identifier", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElement(name = "LocationEntityKey")
    protected Long locationEntityKey;
    @XmlElement(name = "PercentAcceptedDeliveries")
    protected Double percentAcceptedDeliveries;
    @XmlElement(name = "PreviousFixedTime")
    protected Duration previousFixedTime;
    @XmlElement(name = "PreviousVariableTime")
    protected Duration previousVariableTime;
    @XmlElementRef(name = "ServiceLocationCategory", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceLocationCategory> serviceLocationCategory;
    @XmlElementRef(name = "ServiceTimeUpdateReport_ErrorCode_Status", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceTimeUpdateReportErrorCodeStatus;
    @XmlElementRef(name = "ServiceTimeUpdateReport_RejectCode_UpdateStatus", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceTimeUpdateReportRejectCodeUpdateStatus;
    @XmlElement(name = "TotalDeliveries")
    protected Integer totalDeliveries;
    @XmlElement(name = "VariableTimePercentChange")
    protected Double variableTimePercentChange;

    /**
     * Obtém o valor da propriedade acceptedDeliveries.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAcceptedDeliveries() {
        return acceptedDeliveries;
    }

    /**
     * Define o valor da propriedade acceptedDeliveries.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAcceptedDeliveries(Integer value) {
        this.acceptedDeliveries = value;
    }

    /**
     * Obtém o valor da propriedade bulk.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBulk() {
        return bulk;
    }

    /**
     * Define o valor da propriedade bulk.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBulk(Boolean value) {
        this.bulk = value;
    }

    /**
     * Obtém o valor da propriedade computedFixedTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getComputedFixedTime() {
        return computedFixedTime;
    }

    /**
     * Define o valor da propriedade computedFixedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setComputedFixedTime(Duration value) {
        this.computedFixedTime = value;
    }

    /**
     * Obtém o valor da propriedade computedVariableTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getComputedVariableTime() {
        return computedVariableTime;
    }

    /**
     * Define o valor da propriedade computedVariableTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setComputedVariableTime(Duration value) {
        this.computedVariableTime = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade fixedTimePercentChange.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFixedTimePercentChange() {
        return fixedTimePercentChange;
    }

    /**
     * Define o valor da propriedade fixedTimePercentChange.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFixedTimePercentChange(Double value) {
        this.fixedTimePercentChange = value;
    }

    /**
     * Obtém o valor da propriedade helper.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHelper() {
        return helper;
    }

    /**
     * Define o valor da propriedade helper.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHelper(Boolean value) {
        this.helper = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentifier(JAXBElement<String> value) {
        this.identifier = value;
    }

    /**
     * Obtém o valor da propriedade locationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLocationEntityKey() {
        return locationEntityKey;
    }

    /**
     * Define o valor da propriedade locationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLocationEntityKey(Long value) {
        this.locationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade percentAcceptedDeliveries.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentAcceptedDeliveries() {
        return percentAcceptedDeliveries;
    }

    /**
     * Define o valor da propriedade percentAcceptedDeliveries.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentAcceptedDeliveries(Double value) {
        this.percentAcceptedDeliveries = value;
    }

    /**
     * Obtém o valor da propriedade previousFixedTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPreviousFixedTime() {
        return previousFixedTime;
    }

    /**
     * Define o valor da propriedade previousFixedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPreviousFixedTime(Duration value) {
        this.previousFixedTime = value;
    }

    /**
     * Obtém o valor da propriedade previousVariableTime.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPreviousVariableTime() {
        return previousVariableTime;
    }

    /**
     * Define o valor da propriedade previousVariableTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPreviousVariableTime(Duration value) {
        this.previousVariableTime = value;
    }

    /**
     * Obtém o valor da propriedade serviceLocationCategory.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceLocationCategory }{@code >}
     *     
     */
    public JAXBElement<ServiceLocationCategory> getServiceLocationCategory() {
        return serviceLocationCategory;
    }

    /**
     * Define o valor da propriedade serviceLocationCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceLocationCategory }{@code >}
     *     
     */
    public void setServiceLocationCategory(JAXBElement<ServiceLocationCategory> value) {
        this.serviceLocationCategory = value;
    }

    /**
     * Obtém o valor da propriedade serviceTimeUpdateReportErrorCodeStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceTimeUpdateReportErrorCodeStatus() {
        return serviceTimeUpdateReportErrorCodeStatus;
    }

    /**
     * Define o valor da propriedade serviceTimeUpdateReportErrorCodeStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceTimeUpdateReportErrorCodeStatus(JAXBElement<String> value) {
        this.serviceTimeUpdateReportErrorCodeStatus = value;
    }

    /**
     * Obtém o valor da propriedade serviceTimeUpdateReportRejectCodeUpdateStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceTimeUpdateReportRejectCodeUpdateStatus() {
        return serviceTimeUpdateReportRejectCodeUpdateStatus;
    }

    /**
     * Define o valor da propriedade serviceTimeUpdateReportRejectCodeUpdateStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceTimeUpdateReportRejectCodeUpdateStatus(JAXBElement<String> value) {
        this.serviceTimeUpdateReportRejectCodeUpdateStatus = value;
    }

    /**
     * Obtém o valor da propriedade totalDeliveries.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalDeliveries() {
        return totalDeliveries;
    }

    /**
     * Define o valor da propriedade totalDeliveries.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalDeliveries(Integer value) {
        this.totalDeliveries = value;
    }

    /**
     * Obtém o valor da propriedade variableTimePercentChange.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVariableTimePercentChange() {
        return variableTimePercentChange;
    }

    /**
     * Define o valor da propriedade variableTimePercentChange.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVariableTimePercentChange(Double value) {
        this.variableTimePercentChange = value;
    }

}
