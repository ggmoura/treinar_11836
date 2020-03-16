
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfRouteTemplate;


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
 *         &lt;element name="BalanceRouteTemplatesResult" type="{http://roadnet.com/apex/DataContracts/}ArrayOfRouteTemplate" minOccurs="0"/&gt;
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
    "balanceRouteTemplatesResult"
})
@XmlRootElement(name = "BalanceRouteTemplatesResponse")
public class BalanceRouteTemplatesResponse {

    @XmlElementRef(name = "BalanceRouteTemplatesResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRouteTemplate> balanceRouteTemplatesResult;

    /**
     * Obtém o valor da propriedade balanceRouteTemplatesResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteTemplate }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRouteTemplate> getBalanceRouteTemplatesResult() {
        return balanceRouteTemplatesResult;
    }

    /**
     * Define o valor da propriedade balanceRouteTemplatesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteTemplate }{@code >}
     *     
     */
    public void setBalanceRouteTemplatesResult(JAXBElement<ArrayOfRouteTemplate> value) {
        this.balanceRouteTemplatesResult = value;
    }

}
