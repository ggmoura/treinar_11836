
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_routing;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfNavDeviceStatusDto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNavDeviceStatusDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NavDeviceStatusDto" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Routing.DataContracts}NavDeviceStatusDto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNavDeviceStatusDto", propOrder = {
    "navDeviceStatusDto"
})
public class ArrayOfNavDeviceStatusDto {

    @XmlElement(name = "NavDeviceStatusDto", nillable = true)
    protected List<NavDeviceStatusDto> navDeviceStatusDto;

    /**
     * Gets the value of the navDeviceStatusDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the navDeviceStatusDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNavDeviceStatusDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NavDeviceStatusDto }
     * 
     * 
     */
    public List<NavDeviceStatusDto> getNavDeviceStatusDto() {
        if (navDeviceStatusDto == null) {
            navDeviceStatusDto = new ArrayList<NavDeviceStatusDto>();
        }
        return this.navDeviceStatusDto;
    }

}
