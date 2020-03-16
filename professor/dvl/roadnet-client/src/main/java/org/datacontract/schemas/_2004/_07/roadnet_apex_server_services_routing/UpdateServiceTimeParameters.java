
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de UpdateServiceTimeParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UpdateServiceTimeParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="FixedTimeMaxVariance" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="FixedTimeOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ItemType" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.ServiceTimeUpdater}UpdateServiceTimeParameters.ServiceItemType" minOccurs="0"/&gt;
 *         &lt;element name="MinAcceptedDeliveries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MinAcceptedPercentage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="OrderClassEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ReportOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SetToLimits" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="VariableTimeMaxVariancePercentage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateServiceTimeParameters", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.ServiceTimeUpdater", propOrder = {
    "endDate",
    "fixedTimeMaxVariance",
    "fixedTimeOnly",
    "itemType",
    "minAcceptedDeliveries",
    "minAcceptedPercentage",
    "orderClassEntityKey",
    "reportOnly",
    "setToLimits",
    "startDate",
    "variableTimeMaxVariancePercentage"
})
public class UpdateServiceTimeParameters
    extends DataTransferObject
{

    @XmlElementRef(name = "EndDate", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.ServiceTimeUpdater", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> endDate;
    @XmlElementRef(name = "FixedTimeMaxVariance", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.ServiceTimeUpdater", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> fixedTimeMaxVariance;
    @XmlElement(name = "FixedTimeOnly")
    protected Boolean fixedTimeOnly;
    @XmlElement(name = "ItemType")
    @XmlSchemaType(name = "string")
    protected UpdateServiceTimeParametersServiceItemType itemType;
    @XmlElement(name = "MinAcceptedDeliveries")
    protected Integer minAcceptedDeliveries;
    @XmlElement(name = "MinAcceptedPercentage")
    protected Double minAcceptedPercentage;
    @XmlElement(name = "OrderClassEntityKey")
    protected Long orderClassEntityKey;
    @XmlElement(name = "ReportOnly")
    protected Boolean reportOnly;
    @XmlElement(name = "SetToLimits")
    protected Boolean setToLimits;
    @XmlElementRef(name = "StartDate", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.ServiceTimeUpdater", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startDate;
    @XmlElementRef(name = "VariableTimeMaxVariancePercentage", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.ServiceTimeUpdater", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> variableTimeMaxVariancePercentage;

    /**
     * Obtém o valor da propriedade endDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEndDate() {
        return endDate;
    }

    /**
     * Define o valor da propriedade endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.endDate = value;
    }

    /**
     * Obtém o valor da propriedade fixedTimeMaxVariance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getFixedTimeMaxVariance() {
        return fixedTimeMaxVariance;
    }

    /**
     * Define o valor da propriedade fixedTimeMaxVariance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setFixedTimeMaxVariance(JAXBElement<Duration> value) {
        this.fixedTimeMaxVariance = value;
    }

    /**
     * Obtém o valor da propriedade fixedTimeOnly.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFixedTimeOnly() {
        return fixedTimeOnly;
    }

    /**
     * Define o valor da propriedade fixedTimeOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixedTimeOnly(Boolean value) {
        this.fixedTimeOnly = value;
    }

    /**
     * Obtém o valor da propriedade itemType.
     * 
     * @return
     *     possible object is
     *     {@link UpdateServiceTimeParametersServiceItemType }
     *     
     */
    public UpdateServiceTimeParametersServiceItemType getItemType() {
        return itemType;
    }

    /**
     * Define o valor da propriedade itemType.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateServiceTimeParametersServiceItemType }
     *     
     */
    public void setItemType(UpdateServiceTimeParametersServiceItemType value) {
        this.itemType = value;
    }

    /**
     * Obtém o valor da propriedade minAcceptedDeliveries.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinAcceptedDeliveries() {
        return minAcceptedDeliveries;
    }

    /**
     * Define o valor da propriedade minAcceptedDeliveries.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinAcceptedDeliveries(Integer value) {
        this.minAcceptedDeliveries = value;
    }

    /**
     * Obtém o valor da propriedade minAcceptedPercentage.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinAcceptedPercentage() {
        return minAcceptedPercentage;
    }

    /**
     * Define o valor da propriedade minAcceptedPercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinAcceptedPercentage(Double value) {
        this.minAcceptedPercentage = value;
    }

    /**
     * Obtém o valor da propriedade orderClassEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrderClassEntityKey() {
        return orderClassEntityKey;
    }

    /**
     * Define o valor da propriedade orderClassEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrderClassEntityKey(Long value) {
        this.orderClassEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade reportOnly.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReportOnly() {
        return reportOnly;
    }

    /**
     * Define o valor da propriedade reportOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReportOnly(Boolean value) {
        this.reportOnly = value;
    }

    /**
     * Obtém o valor da propriedade setToLimits.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSetToLimits() {
        return setToLimits;
    }

    /**
     * Define o valor da propriedade setToLimits.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSetToLimits(Boolean value) {
        this.setToLimits = value;
    }

    /**
     * Obtém o valor da propriedade startDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartDate() {
        return startDate;
    }

    /**
     * Define o valor da propriedade startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.startDate = value;
    }

    /**
     * Obtém o valor da propriedade variableTimeMaxVariancePercentage.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getVariableTimeMaxVariancePercentage() {
        return variableTimeMaxVariancePercentage;
    }

    /**
     * Define o valor da propriedade variableTimeMaxVariancePercentage.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setVariableTimeMaxVariancePercentage(JAXBElement<Double> value) {
        this.variableTimeMaxVariancePercentage = value;
    }

}
