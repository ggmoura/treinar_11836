
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;


/**
 * <p>Classe Java de ReportGroupMemberParameter complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ReportGroupMemberParameter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParameterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReportParameterDefinition_ParameterValueType_ParameterValueType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportGroupMemberParameter", propOrder = {
    "parameterName",
    "reportParameterDefinitionParameterValueTypeParameterValueType",
    "value"
})
public class ReportGroupMemberParameter
    extends DomainEntity
{

    @XmlElementRef(name = "ParameterName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parameterName;
    @XmlElementRef(name = "ReportParameterDefinition_ParameterValueType_ParameterValueType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportParameterDefinitionParameterValueTypeParameterValueType;
    @XmlElementRef(name = "Value", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> value;

    /**
     * Obtém o valor da propriedade parameterName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParameterName() {
        return parameterName;
    }

    /**
     * Define o valor da propriedade parameterName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParameterName(JAXBElement<String> value) {
        this.parameterName = value;
    }

    /**
     * Obtém o valor da propriedade reportParameterDefinitionParameterValueTypeParameterValueType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportParameterDefinitionParameterValueTypeParameterValueType() {
        return reportParameterDefinitionParameterValueTypeParameterValueType;
    }

    /**
     * Define o valor da propriedade reportParameterDefinitionParameterValueTypeParameterValueType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportParameterDefinitionParameterValueTypeParameterValueType(JAXBElement<String> value) {
        this.reportParameterDefinitionParameterValueTypeParameterValueType = value;
    }

    /**
     * Obtém o valor da propriedade value.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getValue() {
        return value;
    }

    /**
     * Define o valor da propriedade value.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setValue(JAXBElement<Object> value) {
        this.value = value;
    }

}
