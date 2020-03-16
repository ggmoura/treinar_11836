
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfRoadnetTelematicsScriptVersion;


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
 *         &lt;element name="RetrieveAvailableScriptVersionsResult" type="{http://roadnet.com/apex/DataContracts/}ArrayOfRoadnetTelematicsScriptVersion" minOccurs="0"/&gt;
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
    "retrieveAvailableScriptVersionsResult"
})
@XmlRootElement(name = "RetrieveAvailableScriptVersionsResponse")
public class RetrieveAvailableScriptVersionsResponse {

    @XmlElementRef(name = "RetrieveAvailableScriptVersionsResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRoadnetTelematicsScriptVersion> retrieveAvailableScriptVersionsResult;

    /**
     * Obtém o valor da propriedade retrieveAvailableScriptVersionsResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRoadnetTelematicsScriptVersion }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRoadnetTelematicsScriptVersion> getRetrieveAvailableScriptVersionsResult() {
        return retrieveAvailableScriptVersionsResult;
    }

    /**
     * Define o valor da propriedade retrieveAvailableScriptVersionsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRoadnetTelematicsScriptVersion }{@code >}
     *     
     */
    public void setRetrieveAvailableScriptVersionsResult(JAXBElement<ArrayOfRoadnetTelematicsScriptVersion> value) {
        this.retrieveAvailableScriptVersionsResult = value;
    }

}
