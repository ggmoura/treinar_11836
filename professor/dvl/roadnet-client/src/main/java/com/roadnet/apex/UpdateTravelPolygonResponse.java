
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping.UpdateTravelPolygonResult;


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
 *         &lt;element name="UpdateTravelPolygonResult" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}UpdateTravelPolygonResult" minOccurs="0"/&gt;
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
    "updateTravelPolygonResult"
})
@XmlRootElement(name = "UpdateTravelPolygonResponse")
public class UpdateTravelPolygonResponse {

    @XmlElementRef(name = "UpdateTravelPolygonResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateTravelPolygonResult> updateTravelPolygonResult;

    /**
     * Obtém o valor da propriedade updateTravelPolygonResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdateTravelPolygonResult }{@code >}
     *     
     */
    public JAXBElement<UpdateTravelPolygonResult> getUpdateTravelPolygonResult() {
        return updateTravelPolygonResult;
    }

    /**
     * Define o valor da propriedade updateTravelPolygonResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdateTravelPolygonResult }{@code >}
     *     
     */
    public void setUpdateTravelPolygonResult(JAXBElement<UpdateTravelPolygonResult> value) {
        this.updateTravelPolygonResult = value;
    }

}
