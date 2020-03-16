
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;


/**
 * <p>Classe Java de ReportGroupMember complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ReportGroupMember"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReportEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ReportGroupMemberParameters" type="{http://roadnet.com/apex/DataContracts/}ArrayOfReportGroupMemberParameter" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportGroupMember", propOrder = {
    "reportEntityKey",
    "reportGroupMemberParameters"
})
public class ReportGroupMember
    extends DomainEntity
{

    @XmlElement(name = "ReportEntityKey")
    protected Long reportEntityKey;
    @XmlElementRef(name = "ReportGroupMemberParameters", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfReportGroupMemberParameter> reportGroupMemberParameters;

    /**
     * Obtém o valor da propriedade reportEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReportEntityKey() {
        return reportEntityKey;
    }

    /**
     * Define o valor da propriedade reportEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReportEntityKey(Long value) {
        this.reportEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade reportGroupMemberParameters.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReportGroupMemberParameter }{@code >}
     *     
     */
    public JAXBElement<ArrayOfReportGroupMemberParameter> getReportGroupMemberParameters() {
        return reportGroupMemberParameters;
    }

    /**
     * Define o valor da propriedade reportGroupMemberParameters.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReportGroupMemberParameter }{@code >}
     *     
     */
    public void setReportGroupMemberParameters(JAXBElement<ArrayOfReportGroupMemberParameter> value) {
        this.reportGroupMemberParameters = value;
    }

}
