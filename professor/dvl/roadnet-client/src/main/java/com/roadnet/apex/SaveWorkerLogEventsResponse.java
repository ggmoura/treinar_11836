
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
 *         &lt;element name="SaveWorkerLogEventsResult" type="{http://roadnet.com/apex/DataContracts/}ArrayOfSaveResult" minOccurs="0"/&gt;
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
    "saveWorkerLogEventsResult"
})
@XmlRootElement(name = "SaveWorkerLogEventsResponse")
public class SaveWorkerLogEventsResponse {

    @XmlElementRef(name = "SaveWorkerLogEventsResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSaveResult> saveWorkerLogEventsResult;

    /**
     * Obtém o valor da propriedade saveWorkerLogEventsResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSaveResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSaveResult> getSaveWorkerLogEventsResult() {
        return saveWorkerLogEventsResult;
    }

    /**
     * Define o valor da propriedade saveWorkerLogEventsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSaveResult }{@code >}
     *     
     */
    public void setSaveWorkerLogEventsResult(JAXBElement<ArrayOfSaveResult> value) {
        this.saveWorkerLogEventsResult = value;
    }

}
