
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.ArrayOfRouteShield;


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
 *         &lt;element name="RetrieveRouteShieldsResult" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}ArrayOfRouteShield" minOccurs="0"/&gt;
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
    "retrieveRouteShieldsResult"
})
@XmlRootElement(name = "RetrieveRouteShieldsResponse")
public class RetrieveRouteShieldsResponse {

    @XmlElementRef(name = "RetrieveRouteShieldsResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRouteShield> retrieveRouteShieldsResult;

    /**
     * Obtém o valor da propriedade retrieveRouteShieldsResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteShield }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRouteShield> getRetrieveRouteShieldsResult() {
        return retrieveRouteShieldsResult;
    }

    /**
     * Define o valor da propriedade retrieveRouteShieldsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRouteShield }{@code >}
     *     
     */
    public void setRetrieveRouteShieldsResult(JAXBElement<ArrayOfRouteShield> value) {
        this.retrieveRouteShieldsResult = value;
    }

}
