
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de ClientApplicationVersionPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ClientApplicationVersionPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccessHost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AccessPort" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AccessScheme" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ApplicationVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ClientApplicationAndroidPackageName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ClientApplicationDisplayName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ClientApplicationEntityKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ClientApplicationName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CultureInstallationUrl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InstallationFilename" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InstallationHost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InstallationPort" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InstallationScheme" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InstallationUrl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReleaseDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientApplicationVersionPropertyOptions", propOrder = {
    "accessHost",
    "accessPort",
    "accessScheme",
    "applicationVersion",
    "clientApplicationAndroidPackageName",
    "clientApplicationDisplayName",
    "clientApplicationEntityKey",
    "clientApplicationName",
    "cultureInstallationUrl",
    "installationFilename",
    "installationHost",
    "installationPort",
    "installationScheme",
    "installationUrl",
    "releaseDate"
})
public class ClientApplicationVersionPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "AccessHost")
    protected Boolean accessHost;
    @XmlElement(name = "AccessPort")
    protected Boolean accessPort;
    @XmlElement(name = "AccessScheme")
    protected Boolean accessScheme;
    @XmlElement(name = "ApplicationVersion")
    protected Boolean applicationVersion;
    @XmlElement(name = "ClientApplicationAndroidPackageName")
    protected Boolean clientApplicationAndroidPackageName;
    @XmlElement(name = "ClientApplicationDisplayName")
    protected Boolean clientApplicationDisplayName;
    @XmlElement(name = "ClientApplicationEntityKey")
    protected Boolean clientApplicationEntityKey;
    @XmlElement(name = "ClientApplicationName")
    protected Boolean clientApplicationName;
    @XmlElement(name = "CultureInstallationUrl")
    protected Boolean cultureInstallationUrl;
    @XmlElement(name = "InstallationFilename")
    protected Boolean installationFilename;
    @XmlElement(name = "InstallationHost")
    protected Boolean installationHost;
    @XmlElement(name = "InstallationPort")
    protected Boolean installationPort;
    @XmlElement(name = "InstallationScheme")
    protected Boolean installationScheme;
    @XmlElement(name = "InstallationUrl")
    protected Boolean installationUrl;
    @XmlElement(name = "ReleaseDate")
    protected Boolean releaseDate;

    /**
     * Obtém o valor da propriedade accessHost.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccessHost() {
        return accessHost;
    }

    /**
     * Define o valor da propriedade accessHost.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccessHost(Boolean value) {
        this.accessHost = value;
    }

    /**
     * Obtém o valor da propriedade accessPort.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccessPort() {
        return accessPort;
    }

    /**
     * Define o valor da propriedade accessPort.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccessPort(Boolean value) {
        this.accessPort = value;
    }

    /**
     * Obtém o valor da propriedade accessScheme.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccessScheme() {
        return accessScheme;
    }

    /**
     * Define o valor da propriedade accessScheme.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccessScheme(Boolean value) {
        this.accessScheme = value;
    }

    /**
     * Obtém o valor da propriedade applicationVersion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApplicationVersion() {
        return applicationVersion;
    }

    /**
     * Define o valor da propriedade applicationVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplicationVersion(Boolean value) {
        this.applicationVersion = value;
    }

    /**
     * Obtém o valor da propriedade clientApplicationAndroidPackageName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClientApplicationAndroidPackageName() {
        return clientApplicationAndroidPackageName;
    }

    /**
     * Define o valor da propriedade clientApplicationAndroidPackageName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClientApplicationAndroidPackageName(Boolean value) {
        this.clientApplicationAndroidPackageName = value;
    }

    /**
     * Obtém o valor da propriedade clientApplicationDisplayName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClientApplicationDisplayName() {
        return clientApplicationDisplayName;
    }

    /**
     * Define o valor da propriedade clientApplicationDisplayName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClientApplicationDisplayName(Boolean value) {
        this.clientApplicationDisplayName = value;
    }

    /**
     * Obtém o valor da propriedade clientApplicationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClientApplicationEntityKey() {
        return clientApplicationEntityKey;
    }

    /**
     * Define o valor da propriedade clientApplicationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClientApplicationEntityKey(Boolean value) {
        this.clientApplicationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade clientApplicationName.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClientApplicationName() {
        return clientApplicationName;
    }

    /**
     * Define o valor da propriedade clientApplicationName.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClientApplicationName(Boolean value) {
        this.clientApplicationName = value;
    }

    /**
     * Obtém o valor da propriedade cultureInstallationUrl.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCultureInstallationUrl() {
        return cultureInstallationUrl;
    }

    /**
     * Define o valor da propriedade cultureInstallationUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCultureInstallationUrl(Boolean value) {
        this.cultureInstallationUrl = value;
    }

    /**
     * Obtém o valor da propriedade installationFilename.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstallationFilename() {
        return installationFilename;
    }

    /**
     * Define o valor da propriedade installationFilename.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstallationFilename(Boolean value) {
        this.installationFilename = value;
    }

    /**
     * Obtém o valor da propriedade installationHost.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstallationHost() {
        return installationHost;
    }

    /**
     * Define o valor da propriedade installationHost.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstallationHost(Boolean value) {
        this.installationHost = value;
    }

    /**
     * Obtém o valor da propriedade installationPort.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstallationPort() {
        return installationPort;
    }

    /**
     * Define o valor da propriedade installationPort.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstallationPort(Boolean value) {
        this.installationPort = value;
    }

    /**
     * Obtém o valor da propriedade installationScheme.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstallationScheme() {
        return installationScheme;
    }

    /**
     * Define o valor da propriedade installationScheme.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstallationScheme(Boolean value) {
        this.installationScheme = value;
    }

    /**
     * Obtém o valor da propriedade installationUrl.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInstallationUrl() {
        return installationUrl;
    }

    /**
     * Define o valor da propriedade installationUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInstallationUrl(Boolean value) {
        this.installationUrl = value;
    }

    /**
     * Obtém o valor da propriedade releaseDate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReleaseDate() {
        return releaseDate;
    }

    /**
     * Define o valor da propriedade releaseDate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReleaseDate(Boolean value) {
        this.releaseDate = value;
    }

}
