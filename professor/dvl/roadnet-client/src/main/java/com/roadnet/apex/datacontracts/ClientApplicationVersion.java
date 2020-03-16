
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ClientApplicationVersion complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ClientApplicationVersion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}AggregateRootEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccessHost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccessPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AccessScheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApplicationVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientApplicationAndroidPackageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientApplicationDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientApplicationEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ClientApplicationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CultureInstallationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InstallationFilename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InstallationHost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InstallationPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InstallationScheme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InstallationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MinimumApplicationVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReleaseDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientApplicationVersion", propOrder = {
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
    "minimumApplicationVersion",
    "releaseDate"
})
public class ClientApplicationVersion
    extends AggregateRootEntity
{

    @XmlElementRef(name = "AccessHost", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accessHost;
    @XmlElementRef(name = "AccessPort", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> accessPort;
    @XmlElementRef(name = "AccessScheme", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accessScheme;
    @XmlElementRef(name = "ApplicationVersion", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applicationVersion;
    @XmlElementRef(name = "ClientApplicationAndroidPackageName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientApplicationAndroidPackageName;
    @XmlElementRef(name = "ClientApplicationDisplayName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientApplicationDisplayName;
    @XmlElement(name = "ClientApplicationEntityKey")
    protected Long clientApplicationEntityKey;
    @XmlElementRef(name = "ClientApplicationName", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientApplicationName;
    @XmlElementRef(name = "CultureInstallationUrl", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cultureInstallationUrl;
    @XmlElementRef(name = "InstallationFilename", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> installationFilename;
    @XmlElementRef(name = "InstallationHost", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> installationHost;
    @XmlElementRef(name = "InstallationPort", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> installationPort;
    @XmlElementRef(name = "InstallationScheme", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> installationScheme;
    @XmlElementRef(name = "InstallationUrl", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> installationUrl;
    @XmlElementRef(name = "MinimumApplicationVersion", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> minimumApplicationVersion;
    @XmlElementRef(name = "ReleaseDate", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> releaseDate;

    /**
     * Obtém o valor da propriedade accessHost.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccessHost() {
        return accessHost;
    }

    /**
     * Define o valor da propriedade accessHost.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccessHost(JAXBElement<String> value) {
        this.accessHost = value;
    }

    /**
     * Obtém o valor da propriedade accessPort.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAccessPort() {
        return accessPort;
    }

    /**
     * Define o valor da propriedade accessPort.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAccessPort(JAXBElement<Integer> value) {
        this.accessPort = value;
    }

    /**
     * Obtém o valor da propriedade accessScheme.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccessScheme() {
        return accessScheme;
    }

    /**
     * Define o valor da propriedade accessScheme.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccessScheme(JAXBElement<String> value) {
        this.accessScheme = value;
    }

    /**
     * Obtém o valor da propriedade applicationVersion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplicationVersion() {
        return applicationVersion;
    }

    /**
     * Define o valor da propriedade applicationVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplicationVersion(JAXBElement<String> value) {
        this.applicationVersion = value;
    }

    /**
     * Obtém o valor da propriedade clientApplicationAndroidPackageName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientApplicationAndroidPackageName() {
        return clientApplicationAndroidPackageName;
    }

    /**
     * Define o valor da propriedade clientApplicationAndroidPackageName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientApplicationAndroidPackageName(JAXBElement<String> value) {
        this.clientApplicationAndroidPackageName = value;
    }

    /**
     * Obtém o valor da propriedade clientApplicationDisplayName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientApplicationDisplayName() {
        return clientApplicationDisplayName;
    }

    /**
     * Define o valor da propriedade clientApplicationDisplayName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientApplicationDisplayName(JAXBElement<String> value) {
        this.clientApplicationDisplayName = value;
    }

    /**
     * Obtém o valor da propriedade clientApplicationEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClientApplicationEntityKey() {
        return clientApplicationEntityKey;
    }

    /**
     * Define o valor da propriedade clientApplicationEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClientApplicationEntityKey(Long value) {
        this.clientApplicationEntityKey = value;
    }

    /**
     * Obtém o valor da propriedade clientApplicationName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientApplicationName() {
        return clientApplicationName;
    }

    /**
     * Define o valor da propriedade clientApplicationName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientApplicationName(JAXBElement<String> value) {
        this.clientApplicationName = value;
    }

    /**
     * Obtém o valor da propriedade cultureInstallationUrl.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCultureInstallationUrl() {
        return cultureInstallationUrl;
    }

    /**
     * Define o valor da propriedade cultureInstallationUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCultureInstallationUrl(JAXBElement<String> value) {
        this.cultureInstallationUrl = value;
    }

    /**
     * Obtém o valor da propriedade installationFilename.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstallationFilename() {
        return installationFilename;
    }

    /**
     * Define o valor da propriedade installationFilename.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstallationFilename(JAXBElement<String> value) {
        this.installationFilename = value;
    }

    /**
     * Obtém o valor da propriedade installationHost.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstallationHost() {
        return installationHost;
    }

    /**
     * Define o valor da propriedade installationHost.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstallationHost(JAXBElement<String> value) {
        this.installationHost = value;
    }

    /**
     * Obtém o valor da propriedade installationPort.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getInstallationPort() {
        return installationPort;
    }

    /**
     * Define o valor da propriedade installationPort.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setInstallationPort(JAXBElement<Integer> value) {
        this.installationPort = value;
    }

    /**
     * Obtém o valor da propriedade installationScheme.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstallationScheme() {
        return installationScheme;
    }

    /**
     * Define o valor da propriedade installationScheme.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstallationScheme(JAXBElement<String> value) {
        this.installationScheme = value;
    }

    /**
     * Obtém o valor da propriedade installationUrl.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstallationUrl() {
        return installationUrl;
    }

    /**
     * Define o valor da propriedade installationUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstallationUrl(JAXBElement<String> value) {
        this.installationUrl = value;
    }

    /**
     * Obtém o valor da propriedade minimumApplicationVersion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMinimumApplicationVersion() {
        return minimumApplicationVersion;
    }

    /**
     * Define o valor da propriedade minimumApplicationVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMinimumApplicationVersion(JAXBElement<String> value) {
        this.minimumApplicationVersion = value;
    }

    /**
     * Obtém o valor da propriedade releaseDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getReleaseDate() {
        return releaseDate;
    }

    /**
     * Define o valor da propriedade releaseDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setReleaseDate(JAXBElement<XMLGregorianCalendar> value) {
        this.releaseDate = value;
    }

}
