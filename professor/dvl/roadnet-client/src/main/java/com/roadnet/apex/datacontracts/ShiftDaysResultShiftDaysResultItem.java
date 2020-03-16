
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de ShiftDaysResult.ShiftDaysResultItem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ShiftDaysResult.ShiftDaysResultItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DayOfWeekFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorCode" type="{http://roadnet.com/apex/DataContracts/}TransferErrorCode" minOccurs="0"/&gt;
 *         &lt;element name="OrderEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Set" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShiftDaysResult.ShiftDaysResultItem", propOrder = {
    "dayOfWeekFlags",
    "errorCode",
    "orderEntityKey",
    "set"
})
public class ShiftDaysResultShiftDaysResultItem
    extends DataTransferObject
{

    @XmlElementRef(name = "DayOfWeekFlags", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dayOfWeekFlags;
    @XmlElementRef(name = "ErrorCode", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TransferErrorCode> errorCode;
    @XmlElementRef(name = "OrderEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> orderEntityKey;
    @XmlElementRef(name = "Set", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> set;

    /**
     * Obtém o valor da propriedade dayOfWeekFlags.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDayOfWeekFlags() {
        return dayOfWeekFlags;
    }

    /**
     * Define o valor da propriedade dayOfWeekFlags.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDayOfWeekFlags(JAXBElement<String> value) {
        this.dayOfWeekFlags = value;
    }

    /**
     * Obtém o valor da propriedade errorCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransferErrorCode }{@code >}
     *     
     */
    public JAXBElement<TransferErrorCode> getErrorCode() {
        return errorCode;
    }

    /**
     * Define o valor da propriedade errorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransferErrorCode }{@code >}
     *     
     */
    public void setErrorCode(JAXBElement<TransferErrorCode> value) {
        this.errorCode = value;
    }

    /**
     * Obtém o valor da propriedade orderEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOrderEntityKey() {
        return orderEntityKey;
    }

    /**
     * Define o valor da propriedade orderEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOrderEntityKey(JAXBElement<Long> value) {
        this.orderEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade set.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSet() {
        return set;
    }

    /**
     * Define o valor da propriedade set.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSet(JAXBElement<String> value) {
        this.set = value;
    }

}
