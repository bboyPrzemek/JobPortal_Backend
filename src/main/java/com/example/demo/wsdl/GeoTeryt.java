
package com.example.demo.wsdl;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeoTeryt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoTeryt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kodBledu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nazwaPliku" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="opis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="plikZawartosc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoTeryt", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", propOrder = {
    "kodBledu",
    "nazwaPliku",
    "opis",
    "plikZawartosc"
})
public class GeoTeryt {

    @XmlElementRef(name = "kodBledu", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> kodBledu;
    @XmlElementRef(name = "nazwaPliku", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nazwaPliku;
    @XmlElementRef(name = "opis", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opis;
    @XmlElementRef(name = "plikZawartosc", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> plikZawartosc;

    /**
     * Gets the value of the kodBledu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKodBledu() {
        return kodBledu;
    }

    /**
     * Sets the value of the kodBledu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKodBledu(JAXBElement<String> value) {
        this.kodBledu = value;
    }

    /**
     * Gets the value of the nazwaPliku property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNazwaPliku() {
        return nazwaPliku;
    }

    /**
     * Sets the value of the nazwaPliku property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNazwaPliku(JAXBElement<String> value) {
        this.nazwaPliku = value;
    }

    /**
     * Gets the value of the opis property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpis() {
        return opis;
    }

    /**
     * Sets the value of the opis property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpis(JAXBElement<String> value) {
        this.opis = value;
    }

    /**
     * Gets the value of the plikZawartosc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlikZawartosc() {
        return plikZawartosc;
    }

    /**
     * Sets the value of the plikZawartosc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlikZawartosc(JAXBElement<String> value) {
        this.plikZawartosc = value;
    }

}
