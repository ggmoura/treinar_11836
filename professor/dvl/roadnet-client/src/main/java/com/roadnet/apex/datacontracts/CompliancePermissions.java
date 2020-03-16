
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de CompliancePermissions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CompliancePermissions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Dvir" type="{http://roadnet.com/apex/DataContracts/}CompliancePermissions.DvirPermissions" minOccurs="0"/&gt;
 *         &lt;element name="Hos" type="{http://roadnet.com/apex/DataContracts/}CompliancePermissions.HosPermissions" minOccurs="0"/&gt;
 *         &lt;element name="Ifta" type="{http://roadnet.com/apex/DataContracts/}CompliancePermissions.IftaPermissions" minOccurs="0"/&gt;
 *         &lt;element name="Misc" type="{http://roadnet.com/apex/DataContracts/}CompliancePermissions.MiscPermissions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompliancePermissions", propOrder = {
    "dvir",
    "hos",
    "ifta",
    "misc"
})
public class CompliancePermissions
    extends DataTransferObject
{

    @XmlElementRef(name = "Dvir", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<CompliancePermissionsDvirPermissions> dvir;
    @XmlElementRef(name = "Hos", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<CompliancePermissionsHosPermissions> hos;
    @XmlElementRef(name = "Ifta", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<CompliancePermissionsIftaPermissions> ifta;
    @XmlElementRef(name = "Misc", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<CompliancePermissionsMiscPermissions> misc;

    /**
     * Obtém o valor da propriedade dvir.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CompliancePermissionsDvirPermissions }{@code >}
     *     
     */
    public JAXBElement<CompliancePermissionsDvirPermissions> getDvir() {
        return dvir;
    }

    /**
     * Define o valor da propriedade dvir.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CompliancePermissionsDvirPermissions }{@code >}
     *     
     */
    public void setDvir(JAXBElement<CompliancePermissionsDvirPermissions> value) {
        this.dvir = value;
    }

    /**
     * Obtém o valor da propriedade hos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CompliancePermissionsHosPermissions }{@code >}
     *     
     */
    public JAXBElement<CompliancePermissionsHosPermissions> getHos() {
        return hos;
    }

    /**
     * Define o valor da propriedade hos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CompliancePermissionsHosPermissions }{@code >}
     *     
     */
    public void setHos(JAXBElement<CompliancePermissionsHosPermissions> value) {
        this.hos = value;
    }

    /**
     * Obtém o valor da propriedade ifta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CompliancePermissionsIftaPermissions }{@code >}
     *     
     */
    public JAXBElement<CompliancePermissionsIftaPermissions> getIfta() {
        return ifta;
    }

    /**
     * Define o valor da propriedade ifta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CompliancePermissionsIftaPermissions }{@code >}
     *     
     */
    public void setIfta(JAXBElement<CompliancePermissionsIftaPermissions> value) {
        this.ifta = value;
    }

    /**
     * Obtém o valor da propriedade misc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CompliancePermissionsMiscPermissions }{@code >}
     *     
     */
    public JAXBElement<CompliancePermissionsMiscPermissions> getMisc() {
        return misc;
    }

    /**
     * Define o valor da propriedade misc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CompliancePermissionsMiscPermissions }{@code >}
     *     
     */
    public void setMisc(JAXBElement<CompliancePermissionsMiscPermissions> value) {
        this.misc = value;
    }

}
