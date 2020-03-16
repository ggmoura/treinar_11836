
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de IdlingTypeDimensionPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IdlingTypeDimensionPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehouseIdlingTypeDimension_IdlingType_Type" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdlingTypeDimensionPropertyOptions", propOrder = {
    "dataWarehouseIdlingTypeDimensionIdlingTypeType"
})
public class IdlingTypeDimensionPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "DataWarehouseIdlingTypeDimension_IdlingType_Type")
    protected Boolean dataWarehouseIdlingTypeDimensionIdlingTypeType;

    /**
     * Obtém o valor da propriedade dataWarehouseIdlingTypeDimensionIdlingTypeType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataWarehouseIdlingTypeDimensionIdlingTypeType() {
        return dataWarehouseIdlingTypeDimensionIdlingTypeType;
    }

    /**
     * Define o valor da propriedade dataWarehouseIdlingTypeDimensionIdlingTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataWarehouseIdlingTypeDimensionIdlingTypeType(Boolean value) {
        this.dataWarehouseIdlingTypeDimensionIdlingTypeType = value;
    }

}
