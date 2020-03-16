
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.NetworkArcCandidatePropertyOptions;
import com.roadnet.apex.datacontracts.NetworkPOICandidatePropertyOptions;
import com.roadnet.apex.datacontracts.NetworkPointAddressCandidatePropertyOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyInclusionMode;


/**
 * <p>Classe Java de GeocodeOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GeocodeOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NetworkArcCandidatePropertyInclusionMode" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyInclusionMode" minOccurs="0"/&gt;
 *         &lt;element name="NetworkArcCandidatePropertyOptions" type="{http://roadnet.com/apex/DataContracts/}NetworkArcCandidatePropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="NetworkPOICandidatePropertyInclusionMode" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyInclusionMode" minOccurs="0"/&gt;
 *         &lt;element name="NetworkPOICandidatePropertyOptions" type="{http://roadnet.com/apex/DataContracts/}NetworkPOICandidatePropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="NetworkPointAddressCandidatePropertyInclusionMode" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyInclusionMode" minOccurs="0"/&gt;
 *         &lt;element name="NetworkPointAddressCandidatePropertyOptions" type="{http://roadnet.com/apex/DataContracts/}NetworkPointAddressCandidatePropertyOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeocodeOptions", propOrder = {
    "networkArcCandidatePropertyInclusionMode",
    "networkArcCandidatePropertyOptions",
    "networkPOICandidatePropertyInclusionMode",
    "networkPOICandidatePropertyOptions",
    "networkPointAddressCandidatePropertyInclusionMode",
    "networkPointAddressCandidatePropertyOptions"
})
public class GeocodeOptions
    extends DataTransferObject
{

    @XmlElement(name = "NetworkArcCandidatePropertyInclusionMode")
    @XmlSchemaType(name = "string")
    protected PropertyInclusionMode networkArcCandidatePropertyInclusionMode;
    @XmlElementRef(name = "NetworkArcCandidatePropertyOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkArcCandidatePropertyOptions> networkArcCandidatePropertyOptions;
    @XmlElement(name = "NetworkPOICandidatePropertyInclusionMode")
    @XmlSchemaType(name = "string")
    protected PropertyInclusionMode networkPOICandidatePropertyInclusionMode;
    @XmlElementRef(name = "NetworkPOICandidatePropertyOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkPOICandidatePropertyOptions> networkPOICandidatePropertyOptions;
    @XmlElement(name = "NetworkPointAddressCandidatePropertyInclusionMode")
    @XmlSchemaType(name = "string")
    protected PropertyInclusionMode networkPointAddressCandidatePropertyInclusionMode;
    @XmlElementRef(name = "NetworkPointAddressCandidatePropertyOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkPointAddressCandidatePropertyOptions> networkPointAddressCandidatePropertyOptions;

    /**
     * Obtém o valor da propriedade networkArcCandidatePropertyInclusionMode.
     * 
     * @return
     *     possible object is
     *     {@link PropertyInclusionMode }
     *     
     */
    public PropertyInclusionMode getNetworkArcCandidatePropertyInclusionMode() {
        return networkArcCandidatePropertyInclusionMode;
    }

    /**
     * Define o valor da propriedade networkArcCandidatePropertyInclusionMode.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyInclusionMode }
     *     
     */
    public void setNetworkArcCandidatePropertyInclusionMode(PropertyInclusionMode value) {
        this.networkArcCandidatePropertyInclusionMode = value;
    }

    /**
     * Obtém o valor da propriedade networkArcCandidatePropertyOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkArcCandidatePropertyOptions }{@code >}
     *     
     */
    public JAXBElement<NetworkArcCandidatePropertyOptions> getNetworkArcCandidatePropertyOptions() {
        return networkArcCandidatePropertyOptions;
    }

    /**
     * Define o valor da propriedade networkArcCandidatePropertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkArcCandidatePropertyOptions }{@code >}
     *     
     */
    public void setNetworkArcCandidatePropertyOptions(JAXBElement<NetworkArcCandidatePropertyOptions> value) {
        this.networkArcCandidatePropertyOptions = value;
    }

    /**
     * Obtém o valor da propriedade networkPOICandidatePropertyInclusionMode.
     * 
     * @return
     *     possible object is
     *     {@link PropertyInclusionMode }
     *     
     */
    public PropertyInclusionMode getNetworkPOICandidatePropertyInclusionMode() {
        return networkPOICandidatePropertyInclusionMode;
    }

    /**
     * Define o valor da propriedade networkPOICandidatePropertyInclusionMode.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyInclusionMode }
     *     
     */
    public void setNetworkPOICandidatePropertyInclusionMode(PropertyInclusionMode value) {
        this.networkPOICandidatePropertyInclusionMode = value;
    }

    /**
     * Obtém o valor da propriedade networkPOICandidatePropertyOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkPOICandidatePropertyOptions }{@code >}
     *     
     */
    public JAXBElement<NetworkPOICandidatePropertyOptions> getNetworkPOICandidatePropertyOptions() {
        return networkPOICandidatePropertyOptions;
    }

    /**
     * Define o valor da propriedade networkPOICandidatePropertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkPOICandidatePropertyOptions }{@code >}
     *     
     */
    public void setNetworkPOICandidatePropertyOptions(JAXBElement<NetworkPOICandidatePropertyOptions> value) {
        this.networkPOICandidatePropertyOptions = value;
    }

    /**
     * Obtém o valor da propriedade networkPointAddressCandidatePropertyInclusionMode.
     * 
     * @return
     *     possible object is
     *     {@link PropertyInclusionMode }
     *     
     */
    public PropertyInclusionMode getNetworkPointAddressCandidatePropertyInclusionMode() {
        return networkPointAddressCandidatePropertyInclusionMode;
    }

    /**
     * Define o valor da propriedade networkPointAddressCandidatePropertyInclusionMode.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyInclusionMode }
     *     
     */
    public void setNetworkPointAddressCandidatePropertyInclusionMode(PropertyInclusionMode value) {
        this.networkPointAddressCandidatePropertyInclusionMode = value;
    }

    /**
     * Obtém o valor da propriedade networkPointAddressCandidatePropertyOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkPointAddressCandidatePropertyOptions }{@code >}
     *     
     */
    public JAXBElement<NetworkPointAddressCandidatePropertyOptions> getNetworkPointAddressCandidatePropertyOptions() {
        return networkPointAddressCandidatePropertyOptions;
    }

    /**
     * Define o valor da propriedade networkPointAddressCandidatePropertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkPointAddressCandidatePropertyOptions }{@code >}
     *     
     */
    public void setNetworkPointAddressCandidatePropertyOptions(JAXBElement<NetworkPointAddressCandidatePropertyOptions> value) {
        this.networkPointAddressCandidatePropertyOptions = value;
    }

}
