
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RetrieveNodesDetailResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveNodesDetailResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mapNode" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}MapNode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveNodesDetailResult", propOrder = {
    "mapNode"
})
public class RetrieveNodesDetailResult {

    @XmlElementRef(name = "mapNode", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<MapNode> mapNode;

    /**
     * Obtém o valor da propriedade mapNode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MapNode }{@code >}
     *     
     */
    public JAXBElement<MapNode> getMapNode() {
        return mapNode;
    }

    /**
     * Define o valor da propriedade mapNode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MapNode }{@code >}
     *     
     */
    public void setMapNode(JAXBElement<MapNode> value) {
        this.mapNode = value;
    }

}
