
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;


/**
 * <p>Classe Java de OrderTextRecordDto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OrderTextRecordDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderBaseEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TextRecord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderTextRecordDto", propOrder = {
    "orderBaseEntityKey",
    "textRecord"
})
public class OrderTextRecordDto
    extends DomainEntity
{

    @XmlElementRef(name = "OrderBaseEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> orderBaseEntityKey;
    @XmlElementRef(name = "TextRecord", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textRecord;

    /**
     * Obtém o valor da propriedade orderBaseEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getOrderBaseEntityKey() {
        return orderBaseEntityKey;
    }

    /**
     * Define o valor da propriedade orderBaseEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setOrderBaseEntityKey(JAXBElement<Long> value) {
        this.orderBaseEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade textRecord.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextRecord() {
        return textRecord;
    }

    /**
     * Define o valor da propriedade textRecord.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextRecord(JAXBElement<String> value) {
        this.textRecord = value;
    }

}
