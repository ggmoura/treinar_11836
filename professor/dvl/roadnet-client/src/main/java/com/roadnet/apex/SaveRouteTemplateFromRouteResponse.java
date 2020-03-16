
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing.ArrayOfSaveRouteTemplateFromRouteResult;


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
 *         &lt;element name="SaveRouteTemplateFromRouteResult" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}ArrayOfSaveRouteTemplateFromRouteResult" minOccurs="0"/&gt;
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
    "saveRouteTemplateFromRouteResult"
})
@XmlRootElement(name = "SaveRouteTemplateFromRouteResponse")
public class SaveRouteTemplateFromRouteResponse {

    @XmlElementRef(name = "SaveRouteTemplateFromRouteResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSaveRouteTemplateFromRouteResult> saveRouteTemplateFromRouteResult;

    /**
     * Obtém o valor da propriedade saveRouteTemplateFromRouteResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSaveRouteTemplateFromRouteResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSaveRouteTemplateFromRouteResult> getSaveRouteTemplateFromRouteResult() {
        return saveRouteTemplateFromRouteResult;
    }

    /**
     * Define o valor da propriedade saveRouteTemplateFromRouteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSaveRouteTemplateFromRouteResult }{@code >}
     *     
     */
    public void setSaveRouteTemplateFromRouteResult(JAXBElement<ArrayOfSaveRouteTemplateFromRouteResult> value) {
        this.saveRouteTemplateFromRouteResult = value;
    }

}
