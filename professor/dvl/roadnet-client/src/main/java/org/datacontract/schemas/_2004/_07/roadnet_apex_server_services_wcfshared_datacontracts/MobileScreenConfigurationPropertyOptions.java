
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared_datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.RegionBasedAggregateRootEntityPropertyOptions;


/**
 * <p>Classe Java de MobileScreenConfigurationPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MobileScreenConfigurationPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionBasedAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MobileScreenConfigurationType_ConfigurationType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ScreenComponents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileScreenConfigurationPropertyOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.DataContracts.MobileWorkflow", propOrder = {
    "mobileScreenConfigurationTypeConfigurationType",
    "screenComponents"
})
public class MobileScreenConfigurationPropertyOptions
    extends RegionBasedAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "MobileScreenConfigurationType_ConfigurationType")
    protected Boolean mobileScreenConfigurationTypeConfigurationType;
    @XmlElement(name = "ScreenComponents")
    protected Boolean screenComponents;

    /**
     * Obtém o valor da propriedade mobileScreenConfigurationTypeConfigurationType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMobileScreenConfigurationTypeConfigurationType() {
        return mobileScreenConfigurationTypeConfigurationType;
    }

    /**
     * Define o valor da propriedade mobileScreenConfigurationTypeConfigurationType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMobileScreenConfigurationTypeConfigurationType(Boolean value) {
        this.mobileScreenConfigurationTypeConfigurationType = value;
    }

    /**
     * Obtém o valor da propriedade screenComponents.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isScreenComponents() {
        return screenComponents;
    }

    /**
     * Define o valor da propriedade screenComponents.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScreenComponents(Boolean value) {
        this.screenComponents = value;
    }

}
