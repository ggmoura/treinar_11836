
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RouteOptimizationNotification complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RouteOptimizationNotification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}Notification"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RouteOptimizationSuggestionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteOptimizationNotification", propOrder = {
    "routeOptimizationSuggestionEntityKey"
})
public class RouteOptimizationNotification
    extends Notification
{

    @XmlElement(name = "RouteOptimizationSuggestionEntityKey")
    protected Long routeOptimizationSuggestionEntityKey;

    /**
     * Obtém o valor da propriedade routeOptimizationSuggestionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRouteOptimizationSuggestionEntityKey() {
        return routeOptimizationSuggestionEntityKey;
    }

    /**
     * Define o valor da propriedade routeOptimizationSuggestionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRouteOptimizationSuggestionEntityKey(Long value) {
        this.routeOptimizationSuggestionEntityKey = value;
    }

}
