
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RetrieveMapChangedAreasResults complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveMapChangedAreasResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NetworkChangedAreas" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}NetworkChangedAreas" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveMapChangedAreasResults", propOrder = {
    "networkChangedAreas"
})
public class RetrieveMapChangedAreasResults {

    @XmlElementRef(name = "NetworkChangedAreas", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkChangedAreas> networkChangedAreas;

    /**
     * Obtém o valor da propriedade networkChangedAreas.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkChangedAreas }{@code >}
     *     
     */
    public JAXBElement<NetworkChangedAreas> getNetworkChangedAreas() {
        return networkChangedAreas;
    }

    /**
     * Define o valor da propriedade networkChangedAreas.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkChangedAreas }{@code >}
     *     
     */
    public void setNetworkChangedAreas(JAXBElement<NetworkChangedAreas> value) {
        this.networkChangedAreas = value;
    }

}
