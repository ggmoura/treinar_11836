
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import com.roadnet.apex.datacontracts.AggregateRootEntity;


/**
 * <p>Classe Java de DataWarehouseKpiSchedule complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseKpiSchedule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}AggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CultureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataWarehouseKpiOutputType_OutputType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailRecipients" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="ExecutionTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="KpiEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="KpiName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastRunTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Options" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}MeasureUnitOptions" minOccurs="0"/&gt;
 *         &lt;element name="WorldTimeZone_TimeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseKpiSchedule", propOrder = {
    "cultureName",
    "dataWarehouseKpiOutputTypeOutputType",
    "description",
    "emailRecipients",
    "executionTime",
    "kpiEntityKey",
    "kpiName",
    "lastRunTime",
    "options",
    "worldTimeZoneTimeZone"
})
@XmlSeeAlso({
    DataWarehouseDailyKpiSchedule.class,
    DataWarehouseMonthlyKpiSchedule.class
})
public class DataWarehouseKpiSchedule
    extends AggregateRootEntity
{

    @XmlElementRef(name = "CultureName", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cultureName;
    @XmlElementRef(name = "DataWarehouseKpiOutputType_OutputType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseKpiOutputTypeOutputType;
    @XmlElementRef(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "EmailRecipients", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> emailRecipients;
    @XmlElementRef(name = "ExecutionTime", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> executionTime;
    @XmlElement(name = "KpiEntityKey")
    protected Long kpiEntityKey;
    @XmlElementRef(name = "KpiName", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> kpiName;
    @XmlElementRef(name = "LastRunTime", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastRunTime;
    @XmlElementRef(name = "Options", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<MeasureUnitOptions> options;
    @XmlElementRef(name = "WorldTimeZone_TimeZone", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> worldTimeZoneTimeZone;

    /**
     * Obtém o valor da propriedade cultureName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCultureName() {
        return cultureName;
    }

    /**
     * Define o valor da propriedade cultureName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCultureName(JAXBElement<String> value) {
        this.cultureName = value;
    }

    /**
     * Obtém o valor da propriedade dataWarehouseKpiOutputTypeOutputType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseKpiOutputTypeOutputType() {
        return dataWarehouseKpiOutputTypeOutputType;
    }

    /**
     * Define o valor da propriedade dataWarehouseKpiOutputTypeOutputType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseKpiOutputTypeOutputType(JAXBElement<String> value) {
        this.dataWarehouseKpiOutputTypeOutputType = value;
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
     * Obtém o valor da propriedade emailRecipients.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getEmailRecipients() {
        return emailRecipients;
    }

    /**
     * Define o valor da propriedade emailRecipients.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setEmailRecipients(JAXBElement<ArrayOfstring> value) {
        this.emailRecipients = value;
    }

    /**
     * Obtém o valor da propriedade executionTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExecutionTime() {
        return executionTime;
    }

    /**
     * Define o valor da propriedade executionTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExecutionTime(JAXBElement<XMLGregorianCalendar> value) {
        this.executionTime = value;
    }

    /**
     * Obtém o valor da propriedade kpiEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKpiEntityKey() {
        return kpiEntityKey;
    }

    /**
     * Define o valor da propriedade kpiEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKpiEntityKey(Long value) {
        this.kpiEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade kpiName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKpiName() {
        return kpiName;
    }

    /**
     * Define o valor da propriedade kpiName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKpiName(JAXBElement<String> value) {
        this.kpiName = value;
    }

    /**
     * Obtém o valor da propriedade lastRunTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastRunTime() {
        return lastRunTime;
    }

    /**
     * Define o valor da propriedade lastRunTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastRunTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastRunTime = value;
    }

    /**
     * Obtém o valor da propriedade options.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MeasureUnitOptions }{@code >}
     *     
     */
    public JAXBElement<MeasureUnitOptions> getOptions() {
        return options;
    }

    /**
     * Define o valor da propriedade options.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeasureUnitOptions }{@code >}
     *     
     */
    public void setOptions(JAXBElement<MeasureUnitOptions> value) {
        this.options = value;
    }

    /**
     * Obtém o valor da propriedade worldTimeZoneTimeZone.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorldTimeZoneTimeZone() {
        return worldTimeZoneTimeZone;
    }

    /**
     * Define o valor da propriedade worldTimeZoneTimeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorldTimeZoneTimeZone(JAXBElement<String> value) {
        this.worldTimeZoneTimeZone = value;
    }

}
