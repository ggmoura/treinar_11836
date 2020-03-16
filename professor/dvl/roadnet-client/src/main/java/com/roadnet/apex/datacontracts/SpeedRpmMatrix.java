
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de SpeedRpmMatrix complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SpeedRpmMatrix"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SpeedRpmTimes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SpeedUnit_SpeedUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpeedRpmMatrix", propOrder = {
    "speedRpmTimes",
    "speedUnitSpeedUnit"
})
public class SpeedRpmMatrix
    extends DataTransferObject
{

    @XmlElementRef(name = "SpeedRpmTimes", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> speedRpmTimes;
    @XmlElementRef(name = "SpeedUnit_SpeedUnit", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> speedUnitSpeedUnit;

    /**
     * Obtém o valor da propriedade speedRpmTimes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpeedRpmTimes() {
        return speedRpmTimes;
    }

    /**
     * Define o valor da propriedade speedRpmTimes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpeedRpmTimes(JAXBElement<String> value) {
        this.speedRpmTimes = value;
    }

    /**
     * Obtém o valor da propriedade speedUnitSpeedUnit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpeedUnitSpeedUnit() {
        return speedUnitSpeedUnit;
    }

    /**
     * Define o valor da propriedade speedUnitSpeedUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpeedUnitSpeedUnit(JAXBElement<String> value) {
        this.speedUnitSpeedUnit = value;
    }

}
