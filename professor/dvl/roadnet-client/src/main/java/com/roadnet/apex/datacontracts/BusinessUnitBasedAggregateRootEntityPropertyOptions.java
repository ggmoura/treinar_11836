
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de BusinessUnitBasedAggregateRootEntityPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BusinessUnitBasedAggregateRootEntityPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessUnitEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessUnitBasedAggregateRootEntityPropertyOptions", propOrder = {
    "businessUnitEntityKey"
})
@XmlSeeAlso({
    ReportPropertyOptions.class,
    CameraPropertyOptions.class,
    CorrespondenceMailingListPropertyOptions.class,
    RegionLevelPropertyOptions.class,
    ActiveAlertRecipientTypePropertyOptions.class,
    ReasonCodeBasePropertyOptions.class,
    CannedTextMessagePropertyOptions.class,
    TelematicsDeviceInputOutputConfigurationPropertyOptions.class,
    TelematicsInputOutputAccessoryPropertyOptions.class,
    EquipmentManufacturerPropertyOptions.class,
    WorkerAlertAssignmentRulePropertyOptions.class,
    FormControlPropertyOptions.class,
    ServicePatternPropertyOptions.class,
    ServicePatternSetPropertyOptions.class,
    ReportGroupPropertyOptions.class,
    StopCancelReasonCodePropertyOptions.class,
    NotificationRecipientPropertyOptions.class,
    StopUnserviceableReasonCodePropertyOptions.class,
    TransferTemplateSetPropertyOptions.class,
    ImportTestObjectPropertyOptions.class,
    VisibleInMultipleRegionsAggregateRootEntityPropertyOptions.class,
    RegionPropertyOptions.class
})
public class BusinessUnitBasedAggregateRootEntityPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "BusinessUnitEntityKey")
    protected Boolean businessUnitEntityKey;

    /**
     * Obtém o valor da propriedade businessUnitEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBusinessUnitEntityKey() {
        return businessUnitEntityKey;
    }

    /**
     * Define o valor da propriedade businessUnitEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBusinessUnitEntityKey(Boolean value) {
        this.businessUnitEntityKey = value;
    }

}
