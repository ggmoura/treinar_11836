
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
 * <p>Classe Java de SpatialCriteria complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SpatialCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClosestPointCriteria" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}ClosestPointCriteria" minOccurs="0"/&gt;
 *         &lt;element name="FollowByName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "SpatialCriteria", propOrder = {
    "closestPointCriteria",
    "followByName",
    "tileZoomLevelScale",
    "viewport"
})
public class SpatialCriteria
    extends DataTransferObject
{

    @XmlElementRef(name = "ClosestPointCriteria", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ClosestPointCriteria> closestPointCriteria;
    @XmlElement(name = "FollowByName")
    protected Boolean followByName;
    @XmlElement(name = "TileZoomLevelScale")
    protected Double tileZoomLevelScale;
    @XmlElementRef(name = "Viewport", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Viewport> viewport;

    /**
     * Obtém o valor da propriedade closestPointCriteria.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClosestPointCriteria }{@code >}
     *     
     */
    public JAXBElement<ClosestPointCriteria> getClosestPointCriteria() {
        return closestPointCriteria;
    }

    /**
     * Define o valor da propriedade closestPointCriteria.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClosestPointCriteria }{@code >}
     *     
     */
    public void setClosestPointCriteria(JAXBElement<ClosestPointCriteria> value) {
        this.closestPointCriteria = value;
    }

    /**
     * Obtém o valor da propriedade followByName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFollowByName() {
        return followByName;
    }

    /**
     * Define o valor da propriedade followByName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFollowByName(Boolean value) {
        this.followByName = value;
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
