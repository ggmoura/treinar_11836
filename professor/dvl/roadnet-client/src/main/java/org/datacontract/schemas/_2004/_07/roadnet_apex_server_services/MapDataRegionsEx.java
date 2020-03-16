
package org.datacontract.schemas._2004._07.roadnet_apex_server_services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de MapDataRegionsEx.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MapDataRegionsEx"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Alaska"/&gt;
 *     &lt;enumeration value="Alabama"/&gt;
 *     &lt;enumeration value="Arkansas"/&gt;
 *     &lt;enumeration value="Arizona"/&gt;
 *     &lt;enumeration value="California"/&gt;
 *     &lt;enumeration value="Colorado"/&gt;
 *     &lt;enumeration value="Connecticut"/&gt;
 *     &lt;enumeration value="DistrictOfColumbia"/&gt;
 *     &lt;enumeration value="Delaware"/&gt;
 *     &lt;enumeration value="Florida"/&gt;
 *     &lt;enumeration value="Georgia"/&gt;
 *     &lt;enumeration value="Hawaii"/&gt;
 *     &lt;enumeration value="Iowa"/&gt;
 *     &lt;enumeration value="Idaho"/&gt;
 *     &lt;enumeration value="Illinois"/&gt;
 *     &lt;enumeration value="Indiana"/&gt;
 *     &lt;enumeration value="Kansas"/&gt;
 *     &lt;enumeration value="Kentucky"/&gt;
 *     &lt;enumeration value="Louisiana"/&gt;
 *     &lt;enumeration value="Massachusetts"/&gt;
 *     &lt;enumeration value="Maryland"/&gt;
 *     &lt;enumeration value="Maine"/&gt;
 *     &lt;enumeration value="Michigan"/&gt;
 *     &lt;enumeration value="Minnesota"/&gt;
 *     &lt;enumeration value="Missouri"/&gt;
 *     &lt;enumeration value="Mississippi"/&gt;
 *     &lt;enumeration value="Montana"/&gt;
 *     &lt;enumeration value="NorthCarolina"/&gt;
 *     &lt;enumeration value="NorthDakota"/&gt;
 *     &lt;enumeration value="Nebraska"/&gt;
 *     &lt;enumeration value="NewHampshire"/&gt;
 *     &lt;enumeration value="NewJersey"/&gt;
 *     &lt;enumeration value="NewMexico"/&gt;
 *     &lt;enumeration value="Nevada"/&gt;
 *     &lt;enumeration value="NewYork"/&gt;
 *     &lt;enumeration value="Ohio"/&gt;
 *     &lt;enumeration value="Oklahoma"/&gt;
 *     &lt;enumeration value="Oregon"/&gt;
 *     &lt;enumeration value="Pennsylvania"/&gt;
 *     &lt;enumeration value="RhodeIsland"/&gt;
 *     &lt;enumeration value="SouthCarolina"/&gt;
 *     &lt;enumeration value="SouthDakota"/&gt;
 *     &lt;enumeration value="Tennessee"/&gt;
 *     &lt;enumeration value="Texas"/&gt;
 *     &lt;enumeration value="Utah"/&gt;
 *     &lt;enumeration value="Virginia"/&gt;
 *     &lt;enumeration value="Vermont"/&gt;
 *     &lt;enumeration value="Washington"/&gt;
 *     &lt;enumeration value="WestVirginia"/&gt;
 *     &lt;enumeration value="Wisconsin"/&gt;
 *     &lt;enumeration value="Wyoming"/&gt;
 *     &lt;enumeration value="PuertoRico"/&gt;
 *     &lt;enumeration value="UsVirginIslands"/&gt;
 *     &lt;enumeration value="Alberta"/&gt;
 *     &lt;enumeration value="BritishColumbia"/&gt;
 *     &lt;enumeration value="Manitoba"/&gt;
 *     &lt;enumeration value="NewBrunswick"/&gt;
 *     &lt;enumeration value="NewfoundlandLabrador"/&gt;
 *     &lt;enumeration value="NovaScotia"/&gt;
 *     &lt;enumeration value="NorthwestTerritories"/&gt;
 *     &lt;enumeration value="Nunavut"/&gt;
 *     &lt;enumeration value="Ontario"/&gt;
 *     &lt;enumeration value="PrinceEdwardIsland"/&gt;
 *     &lt;enumeration value="Quebec"/&gt;
 *     &lt;enumeration value="Saskatchewan"/&gt;
 *     &lt;enumeration value="YukonTerritory"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MapDataRegionsEx", namespace = "http://schemas.datacontract.org/2004/07/Roadnet.Apex.Server.Services.WCFShared")
