
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfEquipmentDataPoint;


/**
 * <p>Classe Java de SavePositionsParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SavePositionsParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataPoints" type="{http://roadnet.com/apex/DataContracts/}ArrayOfEquipmentDataPoint" minOccurs="0"/&gt;
 *         &lt;element name="DeviceEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SavePositionsParameters", propOrder = {
    "dataPoints",
    "deviceEntityKey",
    "equipmentEntityKey"
})
public class SavePositionsParameters {

    @XmlElementRef(name = "DataPoints", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEquipmentDataPoint> dataPoints;
    @XmlElement(name = "DeviceEntityKey")
    protected Long deviceEntityKey;
    @XmlElementRef(name = "EquipmentEntityKey", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> equipmentEntityKey;

    /**
     * Obtém o valor da propriedade dataPoints.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEquipmentDataPoint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEquipmentDataPoint> getDataPoints() {
        return dataPoints;
    }

    /**
     * Define o valor da propriedade dataPoints.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEquipmentDataPoint }{@code >}
     *     
     */
    public void setDataPoints(JAXBElement<ArrayOfEquipmentDataPoint> value) {
        this.dataPoints = value;
    }

    /**
     * Obtém o valor da propriedade deviceEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDeviceEntityKey() {
        return deviceEntityKey;
    }

    /**
     * Define o valor da propriedade deviceEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDeviceEntityKey(Long value) {
        this.deviceEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade equipmentEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getEquipmentEntityKey() {
        return equipmentEntityKey;
    }

    /**
     * Define o valor da propriedade equipmentEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setEquipmentEntityKey(JAXBElement<Long> value) {
        this.equipmentEntityKey = value;
    }

}
