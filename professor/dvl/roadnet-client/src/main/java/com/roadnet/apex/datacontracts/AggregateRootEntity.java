
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntity;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.AdminReport;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.Customer;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.CustomerBusinessUnit;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.CustomerRegion;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.Database;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.DatabaseServerGroup;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.MapDataset;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.MatrixBuildResult;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.MatrixBuildResultExt;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.QueuedMessage;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.ServiceInstanceInfo;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.SystemMessage;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing_datacontracts.DataWarehouseStagedRoute;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseAccountDimension;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseCargoExceptionTypeDimension;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseCargoUnitTypeDimension;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseCostTypeDimension;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseCustomMeasure;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseDepot;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseDimension;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseDoorStateExceptionRuleDimension;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseEngineIdleExceptionRuleDimension;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseEquipmentClassDimension;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseEquipmentDimension;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseEquipmentManufacturerDimension;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseEquipmentTypeDimension;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseIdlingTypeDimension;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseIntegrationStatus;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseKpiBase;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseKpiFolder;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseKpiSchedule;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseLocationDimension;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseMobileDeviceDimension;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseNavRecalculationReasonDimension;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseOperationsUnitLevel;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehousePlannedAndActualDimension;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehousePowerTakeOffExceptionRuleDimension;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseRoute;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseRouteDescriptorDimension;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseRouteInfoDimension;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseServiceLocationCategoryDimension;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseServiceTypeDimension;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseSpeedingExceptionRuleDimension;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseStopInfoDimension;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseStopTypeDimension;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseTelematicsDeviceDimension;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseTelematicsDeviceInputOutputAccessoryDimension;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseTemperatureExceptionRuleDimension;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseTimeDimension;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseTravelLegTypeDimension;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseWorkerDimension;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseWorkerTypeDimension;


/**
 * <p>Classe Java de AggregateRootEntity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AggregateRootEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregateRootEntity", propOrder = {
    "createdBy",
    "createdTime",
    "modifiedBy",
    "modifiedTime",
    "version"
})
@XmlSeeAlso({
    Customer.class,
    DataWarehouseOperationsUnitLevel.class,
    ClientApplicationVersion.class,
    DataWarehouseIntegrationStatus.class,
    ClientApplication.class,
    ExportPlanningSolutionDto.class,
    EmailSender.class,
    EquipmentDropHookEvent.class,
    AdminUser.class,
    FileAttachment.class,
    AuthenticationPolicy.class,
    CorrespondenceRecipientStatus.class,
    Correspondence.class,
    SpeedBracketSet.class,
    UserClientApplicationVersion.class,
    Comment.class,
    ImportStrategicRoutedSolutionInfo.class,
    OBD2DiagnosticTroubleCode.class,
    Discussion.class,
    ImportOrderBaseInfo.class,
    OpportunityNotification.class,
    Opportunity.class,
    ShareableEntityAccess.class,
    SharingUserGroup.class,
    ImportRoutedSolutionInfo.class,
    Partner.class,
    Facility.class,
    ClientSharedPreference.class,
    MapVendor.class,
    PurchasableFeatureSet.class,
    SendOrderDto.class,
    CustomerSettings.class,
    CustomEntityMetaData.class,
    BusinessUnit.class,
    ClientUserPreference.class,
    Role.class,
    UserGroup.class,
    User.class,
    BusinessUnitBasedAggregateRootEntity.class,
    DataWarehouseMobileDeviceDimension.class,
    DataWarehouseNavRecalculationReasonDimension.class,
    DataWarehouseTelematicsDeviceDimension.class,
    DataWarehousePowerTakeOffExceptionRuleDimension.class,
    DataWarehouseIdlingTypeDimension.class,
    DataWarehouseDimension.class,
    DataWarehouseTelematicsDeviceInputOutputAccessoryDimension.class,
    DataWarehouseAccountDimension.class,
    DataWarehouseCostTypeDimension.class,
    DataWarehouseCustomMeasure.class,
    DataWarehouseDoorStateExceptionRuleDimension.class,
    DataWarehouseEquipmentManufacturerDimension.class,
    DataWarehouseKpiFolder.class,
    DataWarehouseKpiBase.class,
    DataWarehouseKpiSchedule.class,
    DataWarehouseRouteInfoDimension.class,
    DataWarehouseServiceLocationCategoryDimension.class,
    DataWarehouseTemperatureExceptionRuleDimension.class,
    DataWarehousePlannedAndActualDimension.class,
    DataWarehouseEquipmentClassDimension.class,
    DataWarehouseEngineIdleExceptionRuleDimension.class,
    DataWarehouseSpeedingExceptionRuleDimension.class,
    DataWarehouseCargoExceptionTypeDimension.class,
    DataWarehouseCargoUnitTypeDimension.class,
    DataWarehouseRoute.class,
    DataWarehouseEquipmentTypeDimension.class,
    DataWarehouseEquipmentDimension.class,
    DataWarehouseLocationDimension.class,
    DataWarehouseRouteDescriptorDimension.class,
    DataWarehouseServiceTypeDimension.class,
    DataWarehouseStopTypeDimension.class,
    DataWarehouseTimeDimension.class,
    DataWarehouseTravelLegTypeDimension.class,
    DataWarehouseWorkerTypeDimension.class,
    DataWarehouseWorkerDimension.class,
    DataWarehouseDepot.class,
    DataWarehouseStopInfoDimension.class,
    DatabaseServerGroup.class,
    MatrixBuildResultExt.class,
    CustomerBusinessUnit.class,
    CustomerRegion.class,
    Database.class,
    MatrixBuildResult.class,
    ServiceInstanceInfo.class,
    SystemMessage.class,
    AdminReport.class,
    MapDataset.class,
    QueuedMessage.class,
    JobInfo.class,
    Notification.class,
    RegionBasedAggregateRootEntity.class,
    DataWarehouseStagedRoute.class
})
public class AggregateRootEntity
    extends DomainEntity
{

    @XmlElementRef(name = "CreatedBy", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdBy;
    @XmlElement(name = "CreatedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdTime;
    @XmlElementRef(name = "ModifiedBy", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modifiedBy;
    @XmlElement(name = "ModifiedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedTime;
    @XmlElement(name = "Version")
    protected Long version;

    /**
     * Obtém o valor da propriedade createdBy.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreatedBy() {
        return createdBy;
    }

    /**
     * Define o valor da propriedade createdBy.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreatedBy(JAXBElement<String> value) {
        this.createdBy = value;
    }

    /**
     * Obtém o valor da propriedade createdTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedTime() {
        return createdTime;
    }

    /**
     * Define o valor da propriedade createdTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedTime(XMLGregorianCalendar value) {
        this.createdTime = value;
    }

    /**
     * Obtém o valor da propriedade modifiedBy.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getModifiedBy() {
        return modifiedBy;
    }

    /**
     * Define o valor da propriedade modifiedBy.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setModifiedBy(JAXBElement<String> value) {
        this.modifiedBy = value;
    }

    /**
     * Obtém o valor da propriedade modifiedTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifiedTime() {
        return modifiedTime;
    }

    /**
     * Define o valor da propriedade modifiedTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifiedTime(XMLGregorianCalendar value) {
        this.modifiedTime = value;
    }

    /**
     * Obtém o valor da propriedade version.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVersion() {
        return version;
    }

    /**
     * Define o valor da propriedade version.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVersion(Long value) {
        this.version = value;
    }

}
