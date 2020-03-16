
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PlannedAndActualDimensionDetail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PlannedAndActualDimensionDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DimensionDetail"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehousePlannedAndActualType_Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlannedAndActualDimensionDetail", propOrder = {
    "dataWarehousePlannedAndActualTypeValue"
})
public class PlannedAndActualDimensionDetail
    extends DimensionDetail
{

    @XmlElementRef(name = "DataWarehousePlannedAndActualType_Value", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehousePlannedAndActualTypeValue;

    /**
     * Obtém o valor da propriedade dataWarehousePlannedAndActualTypeValue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehousePlannedAndActualTypeValue() {
        return dataWarehousePlannedAndActualTypeValue;
    }

    /**
     * Define o valor da propriedade dataWarehousePlannedAndActualTypeValue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehousePlannedAndActualTypeValue(JAXBElement<String> value) {
        this.dataWarehousePlannedAndActualTypeValue = value;
    }

}
