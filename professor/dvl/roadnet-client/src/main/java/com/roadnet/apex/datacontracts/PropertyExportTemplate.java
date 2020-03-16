
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PropertyExportTemplate complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PropertyExportTemplate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}PropertyTransferTemplate"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RightJustified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyExportTemplate", propOrder = {
    "rightJustified"
})
public class PropertyExportTemplate
    extends PropertyTransferTemplate
{

    @XmlElement(name = "RightJustified")
    protected Boolean rightJustified;

    /**
     * Obtém o valor da propriedade rightJustified.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRightJustified() {
        return rightJustified;
    }

    /**
     * Define o valor da propriedade rightJustified.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRightJustified(Boolean value) {
        this.rightJustified = value;
    }

}
