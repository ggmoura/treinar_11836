
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de MeasureUnitOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MeasureUnitOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DistanceUnit_DistanceUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LiquidVolumeUnit_LiquidVolumeUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasureUnitOptions", propOrder = {
    "distanceUnitDistanceUnit",
    "liquidVolumeUnitLiquidVolumeUnit"
})
public class MeasureUnitOptions
    extends DataTransferObject
{

    @XmlElementRef(name = "DistanceUnit_DistanceUnit", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> distanceUnitDistanceUnit;
    @XmlElementRef(name = "LiquidVolumeUnit_LiquidVolumeUnit", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> liquidVolumeUnitLiquidVolumeUnit;

    /**
     * Obtém o valor da propriedade distanceUnitDistanceUnit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDistanceUnitDistanceUnit() {
        return distanceUnitDistanceUnit;
    }

    /**
     * Define o valor da propriedade distanceUnitDistanceUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDistanceUnitDistanceUnit(JAXBElement<String> value) {
        this.distanceUnitDistanceUnit = value;
    }

    /**
     * Obtém o valor da propriedade liquidVolumeUnitLiquidVolumeUnit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLiquidVolumeUnitLiquidVolumeUnit() {
        return liquidVolumeUnitLiquidVolumeUnit;
    }

    /**
     * Define o valor da propriedade liquidVolumeUnitLiquidVolumeUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLiquidVolumeUnitLiquidVolumeUnit(JAXBElement<String> value) {
        this.liquidVolumeUnitLiquidVolumeUnit = value;
    }

}
