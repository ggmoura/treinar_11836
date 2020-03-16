
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;


/**
 * <p>Classe Java de ServiceLocationEquipmentTypeRestriction complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceLocationEquipmentTypeRestriction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderClassEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Restriction" type="{http://roadnet.com/apex/DataContracts/}EquipmentTypeRestriction" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceLocationEquipmentTypeRestriction", propOrder = {
    "orderClassEntityKey",
    "restriction"
})
public class ServiceLocationEquipmentTypeRestriction
    extends DomainEntity
{

    @XmlElement(name = "OrderClassEntityKey")
    protected Long orderClassEntityKey;
    @XmlElementRef(name = "Restriction", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<EquipmentTypeRestriction> restriction;

    /**
     * Obtém o valor da propriedade orderClassEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrderClassEntityKey() {
        return orderClassEntityKey;
    }

    /**
     * Define o valor da propriedade orderClassEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrderClassEntityKey(Long value) {
        this.orderClassEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade restriction.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EquipmentTypeRestriction }{@code >}
     *     
     */
    public JAXBElement<EquipmentTypeRestriction> getRestriction() {
        return restriction;
    }

    /**
     * Define o valor da propriedade restriction.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EquipmentTypeRestriction }{@code >}
     *     
     */
    public void setRestriction(JAXBElement<EquipmentTypeRestriction> value) {
        this.restriction = value;
    }

}
