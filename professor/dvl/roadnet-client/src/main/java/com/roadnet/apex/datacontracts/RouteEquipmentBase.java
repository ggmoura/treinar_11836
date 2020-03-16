
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;


/**
 * <p>Classe Java de RouteEquipmentBase complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RouteEquipmentBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BeginAtStopEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EndAtStopEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteEquipmentBase", propOrder = {
    "beginAtStopEntityKey",
    "endAtStopEntityKey"
})
@XmlSeeAlso({
    RouteEquipmentType.class,
    RouteEquipment.class
})
public class RouteEquipmentBase
    extends DomainEntity
{

    @XmlElement(name = "BeginAtStopEntityKey")
    protected Long beginAtStopEntityKey;
    @XmlElement(name = "EndAtStopEntityKey")
    protected Long endAtStopEntityKey;

    /**
     * Obtém o valor da propriedade beginAtStopEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBeginAtStopEntityKey() {
        return beginAtStopEntityKey;
    }

    /**
     * Define o valor da propriedade beginAtStopEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBeginAtStopEntityKey(Long value) {
        this.beginAtStopEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade endAtStopEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEndAtStopEntityKey() {
        return endAtStopEntityKey;
    }

    /**
     * Define o valor da propriedade endAtStopEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEndAtStopEntityKey(Long value) {
        this.endAtStopEntityKey = value;
    }

}
