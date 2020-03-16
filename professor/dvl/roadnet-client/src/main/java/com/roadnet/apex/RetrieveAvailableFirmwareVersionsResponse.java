
package com.roadnet.apex;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfRoadnetTelematicsFirmwareVersion;


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
 *         &lt;element name="RetrieveAvailableFirmwareVersionsResult" type="{http://roadnet.com/apex/DataContracts/}ArrayOfRoadnetTelematicsFirmwareVersion" minOccurs="0"/&gt;
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
    "retrieveAvailableFirmwareVersionsResult"
})
@XmlRootElement(name = "RetrieveAvailableFirmwareVersionsResponse")
public class RetrieveAvailableFirmwareVersionsResponse {

    @XmlElementRef(name = "RetrieveAvailableFirmwareVersionsResult", namespace = "http://roadnet.com/apex/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRoadnetTelematicsFirmwareVersion> retrieveAvailableFirmwareVersionsResult;

    /**
     * Obtém o valor da propriedade retrieveAvailableFirmwareVersionsResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRoadnetTelematicsFirmwareVersion }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRoadnetTelematicsFirmwareVersion> getRetrieveAvailableFirmwareVersionsResult() {
        return retrieveAvailableFirmwareVersionsResult;
    }

    /**
     * Define o valor da propriedade retrieveAvailableFirmwareVersionsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRoadnetTelematicsFirmwareVersion }{@code >}
     *     
     */
    public void setRetrieveAvailableFirmwareVersionsResult(JAXBElement<ArrayOfRoadnetTelematicsFirmwareVersion> value) {
        this.retrieveAvailableFirmwareVersionsResult = value;
    }

}
