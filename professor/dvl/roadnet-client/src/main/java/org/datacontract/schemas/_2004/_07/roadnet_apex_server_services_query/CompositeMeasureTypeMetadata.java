
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.CompositeMeasure;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseCompositeMeasureType;


/**
 * <p>Classe Java de CompositeMeasureTypeMetadata complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CompositeMeasureTypeMetadata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse}MeasureTypeMetadata"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompositeMeasure" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}CompositeMeasure" minOccurs="0"/&gt;
 *         &lt;element name="MeasureType" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DataWarehouseCompositeMeasureType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositeMeasureTypeMetadata", propOrder = {
    "compositeMeasure",
    "measureType"
})
public class CompositeMeasureTypeMetadata
    extends MeasureTypeMetadata
{

    @XmlElementRef(name = "CompositeMeasure", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<CompositeMeasure> compositeMeasure;
    @XmlElement(name = "MeasureType")
    @XmlSchemaType(name = "string")
    protected DataWarehouseCompositeMeasureType measureType;

    /**
     * Obtém o valor da propriedade compositeMeasure.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CompositeMeasure }{@code >}
     *     
     */
    public JAXBElement<CompositeMeasure> getCompositeMeasure() {
        return compositeMeasure;
    }

    /**
     * Define o valor da propriedade compositeMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CompositeMeasure }{@code >}
     *     
     */
    public void setCompositeMeasure(JAXBElement<CompositeMeasure> value) {
        this.compositeMeasure = value;
    }

    /**
     * Obtém o valor da propriedade measureType.
     * 
     * @return
     *     possible object is
     *     {@link DataWarehouseCompositeMeasureType }
     *     
     */
    public DataWarehouseCompositeMeasureType getMeasureType() {
        return measureType;
    }

    /**
     * Define o valor da propriedade measureType.
     * 
     * @param value
     *     allowed object is
     *     {@link DataWarehouseCompositeMeasureType }
     *     
     */
    public void setMeasureType(DataWarehouseCompositeMeasureType value) {
        this.measureType = value;
    }

}
