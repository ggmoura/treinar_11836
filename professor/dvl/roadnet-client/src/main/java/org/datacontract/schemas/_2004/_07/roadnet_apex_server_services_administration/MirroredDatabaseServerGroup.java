
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_administration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MirroredDatabaseServerGroup complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="MirroredDatabaseServerGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts}DatabaseServerGroup"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MirrorServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MirrorServerPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PrincipalServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrincipalServerPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="WitnessServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WitnessServerPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MirroredDatabaseServerGroup", propOrder = {
    "mirrorServer",
    "mirrorServerPort",
    "principalServer",
    "principalServerPort",
    "witnessServer",
    "witnessServerPort"
})
public class MirroredDatabaseServerGroup
    extends DatabaseServerGroup
{

    @XmlElementRef(name = "MirrorServer", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mirrorServer;
    @XmlElementRef(name = "MirrorServerPort", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mirrorServerPort;
    @XmlElementRef(name = "PrincipalServer", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> principalServer;
    @XmlElementRef(name = "PrincipalServerPort", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> principalServerPort;
    @XmlElementRef(name = "WitnessServer", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> witnessServer;
    @XmlElementRef(name = "WitnessServerPort", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Administration.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> witnessServerPort;

    /**
     * Obtém o valor da propriedade mirrorServer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMirrorServer() {
        return mirrorServer;
    }

    /**
     * Define o valor da propriedade mirrorServer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMirrorServer(JAXBElement<String> value) {
        this.mirrorServer = value;
    }

    /**
     * Obtém o valor da propriedade mirrorServerPort.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMirrorServerPort() {
        return mirrorServerPort;
    }

    /**
     * Define o valor da propriedade mirrorServerPort.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMirrorServerPort(JAXBElement<Integer> value) {
        this.mirrorServerPort = value;
    }

    /**
     * Obtém o valor da propriedade principalServer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrincipalServer() {
        return principalServer;
    }

    /**
     * Define o valor da propriedade principalServer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrincipalServer(JAXBElement<String> value) {
        this.principalServer = value;
    }

    /**
     * Obtém o valor da propriedade principalServerPort.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPrincipalServerPort() {
        return principalServerPort;
    }

    /**
     * Define o valor da propriedade principalServerPort.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPrincipalServerPort(JAXBElement<Integer> value) {
        this.principalServerPort = value;
    }

    /**
     * Obtém o valor da propriedade witnessServer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWitnessServer() {
        return witnessServer;
    }

    /**
     * Define o valor da propriedade witnessServer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWitnessServer(JAXBElement<String> value) {
        this.witnessServer = value;
    }

    /**
     * Obtém o valor da propriedade witnessServerPort.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWitnessServerPort() {
        return witnessServerPort;
    }

    /**
     * Define o valor da propriedade witnessServerPort.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWitnessServerPort(JAXBElement<Integer> value) {
        this.witnessServerPort = value;
    }

}
