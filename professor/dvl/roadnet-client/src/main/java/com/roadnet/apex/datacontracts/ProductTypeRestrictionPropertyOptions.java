
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ProductTypeRestrictionPropertyOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ProductTypeRestrictionPropertyOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllowDisallow_Rule" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ProductTypeEntityKeys" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductTypeRestrictionPropertyOptions", propOrder = {
    "allowDisallowRule",
    "productTypeEntityKeys"
})
public class ProductTypeRestrictionPropertyOptions {

    @XmlElement(name = "AllowDisallow_Rule")
    protected Boolean allowDisallowRule;
    @XmlElement(name = "ProductTypeEntityKeys")
    protected Boolean productTypeEntityKeys;

    /**
     * Obtém o valor da propriedade allowDisallowRule.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowDisallowRule() {
        return allowDisallowRule;
    }

    /**
     * Define o valor da propriedade allowDisallowRule.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowDisallowRule(Boolean value) {
        this.allowDisallowRule = value;
    }

    /**
     * Obtém o valor da propriedade productTypeEntityKeys.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProductTypeEntityKeys() {
        return productTypeEntityKeys;
    }

    /**
     * Define o valor da propriedade productTypeEntityKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProductTypeEntityKeys(Boolean value) {
        this.productTypeEntityKeys = value;
    }

}
