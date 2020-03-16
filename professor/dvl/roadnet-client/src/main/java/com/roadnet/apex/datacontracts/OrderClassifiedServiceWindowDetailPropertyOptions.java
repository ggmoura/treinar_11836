
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OrderClassifiedServiceWindowDetailPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OrderClassifiedServiceWindowDetailPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}ServiceWindowDetailPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ForceSave" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderClassEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderClassifiedServiceWindowDetailPropertyOptions", propOrder = {
    "forceSave",
    "orderClassEntityKey"
})
public class OrderClassifiedServiceWindowDetailPropertyOptions
    extends ServiceWindowDetailPropertyOptions
{

    @XmlElement(name = "ForceSave")
    protected Boolean forceSave;
    @XmlElement(name = "OrderClassEntityKey")
    protected Boolean orderClassEntityKey;

    /**
     * Obtém o valor da propriedade forceSave.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceSave() {
        return forceSave;
    }

    /**
     * Define o valor da propriedade forceSave.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceSave(Boolean value) {
        this.forceSave = value;
    }

    /**
     * Obtém o valor da propriedade orderClassEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOrderClassEntityKey() {
        return orderClassEntityKey;
    }

    /**
     * Define o valor da propriedade orderClassEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOrderClassEntityKey(Boolean value) {
        this.orderClassEntityKey = value;
    }

}
