
package org.datacontract.schemas._2004._07.roadnet_apex_server_services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MobileDeviceImportParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MobileDeviceImportParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Import}ImportParameters"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PreAuthenticateForOTNav" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileDeviceImportParameters", propOrder = {
    "preAuthenticateForOTNav"
})
public class MobileDeviceImportParameters
    extends ImportParameters
{

    @XmlElement(name = "PreAuthenticateForOTNav")
    protected Boolean preAuthenticateForOTNav;

    /**
     * Obtém o valor da propriedade preAuthenticateForOTNav.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreAuthenticateForOTNav() {
        return preAuthenticateForOTNav;
    }

    /**
     * Define o valor da propriedade preAuthenticateForOTNav.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreAuthenticateForOTNav(Boolean value) {
        this.preAuthenticateForOTNav = value;
    }

}
