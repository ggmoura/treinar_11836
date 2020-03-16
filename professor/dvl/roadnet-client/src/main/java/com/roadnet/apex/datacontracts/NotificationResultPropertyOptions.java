
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de NotificationResultPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NotificationResultPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntityPkey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NotificationCount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationResultPropertyOptions", propOrder = {
    "entityPkey",
    "notificationCount"
})
@XmlSeeAlso({
    KpiNotificationResultPropertyOptions.class
})
public class NotificationResultPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "EntityPkey")
    protected Boolean entityPkey;
    @XmlElement(name = "NotificationCount")
    protected Boolean notificationCount;

    /**
     * Obtém o valor da propriedade entityPkey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEntityPkey() {
        return entityPkey;
    }

    /**
     * Define o valor da propriedade entityPkey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEntityPkey(Boolean value) {
        this.entityPkey = value;
    }

    /**
     * Obtém o valor da propriedade notificationCount.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotificationCount() {
        return notificationCount;
    }

    /**
     * Define o valor da propriedade notificationCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotificationCount(Boolean value) {
        this.notificationCount = value;
    }

}
