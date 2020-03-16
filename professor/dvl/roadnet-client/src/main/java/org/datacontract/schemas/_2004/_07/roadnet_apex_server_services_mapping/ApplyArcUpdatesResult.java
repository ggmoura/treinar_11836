
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ApplyArcUpdatesResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ApplyArcUpdatesResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UpdateArcsResults" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}ArrayOfUpdateArcResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplyArcUpdatesResult", propOrder = {
    "updateArcsResults"
})
public class ApplyArcUpdatesResult {

    @XmlElementRef(name = "UpdateArcsResults", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfUpdateArcResult> updateArcsResults;

    /**
     * Obtém o valor da propriedade updateArcsResults.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUpdateArcResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfUpdateArcResult> getUpdateArcsResults() {
        return updateArcsResults;
    }

    /**
     * Define o valor da propriedade updateArcsResults.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfUpdateArcResult }{@code >}
     *     
     */
    public void setUpdateArcsResults(JAXBElement<ArrayOfUpdateArcResult> value) {
        this.updateArcsResults = value;
    }

}
