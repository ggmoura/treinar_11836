
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de ScheduleEquipmentMaintenanceArgs complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ScheduleEquipmentMaintenanceArgs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EquipmentMaintenanceInfoEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ScheduledDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleEquipmentMaintenanceArgs", propOrder = {
    "equipmentMaintenanceInfoEntityKey",
    "scheduledDate"
})
public class ScheduleEquipmentMaintenanceArgs
    extends DataTransferObject
{

    @XmlElement(name = "EquipmentMaintenanceInfoEntityKey")
    protected Long equipmentMaintenanceInfoEntityKey;
    @XmlElementRef(name = "ScheduledDate", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> scheduledDate;

    /**
     * Obtém o valor da propriedade equipmentMaintenanceInfoEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEquipmentMaintenanceInfoEntityKey() {
        return equipmentMaintenanceInfoEntityKey;
    }

    /**
     * Define o valor da propriedade equipmentMaintenanceInfoEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEquipmentMaintenanceInfoEntityKey(Long value) {
        this.equipmentMaintenanceInfoEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade scheduledDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getScheduledDate() {
        return scheduledDate;
    }

    /**
     * Define o valor da propriedade scheduledDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setScheduledDate(JAXBElement<XMLGregorianCalendar> value) {
        this.scheduledDate = value;
    }

}
