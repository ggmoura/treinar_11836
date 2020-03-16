
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de VisibleInMultipleRegionsAggregateRootEntityPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VisibleInMultipleRegionsAggregateRootEntityPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}BusinessUnitBasedAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreatedInRegionEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RegionEntityKeys" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VisibleInAllRegions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisibleInMultipleRegionsAggregateRootEntityPropertyOptions", propOrder = {
    "createdInRegionEntityKey",
    "regionEntityKeys",
    "visibleInAllRegions"
})
@XmlSeeAlso({
    CompartmentTypePropertyOptions.class,
    ComplianceAlertPropertyOptions.class,
    ProductTypePropertyOptions.class,
    ResourceExceptionRuleExPropertyOptions.class,
    EquipmentProfilePropertyOptions.class,
    BaseMobileDevicePropertyOptions.class,
    EquipmentMaintenanceInfoPropertyOptions.class,
    EquipmentServicePropertyOptions.class,
    DiagnosticTroubleCodeEventPropertyOptions.class,
    WorkerAlertPropertyOptions.class,
    PrintTemplatePropertyOptions.class,
    CustomFormPropertyOptions.class,
    ReportSchedulePropertyOptions.class,
    LocationPropertyOptions.class,
    OnboardCodePropertyOptions.class,
    PackageTypePropertyOptions.class,
    EquipmentMaintenancePlanPropertyOptions.class,
    AccountPropertyOptions.class,
    OrderClassPropertyOptions.class,
    SKUPropertyOptions.class,
    TimeWindowTypePropertyOptions.class,
    EquipmentPropertyOptions.class,
    EquipmentTypePropertyOptions.class,
    ServiceLocationCategoryPropertyOptions.class,
    ServiceTimeTypePropertyOptions.class,
    WorkerPropertyOptions.class,
    WorkerTypePropertyOptions.class
})
public class VisibleInMultipleRegionsAggregateRootEntityPropertyOptions
    extends BusinessUnitBasedAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "CreatedInRegionEntityKey")
    protected Boolean createdInRegionEntityKey;
    @XmlElement(name = "RegionEntityKeys")
    protected Boolean regionEntityKeys;
    @XmlElement(name = "VisibleInAllRegions")
    protected Boolean visibleInAllRegions;

    /**
     * Obtém o valor da propriedade createdInRegionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreatedInRegionEntityKey() {
        return createdInRegionEntityKey;
    }

    /**
     * Define o valor da propriedade createdInRegionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreatedInRegionEntityKey(Boolean value) {
        this.createdInRegionEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade regionEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegionEntityKeys() {
        return regionEntityKeys;
    }

    /**
     * Define o valor da propriedade regionEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegionEntityKeys(Boolean value) {
        this.regionEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade visibleInAllRegions.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisibleInAllRegions() {
        return visibleInAllRegions;
    }

    /**
     * Define o valor da propriedade visibleInAllRegions.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisibleInAllRegions(Boolean value) {
        this.visibleInAllRegions = value;
    }

}
