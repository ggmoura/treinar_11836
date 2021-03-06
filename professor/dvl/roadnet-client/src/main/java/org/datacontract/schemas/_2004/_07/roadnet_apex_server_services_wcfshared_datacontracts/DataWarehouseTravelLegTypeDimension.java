
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.AggregateRootEntity;


/**
 * <p>Classe Java de DataWarehouseTravelLegTypeDimension complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseTravelLegTypeDimension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}AggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehouseTravelLegTypeDimension_TravelLegType_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseTravelLegTypeDimension", propOrder = {
    "dataWarehouseTravelLegTypeDimensionTravelLegTypeType"
})
public class DataWarehouseTravelLegTypeDimension
    extends AggregateRootEntity
{

    @XmlElementRef(name = "DataWarehouseTravelLegTypeDimension_TravelLegType_Type", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseTravelLegTypeDimensionTravelLegTypeType;

    /**
     * Obtém o valor da propriedade dataWarehouseTravelLegTypeDimensionTravelLegTypeType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseTravelLegTypeDimensionTravelLegTypeType() {
        return dataWarehouseTravelLegTypeDimensionTravelLegTypeType;
    }

    /**
     * Define o valor da propriedade dataWarehouseTravelLegTypeDimensionTravelLegTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseTravelLegTypeDimensionTravelLegTypeType(JAXBElement<String> value) {
        this.dataWarehouseTravelLegTypeDimensionTravelLegTypeType = value;
    }

}
