
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de ReportParameterDefinition complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ReportParameterDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AvailableValues" type="{http://roadnet.com/apex/DataContracts/}ArrayOfParameterValue" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParameterUsageType_UsageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Prompt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReportParameterDefinition_ParameterValueType_ValueType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportParameterDefinition", propOrder = {
    "availableValues",
    "name",
    "parameterUsageTypeUsageType",
    "prompt",
    "reportParameterDefinitionParameterValueTypeValueType"
})
public class ReportParameterDefinition
    extends DataTransferObject
{

    @XmlElementRef(name = "AvailableValues", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfParameterValue> availableValues;
    @XmlElementRef(name = "Name", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "ParameterUsageType_UsageType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parameterUsageTypeUsageType;
    @XmlElementRef(name = "Prompt", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prompt;
    @XmlElementRef(name = "ReportParameterDefinition_ParameterValueType_ValueType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportParameterDefinitionParameterValueTypeValueType;

    /**
     * Obtém o valor da propriedade availableValues.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfParameterValue }{@code >}
     *     
     */
    public JAXBElement<ArrayOfParameterValue> getAvailableValues() {
        return availableValues;
    }

    /**
     * Define o valor da propriedade availableValues.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfParameterValue }{@code >}
     *     
     */
    public void setAvailableValues(JAXBElement<ArrayOfParameterValue> value) {
        this.availableValues = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Obtém o valor da propriedade parameterUsageTypeUsageType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParameterUsageTypeUsageType() {
        return parameterUsageTypeUsageType;
    }

    /**
     * Define o valor da propriedade parameterUsageTypeUsageType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParameterUsageTypeUsageType(JAXBElement<String> value) {
        this.parameterUsageTypeUsageType = value;
    }

    /**
     * Obtém o valor da propriedade prompt.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrompt() {
        return prompt;
    }

    /**
     * Define o valor da propriedade prompt.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrompt(JAXBElement<String> value) {
        this.prompt = value;
    }

    /**
     * Obtém o valor da propriedade reportParameterDefinitionParameterValueTypeValueType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportParameterDefinitionParameterValueTypeValueType() {
        return reportParameterDefinitionParameterValueTypeValueType;
    }

    /**
     * Define o valor da propriedade reportParameterDefinitionParameterValueTypeValueType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportParameterDefinitionParameterValueTypeValueType(JAXBElement<String> value) {
        this.reportParameterDefinitionParameterValueTypeValueType = value;
    }

}
