
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyInclusionMode;


/**
 * <p>Classe Java de RetrieveNodesDetailOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveNodesDetailOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImpasseNodePropertyInclusionMode" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyInclusionMode" minOccurs="0"/&gt;
 *         &lt;element name="ImpasseNodePropertyOptions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}ImpasseNodePropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="IntersectionNodePropertyInclusionMode" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyInclusionMode" minOccurs="0"/&gt;
 *         &lt;element name="IntersectionNodePropertyOptions" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}IntersectionNodePropertyOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveNodesDetailOptions", propOrder = {
    "impasseNodePropertyInclusionMode",
    "impasseNodePropertyOptions",
    "intersectionNodePropertyInclusionMode",
    "intersectionNodePropertyOptions"
})
public class RetrieveNodesDetailOptions {

    @XmlElement(name = "ImpasseNodePropertyInclusionMode")
    @XmlSchemaType(name = "string")
    protected PropertyInclusionMode impasseNodePropertyInclusionMode;
    @XmlElementRef(name = "ImpasseNodePropertyOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ImpasseNodePropertyOptions> impasseNodePropertyOptions;
    @XmlElement(name = "IntersectionNodePropertyInclusionMode")
    @XmlSchemaType(name = "string")
    protected PropertyInclusionMode intersectionNodePropertyInclusionMode;
    @XmlElementRef(name = "IntersectionNodePropertyOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<IntersectionNodePropertyOptions> intersectionNodePropertyOptions;

    /**
     * Obtém o valor da propriedade impasseNodePropertyInclusionMode.
     * 
     * @return
     *     possible object is
     *     {@link PropertyInclusionMode }
     *     
     */
    public PropertyInclusionMode getImpasseNodePropertyInclusionMode() {
        return impasseNodePropertyInclusionMode;
    }

    /**
     * Define o valor da propriedade impasseNodePropertyInclusionMode.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyInclusionMode }
     *     
     */
    public void setImpasseNodePropertyInclusionMode(PropertyInclusionMode value) {
        this.impasseNodePropertyInclusionMode = value;
    }

    /**
     * Obtém o valor da propriedade impasseNodePropertyOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ImpasseNodePropertyOptions }{@code >}
     *     
     */
    public JAXBElement<ImpasseNodePropertyOptions> getImpasseNodePropertyOptions() {
        return impasseNodePropertyOptions;
    }

    /**
     * Define o valor da propriedade impasseNodePropertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ImpasseNodePropertyOptions }{@code >}
     *     
     */
    public void setImpasseNodePropertyOptions(JAXBElement<ImpasseNodePropertyOptions> value) {
        this.impasseNodePropertyOptions = value;
    }

    /**
     * Obtém o valor da propriedade intersectionNodePropertyInclusionMode.
     * 
     * @return
     *     possible object is
     *     {@link PropertyInclusionMode }
     *     
     */
    public PropertyInclusionMode getIntersectionNodePropertyInclusionMode() {
        return intersectionNodePropertyInclusionMode;
    }

    /**
     * Define o valor da propriedade intersectionNodePropertyInclusionMode.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyInclusionMode }
     *     
     */
    public void setIntersectionNodePropertyInclusionMode(PropertyInclusionMode value) {
        this.intersectionNodePropertyInclusionMode = value;
    }

    /**
     * Obtém o valor da propriedade intersectionNodePropertyOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntersectionNodePropertyOptions }{@code >}
     *     
     */
    public JAXBElement<IntersectionNodePropertyOptions> getIntersectionNodePropertyOptions() {
        return intersectionNodePropertyOptions;
    }

    /**
     * Define o valor da propriedade intersectionNodePropertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntersectionNodePropertyOptions }{@code >}
     *     
     */
    public void setIntersectionNodePropertyOptions(JAXBElement<IntersectionNodePropertyOptions> value) {
        this.intersectionNodePropertyOptions = value;
    }

}
