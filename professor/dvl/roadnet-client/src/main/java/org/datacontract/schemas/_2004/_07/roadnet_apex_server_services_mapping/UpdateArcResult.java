
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.NetworkArc;


/**
 * <p>Classe Java de UpdateArcResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UpdateArcResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorInfo" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}MappingErrorInfo" minOccurs="0"/&gt;
 *         &lt;element name="SplitArcsInfo" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}ArrayOfNetworkSplitArcInfo" minOccurs="0"/&gt;
 *         &lt;element name="UpdatedNetworkArc" type="{http://roadnet.com/apex/DataContracts/}NetworkArc" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateArcResult", propOrder = {
    "errorInfo",
    "splitArcsInfo",
    "updatedNetworkArc"
})
public class UpdateArcResult {

    @XmlElementRef(name = "ErrorInfo", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<MappingErrorInfo> errorInfo;
    @XmlElementRef(name = "SplitArcsInfo", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNetworkSplitArcInfo> splitArcsInfo;
    @XmlElementRef(name = "UpdatedNetworkArc", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkArc> updatedNetworkArc;

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
     * Obtém o valor da propriedade splitArcsInfo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkSplitArcInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNetworkSplitArcInfo> getSplitArcsInfo() {
        return splitArcsInfo;
    }

    /**
     * Define o valor da propriedade splitArcsInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkSplitArcInfo }{@code >}
     *     
     */
    public void setSplitArcsInfo(JAXBElement<ArrayOfNetworkSplitArcInfo> value) {
        this.splitArcsInfo = value;
    }

    /**
     * Obtém o valor da propriedade updatedNetworkArc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkArc }{@code >}
     *     
     */
    public JAXBElement<NetworkArc> getUpdatedNetworkArc() {
        return updatedNetworkArc;
    }

    /**
     * Define o valor da propriedade updatedNetworkArc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkArc }{@code >}
     *     
     */
    public void setUpdatedNetworkArc(JAXBElement<NetworkArc> value) {
        this.updatedNetworkArc = value;
    }

}
