
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de ServiceTypeDimensionPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceTypeDimensionPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehouseServiceType_Type" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StopActionType_ServiceType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceTypeDimensionPropertyOptions", propOrder = {
    "dataWarehouseServiceTypeType",
    "stopActionTypeServiceType"
})
public class ServiceTypeDimensionPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "DataWarehouseServiceType_Type")
    protected Boolean dataWarehouseServiceTypeType;
    @XmlElement(name = "StopActionType_ServiceType")
    protected Boolean stopActionTypeServiceType;

    /**
     * Obtém o valor da propriedade dataWarehouseServiceTypeType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDataWarehouseServiceTypeType() {
        return dataWarehouseServiceTypeType;
    }

    /**
     * Define o valor da propriedade dataWarehouseServiceTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataWarehouseServiceTypeType(Boolean value) {
        this.dataWarehouseServiceTypeType = value;
    }

    /**
     * Obtém o valor da propriedade stopActionTypeServiceType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopActionTypeServiceType() {
        return stopActionTypeServiceType;
    }

    /**
     * Define o valor da propriedade stopActionTypeServiceType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopActionTypeServiceType(Boolean value) {
        this.stopActionTypeServiceType = value;
    }

}
