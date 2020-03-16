
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de WorkerLoginStateNotification complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="WorkerLoginStateNotification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}Notification"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LoggedIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkerLoginStateNotification", propOrder = {
    "loggedIn"
})
public class WorkerLoginStateNotification
    extends Notification
{

    @XmlElement(name = "LoggedIn")
    protected Boolean loggedIn;

    /**
     * Obtém o valor da propriedade loggedIn.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLoggedIn() {
        return loggedIn;
    }

    /**
     * Define o valor da propriedade loggedIn.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLoggedIn(Boolean value) {
        this.loggedIn = value;
    }

}
