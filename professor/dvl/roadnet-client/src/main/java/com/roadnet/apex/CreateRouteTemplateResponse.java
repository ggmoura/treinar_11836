
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.SaveResult;


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
 *         &lt;element name="CreateRouteTemplateResult" type="{http://roadnet.com/apex/DataContracts/}SaveResult" minOccurs="0"/&gt;
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
    "createRouteTemplateResult"
})
@XmlRootElement(name = "CreateRouteTemplateResponse")
public class CreateRouteTemplateResponse {

    @XmlElementRef(name = "CreateRouteTemplateResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<SaveResult> createRouteTemplateResult;

    /**
     * Obtém o valor da propriedade createRouteTemplateResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SaveResult }{@code >}
     *     
     */
    public JAXBElement<SaveResult> getCreateRouteTemplateResult() {
        return createRouteTemplateResult;
    }

    /**
     * Define o valor da propriedade createRouteTemplateResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SaveResult }{@code >}
     *     
     */
    public void setCreateRouteTemplateResult(JAXBElement<SaveResult> value) {
        this.createRouteTemplateResult = value;
    }

}
