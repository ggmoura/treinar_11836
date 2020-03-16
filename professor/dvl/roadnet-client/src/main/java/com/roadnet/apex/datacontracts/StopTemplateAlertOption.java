
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de StopTemplateAlertOption complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="StopTemplateAlertOption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}AlertOption"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Parameter" type="{http://roadnet.com/apex/DataContracts/}AlertParameter" minOccurs="0"/&gt;
 *         &lt;element name="StopTemplateAlertFlags_Flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopTemplateAlertOption", propOrder = {
    "parameter",
    "stopTemplateAlertFlagsFlag"
})
public class StopTemplateAlertOption
    extends AlertOption
{

    @XmlElementRef(name = "Parameter", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<AlertParameter> parameter;
    @XmlElementRef(name = "StopTemplateAlertFlags_Flag", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stopTemplateAlertFlagsFlag;

    /**
     * Obtém o valor da propriedade parameter.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AlertParameter }{@code >}
     *     
     */
    public JAXBElement<AlertParameter> getParameter() {
        return parameter;
    }

    /**
     * Define o valor da propriedade parameter.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AlertParameter }{@code >}
     *     
     */
    public void setParameter(JAXBElement<AlertParameter> value) {
        this.parameter = value;
    }

    /**
     * Obtém o valor da propriedade stopTemplateAlertFlagsFlag.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStopTemplateAlertFlagsFlag() {
        return stopTemplateAlertFlagsFlag;
    }

    /**
     * Define o valor da propriedade stopTemplateAlertFlagsFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStopTemplateAlertFlagsFlag(JAXBElement<String> value) {
        this.stopTemplateAlertFlagsFlag = value;
    }

}
