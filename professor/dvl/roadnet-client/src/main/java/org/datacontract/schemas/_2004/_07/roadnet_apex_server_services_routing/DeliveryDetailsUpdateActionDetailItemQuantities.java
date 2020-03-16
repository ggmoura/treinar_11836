
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.roadnet.apex.datacontracts.Quantities;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de DeliveryDetailsUpdateAction.DetailItemQuantities complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DeliveryDetailsUpdateAction.DetailItemQuantities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Damaged" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DamagedQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="DamagedReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FreeformDamagedReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FreeformOverReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FreeformQuantityReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FreeformShortReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InputTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Over" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="OverQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="OverReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Quantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QuantityInputQuality_InputQuality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuantityReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Short" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ShortQuantities" type="{http://roadnet.com/apex/DataContracts/}Quantities" minOccurs="0"/&gt;
 *         &lt;element name="ShortReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryDetailsUpdateAction.DetailItemQuantities", propOrder = {
    "damaged",
    "damagedQuantities",
    "damagedReasonCode",
    "freeformDamagedReasonCode",
    "freeformOverReasonCode",
    "freeformQuantityReasonCode",
    "freeformShortReasonCode",
    "inputTimestamp",
    "over",
    "overQuantities",
    "overReasonCode",
    "quantities",
    "quantity",
    "quantityInputQualityInputQuality",
    "quantityReasonCode",
    "_short",
    "shortQuantities",
    "shortReasonCode"
})
public class DeliveryDetailsUpdateActionDetailItemQuantities
    extends DataTransferObject
{

    @XmlElement(name = "Damaged")
    protected Double damaged;
    @XmlElementRef(name = "DamagedQuantities", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> damagedQuantities;
    @XmlElementRef(name = "DamagedReasonCode", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> damagedReasonCode;
    @XmlElementRef(name = "FreeformDamagedReasonCode", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> freeformDamagedReasonCode;
    @XmlElementRef(name = "FreeformOverReasonCode", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> freeformOverReasonCode;
    @XmlElementRef(name = "FreeformQuantityReasonCode", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> freeformQuantityReasonCode;
    @XmlElementRef(name = "FreeformShortReasonCode", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> freeformShortReasonCode;
    @XmlElementRef(name = "InputTimestamp", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> inputTimestamp;
    @XmlElement(name = "Over")
    protected Double over;
    @XmlElementRef(name = "OverQuantities", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> overQuantities;
    @XmlElementRef(name = "OverReasonCode", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> overReasonCode;
    @XmlElementRef(name = "Quantities", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> quantities;
    @XmlElement(name = "Quantity")
    protected Double quantity;
    @XmlElementRef(name = "QuantityInputQuality_InputQuality", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quantityInputQualityInputQuality;
    @XmlElementRef(name = "QuantityReasonCode", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quantityReasonCode;
    @XmlElement(name = "Short")
    protected Double _short;
    @XmlElementRef(name = "ShortQuantities", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Quantities> shortQuantities;
    @XmlElementRef(name = "ShortReasonCode", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shortReasonCode;

    /**
     * Obtém o valor da propriedade damaged.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDamaged() {
        return damaged;
    }

    /**
     * Define o valor da propriedade damaged.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDamaged(Double value) {
        this.damaged = value;
    }

    /**
     * Obtém o valor da propriedade damagedQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getDamagedQuantities() {
        return damagedQuantities;
    }

    /**
     * Define o valor da propriedade damagedQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setDamagedQuantities(JAXBElement<Quantities> value) {
        this.damagedQuantities = value;
    }

    /**
     * Obtém o valor da propriedade damagedReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDamagedReasonCode() {
        return damagedReasonCode;
    }

    /**
     * Define o valor da propriedade damagedReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDamagedReasonCode(JAXBElement<String> value) {
        this.damagedReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade freeformDamagedReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFreeformDamagedReasonCode() {
        return freeformDamagedReasonCode;
    }

    /**
     * Define o valor da propriedade freeformDamagedReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFreeformDamagedReasonCode(JAXBElement<String> value) {
        this.freeformDamagedReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade freeformOverReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFreeformOverReasonCode() {
        return freeformOverReasonCode;
    }

    /**
     * Define o valor da propriedade freeformOverReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFreeformOverReasonCode(JAXBElement<String> value) {
        this.freeformOverReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade freeformQuantityReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFreeformQuantityReasonCode() {
        return freeformQuantityReasonCode;
    }

    /**
     * Define o valor da propriedade freeformQuantityReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFreeformQuantityReasonCode(JAXBElement<String> value) {
        this.freeformQuantityReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade freeformShortReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFreeformShortReasonCode() {
        return freeformShortReasonCode;
    }

    /**
     * Define o valor da propriedade freeformShortReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFreeformShortReasonCode(JAXBElement<String> value) {
        this.freeformShortReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade inputTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getInputTimestamp() {
        return inputTimestamp;
    }

    /**
     * Define o valor da propriedade inputTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setInputTimestamp(JAXBElement<XMLGregorianCalendar> value) {
        this.inputTimestamp = value;
    }

    /**
     * Obtém o valor da propriedade over.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOver() {
        return over;
    }

    /**
     * Define o valor da propriedade over.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOver(Double value) {
        this.over = value;
    }

    /**
     * Obtém o valor da propriedade overQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getOverQuantities() {
        return overQuantities;
    }

    /**
     * Define o valor da propriedade overQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setOverQuantities(JAXBElement<Quantities> value) {
        this.overQuantities = value;
    }

    /**
     * Obtém o valor da propriedade overReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOverReasonCode() {
        return overReasonCode;
    }

    /**
     * Define o valor da propriedade overReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOverReasonCode(JAXBElement<String> value) {
        this.overReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade quantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getQuantities() {
        return quantities;
    }

    /**
     * Define o valor da propriedade quantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setQuantities(JAXBElement<Quantities> value) {
        this.quantities = value;
    }

    /**
     * Obtém o valor da propriedade quantity.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantity() {
        return quantity;
    }

    /**
     * Define o valor da propriedade quantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantity(Double value) {
        this.quantity = value;
    }

    /**
     * Obtém o valor da propriedade quantityInputQualityInputQuality.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuantityInputQualityInputQuality() {
        return quantityInputQualityInputQuality;
    }

    /**
     * Define o valor da propriedade quantityInputQualityInputQuality.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuantityInputQualityInputQuality(JAXBElement<String> value) {
        this.quantityInputQualityInputQuality = value;
    }

    /**
     * Obtém o valor da propriedade quantityReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuantityReasonCode() {
        return quantityReasonCode;
    }

    /**
     * Define o valor da propriedade quantityReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuantityReasonCode(JAXBElement<String> value) {
        this.quantityReasonCode = value;
    }

    /**
     * Obtém o valor da propriedade short.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShort() {
        return _short;
    }

    /**
     * Define o valor da propriedade short.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShort(Double value) {
        this._short = value;
    }

    /**
     * Obtém o valor da propriedade shortQuantities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public JAXBElement<Quantities> getShortQuantities() {
        return shortQuantities;
    }

    /**
     * Define o valor da propriedade shortQuantities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Quantities }{@code >}
     *     
     */
    public void setShortQuantities(JAXBElement<Quantities> value) {
        this.shortQuantities = value;
    }

    /**
     * Obtém o valor da propriedade shortReasonCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShortReasonCode() {
        return shortReasonCode;
    }

    /**
     * Define o valor da propriedade shortReasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShortReasonCode(JAXBElement<String> value) {
        this.shortReasonCode = value;
    }

}
