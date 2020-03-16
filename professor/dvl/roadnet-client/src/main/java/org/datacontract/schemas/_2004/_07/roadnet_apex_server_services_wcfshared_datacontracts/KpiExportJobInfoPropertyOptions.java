
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.RegionBasedAggregateRootEntityPropertyOptions;


/**
 * <p>Classe Java de KpiExportJobInfoPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="KpiExportJobInfoPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionBasedAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FinishTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="JobFailureReason_FailureReason" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="JobState_State" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PercentComplete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ResultOptions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}FileResultPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KpiExportJobInfoPropertyOptions", propOrder = {
    "finishTime",
    "jobFailureReasonFailureReason",
    "jobStateState",
    "percentComplete",
    "result",
    "resultOptions",
    "startTime",
    "userName"
})
public class KpiExportJobInfoPropertyOptions
    extends RegionBasedAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "FinishTime")
    protected Boolean finishTime;
    @XmlElement(name = "JobFailureReason_FailureReason")
    protected Boolean jobFailureReasonFailureReason;
    @XmlElement(name = "JobState_State")
    protected Boolean jobStateState;
    @XmlElement(name = "PercentComplete")
    protected Boolean percentComplete;
    @XmlElement(name = "Result")
    protected Boolean result;
    @XmlElementRef(name = "ResultOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<FileResultPropertyOptions> resultOptions;
    @XmlElement(name = "StartTime")
    protected Boolean startTime;
    @XmlElement(name = "UserName")
    protected Boolean userName;

    /**
     * Obtém o valor da propriedade finishTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFinishTime() {
        return finishTime;
    }

    /**
     * Define o valor da propriedade finishTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinishTime(Boolean value) {
        this.finishTime = value;
    }

    /**
     * Obtém o valor da propriedade jobFailureReasonFailureReason.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJobFailureReasonFailureReason() {
        return jobFailureReasonFailureReason;
    }

    /**
     * Define o valor da propriedade jobFailureReasonFailureReason.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJobFailureReasonFailureReason(Boolean value) {
        this.jobFailureReasonFailureReason = value;
    }

    /**
     * Obtém o valor da propriedade jobStateState.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJobStateState() {
        return jobStateState;
    }

    /**
     * Define o valor da propriedade jobStateState.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJobStateState(Boolean value) {
        this.jobStateState = value;
    }

    /**
     * Obtém o valor da propriedade percentComplete.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPercentComplete() {
        return percentComplete;
    }

    /**
     * Define o valor da propriedade percentComplete.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPercentComplete(Boolean value) {
        this.percentComplete = value;
    }

    /**
     * Obtém o valor da propriedade result.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResult() {
        return result;
    }

    /**
     * Define o valor da propriedade result.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResult(Boolean value) {
        this.result = value;
    }

    /**
     * Obtém o valor da propriedade resultOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FileResultPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<FileResultPropertyOptions> getResultOptions() {
        return resultOptions;
    }

    /**
     * Define o valor da propriedade resultOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FileResultPropertyOptions }{@code >}
     *     
     */
    public void setResultOptions(JAXBElement<FileResultPropertyOptions> value) {
        this.resultOptions = value;
    }

    /**
     * Obtém o valor da propriedade startTime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartTime() {
        return startTime;
    }

    /**
     * Define o valor da propriedade startTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartTime(Boolean value) {
        this.startTime = value;
    }

    /**
     * Obtém o valor da propriedade userName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUserName() {
        return userName;
    }

    /**
     * Define o valor da propriedade userName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUserName(Boolean value) {
        this.userName = value;
    }

}
