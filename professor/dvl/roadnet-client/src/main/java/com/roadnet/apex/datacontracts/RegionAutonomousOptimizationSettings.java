
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de Region.AutonomousOptimizationSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Region.AutonomousOptimizationSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssignOrdersMinTravelTimeBeforeNextStop" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="AutonomousOptimizationIgnoreFlags_AssignOrdersIgnoreConstraints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AutonomousOptimizationRouteGoal_AssignOrdersGoal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Region.AutonomousOptimizationSettings", propOrder = {
    "assignOrdersMinTravelTimeBeforeNextStop",
    "autonomousOptimizationIgnoreFlagsAssignOrdersIgnoreConstraints",
    "autonomousOptimizationRouteGoalAssignOrdersGoal"
})
public class RegionAutonomousOptimizationSettings
    extends DataTransferObject
{

    @XmlElementRef(name = "AssignOrdersMinTravelTimeBeforeNextStop", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> assignOrdersMinTravelTimeBeforeNextStop;
    @XmlElementRef(name = "AutonomousOptimizationIgnoreFlags_AssignOrdersIgnoreConstraints", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> autonomousOptimizationIgnoreFlagsAssignOrdersIgnoreConstraints;
    @XmlElementRef(name = "AutonomousOptimizationRouteGoal_AssignOrdersGoal", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> autonomousOptimizationRouteGoalAssignOrdersGoal;

    /**
     * Obtém o valor da propriedade assignOrdersMinTravelTimeBeforeNextStop.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getAssignOrdersMinTravelTimeBeforeNextStop() {
        return assignOrdersMinTravelTimeBeforeNextStop;
    }

    /**
     * Define o valor da propriedade assignOrdersMinTravelTimeBeforeNextStop.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setAssignOrdersMinTravelTimeBeforeNextStop(JAXBElement<Duration> value) {
        this.assignOrdersMinTravelTimeBeforeNextStop = value;
    }

    /**
     * Obtém o valor da propriedade autonomousOptimizationIgnoreFlagsAssignOrdersIgnoreConstraints.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAutonomousOptimizationIgnoreFlagsAssignOrdersIgnoreConstraints() {
        return autonomousOptimizationIgnoreFlagsAssignOrdersIgnoreConstraints;
    }

    /**
     * Define o valor da propriedade autonomousOptimizationIgnoreFlagsAssignOrdersIgnoreConstraints.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAutonomousOptimizationIgnoreFlagsAssignOrdersIgnoreConstraints(JAXBElement<String> value) {
        this.autonomousOptimizationIgnoreFlagsAssignOrdersIgnoreConstraints = value;
    }

    /**
     * Obtém o valor da propriedade autonomousOptimizationRouteGoalAssignOrdersGoal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAutonomousOptimizationRouteGoalAssignOrdersGoal() {
        return autonomousOptimizationRouteGoalAssignOrdersGoal;
    }

    /**
     * Define o valor da propriedade autonomousOptimizationRouteGoalAssignOrdersGoal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAutonomousOptimizationRouteGoalAssignOrdersGoal(JAXBElement<String> value) {
        this.autonomousOptimizationRouteGoalAssignOrdersGoal = value;
    }

}
