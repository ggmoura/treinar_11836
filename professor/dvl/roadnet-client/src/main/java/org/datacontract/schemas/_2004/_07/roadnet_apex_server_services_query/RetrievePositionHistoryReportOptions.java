
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.roadnet.apex.datacontracts.WorldTimeZone;


/**
 * <p>Classe Java de RetrievePositionHistoryReportOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RetrievePositionHistoryReportOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts}InternalRetrieveEquipmentDataHistoryEncodedOptions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TimeZone" type="{http://roadnet.com/apex/DataContracts/}WorldTimeZone" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrievePositionHistoryReportOptions", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Query.DataContracts", propOrder = {
    "timeZone"
})
public class RetrievePositionHistoryReportOptions
    extends InternalRetrieveEquipmentDataHistoryEncodedOptions
{

    @XmlElement(name = "TimeZone")
    @XmlSchemaType(name = "string")
    protected WorldTimeZone timeZone;

    /**
     * Obtém o valor da propriedade timeZone.
     * 
     * @return
     *     possible object is
     *     {@link WorldTimeZone }
     *     
     */
    public WorldTimeZone getTimeZone() {
        return timeZone;
    }

    /**
     * Define o valor da propriedade timeZone.
     * 
     * @param value
     *     allowed object is
     *     {@link WorldTimeZone }
     *     
     */
    public void setTimeZone(WorldTimeZone value) {
        this.timeZone = value;
    }

}
