
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de SuggestTerritoryResult.Suggestion complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SuggestTerritoryResult.Suggestion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Impact" type="{http://roadnet.com/apex/DataContracts/}TerritoryDeltas" minOccurs="0"/&gt;
 *         &lt;element name="RoutePlacements" type="{http://roadnet.com/apex/DataContracts/}ArrayOfDailyStopPosition" minOccurs="0"/&gt;
 *         &lt;element name="Score" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ServicePatternEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="TerritoryEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuggestTerritoryResult.Suggestion", propOrder = {
    "impact",
    "routePlacements",
    "score",
    "servicePatternEntityKey",
    "territoryEntityKey"
})
public class SuggestTerritoryResultSuggestion
    extends DataTransferObject
{

    @XmlElementRef(name = "Impact", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<TerritoryDeltas> impact;
    @XmlElementRef(name = "RoutePlacements", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDailyStopPosition> routePlacements;
    @XmlElement(name = "Score")
    protected Long score;
    @XmlElementRef(name = "ServicePatternEntityKey", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> servicePatternEntityKey;
    @XmlElement(name = "TerritoryEntityKey")
    protected Long territoryEntityKey;

    /**
     * Obtém o valor da propriedade impact.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TerritoryDeltas }{@code >}
     *     
     */
    public JAXBElement<TerritoryDeltas> getImpact() {
        return impact;
    }

    /**
     * Define o valor da propriedade impact.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TerritoryDeltas }{@code >}
     *     
     */
    public void setImpact(JAXBElement<TerritoryDeltas> value) {
        this.impact = value;
    }

    /**
     * Obtém o valor da propriedade routePlacements.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDailyStopPosition }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDailyStopPosition> getRoutePlacements() {
        return routePlacements;
    }

    /**
     * Define o valor da propriedade routePlacements.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDailyStopPosition }{@code >}
     *     
     */
    public void setRoutePlacements(JAXBElement<ArrayOfDailyStopPosition> value) {
        this.routePlacements = value;
    }

    /**
     * Obtém o valor da propriedade score.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getScore() {
        return score;
    }

    /**
     * Define o valor da propriedade score.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setScore(Long value) {
        this.score = value;
    }

    /**
     * Obtém o valor da propriedade servicePatternEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getServicePatternEntityKey() {
        return servicePatternEntityKey;
    }

    /**
     * Define o valor da propriedade servicePatternEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setServicePatternEntityKey(JAXBElement<Long> value) {
        this.servicePatternEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade territoryEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTerritoryEntityKey() {
        return territoryEntityKey;
    }

    /**
     * Define o valor da propriedade territoryEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTerritoryEntityKey(Long value) {
        this.territoryEntityKey = value;
    }

}
