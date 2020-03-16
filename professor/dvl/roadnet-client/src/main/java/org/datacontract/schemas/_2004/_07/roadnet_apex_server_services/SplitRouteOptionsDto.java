
package org.datacontract.schemas._2004._07.roadnet_apex_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfStopIdentity;


/**
 * <p>Classe Java de SplitRouteOptionsDto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SplitRouteOptionsDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StopIdentities" type="{http://roadnet.com/apex/DataContracts/}ArrayOfStop.Identity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitRouteOptionsDto", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", propOrder = {
    "identifier",
    "stopIdentities"
})
public class SplitRouteOptionsDto
    extends DataTransferObject
{

    @XmlElementRef(name = "Identifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identifier;
    @XmlElementRef(name = "StopIdentities", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStopIdentity> stopIdentities;

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentifier(JAXBElement<String> value) {
        this.identifier = value;
    }

    /**
     * Obtém o valor da propriedade stopIdentities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStopIdentity }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStopIdentity> getStopIdentities() {
        return stopIdentities;
    }

    /**
     * Define o valor da propriedade stopIdentities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStopIdentity }{@code >}
     *     
     */
    public void setStopIdentities(JAXBElement<ArrayOfStopIdentity> value) {
        this.stopIdentities = value;
    }

}
