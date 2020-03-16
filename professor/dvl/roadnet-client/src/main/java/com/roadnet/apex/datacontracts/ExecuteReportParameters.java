
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de ExecuteReportParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ExecuteReportParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OutputFormatType_OutputFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Parameters" type="{http://roadnet.com/apex/DataContracts/}ArrayOfReportParameter" minOccurs="0"/&gt;
 *         &lt;element name="ReportEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecuteReportParameters", propOrder = {
    "outputFormatTypeOutputFormat",
    "parameters",
    "reportEntityKey"
})
public class ExecuteReportParameters
    extends DataTransferObject
{

    @XmlElementRef(name = "OutputFormatType_OutputFormat", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outputFormatTypeOutputFormat;
    @XmlElementRef(name = "Parameters", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfReportParameter> parameters;
    @XmlElement(name = "ReportEntityKey")
    protected Long reportEntityKey;

    /**
     * Obtém o valor da propriedade outputFormatTypeOutputFormat.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutputFormatTypeOutputFormat() {
        return outputFormatTypeOutputFormat;
    }

    /**
     * Define o valor da propriedade outputFormatTypeOutputFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutputFormatTypeOutputFormat(JAXBElement<String> value) {
        this.outputFormatTypeOutputFormat = value;
    }

    /**
     * Obtém o valor da propriedade parameters.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReportParameter }{@code >}
     *     
     */
    public JAXBElement<ArrayOfReportParameter> getParameters() {
        return parameters;
    }

    /**
     * Define o valor da propriedade parameters.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReportParameter }{@code >}
     *     
     */
    public void setParameters(JAXBElement<ArrayOfReportParameter> value) {
        this.parameters = value;
    }

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

}
