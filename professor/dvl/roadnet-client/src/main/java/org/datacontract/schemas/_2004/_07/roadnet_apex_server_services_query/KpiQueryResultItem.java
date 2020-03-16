
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.IMeasure;


/**
 * <p>Classe Java de KpiQueryResultItem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="KpiQueryResultItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataPoints" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse}ArrayOfMeasureResultDataPoint" minOccurs="0"/&gt;
 *         &lt;element name="DataWithoutFeatureExcluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HasMoreData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ListOfMeasureUnitType_UnitTypes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="Measure" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}IMeasure" minOccurs="0"/&gt;
 *         &lt;element name="OperationsUnitAncestors" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KpiQueryResultItem", propOrder = {
    "dataPoints",
    "dataWithoutFeatureExcluded",
    "hasMoreData",
    "listOfMeasureUnitTypeUnitTypes",
    "measure",
    "operationsUnitAncestors"
})
public class KpiQueryResultItem
    extends DataTransferObject
{

    @XmlElementRef(name = "DataPoints", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMeasureResultDataPoint> dataPoints;
    @XmlElementRef(name = "DataWithoutFeatureExcluded", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dataWithoutFeatureExcluded;
    @XmlElement(name = "HasMoreData")
    protected Boolean hasMoreData;
    @XmlElementRef(name = "ListOfMeasureUnitType_UnitTypes", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> listOfMeasureUnitTypeUnitTypes;
    @XmlElementRef(name = "Measure", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<IMeasure> measure;
    @XmlElementRef(name = "OperationsUnitAncestors", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> operationsUnitAncestors;

    /**
     * Obtém o valor da propriedade dataPoints.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMeasureResultDataPoint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMeasureResultDataPoint> getDataPoints() {
        return dataPoints;
    }

    /**
     * Define o valor da propriedade dataPoints.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMeasureResultDataPoint }{@code >}
     *     
     */
    public void setDataPoints(JAXBElement<ArrayOfMeasureResultDataPoint> value) {
        this.dataPoints = value;
    }

    /**
     * Obtém o valor da propriedade dataWithoutFeatureExcluded.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDataWithoutFeatureExcluded() {
        return dataWithoutFeatureExcluded;
    }

    /**
     * Define o valor da propriedade dataWithoutFeatureExcluded.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDataWithoutFeatureExcluded(JAXBElement<Boolean> value) {
        this.dataWithoutFeatureExcluded = value;
    }

    /**
     * Obtém o valor da propriedade hasMoreData.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasMoreData() {
        return hasMoreData;
    }

    /**
     * Define o valor da propriedade hasMoreData.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasMoreData(Boolean value) {
        this.hasMoreData = value;
    }

    /**
     * Obtém o valor da propriedade listOfMeasureUnitTypeUnitTypes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getListOfMeasureUnitTypeUnitTypes() {
        return listOfMeasureUnitTypeUnitTypes;
    }

    /**
     * Define o valor da propriedade listOfMeasureUnitTypeUnitTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setListOfMeasureUnitTypeUnitTypes(JAXBElement<ArrayOfstring> value) {
        this.listOfMeasureUnitTypeUnitTypes = value;
    }

    /**
     * Obtém o valor da propriedade measure.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IMeasure }{@code >}
     *     
     */
    public JAXBElement<IMeasure> getMeasure() {
        return measure;
    }

    /**
     * Define o valor da propriedade measure.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IMeasure }{@code >}
     *     
     */
    public void setMeasure(JAXBElement<IMeasure> value) {
        this.measure = value;
    }

    /**
     * Obtém o valor da propriedade operationsUnitAncestors.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getOperationsUnitAncestors() {
        return operationsUnitAncestors;
    }

    /**
     * Define o valor da propriedade operationsUnitAncestors.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setOperationsUnitAncestors(JAXBElement<ArrayOflong> value) {
        this.operationsUnitAncestors = value;
    }

}
