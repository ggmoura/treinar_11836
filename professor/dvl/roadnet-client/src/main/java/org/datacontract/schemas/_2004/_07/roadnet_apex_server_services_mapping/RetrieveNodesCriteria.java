
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.Viewport;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de RetrieveNodesCriteria complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveNodesCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MapNodeTypeFlags_NodeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TileZoomLevelScale" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Viewport" type="{http://roadnet.com/apex/DataContracts/}Viewport" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveNodesCriteria", propOrder = {
    "mapNodeTypeFlagsNodeType",
    "tileZoomLevelScale",
    "viewport"
})
public class RetrieveNodesCriteria
    extends DataTransferObject
{

    @XmlElementRef(name = "MapNodeTypeFlags_NodeType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapNodeTypeFlagsNodeType;
    @XmlElement(name = "TileZoomLevelScale")
    protected Double tileZoomLevelScale;
    @XmlElementRef(name = "Viewport", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Viewport> viewport;

    /**
     * Obtém o valor da propriedade mapNodeTypeFlagsNodeType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMapNodeTypeFlagsNodeType() {
        return mapNodeTypeFlagsNodeType;
    }

    /**
     * Define o valor da propriedade mapNodeTypeFlagsNodeType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMapNodeTypeFlagsNodeType(JAXBElement<String> value) {
        this.mapNodeTypeFlagsNodeType = value;
    }

    /**
     * Obtém o valor da propriedade tileZoomLevelScale.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTileZoomLevelScale() {
        return tileZoomLevelScale;
    }

    /**
     * Define o valor da propriedade tileZoomLevelScale.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTileZoomLevelScale(Double value) {
        this.tileZoomLevelScale = value;
    }

    /**
     * Obtém o valor da propriedade viewport.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Viewport }{@code >}
     *     
     */
    public JAXBElement<Viewport> getViewport() {
        return viewport;
    }

    /**
     * Define o valor da propriedade viewport.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Viewport }{@code >}
     *     
     */
    public void setViewport(JAXBElement<Viewport> value) {
        this.viewport = value;
    }

}
