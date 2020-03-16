
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
 *         &lt;element name="UpdateDailyRoutesJobResult" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
    "updateDailyRoutesJobResult"
})
@XmlRootElement(name = "UpdateDailyRoutesJobResponse")
public class UpdateDailyRoutesJobResponse {

    @XmlElement(name = "UpdateDailyRoutesJobResult")
    protected Long updateDailyRoutesJobResult;

    /**
     * Obtém o valor da propriedade updateDailyRoutesJobResult.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUpdateDailyRoutesJobResult() {
        return updateDailyRoutesJobResult;
    }

    /**
     * Define o valor da propriedade updateDailyRoutesJobResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUpdateDailyRoutesJobResult(Long value) {
        this.updateDailyRoutesJobResult = value;
    }

}
