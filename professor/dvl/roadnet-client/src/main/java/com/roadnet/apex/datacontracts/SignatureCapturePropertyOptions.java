
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de SignatureCapturePropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SignatureCapturePropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}RegionBasedAggregateRootEntityPropertyOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeliveryImage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Image" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureCapturePropertyOptions", propOrder = {
    "deliveryImage",
    "image"
})
public class SignatureCapturePropertyOptions
    extends RegionBasedAggregateRootEntityPropertyOptions
{

    @XmlElement(name = "DeliveryImage")
    protected Boolean deliveryImage;
    @XmlElement(name = "Image")
    protected Boolean image;

    /**
     * Obtém o valor da propriedade deliveryImage.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeliveryImage() {
        return deliveryImage;
    }

    /**
     * Define o valor da propriedade deliveryImage.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeliveryImage(Boolean value) {
        this.deliveryImage = value;
    }

    /**
     * Obtém o valor da propriedade image.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImage() {
        return image;
    }

    /**
     * Define o valor da propriedade image.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImage(Boolean value) {
        this.image = value;
    }

}
