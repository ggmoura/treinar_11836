
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de CalculateCreateTerritoriesTargetsParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CalculateCreateTerritoriesTargetsParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SessionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TargetType_Target" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TargetValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculateCreateTerritoriesTargetsParameters", propOrder = {
    "sessionEntityKey",
    "targetTypeTarget",
    "targetValue"
})
public class CalculateCreateTerritoriesTargetsParameters
    extends DataTransferObject
{

    @XmlElement(name = "SessionEntityKey")
    protected Long sessionEntityKey;
    @XmlElementRef(name = "TargetType_Target", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> targetTypeTarget;
    @XmlElement(name = "TargetValue")
    protected Double targetValue;

    /**
     * Obtém o valor da propriedade sessionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSessionEntityKey() {
        return sessionEntityKey;
    }

    /**
     * Define o valor da propriedade sessionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSessionEntityKey(Long value) {
        this.sessionEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade targetTypeTarget.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTargetTypeTarget() {
        return targetTypeTarget;
    }

    /**
     * Define o valor da propriedade targetTypeTarget.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTargetTypeTarget(JAXBElement<String> value) {
        this.targetTypeTarget = value;
    }

    /**
     * Obtém o valor da propriedade targetValue.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTargetValue() {
        return targetValue;
    }

    /**
     * Define o valor da propriedade targetValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTargetValue(Double value) {
        this.targetValue = value;
    }

}
