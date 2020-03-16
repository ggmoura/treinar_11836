
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.roadnet.apex.datacontracts.INetworkSpatial;
import com.roadnet.apex.datacontracts.NetworkDataStoreEntity;


/**
 * <p>Classe Java de NetworkEditRecord complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkEditRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://roadnet.com/apex/DataContracts/}NetworkDataStoreEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EditorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsByproductEdit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NetworkEditAction_EditAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetworkSpatialItemType_ItemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NewSpatialItem" type="{http://roadnet.com/apex/DataContracts/}INetworkSpatial" minOccurs="0"/&gt;
 *         &lt;element name="OldSpatialItem" type="{http://roadnet.com/apex/DataContracts/}INetworkSpatial" minOccurs="0"/&gt;
 *         &lt;element name="TimeOfChange" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkEditRecord", propOrder = {
    "editorID",
    "isByproductEdit",
    "networkEditActionEditAction",
    "networkSpatialItemTypeItemType",
    "newSpatialItem",
    "oldSpatialItem",
    "timeOfChange"
})
public class NetworkEditRecord
    extends NetworkDataStoreEntity
{

    @XmlElementRef(name = "EditorID", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> editorID;
    @XmlElement(name = "IsByproductEdit")
    protected Boolean isByproductEdit;
    @XmlElementRef(name = "NetworkEditAction_EditAction", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> networkEditActionEditAction;
    @XmlElementRef(name = "NetworkSpatialItemType_ItemType", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<String> networkSpatialItemTypeItemType;
    @XmlElementRef(name = "NewSpatialItem", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<INetworkSpatial> newSpatialItem;
    @XmlElementRef(name = "OldSpatialItem", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<INetworkSpatial> oldSpatialItem;
    @XmlElement(name = "TimeOfChange")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeOfChange;

    /**
     * Obtém o valor da propriedade editorID.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEditorID() {
        return editorID;
    }

    /**
     * Define o valor da propriedade editorID.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEditorID(JAXBElement<String> value) {
        this.editorID = value;
    }

    /**
     * Obtém o valor da propriedade isByproductEdit.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsByproductEdit() {
        return isByproductEdit;
    }

    /**
     * Define o valor da propriedade isByproductEdit.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsByproductEdit(Boolean value) {
        this.isByproductEdit = value;
    }

    /**
     * Obtém o valor da propriedade networkEditActionEditAction.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNetworkEditActionEditAction() {
        return networkEditActionEditAction;
    }

    /**
     * Define o valor da propriedade networkEditActionEditAction.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNetworkEditActionEditAction(JAXBElement<String> value) {
        this.networkEditActionEditAction = value;
    }

    /**
     * Obtém o valor da propriedade networkSpatialItemTypeItemType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNetworkSpatialItemTypeItemType() {
        return networkSpatialItemTypeItemType;
    }

    /**
     * Define o valor da propriedade networkSpatialItemTypeItemType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNetworkSpatialItemTypeItemType(JAXBElement<String> value) {
        this.networkSpatialItemTypeItemType = value;
    }

    /**
     * Obtém o valor da propriedade newSpatialItem.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link INetworkSpatial }{@code >}
     *     
     */
    public JAXBElement<INetworkSpatial> getNewSpatialItem() {
        return newSpatialItem;
    }

    /**
     * Define o valor da propriedade newSpatialItem.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link INetworkSpatial }{@code >}
     *     
     */
    public void setNewSpatialItem(JAXBElement<INetworkSpatial> value) {
        this.newSpatialItem = value;
    }

    /**
     * Obtém o valor da propriedade oldSpatialItem.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link INetworkSpatial }{@code >}
     *     
     */
    public JAXBElement<INetworkSpatial> getOldSpatialItem() {
        return oldSpatialItem;
    }

    /**
     * Define o valor da propriedade oldSpatialItem.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link INetworkSpatial }{@code >}
     *     
     */
    public void setOldSpatialItem(JAXBElement<INetworkSpatial> value) {
        this.oldSpatialItem = value;
    }

    /**
     * Obtém o valor da propriedade timeOfChange.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeOfChange() {
        return timeOfChange;
    }

    /**
     * Define o valor da propriedade timeOfChange.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeOfChange(XMLGregorianCalendar value) {
        this.timeOfChange = value;
    }

}
