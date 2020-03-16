
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfShareableEntityAccessor;


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
 *         &lt;element name="RetrieveSharedEntityAccessorsResult" type="{http://roadnet.com/apex/DataContracts/}ArrayOfShareableEntityAccessor" minOccurs="0"/&gt;
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
    "retrieveSharedEntityAccessorsResult"
})
@XmlRootElement(name = "RetrieveSharedEntityAccessorsResponse")
public class RetrieveSharedEntityAccessorsResponse {

    @XmlElementRef(name = "RetrieveSharedEntityAccessorsResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfShareableEntityAccessor> retrieveSharedEntityAccessorsResult;

    /**
     * Obtém o valor da propriedade retrieveSharedEntityAccessorsResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfShareableEntityAccessor }{@code >}
     *     
     */
    public JAXBElement<ArrayOfShareableEntityAccessor> getRetrieveSharedEntityAccessorsResult() {
        return retrieveSharedEntityAccessorsResult;
    }

    /**
     * Define o valor da propriedade retrieveSharedEntityAccessorsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfShareableEntityAccessor }{@code >}
     *     
     */
    public void setRetrieveSharedEntityAccessorsResult(JAXBElement<ArrayOfShareableEntityAccessor> value) {
        this.retrieveSharedEntityAccessorsResult = value;
    }

}
