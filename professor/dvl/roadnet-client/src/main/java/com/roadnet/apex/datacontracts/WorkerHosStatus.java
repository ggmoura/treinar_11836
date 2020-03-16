
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de WorkerHosStatus complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="WorkerHosStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BerthTimeToday" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="DriveTimeToday" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="DutyTimeRemainingThisWeek" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="LastDutyStatusChange" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastHosUpdateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OffDutyTimeToday" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="OnDutyTimeToday" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="RemainingDriveTimeToday" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="RemainingDutyTimeToday" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="WorkerDutyStatus_LastKnownDutyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkerHosStatus", propOrder = {
    "berthTimeToday",
    "driveTimeToday",
    "dutyTimeRemainingThisWeek",
    "lastDutyStatusChange",
    "lastHosUpdateTime",
    "offDutyTimeToday",
    "onDutyTimeToday",
    "remainingDriveTimeToday",
    "remainingDutyTimeToday",
    "workerDutyStatusLastKnownDutyStatus"
})
public class WorkerHosStatus
    extends DataTransferObject
{

    @XmlElementRef(name = "BerthTimeToday", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> berthTimeToday;
    @XmlElementRef(name = "DriveTimeToday", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> driveTimeToday;
    @XmlElementRef(name = "DutyTimeRemainingThisWeek", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> dutyTimeRemainingThisWeek;
    @XmlElementRef(name = "LastDutyStatusChange", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastDutyStatusChange;
    @XmlElementRef(name = "LastHosUpdateTime", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastHosUpdateTime;
    @XmlElementRef(name = "OffDutyTimeToday", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> offDutyTimeToday;
    @XmlElementRef(name = "OnDutyTimeToday", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> onDutyTimeToday;
    @XmlElementRef(name = "RemainingDriveTimeToday", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> remainingDriveTimeToday;
    @XmlElementRef(name = "RemainingDutyTimeToday", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> remainingDutyTimeToday;
    @XmlElementRef(name = "WorkerDutyStatus_LastKnownDutyStatus", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workerDutyStatusLastKnownDutyStatus;

    /**
     * Obtém o valor da propriedade berthTimeToday.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getBerthTimeToday() {
        return berthTimeToday;
    }

    /**
     * Define o valor da propriedade berthTimeToday.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setBerthTimeToday(JAXBElement<Duration> value) {
        this.berthTimeToday = value;
    }

    /**
     * Obtém o valor da propriedade driveTimeToday.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getDriveTimeToday() {
        return driveTimeToday;
    }

    /**
     * Define o valor da propriedade driveTimeToday.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setDriveTimeToday(JAXBElement<Duration> value) {
        this.driveTimeToday = value;
    }

    /**
     * Obtém o valor da propriedade dutyTimeRemainingThisWeek.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getDutyTimeRemainingThisWeek() {
        return dutyTimeRemainingThisWeek;
    }

    /**
     * Define o valor da propriedade dutyTimeRemainingThisWeek.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setDutyTimeRemainingThisWeek(JAXBElement<Duration> value) {
        this.dutyTimeRemainingThisWeek = value;
    }

    /**
     * Obtém o valor da propriedade lastDutyStatusChange.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastDutyStatusChange() {
        return lastDutyStatusChange;
    }

    /**
     * Define o valor da propriedade lastDutyStatusChange.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastDutyStatusChange(JAXBElement<XMLGregorianCalendar> value) {
        this.lastDutyStatusChange = value;
    }

    /**
     * Obtém o valor da propriedade lastHosUpdateTime.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastHosUpdateTime() {
        return lastHosUpdateTime;
    }

    /**
     * Define o valor da propriedade lastHosUpdateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastHosUpdateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.lastHosUpdateTime = value;
    }

    /**
     * Obtém o valor da propriedade offDutyTimeToday.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getOffDutyTimeToday() {
        return offDutyTimeToday;
    }

    /**
     * Define o valor da propriedade offDutyTimeToday.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setOffDutyTimeToday(JAXBElement<Duration> value) {
        this.offDutyTimeToday = value;
    }

    /**
     * Obtém o valor da propriedade onDutyTimeToday.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getOnDutyTimeToday() {
        return onDutyTimeToday;
    }

    /**
     * Define o valor da propriedade onDutyTimeToday.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setOnDutyTimeToday(JAXBElement<Duration> value) {
        this.onDutyTimeToday = value;
    }

    /**
     * Obtém o valor da propriedade remainingDriveTimeToday.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getRemainingDriveTimeToday() {
        return remainingDriveTimeToday;
    }

    /**
     * Define o valor da propriedade remainingDriveTimeToday.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setRemainingDriveTimeToday(JAXBElement<Duration> value) {
        this.remainingDriveTimeToday = value;
    }

    /**
     * Obtém o valor da propriedade remainingDutyTimeToday.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getRemainingDutyTimeToday() {
        return remainingDutyTimeToday;
    }

    /**
     * Define o valor da propriedade remainingDutyTimeToday.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setRemainingDutyTimeToday(JAXBElement<Duration> value) {
        this.remainingDutyTimeToday = value;
    }

    /**
     * Obtém o valor da propriedade workerDutyStatusLastKnownDutyStatus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkerDutyStatusLastKnownDutyStatus() {
        return workerDutyStatusLastKnownDutyStatus;
    }

    /**
     * Define o valor da propriedade workerDutyStatusLastKnownDutyStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkerDutyStatusLastKnownDutyStatus(JAXBElement<String> value) {
        this.workerDutyStatusLastKnownDutyStatus = value;
    }

}
