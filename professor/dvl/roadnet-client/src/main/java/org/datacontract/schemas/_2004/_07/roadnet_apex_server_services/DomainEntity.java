
package org.datacontract.schemas._2004._07.roadnet_apex_server_services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringanyType;
import com.roadnet.apex.datacontracts.ActiveAlertRecipientTypeTemplate;
import com.roadnet.apex.datacontracts.AdminUserSession;
import com.roadnet.apex.datacontracts.AggregateRootEntity;
import com.roadnet.apex.datacontracts.AggregateRootPermission;
import com.roadnet.apex.datacontracts.BreakTemplate;
import com.roadnet.apex.datacontracts.ClientApplicationPermission;
import com.roadnet.apex.datacontracts.CompartmentContents;
import com.roadnet.apex.datacontracts.ConsigneeHistory;
import com.roadnet.apex.datacontracts.CorrespondenceMailingListMember;
import com.roadnet.apex.datacontracts.CorrespondenceRecipientDescriptor;
import com.roadnet.apex.datacontracts.CustomEntityPropertyMetaData;
import com.roadnet.apex.datacontracts.CustomFormAssignmentRule;
import com.roadnet.apex.datacontracts.CustomerClientApplicationVersion;
import com.roadnet.apex.datacontracts.EntityTransferTemplate;
import com.roadnet.apex.datacontracts.EquipmentTypeCompartment;
import com.roadnet.apex.datacontracts.ExportPlanningSolutionDtoExportPlanningSolutionCustomPropertiesDto;
import com.roadnet.apex.datacontracts.FormControlAssignment;
import com.roadnet.apex.datacontracts.FormControlResponse;
import com.roadnet.apex.datacontracts.FormControlResponseOption;
import com.roadnet.apex.datacontracts.GroupStop;
import com.roadnet.apex.datacontracts.LineItem;
import com.roadnet.apex.datacontracts.LineItemCompartmentQuantity;
import com.roadnet.apex.datacontracts.LocationAccessPoint;
import com.roadnet.apex.datacontracts.LocationComment;
import com.roadnet.apex.datacontracts.OpportunityExample;
import com.roadnet.apex.datacontracts.OpportunityScenario;
import com.roadnet.apex.datacontracts.OrderTextRecordDto;
import com.roadnet.apex.datacontracts.PropertyTransferTemplate;
import com.roadnet.apex.datacontracts.RegionRestrictedOperatingTimeDetail;
import com.roadnet.apex.datacontracts.ReportGroupMember;
import com.roadnet.apex.datacontracts.ReportGroupMemberParameter;
import com.roadnet.apex.datacontracts.ResourceExceptionExRecipientDetails;
import com.roadnet.apex.datacontracts.ResourceExceptionRecipientDetails;
import com.roadnet.apex.datacontracts.ResourceExceptionRuleCondition;
import com.roadnet.apex.datacontracts.ResourceExceptionRuleExCondition;
import com.roadnet.apex.datacontracts.RoleAssignment;
import com.roadnet.apex.datacontracts.RouteEquipmentBase;
import com.roadnet.apex.datacontracts.RouteJurisdiction;
import com.roadnet.apex.datacontracts.RouteOptimizationSuggestion;
import com.roadnet.apex.datacontracts.RouteTemplateEquipmentBase;
import com.roadnet.apex.datacontracts.RouteTemplateWorker;
import com.roadnet.apex.datacontracts.RouteTender;
import com.roadnet.apex.datacontracts.RouteWorker;
import com.roadnet.apex.datacontracts.ScorecardTemplateCriteria;
import com.roadnet.apex.datacontracts.ServiceLocationActiveAlertSubscription;
import com.roadnet.apex.datacontracts.ServiceLocationEquipmentTypeRestriction;
import com.roadnet.apex.datacontracts.ServicePatternLevel;
import com.roadnet.apex.datacontracts.ServiceTimeDetail;
import com.roadnet.apex.datacontracts.Stop;
import com.roadnet.apex.datacontracts.StopAction;
import com.roadnet.apex.datacontracts.StopActionLineItemQuantities;
import com.roadnet.apex.datacontracts.StopTemplate;
import com.roadnet.apex.datacontracts.Task;
import com.roadnet.apex.datacontracts.TerritoryEquipmentBase;
import com.roadnet.apex.datacontracts.TerritoryWorker;
import com.roadnet.apex.datacontracts.TimeWindowDetail;
import com.roadnet.apex.datacontracts.UserSession;
import com.roadnet.apex.datacontracts.WorkerAlertAssignmentRule;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.CustomerPurchasedFeatureSet;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration.SystemMessageLocalized;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing_datacontracts.DataWarehouseStagedOrder;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing_datacontracts.DataWarehouseStagedRouteEquipment;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing_datacontracts.DataWarehouseStagedStop;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing_datacontracts.DataWarehouseStagedStopQuantity;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseKpiMeasureBase;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseOperationsUnitPermission;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.MobileScreenComponent;


