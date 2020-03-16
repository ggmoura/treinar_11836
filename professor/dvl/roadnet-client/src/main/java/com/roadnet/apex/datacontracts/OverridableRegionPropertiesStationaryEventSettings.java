
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de OverridableRegionProperties.StationaryEventSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OverridableRegionProperties.StationaryEventSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreateIndeterminateStationaryEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinimumIndeterminateStationaryDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinimumStationaryDuration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MinimumTravelSpeed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StationaryDistanceThreshold" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverridableRegionProperties.StationaryEventSettings", propOrder = {
    "createIndeterminateStationaryEvents",
    "minimumIndeterminateStationaryDuration",
    "minimumStationaryDuration",
    "minimumTravelSpeed",
    "stationaryDistanceThreshold"
})
public class OverridableRegionPropertiesStationaryEventSettings
    extends DataTransferObject
{

    @XmlElement(name = "CreateIndeterminateStationaryEvents")
    protected Boolean createIndeterminateStationaryEvents;
    @XmlElement(name = "MinimumIndeterminateStationaryDuration")
    protected Boolean minimumIndeterminateStationaryDuration;
    @XmlElement(name = "MinimumStationaryDuration")
    protected Boolean minimumStationaryDuration;
    @XmlElement(name = "MinimumTravelSpeed")
    protected Boolean minimumTravelSpeed;
    @XmlElement(name = "StationaryDistanceThreshold")
    protected Boolean stationaryDistanceThreshold;

    /**
     * Obtém o valor da propriedade createIndeterminateStationaryEvents.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreateIndeterminateStationaryEvents() {
        return createIndeterminateStationaryEvents;
    }

    /**
     * Define o valor da propriedade createIndeterminateStationaryEvents.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreateIndeterminateStationaryEvents(Boolean value) {
        this.createIndeterminateStationaryEvents = value;
    }

    /**
     * Obtém o valor da propriedade minimumIndeterminateStationaryDuration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinimumIndeterminateStationaryDuration() {
        return minimumIndeterminateStationaryDuration;
    }

    /**
     * Define o valor da propriedade minimumIndeterminateStationaryDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinimumIndeterminateStationaryDuration(Boolean value) {
        this.minimumIndeterminateStationaryDuration = value;
    }

    /**
     * Obtém o valor da propriedade minimumStationaryDuration.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinimumStationaryDuration() {
        return minimumStationaryDuration;
    }

    /**
     * Define o valor da propriedade minimumStationaryDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinimumStationaryDuration(Boolean value) {
        this.minimumStationaryDuration = value;
    }

    /**
     * Obtém o valor da propriedade minimumTravelSpeed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinimumTravelSpeed() {
        return minimumTravelSpeed;
    }

    /**
     * Define o valor da propriedade minimumTravelSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinimumTravelSpeed(Boolean value) {
        this.minimumTravelSpeed = value;
    }

    /**
     * Obtém o valor da propriedade stationaryDistanceThreshold.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStationaryDistanceThreshold() {
        return stationaryDistanceThreshold;
    }

    /**
     * Define o valor da propriedade stationaryDistanceThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStationaryDistanceThreshold(Boolean value) {
        this.stationaryDistanceThreshold = value;
    }

}
