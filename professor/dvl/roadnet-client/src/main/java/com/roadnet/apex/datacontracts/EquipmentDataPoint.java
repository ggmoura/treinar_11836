
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de EquipmentDataPoint complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentDataPoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PositionDataPoint" type="{http://roadnet.com/apex/DataContracts/}PositionDataPoint" minOccurs="0"/&gt;
 *         &lt;element name="TelemetryDataPoint" type="{http://roadnet.com/apex/DataContracts/}TelemetryDataPoint" minOccurs="0"/&gt;
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentDataPoint", propOrder = {
    "positionDataPoint",
    "telemetryDataPoint",
    "timestamp"
})
public class EquipmentDataPoint
    extends DataTransferObject
{

    @XmlElementRef(name = "PositionDataPoint", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<PositionDataPoint> positionDataPoint;
    @XmlElementRef(name = "TelemetryDataPoint", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TelemetryDataPoint> telemetryDataPoint;
    @XmlElement(name = "Timestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;

    /**
     * Obtém o valor da propriedade positionDataPoint.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PositionDataPoint }{@code >}
     *     
     */
    public JAXBElement<PositionDataPoint> getPositionDataPoint() {
        return positionDataPoint;
    }

    /**
     * Define o valor da propriedade positionDataPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PositionDataPoint }{@code >}
     *     
     */
    public void setPositionDataPoint(JAXBElement<PositionDataPoint> value) {
        this.positionDataPoint = value;
    }

    /**
     * Obtém o valor da propriedade telemetryDataPoint.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TelemetryDataPoint }{@code >}
     *     
     */
    public JAXBElement<TelemetryDataPoint> getTelemetryDataPoint() {
        return telemetryDataPoint;
    }

    /**
     * Define o valor da propriedade telemetryDataPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TelemetryDataPoint }{@code >}
     *     
     */
    public void setTelemetryDataPoint(JAXBElement<TelemetryDataPoint> value) {
        this.telemetryDataPoint = value;
    }

    /**
     * Obtém o valor da propriedade timestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Define o valor da propriedade timestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

}
