
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RouteAlertOption complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RouteAlertOption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}AlertOption"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RouteAlertFlags_Flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteAlertOption", propOrder = {
    "routeAlertFlagsFlag"
})
public class RouteAlertOption
    extends AlertOption
{

    @XmlElementRef(name = "RouteAlertFlags_Flag", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routeAlertFlagsFlag;

    /**
     * Obtém o valor da propriedade routeAlertFlagsFlag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRouteAlertFlagsFlag() {
        return routeAlertFlagsFlag;
    }

    /**
     * Define o valor da propriedade routeAlertFlagsFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRouteAlertFlagsFlag(JAXBElement<String> value) {
        this.routeAlertFlagsFlag = value;
    }

}
