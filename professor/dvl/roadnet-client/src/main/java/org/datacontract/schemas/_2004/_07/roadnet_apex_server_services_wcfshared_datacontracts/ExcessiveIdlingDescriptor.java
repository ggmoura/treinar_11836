
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import com.roadnet.apex.datacontracts.LiquidVolume;


/**
 * <p>Classe Java de ExcessiveIdlingDescriptor complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ExcessiveIdlingDescriptor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions}ResourceExceptionSpecialDescriptor"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FuelDataSource_IdlingFuelDataSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FuelUsedIdling" type="{http://roadnet.com/apex/DataContracts/}LiquidVolume" minOccurs="0"/&gt;
 *         &lt;element name="IdlingDuration" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="IdlingFuelUsedCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcessiveIdlingDescriptor", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", propOrder = {
    "fuelDataSourceIdlingFuelDataSource",
    "fuelUsedIdling",
    "idlingDuration",
    "idlingFuelUsedCost"
})
public class ExcessiveIdlingDescriptor
    extends ResourceExceptionSpecialDescriptor
{

    @XmlElementRef(name = "FuelDataSource_IdlingFuelDataSource", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fuelDataSourceIdlingFuelDataSource;
    @XmlElementRef(name = "FuelUsedIdling", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.ResourceExceptionRuleFunctions", type = JAXBElement.class, required = false)
    protected JAXBElement<LiquidVolume> fuelUsedIdling;
    @XmlElement(name = "IdlingDuration")
    protected Duration idlingDuration;
    @XmlElement(name = "IdlingFuelUsedCost")
    protected Double idlingFuelUsedCost;

    /**
     * Obtém o valor da propriedade fuelDataSourceIdlingFuelDataSource.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFuelDataSourceIdlingFuelDataSource() {
        return fuelDataSourceIdlingFuelDataSource;
    }

    /**
     * Define o valor da propriedade fuelDataSourceIdlingFuelDataSource.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFuelDataSourceIdlingFuelDataSource(JAXBElement<String> value) {
        this.fuelDataSourceIdlingFuelDataSource = value;
    }

    /**
     * Obtém o valor da propriedade fuelUsedIdling.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public JAXBElement<LiquidVolume> getFuelUsedIdling() {
        return fuelUsedIdling;
    }

    /**
     * Define o valor da propriedade fuelUsedIdling.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LiquidVolume }{@code >}
     *     
     */
    public void setFuelUsedIdling(JAXBElement<LiquidVolume> value) {
        this.fuelUsedIdling = value;
    }

    /**
     * Obtém o valor da propriedade idlingDuration.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getIdlingDuration() {
        return idlingDuration;
    }

    /**
     * Define o valor da propriedade idlingDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setIdlingDuration(Duration value) {
        this.idlingDuration = value;
    }

    /**
     * Obtém o valor da propriedade idlingFuelUsedCost.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIdlingFuelUsedCost() {
        return idlingFuelUsedCost;
    }

    /**
     * Define o valor da propriedade idlingFuelUsedCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIdlingFuelUsedCost(Double value) {
        this.idlingFuelUsedCost = value;
    }

}
