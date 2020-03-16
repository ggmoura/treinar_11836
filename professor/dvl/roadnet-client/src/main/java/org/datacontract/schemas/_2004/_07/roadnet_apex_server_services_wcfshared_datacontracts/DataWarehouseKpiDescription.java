
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintstring;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de DataWarehouseKpiDescription complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseKpiDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateRangeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExclusiveFiltersDescriptions" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringstring" minOccurs="0"/&gt;
 *         &lt;element name="GroupingDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GroupingDescriptions" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfintstring" minOccurs="0"/&gt;
 *         &lt;element name="InclusiveFiltersDescriptions" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringstring" minOccurs="0"/&gt;
 *         &lt;element name="KpiMeasureDescriptions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}ArrayOfDataWarehouseKpiMeasureDescription" minOccurs="0"/&gt;
 *         &lt;element name="RuleDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RuleDescriptions" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfintstring" minOccurs="0"/&gt;
 *         &lt;element name="SortingDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseKpiDescription", propOrder = {
    "dateRangeDescription",
    "exclusiveFiltersDescriptions",
    "groupingDescription",
    "groupingDescriptions",
    "inclusiveFiltersDescriptions",
    "kpiMeasureDescriptions",
    "ruleDescription",
    "ruleDescriptions",
    "sortingDescription"
})
public class DataWarehouseKpiDescription
    extends DataTransferObject
{

    @XmlElementRef(name = "DateRangeDescription", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dateRangeDescription;
    @XmlElementRef(name = "ExclusiveFiltersDescriptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringstring> exclusiveFiltersDescriptions;
    @XmlElementRef(name = "GroupingDescription", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> groupingDescription;
    @XmlElementRef(name = "GroupingDescriptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfintstring> groupingDescriptions;
    @XmlElementRef(name = "InclusiveFiltersDescriptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringstring> inclusiveFiltersDescriptions;
    @XmlElementRef(name = "KpiMeasureDescriptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDataWarehouseKpiMeasureDescription> kpiMeasureDescriptions;
    @XmlElementRef(name = "RuleDescription", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ruleDescription;
    @XmlElementRef(name = "RuleDescriptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfintstring> ruleDescriptions;
    @XmlElementRef(name = "SortingDescription", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sortingDescription;

    /**
     * Obtém o valor da propriedade dateRangeDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDateRangeDescription() {
        return dateRangeDescription;
    }

    /**
     * Define o valor da propriedade dateRangeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDateRangeDescription(JAXBElement<String> value) {
        this.dateRangeDescription = value;
    }

    /**
     * Obtém o valor da propriedade exclusiveFiltersDescriptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringstring> getExclusiveFiltersDescriptions() {
        return exclusiveFiltersDescriptions;
    }

    /**
     * Define o valor da propriedade exclusiveFiltersDescriptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}
     *     
     */
    public void setExclusiveFiltersDescriptions(JAXBElement<ArrayOfKeyValueOfstringstring> value) {
        this.exclusiveFiltersDescriptions = value;
    }

    /**
     * Obtém o valor da propriedade groupingDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGroupingDescription() {
        return groupingDescription;
    }

    /**
     * Define o valor da propriedade groupingDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGroupingDescription(JAXBElement<String> value) {
        this.groupingDescription = value;
    }

    /**
     * Obtém o valor da propriedade groupingDescriptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfintstring> getGroupingDescriptions() {
        return groupingDescriptions;
    }

    /**
     * Define o valor da propriedade groupingDescriptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintstring }{@code >}
     *     
     */
    public void setGroupingDescriptions(JAXBElement<ArrayOfKeyValueOfintstring> value) {
        this.groupingDescriptions = value;
    }

    /**
     * Obtém o valor da propriedade inclusiveFiltersDescriptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfstringstring> getInclusiveFiltersDescriptions() {
        return inclusiveFiltersDescriptions;
    }

    /**
     * Define o valor da propriedade inclusiveFiltersDescriptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}
     *     
     */
    public void setInclusiveFiltersDescriptions(JAXBElement<ArrayOfKeyValueOfstringstring> value) {
        this.inclusiveFiltersDescriptions = value;
    }

    /**
     * Obtém o valor da propriedade kpiMeasureDescriptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseKpiMeasureDescription }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDataWarehouseKpiMeasureDescription> getKpiMeasureDescriptions() {
        return kpiMeasureDescriptions;
    }

    /**
     * Define o valor da propriedade kpiMeasureDescriptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseKpiMeasureDescription }{@code >}
     *     
     */
    public void setKpiMeasureDescriptions(JAXBElement<ArrayOfDataWarehouseKpiMeasureDescription> value) {
        this.kpiMeasureDescriptions = value;
    }

    /**
     * Obtém o valor da propriedade ruleDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRuleDescription() {
        return ruleDescription;
    }

    /**
     * Define o valor da propriedade ruleDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRuleDescription(JAXBElement<String> value) {
        this.ruleDescription = value;
    }

    /**
     * Obtém o valor da propriedade ruleDescriptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfintstring> getRuleDescriptions() {
        return ruleDescriptions;
    }

    /**
     * Define o valor da propriedade ruleDescriptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintstring }{@code >}
     *     
     */
    public void setRuleDescriptions(JAXBElement<ArrayOfKeyValueOfintstring> value) {
        this.ruleDescriptions = value;
    }

    /**
     * Obtém o valor da propriedade sortingDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSortingDescription() {
        return sortingDescription;
    }

    /**
     * Define o valor da propriedade sortingDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSortingDescription(JAXBElement<String> value) {
        this.sortingDescription = value;
    }

}
