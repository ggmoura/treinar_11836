
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RetrieveMapInfoResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveMapInfoResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MapEditsVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MapSchemaVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MapVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveMapInfoResult", propOrder = {
    "mapEditsVersion",
    "mapSchemaVersion",
    "mapVersion"
})
public class RetrieveMapInfoResult {

    @XmlElement(name = "MapEditsVersion")
    protected Integer mapEditsVersion;
    @XmlElementRef(name = "MapSchemaVersion", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapSchemaVersion;
    @XmlElementRef(name = "MapVersion", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapVersion;

    /**
     * Obtém o valor da propriedade mapEditsVersion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMapEditsVersion() {
        return mapEditsVersion;
    }

    /**
     * Define o valor da propriedade mapEditsVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMapEditsVersion(Integer value) {
        this.mapEditsVersion = value;
    }

    /**
     * Obtém o valor da propriedade mapSchemaVersion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMapSchemaVersion() {
        return mapSchemaVersion;
    }

    /**
     * Define o valor da propriedade mapSchemaVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMapSchemaVersion(JAXBElement<String> value) {
        this.mapSchemaVersion = value;
    }

    /**
     * Obtém o valor da propriedade mapVersion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMapVersion() {
        return mapVersion;
    }

    /**
     * Define o valor da propriedade mapVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMapVersion(JAXBElement<String> value) {
        this.mapVersion = value;
    }

}
