
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de UpdateNodeCriteria complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UpdateNodeCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Node" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}IntersectionNode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateNodeCriteria", propOrder = {
    "node"
})
public class UpdateNodeCriteria {

    @XmlElementRef(name = "Node", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<IntersectionNode> node;

    /**
     * Obtém o valor da propriedade node.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntersectionNode }{@code >}
     *     
     */
    public JAXBElement<IntersectionNode> getNode() {
        return node;
    }

    /**
     * Define o valor da propriedade node.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntersectionNode }{@code >}
     *     
     */
    public void setNode(JAXBElement<IntersectionNode> value) {
        this.node = value;
    }

}
