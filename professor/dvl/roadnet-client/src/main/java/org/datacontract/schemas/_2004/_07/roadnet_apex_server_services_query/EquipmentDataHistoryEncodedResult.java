
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_query;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.roadnet_apex_server_services.DataTransferObject;


/**
 * <p>Classe Java de EquipmentDataHistoryEncodedResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentDataHistoryEncodedResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.DataTransferObjectMapping}DataTransferObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EncodedEquipmentDataSets" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts}ArrayOfEquipmentDataSetEncoded" minOccurs="0"/&gt;
 *         &lt;element name="InitialState" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts}EquipmentInitialState" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentDataHistoryEncodedResult", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", propOrder = {
    "encodedEquipmentDataSets",
    "initialState"
})
public class EquipmentDataHistoryEncodedResult
    extends DataTransferObject
{

    @XmlElementRef(name = "EncodedEquipmentDataSets", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEquipmentDataSetEncoded> encodedEquipmentDataSets;
    @XmlElementRef(name = "InitialState", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", type = JAXBElement.class, required = false)
    protected JAXBElement<EquipmentInitialState> initialState;

    /**
     * Obtém o valor da propriedade encodedEquipmentDataSets.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEquipmentDataSetEncoded }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEquipmentDataSetEncoded> getEncodedEquipmentDataSets() {
        return encodedEquipmentDataSets;
    }

    /**
     * Define o valor da propriedade encodedEquipmentDataSets.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEquipmentDataSetEncoded }{@code >}
     *     
     */
    public void setEncodedEquipmentDataSets(JAXBElement<ArrayOfEquipmentDataSetEncoded> value) {
        this.encodedEquipmentDataSets = value;
    }

    /**
     * Obtém o valor da propriedade initialState.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EquipmentInitialState }{@code >}
     *     
     */
    public JAXBElement<EquipmentInitialState> getInitialState() {
        return initialState;
    }

    /**
     * Define o valor da propriedade initialState.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EquipmentInitialState }{@code >}
     *     
     */
    public void setInitialState(JAXBElement<EquipmentInitialState> value) {
        this.initialState = value;
    }

}
