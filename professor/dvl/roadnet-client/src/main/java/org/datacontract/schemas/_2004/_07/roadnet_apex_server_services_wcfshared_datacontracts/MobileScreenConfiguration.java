
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.RegionBasedAggregateRootEntity;


/**
 * <p>Classe Java de MobileScreenConfiguration complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MobileScreenConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionBasedAggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MobileScreenConfigurationType_ConfigurationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ScreenComponents" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow}ArrayOfMobileScreenComponent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileScreenConfiguration", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", propOrder = {
    "mobileScreenConfigurationTypeConfigurationType",
    "screenComponents"
})
public class MobileScreenConfiguration
    extends RegionBasedAggregateRootEntity
{

    @XmlElementRef(name = "MobileScreenConfigurationType_ConfigurationType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileScreenConfigurationTypeConfigurationType;
    @XmlElementRef(name = "ScreenComponents", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMobileScreenComponent> screenComponents;

    /**
     * Obtém o valor da propriedade mobileScreenConfigurationTypeConfigurationType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileScreenConfigurationTypeConfigurationType() {
        return mobileScreenConfigurationTypeConfigurationType;
    }

    /**
     * Define o valor da propriedade mobileScreenConfigurationTypeConfigurationType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileScreenConfigurationTypeConfigurationType(JAXBElement<String> value) {
        this.mobileScreenConfigurationTypeConfigurationType = value;
    }

    /**
     * Obtém o valor da propriedade screenComponents.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMobileScreenComponent }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMobileScreenComponent> getScreenComponents() {
        return screenComponents;
    }

    /**
     * Define o valor da propriedade screenComponents.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMobileScreenComponent }{@code >}
     *     
     */
    public void setScreenComponents(JAXBElement<ArrayOfMobileScreenComponent> value) {
        this.screenComponents = value;
    }

}
