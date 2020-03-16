
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataWarehouseSpeedingEvent complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataWarehouseSpeedingEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse}DataWarehouseTelematicsEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataWarehouseSpeedingType_EventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Distance" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="MaxSpeed" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="PositionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SpeedLimit" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="SpeedOver" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataWarehouseSpeedingEvent", propOrder = {
    "dataWarehouseSpeedingTypeEventType",
    "distance",
    "maxSpeed",
    "positionText",
    "speedLimit",
    "speedOver"
})
public class DataWarehouseSpeedingEvent
    extends DataWarehouseTelematicsEvent
{

    @XmlElementRef(name = "DataWarehouseSpeedingType_EventType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataWarehouseSpeedingTypeEventType;
    @XmlElementRef(name = "Distance", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> distance;
    @XmlElementRef(name = "MaxSpeed", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> maxSpeed;
    @XmlElementRef(name = "PositionText", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> positionText;
    @XmlElementRef(name = "SpeedLimit", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> speedLimit;
    @XmlElementRef(name = "SpeedOver", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.DataWarehouse", type = JAXBElement.class, required = false)
    protected JAXBElement<Float> speedOver;

    /**
     * Obtém o valor da propriedade dataWarehouseSpeedingTypeEventType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataWarehouseSpeedingTypeEventType() {
        return dataWarehouseSpeedingTypeEventType;
    }

    /**
     * Define o valor da propriedade dataWarehouseSpeedingTypeEventType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataWarehouseSpeedingTypeEventType(JAXBElement<String> value) {
        this.dataWarehouseSpeedingTypeEventType = value;
    }

    /**
     * Obtém o valor da propriedade distance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getDistance() {
        return distance;
    }

    /**
     * Define o valor da propriedade distance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setDistance(JAXBElement<Float> value) {
        this.distance = value;
    }

    /**
     * Obtém o valor da propriedade maxSpeed.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Define o valor da propriedade maxSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setMaxSpeed(JAXBElement<Float> value) {
        this.maxSpeed = value;
    }

    /**
     * Obtém o valor da propriedade positionText.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPositionText() {
        return positionText;
    }

    /**
     * Define o valor da propriedade positionText.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPositionText(JAXBElement<String> value) {
        this.positionText = value;
    }

    /**
     * Obtém o valor da propriedade speedLimit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getSpeedLimit() {
        return speedLimit;
    }

    /**
     * Define o valor da propriedade speedLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setSpeedLimit(JAXBElement<Float> value) {
        this.speedLimit = value;
    }

    /**
     * Obtém o valor da propriedade speedOver.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public JAXBElement<Float> getSpeedOver() {
        return speedOver;
    }

    /**
     * Define o valor da propriedade speedOver.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Float }{@code >}
     *     
     */
    public void setSpeedOver(JAXBElement<Float> value) {
        this.speedOver = value;
    }

}
