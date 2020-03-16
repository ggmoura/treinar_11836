
package org.datacontract.schemas._2004._07.roadnet_apex_server_services_mapping;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfMapBucketInfoDto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMapBucketInfoDto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MapBucketInfoDto" type="{http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.Mapping.DataContracts}MapBucketInfoDto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMapBucketInfoDto", propOrder = {
    "mapBucketInfoDto"
})
public class ArrayOfMapBucketInfoDto {

    @XmlElement(name = "MapBucketInfoDto", nillable = true)
    protected List<MapBucketInfoDto> mapBucketInfoDto;

    /**
     * Gets the value of the mapBucketInfoDto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mapBucketInfoDto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMapBucketInfoDto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MapBucketInfoDto }
     * 
     * 
     */
    public List<MapBucketInfoDto> getMapBucketInfoDto() {
        if (mapBucketInfoDto == null) {
            mapBucketInfoDto = new ArrayList<MapBucketInfoDto>();
        }
        return this.mapBucketInfoDto;
    }

}
