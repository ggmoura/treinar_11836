
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OnStopTemplatePlacement complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OnStopTemplatePlacement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}TemplatePlacement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Position_Place" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StopTemplateEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnStopTemplatePlacement", propOrder = {
    "positionPlace",
    "stopTemplateEntityKey"
})
public class OnStopTemplatePlacement
    extends TemplatePlacement
{

    @XmlElementRef(name = "Position_Place", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> positionPlace;
    @XmlElement(name = "StopTemplateEntityKey")
    protected Long stopTemplateEntityKey;

    /**
     * Obtém o valor da propriedade positionPlace.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPositionPlace() {
        return positionPlace;
    }

    /**
     * Define o valor da propriedade positionPlace.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPositionPlace(JAXBElement<String> value) {
        this.positionPlace = value;
    }

    /**
     * Obtém o valor da propriedade stopTemplateEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStopTemplateEntityKey() {
        return stopTemplateEntityKey;
    }

    /**
     * Define o valor da propriedade stopTemplateEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStopTemplateEntityKey(Long value) {
        this.stopTemplateEntityKey = value;
    }

}
