
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfRoadnetTelematicsVbusFileVersion;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetrieveAvailableVbusFileVersionsResult" type="{http://roadnet.com/apex/DataContracts/}ArrayOfRoadnetTelematicsVbusFileVersion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "retrieveAvailableVbusFileVersionsResult"
})
@XmlRootElement(name = "RetrieveAvailableVbusFileVersionsResponse")
public class RetrieveAvailableVbusFileVersionsResponse {

    @XmlElementRef(name = "RetrieveAvailableVbusFileVersionsResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRoadnetTelematicsVbusFileVersion> retrieveAvailableVbusFileVersionsResult;

    /**
     * Obtém o valor da propriedade retrieveAvailableVbusFileVersionsResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRoadnetTelematicsVbusFileVersion }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRoadnetTelematicsVbusFileVersion> getRetrieveAvailableVbusFileVersionsResult() {
        return retrieveAvailableVbusFileVersionsResult;
    }

    /**
     * Define o valor da propriedade retrieveAvailableVbusFileVersionsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRoadnetTelematicsVbusFileVersion }{@code >}
     *     
     */
    public void setRetrieveAvailableVbusFileVersionsResult(JAXBElement<ArrayOfRoadnetTelematicsVbusFileVersion> value) {
        this.retrieveAvailableVbusFileVersionsResult = value;
    }

}