@XmlEnum
public enum MapDataRegionsEx {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Alaska")
    ALASKA("Alaska"),
    @XmlEnumValue("Alabama")
    ALABAMA("Alabama"),
    @XmlEnumValue("Arkansas")
    ARKANSAS("Arkansas"),
    @XmlEnumValue("Arizona")
    ARIZONA("Arizona"),
    @XmlEnumValue("California")
    CALIFORNIA("California"),
    @XmlEnumValue("Colorado")
    COLORADO("Colorado"),
    @XmlEnumValue("Connecticut")
    CONNECTICUT("Connecticut"),
    @XmlEnumValue("DistrictOfColumbia")
    DISTRICT_OF_COLUMBIA("DistrictOfColumbia"),
    @XmlEnumValue("Delaware")
    DELAWARE("Delaware"),
    @XmlEnumValue("Florida")
    FLORIDA("Florida"),
    @XmlEnumValue("Georgia")
    GEORGIA("Georgia"),
    @XmlEnumValue("Hawaii")
    HAWAII("Hawaii"),
    @XmlEnumValue("Iowa")
    IOWA("Iowa"),
    @XmlEnumValue("Idaho")
    IDAHO("Idaho"),
    @XmlEnumValue("Illinois")
    ILLINOIS("Illinois"),
    @XmlEnumValue("Indiana")
    INDIANA("Indiana"),
    @XmlEnumValue("Kansas")
    KANSAS("Kansas"),
    @XmlEnumValue("Kentucky")
    KENTUCKY("Kentucky"),
    @XmlEnumValue("Louisiana")
    LOUISIANA("Louisiana"),
    @XmlEnumValue("Massachusetts")
    MASSACHUSETTS("Massachusetts"),
    @XmlEnumValue("Maryland")
    MARYLAND("Maryland"),
    @XmlEnumValue("Maine")
    MAINE("Maine"),
    @XmlEnumValue("Michigan")
    MICHIGAN("Michigan"),
    @XmlEnumValue("Minnesota")
    MINNESOTA("Minnesota"),
    @XmlEnumValue("Missouri")
    MISSOURI("Missouri"),
    @XmlEnumValue("Mississippi")
    MISSISSIPPI("Mississippi"),
    @XmlEnumValue("Montana")
    MONTANA("Montana"),
    @XmlEnumValue("NorthCarolina")
    NORTH_CAROLINA("NorthCarolina"),
    @XmlEnumValue("NorthDakota")
    NORTH_DAKOTA("NorthDakota"),
    @XmlEnumValue("Nebraska")
    NEBRASKA("Nebraska"),
    @XmlEnumValue("NewHampshire")
    NEW_HAMPSHIRE("NewHampshire"),
    @XmlEnumValue("NewJersey")
    NEW_JERSEY("NewJersey"),
    @XmlEnumValue("NewMexico")
    NEW_MEXICO("NewMexico"),
    @XmlEnumValue("Nevada")
    NEVADA("Nevada"),
    @XmlEnumValue("NewYork")
    NEW_YORK("NewYork"),
    @XmlEnumValue("Ohio")
    OHIO("Ohio"),
    @XmlEnumValue("Oklahoma")
    OKLAHOMA("Oklahoma"),
    @XmlEnumValue("Oregon")
    OREGON("Oregon"),
    @XmlEnumValue("Pennsylvania")
    PENNSYLVANIA("Pennsylvania"),
    @XmlEnumValue("RhodeIsland")
    RHODE_ISLAND("RhodeIsland"),
    @XmlEnumValue("SouthCarolina")
    SOUTH_CAROLINA("SouthCarolina"),
    @XmlEnumValue("SouthDakota")
    SOUTH_DAKOTA("SouthDakota"),
    @XmlEnumValue("Tennessee")
    TENNESSEE("Tennessee"),
    @XmlEnumValue("Texas")
    TEXAS("Texas"),
    @XmlEnumValue("Utah")
    UTAH("Utah"),
    @XmlEnumValue("Virginia")
    VIRGINIA("Virginia"),
    @XmlEnumValue("Vermont")
    VERMONT("Vermont"),
    @XmlEnumValue("Washington")
    WASHINGTON("Washington"),
    @XmlEnumValue("WestVirginia")
    WEST_VIRGINIA("WestVirginia"),
    @XmlEnumValue("Wisconsin")
    WISCONSIN("Wisconsin"),
    @XmlEnumValue("Wyoming")
    WYOMING("Wyoming"),
    @XmlEnumValue("PuertoRico")
    PUERTO_RICO("PuertoRico"),
    @XmlEnumValue("UsVirginIslands")
    US_VIRGIN_ISLANDS("UsVirginIslands"),
    @XmlEnumValue("Alberta")
    ALBERTA("Alberta"),
    @XmlEnumValue("BritishColumbia")
    BRITISH_COLUMBIA("BritishColumbia"),
    @XmlEnumValue("Manitoba")
    MANITOBA("Manitoba"),
    @XmlEnumValue("NewBrunswick")
    NEW_BRUNSWICK("NewBrunswick"),
    @XmlEnumValue("NewfoundlandLabrador")
    NEWFOUNDLAND_LABRADOR("NewfoundlandLabrador"),
    @XmlEnumValue("NovaScotia")
    NOVA_SCOTIA("NovaScotia"),
    @XmlEnumValue("NorthwestTerritories")
    NORTHWEST_TERRITORIES("NorthwestTerritories"),
    @XmlEnumValue("Nunavut")
    NUNAVUT("Nunavut"),
    @XmlEnumValue("Ontario")
    ONTARIO("Ontario"),
    @XmlEnumValue("PrinceEdwardIsland")
    PRINCE_EDWARD_ISLAND("PrinceEdwardIsland"),
    @XmlEnumValue("Quebec")
    QUEBEC("Quebec"),
    @XmlEnumValue("Saskatchewan")
    SASKATCHEWAN("Saskatchewan"),
    @XmlEnumValue("YukonTerritory")
    YUKON_TERRITORY("YukonTerritory");
    private final String value;

    MapDataRegionsEx(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MapDataRegionsEx fromValue(String v) {
        for (MapDataRegionsEx c: MapDataRegionsEx.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
