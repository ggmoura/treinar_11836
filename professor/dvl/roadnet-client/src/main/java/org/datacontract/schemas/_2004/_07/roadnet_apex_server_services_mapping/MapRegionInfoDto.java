
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.MapDataRegionsEx;


/**
 * <p>Classe Java de MapRegionInfoDto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MapRegionInfoDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared}MapDataRegionsEx" minOccurs="0"/&gt;
 *         &lt;element name="MapBuckets" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}ArrayOfMapBucketInfoDto" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MapRegionInfoDto", propOrder = {
    "description",
    "identifier",
    "mapBuckets"
})
public class MapRegionInfoDto {

    @XmlElementRef(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "Identifier")
    @XmlSchemaType(name = "string")
    protected MapDataRegionsEx identifier;
    @XmlElementRef(name = "MapBuckets", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMapBucketInfoDto> mapBuckets;

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link MapDataRegionsEx }
     *     
     */
    public MapDataRegionsEx getIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link MapDataRegionsEx }
     *     
     */
    public void setIdentifier(MapDataRegionsEx value) {
        this.identifier = value;
    }

    /**
     * Obtém o valor da propriedade mapBuckets.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMapBucketInfoDto }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMapBucketInfoDto> getMapBuckets() {
        return mapBuckets;
    }

    /**
     * Define o valor da propriedade mapBuckets.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMapBucketInfoDto }{@code >}
     *     
     */
    public void setMapBuckets(JAXBElement<ArrayOfMapBucketInfoDto> value) {
        this.mapBuckets = value;
    }

}
