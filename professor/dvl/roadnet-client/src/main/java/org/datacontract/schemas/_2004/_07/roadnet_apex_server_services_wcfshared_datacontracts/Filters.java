
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValuesSBicUMQs;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de Filters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Filters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DimensionFilters" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValues_SBicUMQs" minOccurs="0"/&gt;
 *         &lt;element name="IncludeAllDataForMatchingRoutes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Filters", propOrder = {
    "dimensionFilters",
    "includeAllDataForMatchingRoutes"
})
public class Filters
    extends DataTransferObject
{

    @XmlElementRef(name = "DimensionFilters", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValuesSBicUMQs> dimensionFilters;
    @XmlElement(name = "IncludeAllDataForMatchingRoutes")
    protected Boolean includeAllDataForMatchingRoutes;

    /**
     * Obtém o valor da propriedade dimensionFilters.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValuesSBicUMQs }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValuesSBicUMQs> getDimensionFilters() {
        return dimensionFilters;
    }

    /**
     * Define o valor da propriedade dimensionFilters.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValuesSBicUMQs }{@code >}
     *     
     */
    public void setDimensionFilters(JAXBElement<ArrayOfKeyValueOfDataWarehouseSecondaryDimensionTypeDimensionFilterValuesSBicUMQs> value) {
        this.dimensionFilters = value;
    }

    /**
     * Obtém o valor da propriedade includeAllDataForMatchingRoutes.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeAllDataForMatchingRoutes() {
        return includeAllDataForMatchingRoutes;
    }

    /**
     * Define o valor da propriedade includeAllDataForMatchingRoutes.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeAllDataForMatchingRoutes(Boolean value) {
        this.includeAllDataForMatchingRoutes = value;
    }

}