/**
 * <p>Classe Java de DomainEntity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DomainEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Action" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}ActionType" minOccurs="0"/&gt;
 *         &lt;element name="CustomProperties" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringanyType" minOccurs="0"/&gt;
 *         &lt;element name="CustomRelatedEntities" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringanyType" minOccurs="0"/&gt;
 *         &lt;element name="EntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomainEntity", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping", propOrder = {
    "action",
    "customProperties",
    "customRelatedEntities",
    "entityKey"
})
@XmlSeeAlso({
    AdminUserSession.class,
    RouteOptimizationSuggestion.class,
    CompartmentContents.class,
    EquipmentTypeCompartment.class,
    CorrespondenceMailingListMember.class,
    LineItemCompartmentQuantity.class,
    LineItem.class,
    ResourceExceptionExRecipientDetails.class,
    ResourceExceptionRuleExCondition.class,
    RegionRestrictedOperatingTimeDetail.class,
    OrderTextRecordDto.class,
    RouteTender.class,
    CorrespondenceRecipientDescriptor.class,
    ActiveAlertRecipientTypeTemplate.class,
    AggregateRootPermission.class,
    BreakTemplate.class,
    LocationAccessPoint.class,
    GroupStop.class,
    LocationComment.class,
    ResourceExceptionRecipientDetails.class,
    WorkerAlertAssignmentRule.class,
    OpportunityExample.class,
    OpportunityScenario.class,
    CustomFormAssignmentRule.class,
    FormControlResponse.class,
    FormControlResponseOption.class,
    FormControlAssignment.class,
    ServiceLocationActiveAlertSubscription.class,
    TerritoryWorker.class,
    ServicePatternLevel.class,
    CustomerClientApplicationVersion.class,
    StopAction.class,
    TimeWindowDetail.class,
    StopActionLineItemQuantities.class,
    ReportGroupMember.class,
    ReportGroupMemberParameter.class,
    RouteJurisdiction.class,
    PropertyTransferTemplate.class,
    ResourceExceptionRuleCondition.class,
    RouteTemplateWorker.class,
    StopTemplate.class,
    EntityTransferTemplate.class,
    CustomEntityPropertyMetaData.class,
    ConsigneeHistory.class,
    RouteWorker.class,
    RoleAssignment.class,
    ServiceLocationEquipmentTypeRestriction.class,
    ServiceTimeDetail.class,
    Stop.class,
    ClientApplicationPermission.class,
    Task.class,
    ExportPlanningSolutionDtoExportPlanningSolutionCustomPropertiesDto.class,
    UserSession.class,
    ScorecardTemplateCriteria.class,
    TerritoryEquipmentBase.class,
    RouteEquipmentBase.class,
    RouteTemplateEquipmentBase.class,
    DataWarehouseKpiMeasureBase.class,
    DataWarehouseOperationsUnitPermission.class,
    SystemMessageLocalized.class,
    CustomerPurchasedFeatureSet.class,
    MobileScreenComponent.class,
    DataWarehouseStagedRouteEquipment.class,
    DataWarehouseStagedStopQuantity.class,
    DataWarehouseStagedOrder.class,
    DataWarehouseStagedStop.class,
    AggregateRootEntity.class
})
public class DomainEntity
    extends DataTransferObject
{

    @XmlElement(name = "Action")
    @XmlSchemaType(name = "string")
    protected ActionType action;
    @XmlElementRef(name = "CustomProperties", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringanyType> customProperties;
    @XmlElementRef(name = "CustomRelatedEntities", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringanyType> customRelatedEntities;
    @XmlElement(name = "EntityKey")
    protected Long entityKey;

    /**
     * Obtém o valor da propriedade action.
     * 
     * @return
     *     possible object is
     *     {@link ActionType }
     *     
     */
    public ActionType getAction() {
        return action;
    }

    /**
     * Define o valor da propriedade action.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionType }
     *     
     */
    public void setAction(ActionType value) {
        this.action = value;
    }

    /**
     * Obtém o valor da propriedade customProperties.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringanyType> getCustomProperties() {
        return customProperties;
    }

    /**
     * Define o valor da propriedade customProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public void setCustomProperties(JAXBElement<ArrayOfKeyValueOfstringanyType> value) {
        this.customProperties = value;
    }

    /**
     * Obtém o valor da propriedade customRelatedEntities.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringanyType> getCustomRelatedEntities() {
        return customRelatedEntities;
    }

    /**
     * Define o valor da propriedade customRelatedEntities.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringanyType }{@code >}
     *     
     */
    public void setCustomRelatedEntities(JAXBElement<ArrayOfKeyValueOfstringanyType> value) {
        this.customRelatedEntities = value;
    }

    /**
     * Obtém o valor da propriedade entityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEntityKey() {
        return entityKey;
    }

    /**
     * Define o valor da propriedade entityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEntityKey(Long value) {
        this.entityKey = value;
    }

}
