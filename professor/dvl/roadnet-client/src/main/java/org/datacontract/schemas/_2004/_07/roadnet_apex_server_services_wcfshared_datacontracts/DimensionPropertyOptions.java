
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de DimensionPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DimensionPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehouseDimension_DimensionCategory_Category" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DimensionPropertyOptions", propOrder = {
    "dataWarehouseDimensionDimensionCategoryCategory"
})
@XmlSeeAlso({
    OperationsUnitDimensionPropertyOptions.class
})
public class DimensionPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "DataWarehouseDimension_DimensionCategory_Category")
    protected Boolean dataWarehouseDimensionDimensionCategoryCategory;

    /**
     * Obtém o valor da propriedade dataWarehouseDimensionDimensionCategoryCategory.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataWarehouseDimensionDimensionCategoryCategory() {
        return dataWarehouseDimensionDimensionCategoryCategory;
    }

    /**
     * Define o valor da propriedade dataWarehouseDimensionDimensionCategoryCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataWarehouseDimensionDimensionCategoryCategory(Boolean value) {
        this.dataWarehouseDimensionDimensionCategoryCategory = value;
    }

}
