
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.ArrayOfNetworkInstanceID;
import com.roadnet.apex.datacontracts.NetworkArc;


/**
 * <p>Classe Java de ApplyArcUpdatesCriteria complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ApplyArcUpdatesCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArcsToUpdate" type="{http://roadnet.com/apex/DataContracts/}ArrayOfNetworkInstanceID" minOccurs="0"/&gt;
 *         &lt;element name="TemplateUpdateArc" type="{http://roadnet.com/apex/DataContracts/}NetworkArc" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplyArcUpdatesCriteria", propOrder = {
    "arcsToUpdate",
    "templateUpdateArc"
})
public class ApplyArcUpdatesCriteria {

    @XmlElementRef(name = "ArcsToUpdate", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNetworkInstanceID> arcsToUpdate;
    @XmlElementRef(name = "TemplateUpdateArc", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkArc> templateUpdateArc;

    /**
     * Obtém o valor da propriedade arcsToUpdate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkInstanceID }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNetworkInstanceID> getArcsToUpdate() {
        return arcsToUpdate;
    }

    /**
     * Define o valor da propriedade arcsToUpdate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNetworkInstanceID }{@code >}
     *     
     */
    public void setArcsToUpdate(JAXBElement<ArrayOfNetworkInstanceID> value) {
        this.arcsToUpdate = value;
    }

    /**
     * Obtém o valor da propriedade templateUpdateArc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkArc }{@code >}
     *     
     */
    public JAXBElement<NetworkArc> getTemplateUpdateArc() {
        return templateUpdateArc;
    }

    /**
     * Define o valor da propriedade templateUpdateArc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkArc }{@code >}
     *     
     */
    public void setTemplateUpdateArc(JAXBElement<NetworkArc> value) {
        this.templateUpdateArc = value;
    }

}
