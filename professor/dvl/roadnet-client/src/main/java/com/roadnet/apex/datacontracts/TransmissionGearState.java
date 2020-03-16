
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de TransmissionGearState complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TransmissionGearState"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SpecificGearValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TransmissionGearPosition_GearPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransmissionGearState", propOrder = {
    "specificGearValue",
    "transmissionGearPositionGearPosition"
})
public class TransmissionGearState
    extends DataTransferObject
{

    @XmlElementRef(name = "SpecificGearValue", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> specificGearValue;
    @XmlElementRef(name = "TransmissionGearPosition_GearPosition", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transmissionGearPositionGearPosition;

    /**
     * Obtém o valor da propriedade specificGearValue.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSpecificGearValue() {
        return specificGearValue;
    }

    /**
     * Define o valor da propriedade specificGearValue.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSpecificGearValue(JAXBElement<Integer> value) {
        this.specificGearValue = value;
    }

    /**
     * Obtém o valor da propriedade transmissionGearPositionGearPosition.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransmissionGearPositionGearPosition() {
        return transmissionGearPositionGearPosition;
    }

    /**
     * Define o valor da propriedade transmissionGearPositionGearPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransmissionGearPositionGearPosition(JAXBElement<String> value) {
        this.transmissionGearPositionGearPosition = value;
    }

}
