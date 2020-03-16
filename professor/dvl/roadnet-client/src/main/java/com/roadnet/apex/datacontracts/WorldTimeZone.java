
package com.roadnet.apex.datacontracts;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de WorldTimeZone.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="WorldTimeZone"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UTC"/&gt;
 *     &lt;enumeration value="AzoresCapeVerdeIs"/&gt;
 *     &lt;enumeration value="MidAtlantic"/&gt;
 *     &lt;enumeration value="Brasilia"/&gt;
 *     &lt;enumeration value="BuenosAiresGeorgetown"/&gt;
 *     &lt;enumeration value="Newfoundland"/&gt;
 *     &lt;enumeration value="AtlanticTimeCanada"/&gt;
 *     &lt;enumeration value="LaPaz"/&gt;
 *     &lt;enumeration value="BogotaLima"/&gt;
 *     &lt;enumeration value="EasternTimeUSCanada"/&gt;
 *     &lt;enumeration value="IndianaEast"/&gt;
 *     &lt;enumeration value="CentralTimeUSCanada"/&gt;
 *     &lt;enumeration value="MexicoCityTegucigalpa"/&gt;
 *     &lt;enumeration value="Saskatchewan"/&gt;
 *     &lt;enumeration value="Arizona"/&gt;
 *     &lt;enumeration value="MountainTimeUSCanada"/&gt;
 *     &lt;enumeration value="PacificTimeUSCanada"/&gt;
 *     &lt;enumeration value="Alaska"/&gt;
 *     &lt;enumeration value="Hawaii"/&gt;
 *     &lt;enumeration value="MidwayIslandSamoa"/&gt;
 *     &lt;enumeration value="EniwetokKwajalein"/&gt;
 *     &lt;enumeration value="GreenwichMeanTimeDublinEdinburghLondonLisbon"/&gt;
 *     &lt;enumeration value="MonroviaCasablanca"/&gt;
 *     &lt;enumeration value="BerlinStockholmRomeBernBrusselsVienna"/&gt;
 *     &lt;enumeration value="ParisMadridAmsterdam"/&gt;
 *     &lt;enumeration value="PragueWarsawBudapest"/&gt;
 *     &lt;enumeration value="AthensHelsinkiIstanbul"/&gt;
 *     &lt;enumeration value="Cairo"/&gt;
 *     &lt;enumeration value="EasternEurope"/&gt;
 *     &lt;enumeration value="HararePretoria"/&gt;
 *     &lt;enumeration value="Israel"/&gt;
 *     &lt;enumeration value="BaghdadKuwaitNairobiRiyadh"/&gt;
 *     &lt;enumeration value="MoscowStPetersburgKazanVolgograd"/&gt;
 *     &lt;enumeration value="Tehran"/&gt;
 *     &lt;enumeration value="AbuDhabiMuscatTbilisi"/&gt;
 *     &lt;enumeration value="Kabul"/&gt;
 *     &lt;enumeration value="IslamabadKarachiEkaterinburgTashkent"/&gt;
 *     &lt;enumeration value="BombayCalcuttaMadrasNewDelhiColombo"/&gt;
 *     &lt;enumeration value="AlmatyDhaka"/&gt;
 *     &lt;enumeration value="BangkokJakartaHanoi"/&gt;
 *     &lt;enumeration value="BeijingChongqingUrumqi"/&gt;
 *     &lt;enumeration value="HongKongPerthSingaporeTaipei"/&gt;
 *     &lt;enumeration value="TokyoOsakaSapporoSeoulYakutsk"/&gt;
 *     &lt;enumeration value="Adelaide"/&gt;
 *     &lt;enumeration value="Darwin"/&gt;
 *     &lt;enumeration value="CanberraMelbourneSydney"/&gt;
 *     &lt;enumeration value="GuamPortMoresbyVladivostok"/&gt;
 *     &lt;enumeration value="Hobart"/&gt;
 *     &lt;enumeration value="MagadanSolomonIsNewCaledonia"/&gt;
 *     &lt;enumeration value="FijiKamchatkaMarshallIs"/&gt;
 *     &lt;enumeration value="WellingtonAuckland"/&gt;
 *     &lt;enumeration value="TijuanaBajaCalifornia"/&gt;
 *     &lt;enumeration value="Brisbane"/&gt;
 *     &lt;enumeration value="Caracas"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WorldTimeZone")
