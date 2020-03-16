
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RoutingJobInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RoutingJobInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}JobInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Parameters" type="{http://roadnet.com/apex/DataContracts/}RoutingParameters" minOccurs="0"/&gt;
 *         &lt;element name="PercentComplete" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Result" type="{http://roadnet.com/apex/DataContracts/}RoutingResult" minOccurs="0"/&gt;
 *         &lt;element name="RoutingStage_Stage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutingJobInfo", propOrder = {
    "parameters",
    "percentComplete",
    "result",
    "routingStageStage"
})
public class RoutingJobInfo
    extends JobInfo
{

    @XmlElementRef(name = "Parameters", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RoutingParameters> parameters;
    @XmlElement(name = "PercentComplete")
    protected Double percentComplete;
    @XmlElementRef(name = "Result", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<RoutingResult> result;
    @XmlElementRef(name = "RoutingStage_Stage", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routingStageStage;

    /**
     * Obtém o valor da propriedade parameters.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoutingParameters }{@code >}
     *     
     */
    public JAXBElement<RoutingParameters> getParameters() {
        return parameters;
    }

    /**
     * Define o valor da propriedade parameters.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoutingParameters }{@code >}
     *     
     */
    public void setParameters(JAXBElement<RoutingParameters> value) {
        this.parameters = value;
    }

    /**
     * Obtém o valor da propriedade percentComplete.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentComplete() {
        return percentComplete;
    }

    /**
     * Define o valor da propriedade percentComplete.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentComplete(Double value) {
        this.percentComplete = value;
    }

    /**
     * Obtém o valor da propriedade result.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoutingResult }{@code >}
     *     
     */
    public JAXBElement<RoutingResult> getResult() {
        return result;
    }

    /**
     * Define o valor da propriedade result.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoutingResult }{@code >}
     *     
     */
    public void setResult(JAXBElement<RoutingResult> value) {
        this.result = value;
    }

    /**
     * Obtém o valor da propriedade routingStageStage.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoutingStageStage() {
        return routingStageStage;
    }

    /**
     * Define o valor da propriedade routingStageStage.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoutingStageStage(JAXBElement<String> value) {
        this.routingStageStage = value;
    }

}
