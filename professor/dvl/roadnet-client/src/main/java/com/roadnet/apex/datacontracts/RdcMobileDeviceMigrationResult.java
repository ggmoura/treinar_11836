
package com.roadnet.apex.datacontracts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RdcMobileDeviceMigrationResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RdcMobileDeviceMigrationResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RdcEntityMigrationResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NotMigratedMobileDevices" type="{http://roadnet.com/apex/DataContracts/}ArrayOfNotMigratedMobileDevice" minOccurs="0"/&gt;
 *         &lt;element name="TotalDevices" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RdcMobileDeviceMigrationResult", propOrder = {
    "notMigratedMobileDevices",
    "totalDevices"
})
public class RdcMobileDeviceMigrationResult
    extends RdcEntityMigrationResult
{

    @XmlElementRef(name = "NotMigratedMobileDevices", namespace = "http://roadnet.com/apex/DataContracts/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNotMigratedMobileDevice> notMigratedMobileDevices;
    @XmlElement(name = "TotalDevices")
    protected Integer totalDevices;

    /**
     * Obtém o valor da propriedade notMigratedMobileDevices.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNotMigratedMobileDevice }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNotMigratedMobileDevice> getNotMigratedMobileDevices() {
        return notMigratedMobileDevices;
    }

    /**
     * Define o valor da propriedade notMigratedMobileDevices.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNotMigratedMobileDevice }{@code >}
     *     
     */
    public void setNotMigratedMobileDevices(JAXBElement<ArrayOfNotMigratedMobileDevice> value) {
        this.notMigratedMobileDevices = value;
    }

    /**
     * Obtém o valor da propriedade totalDevices.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalDevices() {
        return totalDevices;
    }

    /**
     * Define o valor da propriedade totalDevices.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalDevices(Integer value) {
        this.totalDevices = value;
    }

}
