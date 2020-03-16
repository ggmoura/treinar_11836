
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ServiceWindowDetailPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ServiceWindowDetailPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}TimeWindowDetailPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequiresMultipleWorkers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceWindowDetailPropertyOptions", propOrder = {
    "requiresMultipleWorkers"
})
@XmlSeeAlso({
    OrderClassifiedServiceWindowDetailPropertyOptions.class
})
public class ServiceWindowDetailPropertyOptions
    extends TimeWindowDetailPropertyOptions
{

    @XmlElement(name = "RequiresMultipleWorkers")
    protected Boolean requiresMultipleWorkers;

    /**
     * Obtém o valor da propriedade requiresMultipleWorkers.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiresMultipleWorkers() {
        return requiresMultipleWorkers;
    }

    /**
     * Define o valor da propriedade requiresMultipleWorkers.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiresMultipleWorkers(Boolean value) {
        this.requiresMultipleWorkers = value;
    }

}
