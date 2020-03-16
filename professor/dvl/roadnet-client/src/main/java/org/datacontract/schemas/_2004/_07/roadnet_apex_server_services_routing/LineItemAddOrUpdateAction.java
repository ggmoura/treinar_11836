
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringanyType;
import com.roadnet.apex.datacontracts.StopIdentity;


/**
 * <p>Classe Java de LineItemAddOrUpdateAction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LineItemAddOrUpdateAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}MobileDeviceAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsAdd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineItemCustomProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringanyType" minOccurs="0"/&gt;
 *         &lt;element name="LineItemIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SkuKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="StopKey" type="{http://roadnet.com/apex/DataContracts/}Stop.Identity" minOccurs="0"/&gt;
 *         &lt;element name="TaskType_TaskType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItemAddOrUpdateAction", propOrder = {
    "isAdd",
    "lineItemCustomProperties",
    "lineItemIdentifier",
    "orderIdentifier",
    "skuKey",
    "stopKey",
    "taskTypeTaskType"
})
public class LineItemAddOrUpdateAction
    extends MobileDeviceAction
{

    @XmlElement(name = "IsAdd")
    protected Boolean isAdd;
    @XmlElementRef(name = "LineItemCustomProperties", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringanyType> lineItemCustomProperties;
    @XmlElementRef(name = "LineItemIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineItemIdentifier;
    @XmlElementRef(name = "OrderIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> orderIdentifier;
    @XmlElement(name = "SkuKey")
    protected Long skuKey;
    @XmlElementRef(name = "StopKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<StopIdentity> stopKey;
    @XmlElementRef(name = "TaskType_TaskType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taskTypeTaskType;

    /**
     * Obtém o valor da propriedade isAdd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAdd() {
        return isAdd;
    }

    /**
     * Define o valor da propriedade isAdd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAdd(Boolean value) {
        this.isAdd = value;
    }

    /**
     * Obtém o valor da propriedade lineItemCustomProperties.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringanyType> getLineItemCustomProperties() {
        return lineItemCustomProperties;
    }

    /**
     * Define o valor da propriedade lineItemCustomProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public void setLineItemCustomProperties(JAXBElement<ArrayOfKeyValueOfstringanyType> value) {
        this.lineItemCustomProperties = value;
    }

    /**
     * Obtém o valor da propriedade lineItemIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLineItemIdentifier() {
        return lineItemIdentifier;
    }

    /**
     * Define o valor da propriedade lineItemIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLineItemIdentifier(JAXBElement<String> value) {
        this.lineItemIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade orderIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderIdentifier() {
        return orderIdentifier;
    }

    /**
     * Define o valor da propriedade orderIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderIdentifier(JAXBElement<String> value) {
        this.orderIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade skuKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSkuKey() {
        return skuKey;
    }

    /**
     * Define o valor da propriedade skuKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSkuKey(Long value) {
        this.skuKey = value;
    }

    /**
     * Obtém o valor da propriedade stopKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StopIdentity }{@code >}
     *     
     */
    public JAXBElement<StopIdentity> getStopKey() {
        return stopKey;
    }

    /**
     * Define o valor da propriedade stopKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StopIdentity }{@code >}
     *     
     */
    public void setStopKey(JAXBElement<StopIdentity> value) {
        this.stopKey = value;
    }

    /**
     * Obtém o valor da propriedade taskTypeTaskType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaskTypeTaskType() {
        return taskTypeTaskType;
    }

    /**
     * Define o valor da propriedade taskTypeTaskType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaskTypeTaskType(JAXBElement<String> value) {
        this.taskTypeTaskType = value;
    }

}
