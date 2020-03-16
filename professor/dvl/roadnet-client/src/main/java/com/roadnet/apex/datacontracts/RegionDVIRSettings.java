
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de Region.DVIRSettings complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Region.DVIRSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CarryOverInspectionDefects" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DVIRCommentFrequencyOptions_CommentFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DVIRCommentOptions_CommentWhenDefectsExists" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DVIRInspectionOptions_MiddayInspection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DVIRInspectionOptions_TrailerPostTripInspection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DVIRInspectionOptions_TrailerPreTripInspection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DVIRInspectionOptions_VehiclePostTripInspection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DVIRInspectionOptions_VehiclePreTripInspection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DVIRPromptForCommentOptions_PromptForComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DVIRSubmitOptions_MiddayInspectionSubmit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DVIRSubmitOptions_TrailerPostTripInspectionSubmit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DVIRSubmitOptions_TrailerPreTripInspectionSubmit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DVIRSubmitOptions_VehiclePostTripInspectionSubmit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DVIRSubmitOptions_VehiclePreTripInspectionSubmit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DoNotAllowFreeFormTrailerIDs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PromptToLogoutAfterPostTrip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PromptToRemainAssociatedUponPostTrip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Region.DVIRSettings", propOrder = {
    "carryOverInspectionDefects",
    "dvirCommentFrequencyOptionsCommentFrequency",
    "dvirCommentOptionsCommentWhenDefectsExists",
    "dvirInspectionOptionsMiddayInspection",
    "dvirInspectionOptionsTrailerPostTripInspection",
    "dvirInspectionOptionsTrailerPreTripInspection",
    "dvirInspectionOptionsVehiclePostTripInspection",
    "dvirInspectionOptionsVehiclePreTripInspection",
    "dvirPromptForCommentOptionsPromptForComment",
    "dvirSubmitOptionsMiddayInspectionSubmit",
    "dvirSubmitOptionsTrailerPostTripInspectionSubmit",
    "dvirSubmitOptionsTrailerPreTripInspectionSubmit",
    "dvirSubmitOptionsVehiclePostTripInspectionSubmit",
    "dvirSubmitOptionsVehiclePreTripInspectionSubmit",
    "doNotAllowFreeFormTrailerIDs",
    "promptToLogoutAfterPostTrip",
    "promptToRemainAssociatedUponPostTrip"
})
public class RegionDVIRSettings
    extends DataTransferObject
{

    @XmlElement(name = "CarryOverInspectionDefects")
    protected Boolean carryOverInspectionDefects;
    @XmlElementRef(name = "DVIRCommentFrequencyOptions_CommentFrequency", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dvirCommentFrequencyOptionsCommentFrequency;
    @XmlElementRef(name = "DVIRCommentOptions_CommentWhenDefectsExists", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dvirCommentOptionsCommentWhenDefectsExists;
    @XmlElementRef(name = "DVIRInspectionOptions_MiddayInspection", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dvirInspectionOptionsMiddayInspection;
    @XmlElementRef(name = "DVIRInspectionOptions_TrailerPostTripInspection", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dvirInspectionOptionsTrailerPostTripInspection;
    @XmlElementRef(name = "DVIRInspectionOptions_TrailerPreTripInspection", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dvirInspectionOptionsTrailerPreTripInspection;
    @XmlElementRef(name = "DVIRInspectionOptions_VehiclePostTripInspection", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dvirInspectionOptionsVehiclePostTripInspection;
    @XmlElementRef(name = "DVIRInspectionOptions_VehiclePreTripInspection", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dvirInspectionOptionsVehiclePreTripInspection;
    @XmlElementRef(name = "DVIRPromptForCommentOptions_PromptForComment", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dvirPromptForCommentOptionsPromptForComment;
    @XmlElementRef(name = "DVIRSubmitOptions_MiddayInspectionSubmit", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dvirSubmitOptionsMiddayInspectionSubmit;
    @XmlElementRef(name = "DVIRSubmitOptions_TrailerPostTripInspectionSubmit", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dvirSubmitOptionsTrailerPostTripInspectionSubmit;
    @XmlElementRef(name = "DVIRSubmitOptions_TrailerPreTripInspectionSubmit", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dvirSubmitOptionsTrailerPreTripInspectionSubmit;
    @XmlElementRef(name = "DVIRSubmitOptions_VehiclePostTripInspectionSubmit", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dvirSubmitOptionsVehiclePostTripInspectionSubmit;
    @XmlElementRef(name = "DVIRSubmitOptions_VehiclePreTripInspectionSubmit", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dvirSubmitOptionsVehiclePreTripInspectionSubmit;
    @XmlElement(name = "DoNotAllowFreeFormTrailerIDs")
    protected Boolean doNotAllowFreeFormTrailerIDs;
    @XmlElement(name = "PromptToLogoutAfterPostTrip")
    protected Boolean promptToLogoutAfterPostTrip;
    @XmlElement(name = "PromptToRemainAssociatedUponPostTrip")
    protected Boolean promptToRemainAssociatedUponPostTrip;

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
     * Obtém o valor da propriedade dvirCommentFrequencyOptionsCommentFrequency.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDVIRCommentFrequencyOptionsCommentFrequency() {
        return dvirCommentFrequencyOptionsCommentFrequency;
    }

    /**
     * Define o valor da propriedade dvirCommentFrequencyOptionsCommentFrequency.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDVIRCommentFrequencyOptionsCommentFrequency(JAXBElement<String> value) {
        this.dvirCommentFrequencyOptionsCommentFrequency = value;
    }

    /**
     * Obtém o valor da propriedade dvirCommentOptionsCommentWhenDefectsExists.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDVIRCommentOptionsCommentWhenDefectsExists() {
        return dvirCommentOptionsCommentWhenDefectsExists;
    }

    /**
     * Define o valor da propriedade dvirCommentOptionsCommentWhenDefectsExists.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDVIRCommentOptionsCommentWhenDefectsExists(JAXBElement<String> value) {
        this.dvirCommentOptionsCommentWhenDefectsExists = value;
    }

    /**
     * Obtém o valor da propriedade dvirInspectionOptionsMiddayInspection.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDVIRInspectionOptionsMiddayInspection() {
        return dvirInspectionOptionsMiddayInspection;
    }

    /**
     * Define o valor da propriedade dvirInspectionOptionsMiddayInspection.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDVIRInspectionOptionsMiddayInspection(JAXBElement<String> value) {
        this.dvirInspectionOptionsMiddayInspection = value;
    }

    /**
     * Obtém o valor da propriedade dvirInspectionOptionsTrailerPostTripInspection.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDVIRInspectionOptionsTrailerPostTripInspection() {
        return dvirInspectionOptionsTrailerPostTripInspection;
    }

    /**
     * Define o valor da propriedade dvirInspectionOptionsTrailerPostTripInspection.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDVIRInspectionOptionsTrailerPostTripInspection(JAXBElement<String> value) {
        this.dvirInspectionOptionsTrailerPostTripInspection = value;
    }

    /**
     * Obtém o valor da propriedade dvirInspectionOptionsTrailerPreTripInspection.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDVIRInspectionOptionsTrailerPreTripInspection() {
        return dvirInspectionOptionsTrailerPreTripInspection;
    }

    /**
     * Define o valor da propriedade dvirInspectionOptionsTrailerPreTripInspection.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDVIRInspectionOptionsTrailerPreTripInspection(JAXBElement<String> value) {
        this.dvirInspectionOptionsTrailerPreTripInspection = value;
    }

    /**
     * Obtém o valor da propriedade dvirInspectionOptionsVehiclePostTripInspection.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDVIRInspectionOptionsVehiclePostTripInspection() {
        return dvirInspectionOptionsVehiclePostTripInspection;
    }

    /**
     * Define o valor da propriedade dvirInspectionOptionsVehiclePostTripInspection.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDVIRInspectionOptionsVehiclePostTripInspection(JAXBElement<String> value) {
        this.dvirInspectionOptionsVehiclePostTripInspection = value;
    }

    /**
     * Obtém o valor da propriedade dvirInspectionOptionsVehiclePreTripInspection.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDVIRInspectionOptionsVehiclePreTripInspection() {
        return dvirInspectionOptionsVehiclePreTripInspection;
    }

    /**
     * Define o valor da propriedade dvirInspectionOptionsVehiclePreTripInspection.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDVIRInspectionOptionsVehiclePreTripInspection(JAXBElement<String> value) {
        this.dvirInspectionOptionsVehiclePreTripInspection = value;
    }

    /**
     * Obtém o valor da propriedade dvirPromptForCommentOptionsPromptForComment.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDVIRPromptForCommentOptionsPromptForComment() {
        return dvirPromptForCommentOptionsPromptForComment;
    }

    /**
     * Define o valor da propriedade dvirPromptForCommentOptionsPromptForComment.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDVIRPromptForCommentOptionsPromptForComment(JAXBElement<String> value) {
        this.dvirPromptForCommentOptionsPromptForComment = value;
    }

    /**
     * Obtém o valor da propriedade dvirSubmitOptionsMiddayInspectionSubmit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDVIRSubmitOptionsMiddayInspectionSubmit() {
        return dvirSubmitOptionsMiddayInspectionSubmit;
    }

    /**
     * Define o valor da propriedade dvirSubmitOptionsMiddayInspectionSubmit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDVIRSubmitOptionsMiddayInspectionSubmit(JAXBElement<String> value) {
        this.dvirSubmitOptionsMiddayInspectionSubmit = value;
    }

    /**
     * Obtém o valor da propriedade dvirSubmitOptionsTrailerPostTripInspectionSubmit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDVIRSubmitOptionsTrailerPostTripInspectionSubmit() {
        return dvirSubmitOptionsTrailerPostTripInspectionSubmit;
    }

    /**
     * Define o valor da propriedade dvirSubmitOptionsTrailerPostTripInspectionSubmit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDVIRSubmitOptionsTrailerPostTripInspectionSubmit(JAXBElement<String> value) {
        this.dvirSubmitOptionsTrailerPostTripInspectionSubmit = value;
    }

    /**
     * Obtém o valor da propriedade dvirSubmitOptionsTrailerPreTripInspectionSubmit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDVIRSubmitOptionsTrailerPreTripInspectionSubmit() {
        return dvirSubmitOptionsTrailerPreTripInspectionSubmit;
    }

    /**
     * Define o valor da propriedade dvirSubmitOptionsTrailerPreTripInspectionSubmit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDVIRSubmitOptionsTrailerPreTripInspectionSubmit(JAXBElement<String> value) {
        this.dvirSubmitOptionsTrailerPreTripInspectionSubmit = value;
    }

    /**
     * Obtém o valor da propriedade dvirSubmitOptionsVehiclePostTripInspectionSubmit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDVIRSubmitOptionsVehiclePostTripInspectionSubmit() {
        return dvirSubmitOptionsVehiclePostTripInspectionSubmit;
    }

    /**
     * Define o valor da propriedade dvirSubmitOptionsVehiclePostTripInspectionSubmit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDVIRSubmitOptionsVehiclePostTripInspectionSubmit(JAXBElement<String> value) {
        this.dvirSubmitOptionsVehiclePostTripInspectionSubmit = value;
    }

    /**
     * Obtém o valor da propriedade dvirSubmitOptionsVehiclePreTripInspectionSubmit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDVIRSubmitOptionsVehiclePreTripInspectionSubmit() {
        return dvirSubmitOptionsVehiclePreTripInspectionSubmit;
    }

    /**
     * Define o valor da propriedade dvirSubmitOptionsVehiclePreTripInspectionSubmit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDVIRSubmitOptionsVehiclePreTripInspectionSubmit(JAXBElement<String> value) {
        this.dvirSubmitOptionsVehiclePreTripInspectionSubmit = value;
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

}
