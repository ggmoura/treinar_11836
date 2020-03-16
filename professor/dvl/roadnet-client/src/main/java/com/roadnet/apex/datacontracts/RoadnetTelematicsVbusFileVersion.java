
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de RoadnetTelematicsVbusFileVersion complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RoadnetTelematicsVbusFileVersion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeviceModels" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="VbusFileType_VbusFileType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VersionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadnetTelematicsVbusFileVersion", propOrder = {
    "deviceModels",
    "vbusFileTypeVbusFileType",
    "versionNumber"
})
public class RoadnetTelematicsVbusFileVersion
    extends DataTransferObject
{

    @XmlElementRef(name = "DeviceModels", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> deviceModels;
    @XmlElementRef(name = "VbusFileType_VbusFileType", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vbusFileTypeVbusFileType;
    @XmlElementRef(name = "VersionNumber", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> versionNumber;

    /**
     * Obtém o valor da propriedade deviceModels.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getDeviceModels() {
        return deviceModels;
    }

    /**
     * Define o valor da propriedade deviceModels.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setDeviceModels(JAXBElement<ArrayOfstring> value) {
        this.deviceModels = value;
    }

    /**
     * Obtém o valor da propriedade vbusFileTypeVbusFileType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVbusFileTypeVbusFileType() {
        return vbusFileTypeVbusFileType;
    }

    /**
     * Define o valor da propriedade vbusFileTypeVbusFileType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVbusFileTypeVbusFileType(JAXBElement<String> value) {
        this.vbusFileTypeVbusFileType = value;
    }

    /**
     * Obtém o valor da propriedade versionNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVersionNumber() {
        return versionNumber;
    }

    /**
     * Define o valor da propriedade versionNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVersionNumber(JAXBElement<String> value) {
        this.versionNumber = value;
    }

}
