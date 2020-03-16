
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfNetworkRestrictedPath;
import com.roadnet.apex.datacontracts.ArrayOfNetworkTravelPolygon;


/**
 * <p>Classe Java de RetrieveRestrictedPathsAndPolygonsResults complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveRestrictedPathsAndPolygonsResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TravelPaths" type="{http://roadnet.com/apex/DataContracts/}ArrayOfNetworkRestrictedPath" minOccurs="0"/&gt;
 *         &lt;element name="TravelPolygons" type="{http://roadnet.com/apex/DataContracts/}ArrayOfNetworkTravelPolygon" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveRestrictedPathsAndPolygonsResults", propOrder = {
    "travelPaths",
    "travelPolygons"
})
public class RetrieveRestrictedPathsAndPolygonsResults {

    @XmlElementRef(name = "TravelPaths", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNetworkRestrictedPath> travelPaths;
    @XmlElementRef(name = "TravelPolygons", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNetworkTravelPolygon> travelPolygons;

    /**
     * Obtém o valor da propriedade travelPaths.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkRestrictedPath }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNetworkRestrictedPath> getTravelPaths() {
        return travelPaths;
    }

    /**
     * Define o valor da propriedade travelPaths.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkRestrictedPath }{@code >}
     *     
     */
    public void setTravelPaths(JAXBElement<ArrayOfNetworkRestrictedPath> value) {
        this.travelPaths = value;
    }

    /**
     * Obtém o valor da propriedade travelPolygons.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkTravelPolygon }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNetworkTravelPolygon> getTravelPolygons() {
        return travelPolygons;
    }

    /**
     * Define o valor da propriedade travelPolygons.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkTravelPolygon }{@code >}
     *     
     */
    public void setTravelPolygons(JAXBElement<ArrayOfNetworkTravelPolygon> value) {
        this.travelPolygons = value;
    }

}
