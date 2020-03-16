
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.NetworkArc;
import com.roadnet.apex.datacontracts.NetworkInstanceID;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de NetworkSplitArcInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkSplitArcInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OldInstanceID" type="{http://roadnet.com/apex/DataContracts/}NetworkInstanceID" minOccurs="0"/&gt;
 *         &lt;element name="SplitArc" type="{http://roadnet.com/apex/DataContracts/}NetworkArc" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkSplitArcInfo", propOrder = {
    "oldInstanceID",
    "splitArc"
})
public class NetworkSplitArcInfo
    extends DataTransferObject
{

    @XmlElementRef(name = "OldInstanceID", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkInstanceID> oldInstanceID;
    @XmlElementRef(name = "SplitArc", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<NetworkArc> splitArc;

    /**
     * Obtém o valor da propriedade oldInstanceID.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkInstanceID }{@code >}
     *     
     */
    public JAXBElement<NetworkInstanceID> getOldInstanceID() {
        return oldInstanceID;
    }

    /**
     * Define o valor da propriedade oldInstanceID.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkInstanceID }{@code >}
     *     
     */
    public void setOldInstanceID(JAXBElement<NetworkInstanceID> value) {
        this.oldInstanceID = value;
    }

    /**
     * Obtém o valor da propriedade splitArc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NetworkArc }{@code >}
     *     
     */
    public JAXBElement<NetworkArc> getSplitArc() {
        return splitArc;
    }

    /**
     * Define o valor da propriedade splitArc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NetworkArc }{@code >}
     *     
     */
    public void setSplitArc(JAXBElement<NetworkArc> value) {
        this.splitArc = value;
    }

}
