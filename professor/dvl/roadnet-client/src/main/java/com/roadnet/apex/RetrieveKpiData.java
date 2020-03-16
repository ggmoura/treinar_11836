
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.DataWarehouseKpiBase;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.MeasureUnitOptions;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kpiBaseDto" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DataWarehouseKpiBase" minOccurs="0"/&gt;
 *         &lt;element name="measureUnitOptionsDto" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}MeasureUnitOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "kpiBaseDto",
    "measureUnitOptionsDto"
})
@XmlRootElement(name = "RetrieveKpiData")
public class RetrieveKpiData {

    @XmlElementRef(name = "kpiBaseDto", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<DataWarehouseKpiBase> kpiBaseDto;
    @XmlElementRef(name = "measureUnitOptionsDto", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<MeasureUnitOptions> measureUnitOptionsDto;

    /**
     * Obtém o valor da propriedade kpiBaseDto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseKpiBase }{@code >}
     *     
     */
    public JAXBElement<DataWarehouseKpiBase> getKpiBaseDto() {
        return kpiBaseDto;
    }

    /**
     * Define o valor da propriedade kpiBaseDto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataWarehouseKpiBase }{@code >}
     *     
     */
    public void setKpiBaseDto(JAXBElement<DataWarehouseKpiBase> value) {
        this.kpiBaseDto = value;
    }

    /**
     * Obtém o valor da propriedade measureUnitOptionsDto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MeasureUnitOptions }{@code >}
     *     
     */
    public JAXBElement<MeasureUnitOptions> getMeasureUnitOptionsDto() {
        return measureUnitOptionsDto;
    }

    /**
     * Define o valor da propriedade measureUnitOptionsDto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MeasureUnitOptions }{@code >}
     *     
     */
    public void setMeasureUnitOptionsDto(JAXBElement<MeasureUnitOptions> value) {
        this.measureUnitOptionsDto = value;
    }

}
