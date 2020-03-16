
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.CreateTerritoriesTargetValues;


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
 *         &lt;element name="CalculateCreateTerritoriesTargetsForPassResult" type="{http://roadnet.com/apex/DataContracts/}CreateTerritoriesTargetValues" minOccurs="0"/&gt;
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
    "calculateCreateTerritoriesTargetsForPassResult"
})
@XmlRootElement(name = "CalculateCreateTerritoriesTargetsForPassResponse")
public class CalculateCreateTerritoriesTargetsForPassResponse {

    @XmlElementRef(name = "CalculateCreateTerritoriesTargetsForPassResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<CreateTerritoriesTargetValues> calculateCreateTerritoriesTargetsForPassResult;

    /**
     * Obtém o valor da propriedade calculateCreateTerritoriesTargetsForPassResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreateTerritoriesTargetValues }{@code >}
     *     
     */
    public JAXBElement<CreateTerritoriesTargetValues> getCalculateCreateTerritoriesTargetsForPassResult() {
        return calculateCreateTerritoriesTargetsForPassResult;
    }

    /**
     * Define o valor da propriedade calculateCreateTerritoriesTargetsForPassResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreateTerritoriesTargetValues }{@code >}
     *     
     */
    public void setCalculateCreateTerritoriesTargetsForPassResult(JAXBElement<CreateTerritoriesTargetValues> value) {
        this.calculateCreateTerritoriesTargetsForPassResult = value;
    }

}
