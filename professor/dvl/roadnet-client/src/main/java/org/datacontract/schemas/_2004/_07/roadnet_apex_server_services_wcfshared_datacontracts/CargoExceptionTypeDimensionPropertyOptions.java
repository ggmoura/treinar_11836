
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de CargoExceptionTypeDimensionPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CargoExceptionTypeDimensionPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehouseCargoExceptionType_Type" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CargoExceptionTypeDimensionPropertyOptions", propOrder = {
    "dataWarehouseCargoExceptionTypeType"
})
public class CargoExceptionTypeDimensionPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "DataWarehouseCargoExceptionType_Type")
    protected Boolean dataWarehouseCargoExceptionTypeType;

    /**
     * Obtém o valor da propriedade dataWarehouseCargoExceptionTypeType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataWarehouseCargoExceptionTypeType() {
        return dataWarehouseCargoExceptionTypeType;
    }

    /**
     * Define o valor da propriedade dataWarehouseCargoExceptionTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataWarehouseCargoExceptionTypeType(Boolean value) {
        this.dataWarehouseCargoExceptionTypeType = value;
    }

}
