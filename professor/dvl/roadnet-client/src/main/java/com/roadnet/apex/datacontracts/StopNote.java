
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de StopNote complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="StopNote"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RouteNote"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StopEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopNote", propOrder = {
    "stopEntityKey"
})
@XmlSeeAlso({
    MidRouteDepotStopNote.class,
    NonServiceableStopNote.class,
    ServiceableStopNote.class
})
public class StopNote
    extends RouteNote
{

    @XmlElement(name = "StopEntityKey")
    protected Long stopEntityKey;

    /**
     * Obtém o valor da propriedade stopEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStopEntityKey() {
        return stopEntityKey;
    }

    /**
     * Define o valor da propriedade stopEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStopEntityKey(Long value) {
        this.stopEntityKey = value;
    }

}
