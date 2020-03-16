
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de BusinessUnitBasedAggregateRootEntity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BusinessUnitBasedAggregateRootEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}AggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessUnitEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessUnitBasedAggregateRootEntity", propOrder = {
    "businessUnitEntityKey"
})
@XmlSeeAlso({
    Report.class,
    ReasonCodeBase.class,
    Camera.class,
    CorrespondenceMailingList.class,
    RegionLevel.class,
    ActiveAlertRecipientType.class,
    CannedTextMessage.class,
    TelematicsDeviceInputOutputConfiguration.class,
    TelematicsInputOutputAccessory.class,
    EquipmentMaintenanceInfo.class,
    EquipmentService.class,
    FormControl.class,
    ServicePattern.class,
    ServicePatternSet.class,
    ReportGroup.class,
    NotificationRecipient.class,
    TransferTemplateSet.class,
    VisibleInMultipleRegionsAggregateRootEntity.class,
    Region.class,
    EquipmentManufacturer.class
})
public class BusinessUnitBasedAggregateRootEntity
    extends AggregateRootEntity
{

    @XmlElement(name = "BusinessUnitEntityKey")
    protected Long businessUnitEntityKey;

    /**
     * Obtém o valor da propriedade businessUnitEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBusinessUnitEntityKey() {
        return businessUnitEntityKey;
    }

    /**
     * Define o valor da propriedade businessUnitEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBusinessUnitEntityKey(Long value) {
        this.businessUnitEntityKey = value;
    }

}
