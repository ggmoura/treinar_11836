
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfNetworkArc;
import com.roadnet.apex.datacontracts.Coordinate;
import com.roadnet.apex.datacontracts.NetworkDataStoreEntity;


/**
 * <p>Classe Java de MapNode complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MapNode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}NetworkDataStoreEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AttachedArcs" type="{http://roadnet.com/apex/DataContracts/}ArrayOfNetworkArc" minOccurs="0"/&gt;
 *         &lt;element name="Point" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MapNode", propOrder = {
    "attachedArcs",
    "point"
})
@XmlSeeAlso({
    ImpasseNode.class,
    IntersectionNode.class
})
public class MapNode
    extends NetworkDataStoreEntity
{

    @XmlElementRef(name = "AttachedArcs", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNetworkArc> attachedArcs;
    @XmlElementRef(name = "Point", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> point;

    /**
     * Obtém o valor da propriedade attachedArcs.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkArc }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNetworkArc> getAttachedArcs() {
        return attachedArcs;
    }

    /**
     * Define o valor da propriedade attachedArcs.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkArc }{@code >}
     *     
     */
    public void setAttachedArcs(JAXBElement<ArrayOfNetworkArc> value) {
        this.attachedArcs = value;
    }

    /**
     * Obtém o valor da propriedade point.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getPoint() {
        return point;
    }

    /**
     * Define o valor da propriedade point.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setPoint(JAXBElement<Coordinate> value) {
        this.point = value;
    }

}
