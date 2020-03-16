
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.NetworkTravelPolygon;


/**
 * <p>Classe Java de UpdateTravelPolygonResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UpdateTravelPolygonResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UpdatedTravelPolygon" type="{http://roadnet.com/apex/DataContracts/}NetworkTravelPolygon" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateTravelPolygonResult", propOrder = {
    "updatedTravelPolygon"
})
public class UpdateTravelPolygonResult {

    @XmlElementRef(name = "UpdatedTravelPolygon", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkTravelPolygon> updatedTravelPolygon;

    /**
     * Obtém o valor da propriedade updatedTravelPolygon.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkTravelPolygon }{@code >}
     *     
     */
    public JAXBElement<NetworkTravelPolygon> getUpdatedTravelPolygon() {
        return updatedTravelPolygon;
    }

    /**
     * Define o valor da propriedade updatedTravelPolygon.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkTravelPolygon }{@code >}
     *     
     */
    public void setUpdatedTravelPolygon(JAXBElement<NetworkTravelPolygon> value) {
        this.updatedTravelPolygon = value;
    }

}
