
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
 *         &lt;element name="IsCustomHierarchyEnabledResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "isCustomHierarchyEnabledResult"
})
@XmlRootElement(name = "IsCustomHierarchyEnabledResponse")
public class IsCustomHierarchyEnabledResponse {

    @XmlElement(name = "IsCustomHierarchyEnabledResult")
    protected Boolean isCustomHierarchyEnabledResult;

    /**
     * Obtém o valor da propriedade isCustomHierarchyEnabledResult.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCustomHierarchyEnabledResult() {
        return isCustomHierarchyEnabledResult;
    }

    /**
     * Define o valor da propriedade isCustomHierarchyEnabledResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCustomHierarchyEnabledResult(Boolean value) {
        this.isCustomHierarchyEnabledResult = value;
    }

}
