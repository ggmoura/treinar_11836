
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de ReportGroupMemberParameterPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ReportGroupMemberParameterPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParameterName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReportEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReportParameterDefinition_ParameterValueType_ParameterValueType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportGroupMemberParameterPropertyOptions", propOrder = {
    "parameterName",
    "reportEntityKey",
    "reportParameterDefinitionParameterValueTypeParameterValueType",
    "value"
})
public class ReportGroupMemberParameterPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "ParameterName")
    protected Boolean parameterName;
    @XmlElement(name = "ReportEntityKey")
    protected Boolean reportEntityKey;
    @XmlElement(name = "ReportParameterDefinition_ParameterValueType_ParameterValueType")
    protected Boolean reportParameterDefinitionParameterValueTypeParameterValueType;
    @XmlElement(name = "Value")
    protected Boolean value;

    /**
     * Obtém o valor da propriedade parameterName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParameterName() {
        return parameterName;
    }

    /**
     * Define o valor da propriedade parameterName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParameterName(Boolean value) {
        this.parameterName = value;
    }

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
     * Obtém o valor da propriedade reportParameterDefinitionParameterValueTypeParameterValueType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReportParameterDefinitionParameterValueTypeParameterValueType() {
        return reportParameterDefinitionParameterValueTypeParameterValueType;
    }

    /**
     * Define o valor da propriedade reportParameterDefinitionParameterValueTypeParameterValueType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReportParameterDefinitionParameterValueTypeParameterValueType(Boolean value) {
        this.reportParameterDefinitionParameterValueTypeParameterValueType = value;
    }

    /**
     * Obtém o valor da propriedade value.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValue() {
        return value;
    }

    /**
     * Define o valor da propriedade value.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValue(Boolean value) {
        this.value = value;
    }

}
