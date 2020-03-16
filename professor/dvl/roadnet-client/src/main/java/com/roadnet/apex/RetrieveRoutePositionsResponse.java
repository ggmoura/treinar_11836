
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfRoutePosition;


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
 *         &lt;element name="RetrieveRoutePositionsResult" type="{http://roadnet.com/apex/DataContracts/}ArrayOfRoutePosition" minOccurs="0"/&gt;
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
    "retrieveRoutePositionsResult"
})
@XmlRootElement(name = "RetrieveRoutePositionsResponse")
public class RetrieveRoutePositionsResponse {

    @XmlElementRef(name = "RetrieveRoutePositionsResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRoutePosition> retrieveRoutePositionsResult;

    /**
     * Obtém o valor da propriedade retrieveRoutePositionsResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRoutePosition }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRoutePosition> getRetrieveRoutePositionsResult() {
        return retrieveRoutePositionsResult;
    }

    /**
     * Define o valor da propriedade retrieveRoutePositionsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRoutePosition }{@code >}
     *     
     */
    public void setRetrieveRoutePositionsResult(JAXBElement<ArrayOfRoutePosition> value) {
        this.retrieveRoutePositionsResult = value;
    }

}
