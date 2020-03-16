
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RetrieveNodesDetailCriteria complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveNodesDetailCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Nodes" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}ArrayOfMapNode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveNodesDetailCriteria", propOrder = {
    "nodes"
})
public class RetrieveNodesDetailCriteria {

    @XmlElementRef(name = "Nodes", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMapNode> nodes;

    /**
     * Obtém o valor da propriedade nodes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMapNode }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMapNode> getNodes() {
        return nodes;
    }

    /**
     * Define o valor da propriedade nodes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMapNode }{@code >}
     *     
     */
    public void setNodes(JAXBElement<ArrayOfMapNode> value) {
        this.nodes = value;
    }

}
