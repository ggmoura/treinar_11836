
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.roadnet.apex.datacontracts.Coordinate;
import com.roadnet.apex.datacontracts.NetworkArc;
import com.roadnet.apex.datacontracts.NetworkPOI;


/**
 * <p>Classe Java de MapSyncCriteria complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MapSyncCriteria"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EditType" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}MapSyncEditType" minOccurs="0"/&gt;
 *         &lt;element name="ImpassePoint" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="MapCountryAbbreviations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MapVendorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MapVendorVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NewArc" type="{http://roadnet.com/apex/DataContracts/}NetworkArc" minOccurs="0"/&gt;
 *         &lt;element name="NewPOI" type="{http://roadnet.com/apex/DataContracts/}NetworkPOI" minOccurs="0"/&gt;
 *         &lt;element name="OldArc" type="{http://roadnet.com/apex/DataContracts/}NetworkArc" minOccurs="0"/&gt;
 *         &lt;element name="OldPOI" type="{http://roadnet.com/apex/DataContracts/}NetworkPOI" minOccurs="0"/&gt;
 *         &lt;element name="RoadClassCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoadClassLevel" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}MapSyncRoadClassLevel" minOccurs="0"/&gt;
 *         &lt;element name="RoadClassLowerLeftCorner" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="RoadClassMode" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}MapSyncRoadClassMode" minOccurs="0"/&gt;
 *         &lt;element name="RoadClassOperation" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}MapSyncRoadClassOperation" minOccurs="0"/&gt;
 *         &lt;element name="RoadClassSpeedIsMetric" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RoadClassSpeedLowerLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RoadClassSpeedUpperLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RoadClassSpeedValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RoadClassStateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoadClassUpperRightCorner" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="TimeOfChange" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TurnPenaltyIncomingArc" type="{http://roadnet.com/apex/DataContracts/}NetworkArc" minOccurs="0"/&gt;
 *         &lt;element name="TurnPenaltyNodePoint" type="{http://roadnet.com/apex/DataContracts/}Coordinate" minOccurs="0"/&gt;
 *         &lt;element name="TurnPenaltyOutgoingArc" type="{http://roadnet.com/apex/DataContracts/}NetworkArc" minOccurs="0"/&gt;
 *         &lt;element name="TurnPenaltyValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MapSyncCriteria", propOrder = {
    "editType",
    "impassePoint",
    "mapCountryAbbreviations",
    "mapVendorName",
    "mapVendorVersion",
    "newArc",
    "newPOI",
    "oldArc",
    "oldPOI",
    "roadClassCountryCode",
    "roadClassLevel",
    "roadClassLowerLeftCorner",
    "roadClassMode",
    "roadClassOperation",
    "roadClassSpeedIsMetric",
    "roadClassSpeedLowerLimit",
    "roadClassSpeedUpperLimit",
    "roadClassSpeedValue",
    "roadClassStateName",
    "roadClassUpperRightCorner",
    "timeOfChange",
    "turnPenaltyIncomingArc",
    "turnPenaltyNodePoint",
    "turnPenaltyOutgoingArc",
    "turnPenaltyValue",
    "userID"
})
public class MapSyncCriteria {

    @XmlElement(name = "EditType")
    @XmlSchemaType(name = "string")
    protected MapSyncEditType editType;
    @XmlElementRef(name = "ImpassePoint", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> impassePoint;
    @XmlElementRef(name = "MapCountryAbbreviations", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapCountryAbbreviations;
    @XmlElementRef(name = "MapVendorName", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapVendorName;
    @XmlElementRef(name = "MapVendorVersion", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mapVendorVersion;
    @XmlElementRef(name = "NewArc", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkArc> newArc;
    @XmlElementRef(name = "NewPOI", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkPOI> newPOI;
    @XmlElementRef(name = "OldArc", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkArc> oldArc;
    @XmlElementRef(name = "OldPOI", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkPOI> oldPOI;
    @XmlElementRef(name = "RoadClassCountryCode", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> roadClassCountryCode;
    @XmlElement(name = "RoadClassLevel")
    @XmlSchemaType(name = "string")
    protected MapSyncRoadClassLevel roadClassLevel;
    @XmlElementRef(name = "RoadClassLowerLeftCorner", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> roadClassLowerLeftCorner;
    @XmlElement(name = "RoadClassMode")
    @XmlSchemaType(name = "string")
    protected MapSyncRoadClassMode roadClassMode;
    @XmlElement(name = "RoadClassOperation")
    @XmlSchemaType(name = "string")
    protected MapSyncRoadClassOperation roadClassOperation;
    @XmlElement(name = "RoadClassSpeedIsMetric")
    protected Boolean roadClassSpeedIsMetric;
    @XmlElement(name = "RoadClassSpeedLowerLimit")
    protected Integer roadClassSpeedLowerLimit;
    @XmlElement(name = "RoadClassSpeedUpperLimit")
    protected Integer roadClassSpeedUpperLimit;
    @XmlElement(name = "RoadClassSpeedValue")
    protected Integer roadClassSpeedValue;
    @XmlElementRef(name = "RoadClassStateName", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> roadClassStateName;
    @XmlElementRef(name = "RoadClassUpperRightCorner", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> roadClassUpperRightCorner;
    @XmlElement(name = "TimeOfChange")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeOfChange;
    @XmlElementRef(name = "TurnPenaltyIncomingArc", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkArc> turnPenaltyIncomingArc;
    @XmlElementRef(name = "TurnPenaltyNodePoint", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Coordinate> turnPenaltyNodePoint;
    @XmlElementRef(name = "TurnPenaltyOutgoingArc", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkArc> turnPenaltyOutgoingArc;
    @XmlElement(name = "TurnPenaltyValue")
    protected Integer turnPenaltyValue;
    @XmlElementRef(name = "UserID", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userID;

    /**
     * Obtém o valor da propriedade editType.
     * 
     * @return
     *     possible object is
     *     {@link MapSyncEditType }
     *     
     */
    public MapSyncEditType getEditType() {
        return editType;
    }

    /**
     * Define o valor da propriedade editType.
     * 
     * @param value
     *     allowed object is
     *     {@link MapSyncEditType }
     *     
     */
    public void setEditType(MapSyncEditType value) {
        this.editType = value;
    }

    /**
     * Obtém o valor da propriedade impassePoint.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getImpassePoint() {
        return impassePoint;
    }

    /**
     * Define o valor da propriedade impassePoint.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setImpassePoint(JAXBElement<Coordinate> value) {
        this.impassePoint = value;
    }

    /**
     * Obtém o valor da propriedade mapCountryAbbreviations.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMapCountryAbbreviations() {
        return mapCountryAbbreviations;
    }

    /**
     * Define o valor da propriedade mapCountryAbbreviations.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMapCountryAbbreviations(JAXBElement<String> value) {
        this.mapCountryAbbreviations = value;
    }

    /**
     * Obtém o valor da propriedade mapVendorName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMapVendorName() {
        return mapVendorName;
    }

    /**
     * Define o valor da propriedade mapVendorName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMapVendorName(JAXBElement<String> value) {
        this.mapVendorName = value;
    }

    /**
     * Obtém o valor da propriedade mapVendorVersion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMapVendorVersion() {
        return mapVendorVersion;
    }

    /**
     * Define o valor da propriedade mapVendorVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMapVendorVersion(JAXBElement<String> value) {
        this.mapVendorVersion = value;
    }

    /**
     * Obtém o valor da propriedade newArc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkArc }{@code >}
     *     
     */
    public JAXBElement<NetworkArc> getNewArc() {
        return newArc;
    }

    /**
     * Define o valor da propriedade newArc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkArc }{@code >}
     *     
     */
    public void setNewArc(JAXBElement<NetworkArc> value) {
        this.newArc = value;
    }

    /**
     * Obtém o valor da propriedade newPOI.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkPOI }{@code >}
     *     
     */
    public JAXBElement<NetworkPOI> getNewPOI() {
        return newPOI;
    }

    /**
     * Define o valor da propriedade newPOI.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkPOI }{@code >}
     *     
     */
    public void setNewPOI(JAXBElement<NetworkPOI> value) {
        this.newPOI = value;
    }

    /**
     * Obtém o valor da propriedade oldArc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkArc }{@code >}
     *     
     */
    public JAXBElement<NetworkArc> getOldArc() {
        return oldArc;
    }

    /**
     * Define o valor da propriedade oldArc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkArc }{@code >}
     *     
     */
    public void setOldArc(JAXBElement<NetworkArc> value) {
        this.oldArc = value;
    }

    /**
     * Obtém o valor da propriedade oldPOI.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkPOI }{@code >}
     *     
     */
    public JAXBElement<NetworkPOI> getOldPOI() {
        return oldPOI;
    }

    /**
     * Define o valor da propriedade oldPOI.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkPOI }{@code >}
     *     
     */
    public void setOldPOI(JAXBElement<NetworkPOI> value) {
        this.oldPOI = value;
    }

    /**
     * Obtém o valor da propriedade roadClassCountryCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoadClassCountryCode() {
        return roadClassCountryCode;
    }

    /**
     * Define o valor da propriedade roadClassCountryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoadClassCountryCode(JAXBElement<String> value) {
        this.roadClassCountryCode = value;
    }

    /**
     * Obtém o valor da propriedade roadClassLevel.
     * 
     * @return
     *     possible object is
     *     {@link MapSyncRoadClassLevel }
     *     
     */
    public MapSyncRoadClassLevel getRoadClassLevel() {
        return roadClassLevel;
    }

    /**
     * Define o valor da propriedade roadClassLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link MapSyncRoadClassLevel }
     *     
     */
    public void setRoadClassLevel(MapSyncRoadClassLevel value) {
        this.roadClassLevel = value;
    }

    /**
     * Obtém o valor da propriedade roadClassLowerLeftCorner.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getRoadClassLowerLeftCorner() {
        return roadClassLowerLeftCorner;
    }

    /**
     * Define o valor da propriedade roadClassLowerLeftCorner.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setRoadClassLowerLeftCorner(JAXBElement<Coordinate> value) {
        this.roadClassLowerLeftCorner = value;
    }

    /**
     * Obtém o valor da propriedade roadClassMode.
     * 
     * @return
     *     possible object is
     *     {@link MapSyncRoadClassMode }
     *     
     */
    public MapSyncRoadClassMode getRoadClassMode() {
        return roadClassMode;
    }

    /**
     * Define o valor da propriedade roadClassMode.
     * 
     * @param value
     *     allowed object is
     *     {@link MapSyncRoadClassMode }
     *     
     */
    public void setRoadClassMode(MapSyncRoadClassMode value) {
        this.roadClassMode = value;
    }

    /**
     * Obtém o valor da propriedade roadClassOperation.
     * 
     * @return
     *     possible object is
     *     {@link MapSyncRoadClassOperation }
     *     
     */
    public MapSyncRoadClassOperation getRoadClassOperation() {
        return roadClassOperation;
    }

    /**
     * Define o valor da propriedade roadClassOperation.
     * 
     * @param value
     *     allowed object is
     *     {@link MapSyncRoadClassOperation }
     *     
     */
    public void setRoadClassOperation(MapSyncRoadClassOperation value) {
        this.roadClassOperation = value;
    }

    /**
     * Obtém o valor da propriedade roadClassSpeedIsMetric.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRoadClassSpeedIsMetric() {
        return roadClassSpeedIsMetric;
    }

    /**
     * Define o valor da propriedade roadClassSpeedIsMetric.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRoadClassSpeedIsMetric(Boolean value) {
        this.roadClassSpeedIsMetric = value;
    }

    /**
     * Obtém o valor da propriedade roadClassSpeedLowerLimit.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRoadClassSpeedLowerLimit() {
        return roadClassSpeedLowerLimit;
    }

    /**
     * Define o valor da propriedade roadClassSpeedLowerLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRoadClassSpeedLowerLimit(Integer value) {
        this.roadClassSpeedLowerLimit = value;
    }

    /**
     * Obtém o valor da propriedade roadClassSpeedUpperLimit.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRoadClassSpeedUpperLimit() {
        return roadClassSpeedUpperLimit;
    }

    /**
     * Define o valor da propriedade roadClassSpeedUpperLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRoadClassSpeedUpperLimit(Integer value) {
        this.roadClassSpeedUpperLimit = value;
    }

    /**
     * Obtém o valor da propriedade roadClassSpeedValue.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRoadClassSpeedValue() {
        return roadClassSpeedValue;
    }

    /**
     * Define o valor da propriedade roadClassSpeedValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRoadClassSpeedValue(Integer value) {
        this.roadClassSpeedValue = value;
    }

    /**
     * Obtém o valor da propriedade roadClassStateName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoadClassStateName() {
        return roadClassStateName;
    }

    /**
     * Define o valor da propriedade roadClassStateName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoadClassStateName(JAXBElement<String> value) {
        this.roadClassStateName = value;
    }

    /**
     * Obtém o valor da propriedade roadClassUpperRightCorner.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getRoadClassUpperRightCorner() {
        return roadClassUpperRightCorner;
    }

    /**
     * Define o valor da propriedade roadClassUpperRightCorner.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setRoadClassUpperRightCorner(JAXBElement<Coordinate> value) {
        this.roadClassUpperRightCorner = value;
    }

    /**
     * Obtém o valor da propriedade timeOfChange.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeOfChange() {
        return timeOfChange;
    }

    /**
     * Define o valor da propriedade timeOfChange.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeOfChange(XMLGregorianCalendar value) {
        this.timeOfChange = value;
    }

    /**
     * Obtém o valor da propriedade turnPenaltyIncomingArc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkArc }{@code >}
     *     
     */
    public JAXBElement<NetworkArc> getTurnPenaltyIncomingArc() {
        return turnPenaltyIncomingArc;
    }

    /**
     * Define o valor da propriedade turnPenaltyIncomingArc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkArc }{@code >}
     *     
     */
    public void setTurnPenaltyIncomingArc(JAXBElement<NetworkArc> value) {
        this.turnPenaltyIncomingArc = value;
    }

    /**
     * Obtém o valor da propriedade turnPenaltyNodePoint.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public JAXBElement<Coordinate> getTurnPenaltyNodePoint() {
        return turnPenaltyNodePoint;
    }

    /**
     * Define o valor da propriedade turnPenaltyNodePoint.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Coordinate }{@code >}
     *     
     */
    public void setTurnPenaltyNodePoint(JAXBElement<Coordinate> value) {
        this.turnPenaltyNodePoint = value;
    }

    /**
     * Obtém o valor da propriedade turnPenaltyOutgoingArc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkArc }{@code >}
     *     
     */
    public JAXBElement<NetworkArc> getTurnPenaltyOutgoingArc() {
        return turnPenaltyOutgoingArc;
    }

    /**
     * Define o valor da propriedade turnPenaltyOutgoingArc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkArc }{@code >}
     *     
     */
    public void setTurnPenaltyOutgoingArc(JAXBElement<NetworkArc> value) {
        this.turnPenaltyOutgoingArc = value;
    }

    /**
     * Obtém o valor da propriedade turnPenaltyValue.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTurnPenaltyValue() {
        return turnPenaltyValue;
    }

    /**
     * Define o valor da propriedade turnPenaltyValue.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTurnPenaltyValue(Integer value) {
        this.turnPenaltyValue = value;
    }

    /**
     * Obtém o valor da propriedade userID.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserID() {
        return userID;
    }

    /**
     * Define o valor da propriedade userID.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserID(JAXBElement<String> value) {
        this.userID = value;
    }

}
