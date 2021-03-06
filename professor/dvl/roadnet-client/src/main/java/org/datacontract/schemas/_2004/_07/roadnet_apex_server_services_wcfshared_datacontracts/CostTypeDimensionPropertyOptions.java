
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de CostTypeDimensionPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CostTypeDimensionPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehouseCostType_Type" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CostTypeDimensionPropertyOptions", propOrder = {
    "dataWarehouseCostTypeType"
})
public class CostTypeDimensionPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "DataWarehouseCostType_Type")
    protected Boolean dataWarehouseCostTypeType;

    /**
     * Obtém o valor da propriedade dataWarehouseCostTypeType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataWarehouseCostTypeType() {
        return dataWarehouseCostTypeType;
    }

    /**
     * Define o valor da propriedade dataWarehouseCostTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataWarehouseCostTypeType(Boolean value) {
        this.dataWarehouseCostTypeType = value;
    }

}
