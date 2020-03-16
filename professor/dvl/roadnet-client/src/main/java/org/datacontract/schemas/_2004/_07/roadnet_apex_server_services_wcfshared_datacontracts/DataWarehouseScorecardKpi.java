
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehouseScorecardKpi complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseScorecardKpi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DataWarehouseKpiBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Measures" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}ArrayOfDataWarehouseScorecardKpiMeasure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseScorecardKpi", propOrder = {
    "measures"
})
public class DataWarehouseScorecardKpi
    extends DataWarehouseKpiBase
{

    @XmlElementRef(name = "Measures", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDataWarehouseScorecardKpiMeasure> measures;

    /**
     * Obtém o valor da propriedade measures.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseScorecardKpiMeasure }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDataWarehouseScorecardKpiMeasure> getMeasures() {
        return measures;
    }

    /**
     * Define o valor da propriedade measures.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDataWarehouseScorecardKpiMeasure }{@code >}
     *     
     */
    public void setMeasures(JAXBElement<ArrayOfDataWarehouseScorecardKpiMeasure> value) {
        this.measures = value;
    }

}
