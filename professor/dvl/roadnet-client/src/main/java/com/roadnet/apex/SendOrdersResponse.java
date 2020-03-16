
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.SendOrdersResults;


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
 *         &lt;element name="SendOrdersResult" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}SendOrdersResults" minOccurs="0"/&gt;
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
    "sendOrdersResult"
})
@XmlRootElement(name = "SendOrdersResponse")
public class SendOrdersResponse {

    @XmlElementRef(name = "SendOrdersResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<SendOrdersResults> sendOrdersResult;

    /**
     * Obtém o valor da propriedade sendOrdersResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SendOrdersResults }{@code >}
     *     
     */
    public JAXBElement<SendOrdersResults> getSendOrdersResult() {
        return sendOrdersResult;
    }

    /**
     * Define o valor da propriedade sendOrdersResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SendOrdersResults }{@code >}
     *     
     */
    public void setSendOrdersResult(JAXBElement<SendOrdersResults> value) {
        this.sendOrdersResult = value;
    }

}
