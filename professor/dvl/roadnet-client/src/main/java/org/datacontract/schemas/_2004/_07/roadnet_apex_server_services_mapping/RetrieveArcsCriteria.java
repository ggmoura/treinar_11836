
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de RetrieveArcsCriteria complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveArcsCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddressCriteria" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}AddressCriteria" minOccurs="0"/&gt;
 *         &lt;element name="MaxNumberArcs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SpatialCriteria" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}SpatialCriteria" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveArcsCriteria", propOrder = {
    "addressCriteria",
    "maxNumberArcs",
    "spatialCriteria"
})
public class RetrieveArcsCriteria
    extends DataTransferObject
{

    @XmlElementRef(name = "AddressCriteria", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<AddressCriteria> addressCriteria;
    @XmlElement(name = "MaxNumberArcs")
    protected Integer maxNumberArcs;
    @XmlElementRef(name = "SpatialCriteria", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<SpatialCriteria> spatialCriteria;

    /**
     * Obtém o valor da propriedade addressCriteria.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddressCriteria }{@code >}
     *     
     */
    public JAXBElement<AddressCriteria> getAddressCriteria() {
        return addressCriteria;
    }

    /**
     * Define o valor da propriedade addressCriteria.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddressCriteria }{@code >}
     *     
     */
    public void setAddressCriteria(JAXBElement<AddressCriteria> value) {
        this.addressCriteria = value;
    }

    /**
     * Obtém o valor da propriedade maxNumberArcs.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNumberArcs() {
        return maxNumberArcs;
    }

    /**
     * Define o valor da propriedade maxNumberArcs.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNumberArcs(Integer value) {
        this.maxNumberArcs = value;
    }

    /**
     * Obtém o valor da propriedade spatialCriteria.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SpatialCriteria }{@code >}
     *     
     */
    public JAXBElement<SpatialCriteria> getSpatialCriteria() {
        return spatialCriteria;
    }

    /**
     * Define o valor da propriedade spatialCriteria.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SpatialCriteria }{@code >}
     *     
     */
    public void setSpatialCriteria(JAXBElement<SpatialCriteria> value) {
        this.spatialCriteria = value;
    }

}
