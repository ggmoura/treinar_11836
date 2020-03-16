
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.Coordinate;
import com.roadnet.apex.datacontracts.Distance;
import com.roadnet.apex.datacontracts.Jurisdiction;
import com.roadnet.apex.datacontracts.PointPath;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de JurisdictionDistance complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="JurisdictionDistance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Distance" type="{http://roadnet.com/apex/DataContracts/}Distance" minOccurs="0"/&gt;
 *         &lt;element name="FromCoordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="Jurisdiction" type="{http://roadnet.com/apex/DataContracts/}Jurisdiction" minOccurs="0"/&gt;
 *         &lt;element name="Path" type="{http://roadnet.com/apex/DataContracts/}PointPath" minOccurs="0"/&gt;
 *         &lt;element name="ToCoordinate" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JurisdictionDistance", propOrder = {
    "distance",
    "fromCoordinate",
    "jurisdiction",
    "path",
    "toCoordinate"
})
public class JurisdictionDistance
    extends DataTransferObject
{

    @XmlElementRef(name = "Distance", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Distance> distance;
    @XmlElementRef(name = "FromCoordinate", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> fromCoordinate;
    @XmlElementRef(name = "Jurisdiction", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Jurisdiction> jurisdiction;
    @XmlElementRef(name = "Path", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<PointPath> path;
    @XmlElementRef(name = "ToCoordinate", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> toCoordinate;

    /**
     * Obtém o valor da propriedade distance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public JAXBElement<Distance> getDistance() {
        return distance;
    }

    /**
     * Define o valor da propriedade distance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Distance }{@code >}
     *     
     */
    public void setDistance(JAXBElement<Distance> value) {
        this.distance = value;
    }

    /**
     * Obtém o valor da propriedade fromCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getFromCoordinate() {
        return fromCoordinate;
    }

    /**
     * Define o valor da propriedade fromCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setFromCoordinate(JAXBElement<Coordinate> value) {
        this.fromCoordinate = value;
    }

    /**
     * Obtém o valor da propriedade jurisdiction.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Jurisdiction }{@code >}
     *     
     */
    public JAXBElement<Jurisdiction> getJurisdiction() {
        return jurisdiction;
    }

    /**
     * Define o valor da propriedade jurisdiction.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Jurisdiction }{@code >}
     *     
     */
    public void setJurisdiction(JAXBElement<Jurisdiction> value) {
        this.jurisdiction = value;
    }

    /**
     * Obtém o valor da propriedade path.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PointPath }{@code >}
     *     
     */
    public JAXBElement<PointPath> getPath() {
        return path;
    }

    /**
     * Define o valor da propriedade path.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PointPath }{@code >}
     *     
     */
    public void setPath(JAXBElement<PointPath> value) {
        this.path = value;
    }

    /**
     * Obtém o valor da propriedade toCoordinate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getToCoordinate() {
        return toCoordinate;
    }

    /**
     * Define o valor da propriedade toCoordinate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setToCoordinate(JAXBElement<Coordinate> value) {
        this.toCoordinate = value;
    }

}
