
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.Viewport;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de RetrieveTravelPathsAndPolygonsCriteria complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrieveTravelPathsAndPolygonsCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClosestPointCriteria" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}ClosestPointCriteria" minOccurs="0"/&gt;
 *         &lt;element name="Viewport" type="{http://roadnet.com/apex/DataContracts/}Viewport" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveTravelPathsAndPolygonsCriteria", propOrder = {
    "closestPointCriteria",
    "viewport"
})
public class RetrieveTravelPathsAndPolygonsCriteria
    extends DataTransferObject
{

    @XmlElementRef(name = "ClosestPointCriteria", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ClosestPointCriteria> closestPointCriteria;
    @XmlElementRef(name = "Viewport", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Viewport> viewport;

    /**
     * Obtém o valor da propriedade closestPointCriteria.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClosestPointCriteria }{@code >}
     *     
     */
    public JAXBElement<ClosestPointCriteria> getClosestPointCriteria() {
        return closestPointCriteria;
    }

    /**
     * Define o valor da propriedade closestPointCriteria.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClosestPointCriteria }{@code >}
     *     
     */
    public void setClosestPointCriteria(JAXBElement<ClosestPointCriteria> value) {
        this.closestPointCriteria = value;
    }

    /**
     * Obtém o valor da propriedade viewport.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Viewport }{@code >}
     *     
     */
    public JAXBElement<Viewport> getViewport() {
        return viewport;
    }

    /**
     * Define o valor da propriedade viewport.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Viewport }{@code >}
     *     
     */
    public void setViewport(JAXBElement<Viewport> value) {
        this.viewport = value;
    }

}
