
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
 *         &lt;element name="CreateRoutesResult" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
    "createRoutesResult"
})
@XmlRootElement(name = "CreateRoutesResponse")
public class CreateRoutesResponse {

    @XmlElement(name = "CreateRoutesResult")
    protected Long createRoutesResult;

    /**
     * Obtém o valor da propriedade createRoutesResult.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreateRoutesResult() {
        return createRoutesResult;
    }

    /**
     * Define o valor da propriedade createRoutesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreateRoutesResult(Long value) {
        this.createRoutesResult = value;
    }

}
