
package com.roadnet.apex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ExportPlanningSolutionResult" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
    "exportPlanningSolutionResult"
})
@XmlRootElement(name = "ExportPlanningSolutionResponse")
public class ExportPlanningSolutionResponse {

    @XmlElement(name = "ExportPlanningSolutionResult")
    protected Long exportPlanningSolutionResult;

    /**
     * Obtém o valor da propriedade exportPlanningSolutionResult.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExportPlanningSolutionResult() {
        return exportPlanningSolutionResult;
    }

    /**
     * Define o valor da propriedade exportPlanningSolutionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExportPlanningSolutionResult(Long value) {
        this.exportPlanningSolutionResult = value;
    }

}
