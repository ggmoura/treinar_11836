
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DomainEntityPropertyOptions;


/**
 * <p>Classe Java de DatabaseServerGroupPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DatabaseServerGroupPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DomainEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AvailabilityGroup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BackupDirectory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Listener" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MirrorServer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MirrorServerPort" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryReplicaServer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PrincipalServer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PrincipalServerPort" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Server" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ServerGroupType_Type" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WitnessServer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WitnessServerPort" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatabaseServerGroupPropertyOptions", propOrder = {
    "availabilityGroup",
    "backupDirectory",
    "description",
    "identifier",
    "listener",
    "mirrorServer",
    "mirrorServerPort",
    "primaryReplicaServer",
    "principalServer",
    "principalServerPort",
    "server",
    "serverGroupTypeType",
    "witnessServer",
    "witnessServerPort"
})
public class DatabaseServerGroupPropertyOptions
    extends DomainEntityPropertyOptions
{

    @XmlElement(name = "AvailabilityGroup")
    protected Boolean availabilityGroup;
    @XmlElement(name = "BackupDirectory")
    protected Boolean backupDirectory;
    @XmlElement(name = "Description")
    protected Boolean description;
    @XmlElement(name = "Identifier")
    protected Boolean identifier;
    @XmlElement(name = "Listener")
    protected Boolean listener;
    @XmlElement(name = "MirrorServer")
    protected Boolean mirrorServer;
    @XmlElement(name = "MirrorServerPort")
    protected Boolean mirrorServerPort;
    @XmlElement(name = "PrimaryReplicaServer")
    protected Boolean primaryReplicaServer;
    @XmlElement(name = "PrincipalServer")
    protected Boolean principalServer;
    @XmlElement(name = "PrincipalServerPort")
    protected Boolean principalServerPort;
    @XmlElement(name = "Server")
    protected Boolean server;
    @XmlElement(name = "ServerGroupType_Type")
    protected Boolean serverGroupTypeType;
    @XmlElement(name = "WitnessServer")
    protected Boolean witnessServer;
    @XmlElement(name = "WitnessServerPort")
    protected Boolean witnessServerPort;

    /**
     * Obtém o valor da propriedade availabilityGroup.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvailabilityGroup() {
        return availabilityGroup;
    }

    /**
     * Define o valor da propriedade availabilityGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvailabilityGroup(Boolean value) {
        this.availabilityGroup = value;
    }

    /**
     * Obtém o valor da propriedade backupDirectory.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBackupDirectory() {
        return backupDirectory;
    }

    /**
     * Define o valor da propriedade backupDirectory.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBackupDirectory(Boolean value) {
        this.backupDirectory = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDescription(Boolean value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade identifier.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdentifier() {
        return identifier;
    }

    /**
     * Define o valor da propriedade identifier.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdentifier(Boolean value) {
        this.identifier = value;
    }

    /**
     * Obtém o valor da propriedade listener.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isListener() {
        return listener;
    }

    /**
     * Define o valor da propriedade listener.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setListener(Boolean value) {
        this.listener = value;
    }

    /**
     * Obtém o valor da propriedade mirrorServer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMirrorServer() {
        return mirrorServer;
    }

    /**
     * Define o valor da propriedade mirrorServer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMirrorServer(Boolean value) {
        this.mirrorServer = value;
    }

    /**
     * Obtém o valor da propriedade mirrorServerPort.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMirrorServerPort() {
        return mirrorServerPort;
    }

    /**
     * Define o valor da propriedade mirrorServerPort.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMirrorServerPort(Boolean value) {
        this.mirrorServerPort = value;
    }

    /**
     * Obtém o valor da propriedade primaryReplicaServer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryReplicaServer() {
        return primaryReplicaServer;
    }

    /**
     * Define o valor da propriedade primaryReplicaServer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryReplicaServer(Boolean value) {
        this.primaryReplicaServer = value;
    }

    /**
     * Obtém o valor da propriedade principalServer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrincipalServer() {
        return principalServer;
    }

    /**
     * Define o valor da propriedade principalServer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrincipalServer(Boolean value) {
        this.principalServer = value;
    }

    /**
     * Obtém o valor da propriedade principalServerPort.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrincipalServerPort() {
        return principalServerPort;
    }

    /**
     * Define o valor da propriedade principalServerPort.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrincipalServerPort(Boolean value) {
        this.principalServerPort = value;
    }

    /**
     * Obtém o valor da propriedade server.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServer() {
        return server;
    }

    /**
     * Define o valor da propriedade server.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServer(Boolean value) {
        this.server = value;
    }

    /**
     * Obtém o valor da propriedade serverGroupTypeType.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServerGroupTypeType() {
        return serverGroupTypeType;
    }

    /**
     * Define o valor da propriedade serverGroupTypeType.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServerGroupTypeType(Boolean value) {
        this.serverGroupTypeType = value;
    }

    /**
     * Obtém o valor da propriedade witnessServer.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWitnessServer() {
        return witnessServer;
    }

    /**
     * Define o valor da propriedade witnessServer.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWitnessServer(Boolean value) {
        this.witnessServer = value;
    }

    /**
     * Obtém o valor da propriedade witnessServerPort.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWitnessServerPort() {
        return witnessServerPort;
    }

    /**
     * Define o valor da propriedade witnessServerPort.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWitnessServerPort(Boolean value) {
        this.witnessServerPort = value;
    }

}
