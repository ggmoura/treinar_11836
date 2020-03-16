
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de Region.CombineOrdersSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Region.CombineOrdersSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SplitOrders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WithDifferentLineItemType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WithDifferentOrderBeginDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WithDifferentOrderClass" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WithDifferentOrderEndDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WithDifferentOrderUrgency" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WithDifferentSelector" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WithDifferentTimeWindows" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Region.CombineOrdersSettings", propOrder = {
    "enabled",
    "splitOrders",
    "withDifferentLineItemType",
    "withDifferentOrderBeginDate",
    "withDifferentOrderClass",
    "withDifferentOrderEndDate",
    "withDifferentOrderUrgency",
    "withDifferentSelector",
    "withDifferentTimeWindows"
})
public class RegionCombineOrdersSettings
    extends DataTransferObject
{

    @XmlElement(name = "Enabled")
    protected Boolean enabled;
    @XmlElement(name = "SplitOrders")
    protected Boolean splitOrders;
    @XmlElement(name = "WithDifferentLineItemType")
    protected Boolean withDifferentLineItemType;
    @XmlElement(name = "WithDifferentOrderBeginDate")
    protected Boolean withDifferentOrderBeginDate;
    @XmlElement(name = "WithDifferentOrderClass")
    protected Boolean withDifferentOrderClass;
    @XmlElement(name = "WithDifferentOrderEndDate")
    protected Boolean withDifferentOrderEndDate;
    @XmlElement(name = "WithDifferentOrderUrgency")
    protected Boolean withDifferentOrderUrgency;
    @XmlElement(name = "WithDifferentSelector")
    protected Boolean withDifferentSelector;
    @XmlElement(name = "WithDifferentTimeWindows")
    protected Boolean withDifferentTimeWindows;

    /**
     * Obtém o valor da propriedade enabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Define o valor da propriedade enabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Obtém o valor da propriedade splitOrders.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSplitOrders() {
        return splitOrders;
    }

    /**
     * Define o valor da propriedade splitOrders.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSplitOrders(Boolean value) {
        this.splitOrders = value;
    }

    /**
     * Obtém o valor da propriedade withDifferentLineItemType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithDifferentLineItemType() {
        return withDifferentLineItemType;
    }

    /**
     * Define o valor da propriedade withDifferentLineItemType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithDifferentLineItemType(Boolean value) {
        this.withDifferentLineItemType = value;
    }

    /**
     * Obtém o valor da propriedade withDifferentOrderBeginDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithDifferentOrderBeginDate() {
        return withDifferentOrderBeginDate;
    }

    /**
     * Define o valor da propriedade withDifferentOrderBeginDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithDifferentOrderBeginDate(Boolean value) {
        this.withDifferentOrderBeginDate = value;
    }

    /**
     * Obtém o valor da propriedade withDifferentOrderClass.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithDifferentOrderClass() {
        return withDifferentOrderClass;
    }

    /**
     * Define o valor da propriedade withDifferentOrderClass.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithDifferentOrderClass(Boolean value) {
        this.withDifferentOrderClass = value;
    }

    /**
     * Obtém o valor da propriedade withDifferentOrderEndDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithDifferentOrderEndDate() {
        return withDifferentOrderEndDate;
    }

    /**
     * Define o valor da propriedade withDifferentOrderEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithDifferentOrderEndDate(Boolean value) {
        this.withDifferentOrderEndDate = value;
    }

    /**
     * Obtém o valor da propriedade withDifferentOrderUrgency.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithDifferentOrderUrgency() {
        return withDifferentOrderUrgency;
    }

    /**
     * Define o valor da propriedade withDifferentOrderUrgency.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithDifferentOrderUrgency(Boolean value) {
        this.withDifferentOrderUrgency = value;
    }

    /**
     * Obtém o valor da propriedade withDifferentSelector.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithDifferentSelector() {
        return withDifferentSelector;
    }

    /**
     * Define o valor da propriedade withDifferentSelector.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithDifferentSelector(Boolean value) {
        this.withDifferentSelector = value;
    }

    /**
     * Obtém o valor da propriedade withDifferentTimeWindows.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWithDifferentTimeWindows() {
        return withDifferentTimeWindows;
    }

    /**
     * Define o valor da propriedade withDifferentTimeWindows.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWithDifferentTimeWindows(Boolean value) {
        this.withDifferentTimeWindows = value;
    }

}
