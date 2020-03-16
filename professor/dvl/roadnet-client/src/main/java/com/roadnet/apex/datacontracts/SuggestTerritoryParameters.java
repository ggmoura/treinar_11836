
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de SuggestTerritoryParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SuggestTerritoryParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AutoInsert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxReturnedSuggestions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SuggestTerritoryGoal_Goal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SuggestTerritoryIgnoreFlags_IgnoreFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TerritoryEntityKeys" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuggestTerritoryParameters", propOrder = {
    "autoInsert",
    "maxReturnedSuggestions",
    "suggestTerritoryGoalGoal",
    "suggestTerritoryIgnoreFlagsIgnoreFlags",
    "territoryEntityKeys"
})
public class SuggestTerritoryParameters
    extends DataTransferObject
{

    @XmlElement(name = "AutoInsert")
    protected Boolean autoInsert;
    @XmlElement(name = "MaxReturnedSuggestions")
    protected Integer maxReturnedSuggestions;
    @XmlElementRef(name = "SuggestTerritoryGoal_Goal", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> suggestTerritoryGoalGoal;
    @XmlElementRef(name = "SuggestTerritoryIgnoreFlags_IgnoreFlags", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> suggestTerritoryIgnoreFlagsIgnoreFlags;
    @XmlElementRef(name = "TerritoryEntityKeys", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> territoryEntityKeys;

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
     * Obtém o valor da propriedade suggestTerritoryGoalGoal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSuggestTerritoryGoalGoal() {
        return suggestTerritoryGoalGoal;
    }

    /**
     * Define o valor da propriedade suggestTerritoryGoalGoal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSuggestTerritoryGoalGoal(JAXBElement<String> value) {
        this.suggestTerritoryGoalGoal = value;
    }

    /**
     * Obtém o valor da propriedade suggestTerritoryIgnoreFlagsIgnoreFlags.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSuggestTerritoryIgnoreFlagsIgnoreFlags() {
        return suggestTerritoryIgnoreFlagsIgnoreFlags;
    }

    /**
     * Define o valor da propriedade suggestTerritoryIgnoreFlagsIgnoreFlags.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSuggestTerritoryIgnoreFlagsIgnoreFlags(JAXBElement<String> value) {
        this.suggestTerritoryIgnoreFlagsIgnoreFlags = value;
    }

    /**
     * Obtém o valor da propriedade territoryEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getTerritoryEntityKeys() {
        return territoryEntityKeys;
    }

    /**
     * Define o valor da propriedade territoryEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setTerritoryEntityKeys(JAXBElement<ArrayOflong> value) {
        this.territoryEntityKeys = value;
    }

}
