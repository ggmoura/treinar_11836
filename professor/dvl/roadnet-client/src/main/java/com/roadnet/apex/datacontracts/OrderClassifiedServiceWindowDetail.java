
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OrderClassifiedServiceWindowDetail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OrderClassifiedServiceWindowDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}ServiceWindowDetail"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderClassEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderClassifiedServiceWindowDetail", propOrder = {
    "orderClassEntityKey"
})
@XmlSeeAlso({
    ServiceLocationServiceWindowDetail.class,
    TimeWindowTypeServiceWindowDetail.class
})
public class OrderClassifiedServiceWindowDetail
    extends ServiceWindowDetail
{

    @XmlElement(name = "OrderClassEntityKey")
    protected Long orderClassEntityKey;

    /**
     * Obtém o valor da propriedade orderClassEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrderClassEntityKey() {
        return orderClassEntityKey;
    }

    /**
     * Define o valor da propriedade orderClassEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrderClassEntityKey(Long value) {
        this.orderClassEntityKey = value;
    }

}
