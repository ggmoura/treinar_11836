
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de AddStopsUsingStationaryResourceEventOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AddStopsUsingStationaryResourceEventOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GeocodeLocation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddStopsUsingStationaryResourceEventOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.Options", propOrder = {
    "geocodeLocation"
})
public class AddStopsUsingStationaryResourceEventOptions {

    @XmlElement(name = "GeocodeLocation")
    protected Boolean geocodeLocation;

    /**
     * Obtém o valor da propriedade geocodeLocation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGeocodeLocation() {
        return geocodeLocation;
    }

    /**
     * Define o valor da propriedade geocodeLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGeocodeLocation(Boolean value) {
        this.geocodeLocation = value;
    }

}
