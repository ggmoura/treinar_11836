
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.AggregateRootEntity;


/**
 * <p>Classe Java de DataWarehousePlannedAndActualDimension complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehousePlannedAndActualDimension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}AggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehousePlannedAndActualType_PlannedAndActual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehousePlannedAndActualDimension", propOrder = {
    "dataWarehousePlannedAndActualTypePlannedAndActual"
})
public class DataWarehousePlannedAndActualDimension
    extends AggregateRootEntity
{

    @XmlElementRef(name = "DataWarehousePlannedAndActualType_PlannedAndActual", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehousePlannedAndActualTypePlannedAndActual;

    /**
     * Obtém o valor da propriedade dataWarehousePlannedAndActualTypePlannedAndActual.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehousePlannedAndActualTypePlannedAndActual() {
        return dataWarehousePlannedAndActualTypePlannedAndActual;
    }

    /**
     * Define o valor da propriedade dataWarehousePlannedAndActualTypePlannedAndActual.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehousePlannedAndActualTypePlannedAndActual(JAXBElement<String> value) {
        this.dataWarehousePlannedAndActualTypePlannedAndActual = value;
    }

}
