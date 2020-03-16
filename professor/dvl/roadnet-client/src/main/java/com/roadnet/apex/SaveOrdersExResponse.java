
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfSaveResult;


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
 *         &lt;element name="SaveOrdersExResult" type="{http://roadnet.com/apex/DataContracts/}ArrayOfSaveResult" minOccurs="0"/&gt;
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
    "saveOrdersExResult"
})
@XmlRootElement(name = "SaveOrdersExResponse")
public class SaveOrdersExResponse {

    @XmlElementRef(name = "SaveOrdersExResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSaveResult> saveOrdersExResult;

    /**
     * Obtém o valor da propriedade saveOrdersExResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSaveResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSaveResult> getSaveOrdersExResult() {
        return saveOrdersExResult;
    }

    /**
     * Define o valor da propriedade saveOrdersExResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSaveResult }{@code >}
     *     
     */
    public void setSaveOrdersExResult(JAXBElement<ArrayOfSaveResult> value) {
        this.saveOrdersExResult = value;
    }

}
