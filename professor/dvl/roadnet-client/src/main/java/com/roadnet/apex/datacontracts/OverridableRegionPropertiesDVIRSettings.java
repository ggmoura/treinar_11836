
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de OverridableRegionProperties.DVIRSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OverridableRegionProperties.DVIRSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CarryOverInspectionDefects" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CommentFrequency" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CommentWhenDefectsExists" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DoNotAllowFreeFormTrailerIDs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MiddayInspection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MiddayInspectionSubmit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PromptForComment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PromptToLogoutAfterPostTrip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PromptToRemainAssociatedUponPostTrip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TrailerPostTripInspection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TrailerPostTripInspectionSubmit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TrailerPreTripInspection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TrailerPreTripInspectionSubmit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VehiclePostTripInspection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VehiclePostTripInspectionSubmit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VehiclePreTripInspection" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VehiclePreTripInspectionSubmit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverridableRegionProperties.DVIRSettings", propOrder = {
    "carryOverInspectionDefects",
    "commentFrequency",
    "commentWhenDefectsExists",
    "doNotAllowFreeFormTrailerIDs",
    "middayInspection",
    "middayInspectionSubmit",
    "promptForComment",
    "promptToLogoutAfterPostTrip",
    "promptToRemainAssociatedUponPostTrip",
    "trailerPostTripInspection",
    "trailerPostTripInspectionSubmit",
    "trailerPreTripInspection",
    "trailerPreTripInspectionSubmit",
    "vehiclePostTripInspection",
    "vehiclePostTripInspectionSubmit",
    "vehiclePreTripInspection",
    "vehiclePreTripInspectionSubmit"
})
public class OverridableRegionPropertiesDVIRSettings
    extends DataTransferObject
{

    @XmlElement(name = "CarryOverInspectionDefects")
    protected Boolean carryOverInspectionDefects;
    @XmlElement(name = "CommentFrequency")
    protected Boolean commentFrequency;
    @XmlElement(name = "CommentWhenDefectsExists")
    protected Boolean commentWhenDefectsExists;
    @XmlElement(name = "DoNotAllowFreeFormTrailerIDs")
    protected Boolean doNotAllowFreeFormTrailerIDs;
    @XmlElement(name = "MiddayInspection")
    protected Boolean middayInspection;
    @XmlElement(name = "MiddayInspectionSubmit")
    protected Boolean middayInspectionSubmit;
    @XmlElement(name = "PromptForComment")
    protected Boolean promptForComment;
    @XmlElement(name = "PromptToLogoutAfterPostTrip")
    protected Boolean promptToLogoutAfterPostTrip;
    @XmlElement(name = "PromptToRemainAssociatedUponPostTrip")
    protected Boolean promptToRemainAssociatedUponPostTrip;
    @XmlElement(name = "TrailerPostTripInspection")
    protected Boolean trailerPostTripInspection;
    @XmlElement(name = "TrailerPostTripInspectionSubmit")
    protected Boolean trailerPostTripInspectionSubmit;
    @XmlElement(name = "TrailerPreTripInspection")
    protected Boolean trailerPreTripInspection;
    @XmlElement(name = "TrailerPreTripInspectionSubmit")
    protected Boolean trailerPreTripInspectionSubmit;
    @XmlElement(name = "VehiclePostTripInspection")
    protected Boolean vehiclePostTripInspection;
    @XmlElement(name = "VehiclePostTripInspectionSubmit")
    protected Boolean vehiclePostTripInspectionSubmit;
    @XmlElement(name = "VehiclePreTripInspection")
    protected Boolean vehiclePreTripInspection;
    @XmlElement(name = "VehiclePreTripInspectionSubmit")
    protected Boolean vehiclePreTripInspectionSubmit;

    /**
     * Obtém o valor da propriedade carryOverInspectionDefects.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCarryOverInspectionDefects() {
        return carryOverInspectionDefects;
    }

    /**
     * Define o valor da propriedade carryOverInspectionDefects.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCarryOverInspectionDefects(Boolean value) {
        this.carryOverInspectionDefects = value;
    }

    /**
     * Obtém o valor da propriedade commentFrequency.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommentFrequency() {
        return commentFrequency;
    }

    /**
     * Define o valor da propriedade commentFrequency.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommentFrequency(Boolean value) {
        this.commentFrequency = value;
    }

    /**
     * Obtém o valor da propriedade commentWhenDefectsExists.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCommentWhenDefectsExists() {
        return commentWhenDefectsExists;
    }

    /**
     * Define o valor da propriedade commentWhenDefectsExists.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommentWhenDefectsExists(Boolean value) {
        this.commentWhenDefectsExists = value;
    }

    /**
     * Obtém o valor da propriedade doNotAllowFreeFormTrailerIDs.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoNotAllowFreeFormTrailerIDs() {
        return doNotAllowFreeFormTrailerIDs;
    }

    /**
     * Define o valor da propriedade doNotAllowFreeFormTrailerIDs.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoNotAllowFreeFormTrailerIDs(Boolean value) {
        this.doNotAllowFreeFormTrailerIDs = value;
    }

    /**
     * Obtém o valor da propriedade middayInspection.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMiddayInspection() {
        return middayInspection;
    }

    /**
     * Define o valor da propriedade middayInspection.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMiddayInspection(Boolean value) {
        this.middayInspection = value;
    }

    /**
     * Obtém o valor da propriedade middayInspectionSubmit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMiddayInspectionSubmit() {
        return middayInspectionSubmit;
    }

    /**
     * Define o valor da propriedade middayInspectionSubmit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMiddayInspectionSubmit(Boolean value) {
        this.middayInspectionSubmit = value;
    }

    /**
     * Obtém o valor da propriedade promptForComment.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPromptForComment() {
        return promptForComment;
    }

    /**
     * Define o valor da propriedade promptForComment.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPromptForComment(Boolean value) {
        this.promptForComment = value;
    }

    /**
     * Obtém o valor da propriedade promptToLogoutAfterPostTrip.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPromptToLogoutAfterPostTrip() {
        return promptToLogoutAfterPostTrip;
    }

    /**
     * Define o valor da propriedade promptToLogoutAfterPostTrip.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPromptToLogoutAfterPostTrip(Boolean value) {
        this.promptToLogoutAfterPostTrip = value;
    }

    /**
     * Obtém o valor da propriedade promptToRemainAssociatedUponPostTrip.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPromptToRemainAssociatedUponPostTrip() {
        return promptToRemainAssociatedUponPostTrip;
    }

    /**
     * Define o valor da propriedade promptToRemainAssociatedUponPostTrip.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPromptToRemainAssociatedUponPostTrip(Boolean value) {
        this.promptToRemainAssociatedUponPostTrip = value;
    }

    /**
     * Obtém o valor da propriedade trailerPostTripInspection.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrailerPostTripInspection() {
        return trailerPostTripInspection;
    }

    /**
     * Define o valor da propriedade trailerPostTripInspection.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrailerPostTripInspection(Boolean value) {
        this.trailerPostTripInspection = value;
    }

    /**
     * Obtém o valor da propriedade trailerPostTripInspectionSubmit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrailerPostTripInspectionSubmit() {
        return trailerPostTripInspectionSubmit;
    }

    /**
     * Define o valor da propriedade trailerPostTripInspectionSubmit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrailerPostTripInspectionSubmit(Boolean value) {
        this.trailerPostTripInspectionSubmit = value;
    }

    /**
     * Obtém o valor da propriedade trailerPreTripInspection.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrailerPreTripInspection() {
        return trailerPreTripInspection;
    }

    /**
     * Define o valor da propriedade trailerPreTripInspection.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrailerPreTripInspection(Boolean value) {
        this.trailerPreTripInspection = value;
    }

    /**
     * Obtém o valor da propriedade trailerPreTripInspectionSubmit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrailerPreTripInspectionSubmit() {
        return trailerPreTripInspectionSubmit;
    }

    /**
     * Define o valor da propriedade trailerPreTripInspectionSubmit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrailerPreTripInspectionSubmit(Boolean value) {
        this.trailerPreTripInspectionSubmit = value;
    }

    /**
     * Obtém o valor da propriedade vehiclePostTripInspection.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVehiclePostTripInspection() {
        return vehiclePostTripInspection;
    }

    /**
     * Define o valor da propriedade vehiclePostTripInspection.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVehiclePostTripInspection(Boolean value) {
        this.vehiclePostTripInspection = value;
    }

    /**
     * Obtém o valor da propriedade vehiclePostTripInspectionSubmit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVehiclePostTripInspectionSubmit() {
        return vehiclePostTripInspectionSubmit;
    }

    /**
     * Define o valor da propriedade vehiclePostTripInspectionSubmit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVehiclePostTripInspectionSubmit(Boolean value) {
        this.vehiclePostTripInspectionSubmit = value;
    }

    /**
     * Obtém o valor da propriedade vehiclePreTripInspection.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVehiclePreTripInspection() {
        return vehiclePreTripInspection;
    }

    /**
     * Define o valor da propriedade vehiclePreTripInspection.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVehiclePreTripInspection(Boolean value) {
        this.vehiclePreTripInspection = value;
    }

    /**
     * Obtém o valor da propriedade vehiclePreTripInspectionSubmit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVehiclePreTripInspectionSubmit() {
        return vehiclePreTripInspectionSubmit;
    }

    /**
     * Define o valor da propriedade vehiclePreTripInspectionSubmit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVehiclePreTripInspectionSubmit(Boolean value) {
        this.vehiclePreTripInspectionSubmit = value;
    }

}
