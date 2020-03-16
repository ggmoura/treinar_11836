
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.NetworkRestrictedPath;


/**
 * <p>Classe Java de UpdateRestrictedPathResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UpdateRestrictedPathResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UpdatedTravelPath" type="{http://roadnet.com/apex/DataContracts/}NetworkRestrictedPath" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateRestrictedPathResult", propOrder = {
    "updatedTravelPath"
})
public class UpdateRestrictedPathResult {

    @XmlElementRef(name = "UpdatedTravelPath", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkRestrictedPath> updatedTravelPath;

    /**
     * Obtém o valor da propriedade updatedTravelPath.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkRestrictedPath }{@code >}
     *     
     */
    public JAXBElement<NetworkRestrictedPath> getUpdatedTravelPath() {
        return updatedTravelPath;
    }

    /**
     * Define o valor da propriedade updatedTravelPath.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkRestrictedPath }{@code >}
     *     
     */
    public void setUpdatedTravelPath(JAXBElement<NetworkRestrictedPath> value) {
        this.updatedTravelPath = value;
    }

}
