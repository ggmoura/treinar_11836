
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de ReportGroupMemberPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ReportGroupMemberPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReportEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReportGroupMemberParameters" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReportGroupMemberParametersOptions" type="{http://roadnet.com/apex/DataContracts/}ReportGroupMemberParameterPropertyOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportGroupMemberPropertyOptions", propOrder = {
    "reportEntityKey",
    "reportGroupMemberParameters",
    "reportGroupMemberParametersOptions"
})
public class ReportGroupMemberPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "ReportEntityKey")
    protected Boolean reportEntityKey;
    @XmlElement(name = "ReportGroupMemberParameters")
    protected Boolean reportGroupMemberParameters;
    @XmlElementRef(name = "ReportGroupMemberParametersOptions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ReportGroupMemberParameterPropertyOptions> reportGroupMemberParametersOptions;

    /**
     * Obtém o valor da propriedade reportEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReportEntityKey() {
        return reportEntityKey;
    }

    /**
     * Define o valor da propriedade reportEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReportEntityKey(Boolean value) {
        this.reportEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade reportGroupMemberParameters.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReportGroupMemberParameters() {
        return reportGroupMemberParameters;
    }

    /**
     * Define o valor da propriedade reportGroupMemberParameters.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReportGroupMemberParameters(Boolean value) {
        this.reportGroupMemberParameters = value;
    }

    /**
     * Obtém o valor da propriedade reportGroupMemberParametersOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReportGroupMemberParameterPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ReportGroupMemberParameterPropertyOptions> getReportGroupMemberParametersOptions() {
        return reportGroupMemberParametersOptions;
    }

    /**
     * Define o valor da propriedade reportGroupMemberParametersOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReportGroupMemberParameterPropertyOptions }{@code >}
     *     
     */
    public void setReportGroupMemberParametersOptions(JAXBElement<ReportGroupMemberParameterPropertyOptions> value) {
        this.reportGroupMemberParametersOptions = value;
    }

}
