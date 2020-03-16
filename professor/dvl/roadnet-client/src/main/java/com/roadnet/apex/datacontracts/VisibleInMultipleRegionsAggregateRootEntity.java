
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;


/**
 * <p>Classe Java de VisibleInMultipleRegionsAggregateRootEntity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="VisibleInMultipleRegionsAggregateRootEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}BusinessUnitBasedAggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreatedInRegionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="RegionEntityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
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
@XmlType(name = "VisibleInMultipleRegionsAggregateRootEntity", propOrder = {
    "createdInRegionEntityKey",
    "regionEntityKeys",
    "visibleInAllRegions"
})
@XmlSeeAlso({
    Worker.class,
    CompartmentType.class,
    Equipment.class,
    ServiceLocationCategory.class,
    ComplianceAlert.class,
    ProductType.class,
    ResourceExceptionRuleEx.class,
    EquipmentProfile.class,
    BaseMobileDevice.class,
    DiagnosticTroubleCodeEvent.class,
    WorkerAlert.class,
    PrintTemplate.class,
    CustomForm.class,
    ReportSchedule.class,
    Location.class,
    OnboardCode.class,
    PackageType.class,
    EquipmentMaintenancePlan.class,
    Account.class,
    OrderClass.class,
    SKU.class,
    TimeWindowType.class,
    WorkerType.class,
    EquipmentType.class,
    ServiceTimeType.class
})
public class VisibleInMultipleRegionsAggregateRootEntity
    extends BusinessUnitBasedAggregateRootEntity
{

    @XmlElement(name = "CreatedInRegionEntityKey")
    protected Long createdInRegionEntityKey;
    @XmlElementRef(name = "RegionEntityKeys", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> regionEntityKeys;
    @XmlElementRef(name = "VisibleInAllRegions", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> visibleInAllRegions;

    /**
     * Obtém o valor da propriedade createdInRegionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreatedInRegionEntityKey() {
        return createdInRegionEntityKey;
    }

    /**
     * Define o valor da propriedade createdInRegionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreatedInRegionEntityKey(Long value) {
        this.createdInRegionEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade regionEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getRegionEntityKeys() {
        return regionEntityKeys;
    }

    /**
     * Define o valor da propriedade regionEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setRegionEntityKeys(JAXBElement<ArrayOflong> value) {
        this.regionEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade visibleInAllRegions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getVisibleInAllRegions() {
        return visibleInAllRegions;
    }

    /**
     * Define o valor da propriedade visibleInAllRegions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setVisibleInAllRegions(JAXBElement<Boolean> value) {
        this.visibleInAllRegions = value;
    }

}
