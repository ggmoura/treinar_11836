
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RetrieveNodesDetailResults complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveNodesDetailResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DetailResults" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}ArrayOfRetrieveNodesDetailResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveNodesDetailResults", propOrder = {
    "detailResults"
})
public class RetrieveNodesDetailResults {

    @XmlElementRef(name = "DetailResults", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRetrieveNodesDetailResult> detailResults;

    /**
     * Obtém o valor da propriedade detailResults.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRetrieveNodesDetailResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRetrieveNodesDetailResult> getDetailResults() {
        return detailResults;
    }

    /**
     * Define o valor da propriedade detailResults.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRetrieveNodesDetailResult }{@code >}
     *     
     */
    public void setDetailResults(JAXBElement<ArrayOfRetrieveNodesDetailResult> value) {
        this.detailResults = value;
    }

}
