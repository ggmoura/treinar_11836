
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;


/**
 * <p>Classe Java de SuggestRouteTemplateCandidates complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SuggestRouteTemplateCandidates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="SuggestRouteTemplateCandidates_EntityType_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuggestRouteTemplateCandidates", propOrder = {
    "entityKeys",
    "suggestRouteTemplateCandidatesEntityTypeType"
})
public class SuggestRouteTemplateCandidates {

    @XmlElementRef(name = "EntityKeys", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> entityKeys;
    @XmlElementRef(name = "SuggestRouteTemplateCandidates_EntityType_Type", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> suggestRouteTemplateCandidatesEntityTypeType;

    /**
     * Obtém o valor da propriedade entityKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getEntityKeys() {
        return entityKeys;
    }

    /**
     * Define o valor da propriedade entityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setEntityKeys(JAXBElement<ArrayOflong> value) {
        this.entityKeys = value;
    }

    /**
     * Obtém o valor da propriedade suggestRouteTemplateCandidatesEntityTypeType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSuggestRouteTemplateCandidatesEntityTypeType() {
        return suggestRouteTemplateCandidatesEntityTypeType;
    }

    /**
     * Define o valor da propriedade suggestRouteTemplateCandidatesEntityTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSuggestRouteTemplateCandidatesEntityTypeType(JAXBElement<String> value) {
        this.suggestRouteTemplateCandidatesEntityTypeType = value;
    }

}
