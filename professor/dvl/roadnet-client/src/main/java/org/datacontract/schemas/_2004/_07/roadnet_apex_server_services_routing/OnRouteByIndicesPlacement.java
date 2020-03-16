
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de OnRouteByIndicesPlacement complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OnRouteByIndicesPlacement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}Placement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaskIndices" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}ArrayOfOnRouteByIndicesPlacement.TaskTypeToIndex" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnRouteByIndicesPlacement", propOrder = {
    "taskIndices"
})
public class OnRouteByIndicesPlacement
    extends Placement
{

    @XmlElementRef(name = "TaskIndices", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOnRouteByIndicesPlacementTaskTypeToIndex> taskIndices;

    /**
     * Obtém o valor da propriedade taskIndices.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOnRouteByIndicesPlacementTaskTypeToIndex }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOnRouteByIndicesPlacementTaskTypeToIndex> getTaskIndices() {
        return taskIndices;
    }

    /**
     * Define o valor da propriedade taskIndices.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOnRouteByIndicesPlacementTaskTypeToIndex }{@code >}
     *     
     */
    public void setTaskIndices(JAXBElement<ArrayOfOnRouteByIndicesPlacementTaskTypeToIndex> value) {
        this.taskIndices = value;
    }

}
