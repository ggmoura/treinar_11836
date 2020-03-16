
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseAtomicMeasureType;


/**
 * <p>Classe Java de AtomicMeasureTypeMetadata complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AtomicMeasureTypeMetadata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse}MeasureTypeMetadata"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MeasureType" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DataWarehouseAtomicMeasureType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AtomicMeasureTypeMetadata", propOrder = {
    "measureType"
})
public class AtomicMeasureTypeMetadata
    extends MeasureTypeMetadata
{

    @XmlElement(name = "MeasureType")
    @XmlSchemaType(name = "string")
    protected DataWarehouseAtomicMeasureType measureType;

    /**
     * Obtém o valor da propriedade measureType.
     * 
     * @return
     *     possible object is
     *     {@link DataWarehouseAtomicMeasureType }
     *     
     */
    public DataWarehouseAtomicMeasureType getMeasureType() {
        return measureType;
    }

    /**
     * Define o valor da propriedade measureType.
     * 
     * @param value
     *     allowed object is
     *     {@link DataWarehouseAtomicMeasureType }
     *     
     */
    public void setMeasureType(DataWarehouseAtomicMeasureType value) {
        this.measureType = value;
    }

}
