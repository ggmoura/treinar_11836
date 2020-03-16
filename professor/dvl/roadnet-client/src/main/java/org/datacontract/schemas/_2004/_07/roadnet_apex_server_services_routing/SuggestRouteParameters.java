
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts.SimpleExpressionBase;


/**
 * <p>Classe Java de SuggestRouteParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SuggestRouteParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AutoInsert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DefaultRoutingSessionEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="MaxReturnedSuggestions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MinimumTravelTimeToConsiderBeforeNextStop" type="{http://schemas.microsoft.com/2003/10/Serialization/}duration" minOccurs="0"/&gt;
 *         &lt;element name="RouteEntityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *         &lt;element name="RouteExpression" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.Expression}SimpleExpressionBase" minOccurs="0"/&gt;
 *         &lt;element name="SuggestIgnoreFlags_IgnoreFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SuggestRouteGoal_Goal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SuggestRoutesWithSameRoutingSession" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuggestRouteParameters", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", propOrder = {
    "autoInsert",
    "defaultRoutingSessionEntityKey",
    "maxReturnedSuggestions",
    "minimumTravelTimeToConsiderBeforeNextStop",
    "routeEntityKeys",
    "routeExpression",
    "suggestIgnoreFlagsIgnoreFlags",
    "suggestRouteGoalGoal",
    "suggestRoutesWithSameRoutingSession"
})
public class SuggestRouteParameters
    extends DataTransferObject
{

    @XmlElement(name = "AutoInsert")
    protected Boolean autoInsert;
    @XmlElementRef(name = "DefaultRoutingSessionEntityKey", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> defaultRoutingSessionEntityKey;
    @XmlElement(name = "MaxReturnedSuggestions")
    protected Integer maxReturnedSuggestions;
    @XmlElementRef(name = "MinimumTravelTimeToConsiderBeforeNextStop", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", type = JAXBElement.class, required = false)
    protected JAXBElement<Duration> minimumTravelTimeToConsiderBeforeNextStop;
    @XmlElementRef(name = "RouteEntityKeys", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> routeEntityKeys;
    @XmlElementRef(name = "RouteExpression", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", type = JAXBElement.class, required = false)
    protected JAXBElement<SimpleExpressionBase> routeExpression;
    @XmlElementRef(name = "SuggestIgnoreFlags_IgnoreFlags", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", type = JAXBElement.class, required = false)
    protected JAXBElement<String> suggestIgnoreFlagsIgnoreFlags;
    @XmlElementRef(name = "SuggestRouteGoal_Goal", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.SuggestRoute", type = JAXBElement.class, required = false)
    protected JAXBElement<String> suggestRouteGoalGoal;
    @XmlElement(name = "SuggestRoutesWithSameRoutingSession")
    protected Boolean suggestRoutesWithSameRoutingSession;

    /**
     * Obtém o valor da propriedade autoInsert.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoInsert() {
        return autoInsert;
    }

    /**
     * Define o valor da propriedade autoInsert.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoInsert(Boolean value) {
        this.autoInsert = value;
    }

    /**
     * Obtém o valor da propriedade defaultRoutingSessionEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDefaultRoutingSessionEntityKey() {
        return defaultRoutingSessionEntityKey;
    }

    /**
     * Define o valor da propriedade defaultRoutingSessionEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDefaultRoutingSessionEntityKey(JAXBElement<Long> value) {
        this.defaultRoutingSessionEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade maxReturnedSuggestions.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxReturnedSuggestions() {
        return maxReturnedSuggestions;
    }

    /**
     * Define o valor da propriedade maxReturnedSuggestions.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxReturnedSuggestions(Integer value) {
        this.maxReturnedSuggestions = value;
    }

    /**
     * Obtém o valor da propriedade minimumTravelTimeToConsiderBeforeNextStop.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public JAXBElement<Duration> getMinimumTravelTimeToConsiderBeforeNextStop() {
        return minimumTravelTimeToConsiderBeforeNextStop;
    }

    /**
     * Define o valor da propriedade minimumTravelTimeToConsiderBeforeNextStop.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Duration }{@code >}
     *     
     */
    public void setMinimumTravelTimeToConsiderBeforeNextStop(JAXBElement<Duration> value) {
        this.minimumTravelTimeToConsiderBeforeNextStop = value;
    }

    /**
     * Obtém o valor da propriedade routeEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getRouteEntityKeys() {
        return routeEntityKeys;
    }

    /**
     * Define o valor da propriedade routeEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setRouteEntityKeys(JAXBElement<ArrayOflong> value) {
        this.routeEntityKeys = value;
    }

    /**
     * Obtém o valor da propriedade routeExpression.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SimpleExpressionBase }{@code >}
     *     
     */
    public JAXBElement<SimpleExpressionBase> getRouteExpression() {
        return routeExpression;
    }

    /**
     * Define o valor da propriedade routeExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SimpleExpressionBase }{@code >}
     *     
     */
    public void setRouteExpression(JAXBElement<SimpleExpressionBase> value) {
        this.routeExpression = value;
    }

    /**
     * Obtém o valor da propriedade suggestIgnoreFlagsIgnoreFlags.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSuggestIgnoreFlagsIgnoreFlags() {
        return suggestIgnoreFlagsIgnoreFlags;
    }

    /**
     * Define o valor da propriedade suggestIgnoreFlagsIgnoreFlags.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSuggestIgnoreFlagsIgnoreFlags(JAXBElement<String> value) {
        this.suggestIgnoreFlagsIgnoreFlags = value;
    }

    /**
     * Obtém o valor da propriedade suggestRouteGoalGoal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSuggestRouteGoalGoal() {
        return suggestRouteGoalGoal;
    }

    /**
     * Define o valor da propriedade suggestRouteGoalGoal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSuggestRouteGoalGoal(JAXBElement<String> value) {
        this.suggestRouteGoalGoal = value;
    }

    /**
     * Obtém o valor da propriedade suggestRoutesWithSameRoutingSession.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuggestRoutesWithSameRoutingSession() {
        return suggestRoutesWithSameRoutingSession;
    }

    /**
     * Define o valor da propriedade suggestRoutesWithSameRoutingSession.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuggestRoutesWithSameRoutingSession(Boolean value) {
        this.suggestRoutesWithSameRoutingSession = value;
    }

}
