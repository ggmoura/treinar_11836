
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de DataWarehouseKpiMeasureDescription complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseKpiMeasureDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AverageDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompareDescriptions" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="ExclusiveFiltersDescriptions" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringstring" minOccurs="0"/&gt;
 *         &lt;element name="InclusiveFiltersDescriptions" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringstring" minOccurs="0"/&gt;
 *         &lt;element name="MeasureDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ScorecardCriteria" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DataWarehouseScorecardKpiMeasureCriteria" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseKpiMeasureDescription", propOrder = {
    "averageDescription",
    "compareDescriptions",
    "exclusiveFiltersDescriptions",
    "inclusiveFiltersDescriptions",
    "measureDescription",
    "scorecardCriteria"
})
public class DataWarehouseKpiMeasureDescription
    extends DataTransferObject
{

    @XmlElementRef(name = "AverageDescription", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> averageDescription;
    @XmlElementRef(name = "CompareDescriptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> compareDescriptions;
    @XmlElementRef(name = "ExclusiveFiltersDescriptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringstring> exclusiveFiltersDescriptions;
    @XmlElementRef(name = "InclusiveFiltersDescriptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfstringstring> inclusiveFiltersDescriptions;
    @XmlElementRef(name = "MeasureDescription", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> measureDescription;
    @XmlElementRef(name = "ScorecardCriteria", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<DataWarehouseScorecardKpiMeasureCriteria> scorecardCriteria;

    /**
     * Obtém o valor da propriedade averageDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAverageDescription() {
        return averageDescription;
    }

    /**
     * Define o valor da propriedade averageDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAverageDescription(JAXBElement<String> value) {
        this.averageDescription = value;
    }

    /**
     * Obtém o valor da propriedade compareDescriptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getCompareDescriptions() {
        return compareDescriptions;
    }

    /**
     * Define o valor da propriedade compareDescriptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setCompareDescriptions(JAXBElement<ArrayOfstring> value) {
        this.compareDescriptions = value;
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
     * Obtém o valor da propriedade measureDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMeasureDescription() {
        return measureDescription;
    }

    /**
     * Define o valor da propriedade measureDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMeasureDescription(JAXBElement<String> value) {
        this.measureDescription = value;
    }

    /**
     * Obtém o valor da propriedade scorecardCriteria.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseScorecardKpiMeasureCriteria }{@code >}
     *     
     */
    public JAXBElement<DataWarehouseScorecardKpiMeasureCriteria> getScorecardCriteria() {
        return scorecardCriteria;
    }

    /**
     * Define o valor da propriedade scorecardCriteria.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseScorecardKpiMeasureCriteria }{@code >}
     *     
     */
    public void setScorecardCriteria(JAXBElement<DataWarehouseScorecardKpiMeasureCriteria> value) {
        this.scorecardCriteria = value;
    }

}