@XmlEnum
public enum WorldTimeZone {

    UTC("UTC"),
    @XmlEnumValue("AzoresCapeVerdeIs")
    AZORES_CAPE_VERDE_IS("AzoresCapeVerdeIs"),
    @XmlEnumValue("MidAtlantic")
    MID_ATLANTIC("MidAtlantic"),
    @XmlEnumValue("Brasilia")
    BRASILIA("Brasilia"),
    @XmlEnumValue("BuenosAiresGeorgetown")
    BUENOS_AIRES_GEORGETOWN("BuenosAiresGeorgetown"),
    @XmlEnumValue("Newfoundland")
    NEWFOUNDLAND("Newfoundland"),
    @XmlEnumValue("AtlanticTimeCanada")
    ATLANTIC_TIME_CANADA("AtlanticTimeCanada"),
    @XmlEnumValue("LaPaz")
    LA_PAZ("LaPaz"),
    @XmlEnumValue("BogotaLima")
    BOGOTA_LIMA("BogotaLima"),
    @XmlEnumValue("EasternTimeUSCanada")
    EASTERN_TIME_US_CANADA("EasternTimeUSCanada"),
    @XmlEnumValue("IndianaEast")
    INDIANA_EAST("IndianaEast"),
    @XmlEnumValue("CentralTimeUSCanada")
    CENTRAL_TIME_US_CANADA("CentralTimeUSCanada"),
    @XmlEnumValue("MexicoCityTegucigalpa")
    MEXICO_CITY_TEGUCIGALPA("MexicoCityTegucigalpa"),
    @XmlEnumValue("Saskatchewan")
    SASKATCHEWAN("Saskatchewan"),
    @XmlEnumValue("Arizona")
    ARIZONA("Arizona"),
    @XmlEnumValue("MountainTimeUSCanada")
    MOUNTAIN_TIME_US_CANADA("MountainTimeUSCanada"),
    @XmlEnumValue("PacificTimeUSCanada")
    PACIFIC_TIME_US_CANADA("PacificTimeUSCanada"),
    @XmlEnumValue("Alaska")
    ALASKA("Alaska"),
    @XmlEnumValue("Hawaii")
    HAWAII("Hawaii"),
    @XmlEnumValue("MidwayIslandSamoa")
    MIDWAY_ISLAND_SAMOA("MidwayIslandSamoa"),
    @XmlEnumValue("EniwetokKwajalein")
    ENIWETOK_KWAJALEIN("EniwetokKwajalein"),
    @XmlEnumValue("GreenwichMeanTimeDublinEdinburghLondonLisbon")
    GREENWICH_MEAN_TIME_DUBLIN_EDINBURGH_LONDON_LISBON("GreenwichMeanTimeDublinEdinburghLondonLisbon"),
    @XmlEnumValue("MonroviaCasablanca")
    MONROVIA_CASABLANCA("MonroviaCasablanca"),
    @XmlEnumValue("BerlinStockholmRomeBernBrusselsVienna")
    BERLIN_STOCKHOLM_ROME_BERN_BRUSSELS_VIENNA("BerlinStockholmRomeBernBrusselsVienna"),
    @XmlEnumValue("ParisMadridAmsterdam")
    PARIS_MADRID_AMSTERDAM("ParisMadridAmsterdam"),
    @XmlEnumValue("PragueWarsawBudapest")
    PRAGUE_WARSAW_BUDAPEST("PragueWarsawBudapest"),
    @XmlEnumValue("AthensHelsinkiIstanbul")
    ATHENS_HELSINKI_ISTANBUL("AthensHelsinkiIstanbul"),
    @XmlEnumValue("Cairo")
    CAIRO("Cairo"),
    @XmlEnumValue("EasternEurope")
    EASTERN_EUROPE("EasternEurope"),
    @XmlEnumValue("HararePretoria")
    HARARE_PRETORIA("HararePretoria"),
    @XmlEnumValue("Israel")
    ISRAEL("Israel"),
    @XmlEnumValue("BaghdadKuwaitNairobiRiyadh")
    BAGHDAD_KUWAIT_NAIROBI_RIYADH("BaghdadKuwaitNairobiRiyadh"),
    @XmlEnumValue("MoscowStPetersburgKazanVolgograd")
    MOSCOW_ST_PETERSBURG_KAZAN_VOLGOGRAD("MoscowStPetersburgKazanVolgograd"),
    @XmlEnumValue("Tehran")
    TEHRAN("Tehran"),
    @XmlEnumValue("AbuDhabiMuscatTbilisi")
    ABU_DHABI_MUSCAT_TBILISI("AbuDhabiMuscatTbilisi"),
    @XmlEnumValue("Kabul")
    KABUL("Kabul"),
    @XmlEnumValue("IslamabadKarachiEkaterinburgTashkent")
    ISLAMABAD_KARACHI_EKATERINBURG_TASHKENT("IslamabadKarachiEkaterinburgTashkent"),
    @XmlEnumValue("BombayCalcuttaMadrasNewDelhiColombo")
    BOMBAY_CALCUTTA_MADRAS_NEW_DELHI_COLOMBO("BombayCalcuttaMadrasNewDelhiColombo"),
    @XmlEnumValue("AlmatyDhaka")
    ALMATY_DHAKA("AlmatyDhaka"),
    @XmlEnumValue("BangkokJakartaHanoi")
    BANGKOK_JAKARTA_HANOI("BangkokJakartaHanoi"),
    @XmlEnumValue("BeijingChongqingUrumqi")
    BEIJING_CHONGQING_URUMQI("BeijingChongqingUrumqi"),
    @XmlEnumValue("HongKongPerthSingaporeTaipei")
    HONG_KONG_PERTH_SINGAPORE_TAIPEI("HongKongPerthSingaporeTaipei"),
    @XmlEnumValue("TokyoOsakaSapporoSeoulYakutsk")
    TOKYO_OSAKA_SAPPORO_SEOUL_YAKUTSK("TokyoOsakaSapporoSeoulYakutsk"),
    @XmlEnumValue("Adelaide")
    ADELAIDE("Adelaide"),
    @XmlEnumValue("Darwin")
    DARWIN("Darwin"),
    @XmlEnumValue("CanberraMelbourneSydney")
    CANBERRA_MELBOURNE_SYDNEY("CanberraMelbourneSydney"),
    @XmlEnumValue("GuamPortMoresbyVladivostok")
    GUAM_PORT_MORESBY_VLADIVOSTOK("GuamPortMoresbyVladivostok"),
    @XmlEnumValue("Hobart")
    HOBART("Hobart"),
    @XmlEnumValue("MagadanSolomonIsNewCaledonia")
    MAGADAN_SOLOMON_IS_NEW_CALEDONIA("MagadanSolomonIsNewCaledonia"),
    @XmlEnumValue("FijiKamchatkaMarshallIs")
    FIJI_KAMCHATKA_MARSHALL_IS("FijiKamchatkaMarshallIs"),
    @XmlEnumValue("WellingtonAuckland")
    WELLINGTON_AUCKLAND("WellingtonAuckland"),
    @XmlEnumValue("TijuanaBajaCalifornia")
    TIJUANA_BAJA_CALIFORNIA("TijuanaBajaCalifornia"),
    @XmlEnumValue("Brisbane")
    BRISBANE("Brisbane"),
    @XmlEnumValue("Caracas")
    CARACAS("Caracas");
    private final String value;

    WorldTimeZone(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorldTimeZone fromValue(String v) {
        for (WorldTimeZone c: WorldTimeZone.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
