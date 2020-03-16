
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de OnRouteByIndicesPlacement.TaskTypeToIndex complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OnRouteByIndicesPlacement.TaskTypeToIndex"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StopPlacementInfo" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}OnStopPlacementInfo" minOccurs="0"/&gt;
 *         &lt;element name="TaskType_TaskType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnRouteByIndicesPlacement.TaskTypeToIndex", propOrder = {
    "index",
    "stopPlacementInfo",
    "taskTypeTaskType"
})
public class OnRouteByIndicesPlacementTaskTypeToIndex
    extends DataTransferObject
{

    @XmlElement(name = "Index")
    protected Integer index;
    @XmlElementRef(name = "StopPlacementInfo", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<OnStopPlacementInfo> stopPlacementInfo;
    @XmlElementRef(name = "TaskType_TaskType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taskTypeTaskType;

    /**
     * Obtém o valor da propriedade index.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * Define o valor da propriedade index.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndex(Integer value) {
        this.index = value;
    }

    /**
     * Obtém o valor da propriedade stopPlacementInfo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OnStopPlacementInfo }{@code >}
     *     
     */
    public JAXBElement<OnStopPlacementInfo> getStopPlacementInfo() {
        return stopPlacementInfo;
    }

    /**
     * Define o valor da propriedade stopPlacementInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OnStopPlacementInfo }{@code >}
     *     
     */
    public void setStopPlacementInfo(JAXBElement<OnStopPlacementInfo> value) {
        this.stopPlacementInfo = value;
    }

    /**
     * Obtém o valor da propriedade taskTypeTaskType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaskTypeTaskType() {
        return taskTypeTaskType;
    }

    /**
     * Define o valor da propriedade taskTypeTaskType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaskTypeTaskType(JAXBElement<String> value) {
        this.taskTypeTaskType = value;
    }

}
