
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfNamedPlace;


/**
 * <p>Classe Java de GeocodeCriteria complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GeocodeCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NamedPlaces" type="{http://roadnet.com/apex/DataContracts/}ArrayOfNamedPlace" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeocodeCriteria", propOrder = {
    "namedPlaces"
})
public class GeocodeCriteria {

    @XmlElementRef(name = "NamedPlaces", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNamedPlace> namedPlaces;

    /**
     * Obtém o valor da propriedade namedPlaces.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNamedPlace }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNamedPlace> getNamedPlaces() {
        return namedPlaces;
    }

    /**
     * Define o valor da propriedade namedPlaces.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNamedPlace }{@code >}
     *     
     */
    public void setNamedPlaces(JAXBElement<ArrayOfNamedPlace> value) {
        this.namedPlaces = value;
    }

}
