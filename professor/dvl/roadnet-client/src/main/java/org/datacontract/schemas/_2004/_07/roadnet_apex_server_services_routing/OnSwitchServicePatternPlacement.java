
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.Quantities;


/**
 * <p>Classe Java de OnSwitchServicePatternPlacement complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OnSwitchServicePatternPlacement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}RecurringOrderPlacement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeliveryQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="ServicePatternEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ServicePatternSetEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="StartingWeek" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TerritoryEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnSwitchServicePatternPlacement", propOrder = {
    "deliveryQuantities",
    "servicePatternEntityKey",
    "servicePatternSetEntityKey",
    "startingWeek",
    "territoryEntityKey"
})
public class OnSwitchServicePatternPlacement
    extends RecurringOrderPlacement
{

    @XmlElementRef(name = "DeliveryQuantities", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> deliveryQuantities;
    @XmlElement(name = "ServicePatternEntityKey")
    protected Long servicePatternEntityKey;
    @XmlElement(name = "ServicePatternSetEntityKey")
    protected Long servicePatternSetEntityKey;
    @XmlElement(name = "StartingWeek")
    protected Integer startingWeek;
    @XmlElement(name = "TerritoryEntityKey")
    protected Long territoryEntityKey;

    /**
     * Obtém o valor da propriedade deliveryQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getDeliveryQuantities() {
        return deliveryQuantities;
    }

    /**
     * Define o valor da propriedade deliveryQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setDeliveryQuantities(JAXBElement<Quantities> value) {
        this.deliveryQuantities = value;
    }

    /**
     * Obtém o valor da propriedade servicePatternEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServicePatternEntityKey() {
        return servicePatternEntityKey;
    }

    /**
     * Define o valor da propriedade servicePatternEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServicePatternEntityKey(Long value) {
        this.servicePatternEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade servicePatternSetEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServicePatternSetEntityKey() {
        return servicePatternSetEntityKey;
    }

    /**
     * Define o valor da propriedade servicePatternSetEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServicePatternSetEntityKey(Long value) {
        this.servicePatternSetEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade startingWeek.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartingWeek() {
        return startingWeek;
    }

    /**
     * Define o valor da propriedade startingWeek.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartingWeek(Integer value) {
        this.startingWeek = value;
    }

    /**
     * Obtém o valor da propriedade territoryEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTerritoryEntityKey() {
        return territoryEntityKey;
    }

    /**
     * Define o valor da propriedade territoryEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTerritoryEntityKey(Long value) {
        this.territoryEntityKey = value;
    }

}
