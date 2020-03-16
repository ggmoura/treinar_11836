
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.NetworkTravelModel;


/**
 * <p>Classe Java de RetrieveTravelModelResults complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveTravelModelResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TravelModel" type="{http://roadnet.com/apex/DataContracts/}NetworkTravelModel" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveTravelModelResults", propOrder = {
    "travelModel"
})
public class RetrieveTravelModelResults {

    @XmlElementRef(name = "TravelModel", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkTravelModel> travelModel;

    /**
     * Obtém o valor da propriedade travelModel.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkTravelModel }{@code >}
     *     
     */
    public JAXBElement<NetworkTravelModel> getTravelModel() {
        return travelModel;
    }

    /**
     * Define o valor da propriedade travelModel.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkTravelModel }{@code >}
     *     
     */
    public void setTravelModel(JAXBElement<NetworkTravelModel> value) {
        this.travelModel = value;
    }

}
