
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_wcfshared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfTransferableEntityInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTransferableEntityInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransferableEntityInfo" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared.Transferable}TransferableEntityInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTransferableEntityInfo", propOrder = {
    "transferableEntityInfo"
})
public class ArrayOfTransferableEntityInfo {

    @XmlElement(name = "TransferableEntityInfo", nillable = true)
    protected List<TransferableEntityInfo> transferableEntityInfo;

    /**
     * Gets the value of the transferableEntityInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferableEntityInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferableEntityInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransferableEntityInfo }
     * 
     * 
     */
    public List<TransferableEntityInfo> getTransferableEntityInfo() {
        if (transferableEntityInfo == null) {
            transferableEntityInfo = new ArrayList<TransferableEntityInfo>();
        }
        return this.transferableEntityInfo;
    }

}
