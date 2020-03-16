
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CorrespondenceMailingListMemberDepot complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CorrespondenceMailingListMemberDepot"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}CorrespondenceMailingListMember"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DepotEntityKey" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrespondenceMailingListMemberDepot", propOrder = {
    "depotEntityKey"
})
public class CorrespondenceMailingListMemberDepot
    extends CorrespondenceMailingListMember
{

    @XmlElement(name = "DepotEntityKey")
    protected Long depotEntityKey;

    /**
     * Obtém o valor da propriedade depotEntityKey.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDepotEntityKey() {
        return depotEntityKey;
    }

    /**
     * Define o valor da propriedade depotEntityKey.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDepotEntityKey(Long value) {
        this.depotEntityKey = value;
    }

}
