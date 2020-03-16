
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RetrieveEditOperationsResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveEditOperationsResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorInfo" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}MappingErrorInfo" minOccurs="0"/&gt;
 *         &lt;element name="Operations" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}ArrayOfNetworkEditOperation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveEditOperationsResult", propOrder = {
    "errorInfo",
    "operations"
})
public class RetrieveEditOperationsResult {

    @XmlElementRef(name = "ErrorInfo", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<MappingErrorInfo> errorInfo;
    @XmlElementRef(name = "Operations", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNetworkEditOperation> operations;

    /**
     * Obtém o valor da propriedade errorInfo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MappingErrorInfo }{@code >}
     *     
     */
    public JAXBElement<MappingErrorInfo> getErrorInfo() {
        return errorInfo;
    }

    /**
     * Define o valor da propriedade errorInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MappingErrorInfo }{@code >}
     *     
     */
    public void setErrorInfo(JAXBElement<MappingErrorInfo> value) {
        this.errorInfo = value;
    }

    /**
     * Obtém o valor da propriedade operations.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkEditOperation }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNetworkEditOperation> getOperations() {
        return operations;
    }

    /**
     * Define o valor da propriedade operations.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkEditOperation }{@code >}
     *     
     */
    public void setOperations(JAXBElement<ArrayOfNetworkEditOperation> value) {
        this.operations = value;
    }

}
