
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.UserSettings;
import com.roadnet.apex.datacontracts.UserSettingsPropertyOptions;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.PropertyInclusionMode;


/**
 * <p>Classe Java de UpdateUserSettingsParameters complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UpdateUserSettingsParameters"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InclusionMode" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}PropertyInclusionMode" minOccurs="0"/&gt;
 *         &lt;element name="PropertyOptions" type="{http://roadnet.com/apex/DataContracts/}UserSettingsPropertyOptions" minOccurs="0"/&gt;
 *         &lt;element name="UserSettings" type="{http://roadnet.com/apex/DataContracts/}UserSettings" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateUserSettingsParameters", propOrder = {
    "inclusionMode",
    "propertyOptions",
    "userSettings"
})
public class UpdateUserSettingsParameters {

    @XmlElement(name = "InclusionMode")
    @XmlSchemaType(name = "string")
    protected PropertyInclusionMode inclusionMode;
    @XmlElementRef(name = "PropertyOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<UserSettingsPropertyOptions> propertyOptions;
    @XmlElementRef(name = "UserSettings", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<UserSettings> userSettings;

    /**
     * Obtém o valor da propriedade inclusionMode.
     * 
     * @return
     *     possible object is
     *     {@link PropertyInclusionMode }
     *     
     */
    public PropertyInclusionMode getInclusionMode() {
        return inclusionMode;
    }

    /**
     * Define o valor da propriedade inclusionMode.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyInclusionMode }
     *     
     */
    public void setInclusionMode(PropertyInclusionMode value) {
        this.inclusionMode = value;
    }

    /**
     * Obtém o valor da propriedade propertyOptions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserSettingsPropertyOptions }{@code >}
     *     
     */
    public JAXBElement<UserSettingsPropertyOptions> getPropertyOptions() {
        return propertyOptions;
    }

    /**
     * Define o valor da propriedade propertyOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserSettingsPropertyOptions }{@code >}
     *     
     */
    public void setPropertyOptions(JAXBElement<UserSettingsPropertyOptions> value) {
        this.propertyOptions = value;
    }

    /**
     * Obtém o valor da propriedade userSettings.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserSettings }{@code >}
     *     
     */
    public JAXBElement<UserSettings> getUserSettings() {
        return userSettings;
    }

    /**
     * Define o valor da propriedade userSettings.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserSettings }{@code >}
     *     
     */
    public void setUserSettings(JAXBElement<UserSettings> value) {
        this.userSettings = value;
    }

}
