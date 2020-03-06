


package com.softcorp.cr.facturaelectronica.api.dtos.debitnotes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmisorType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="EmisorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nombre">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Identificacion" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaDebitoElectronica}IdentificacionType"/>
 *         &lt;element name="NombreComercial" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Ubicacion" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaDebitoElectronica}UbicacionType"/>
 *         &lt;element name="Telefono" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaDebitoElectronica}TelefonoType" minOccurs="0"/>
 *         &lt;element name="Fax" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaDebitoElectronica}TelefonoType" minOccurs="0"/>
 *         &lt;element name="CorreoElectronico">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="160"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmisorType", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaDebitoElectronica", propOrder = {
        "nombre",
        "identificacion",
        "nombreComercial",
        "ubicacion",
        "telefono",
        "fax",
        "correoElectronico"
})
public class EmisorType {

    @XmlElement(name = "Nombre", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaDebitoElectronica", required = true)
    protected String nombre;
    @XmlElement(name = "Identificacion", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaDebitoElectronica", required = true)
    protected IdentificacionType identificacion;
    @XmlElement(name = "NombreComercial", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaDebitoElectronica")
    protected String nombreComercial;
    @XmlElement(name = "Ubicacion", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaDebitoElectronica", required = true)
    protected UbicacionType ubicacion;
    @XmlElement(name = "Telefono", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaDebitoElectronica", required = false)
    protected TelefonoType telefono;
    @XmlElement(name = "Fax", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaDebitoElectronica", required = false)
    protected TelefonoType fax;
    @XmlElement(name = "CorreoElectronico", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/notaDebitoElectronica", required = true)
    protected String correoElectronico;

    /**
     * Gets the value of the nombre property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the identificacion property.
     *
     * @return possible object is
     * {@link IdentificacionType }
     */
    public IdentificacionType getIdentificacion() {
        return identificacion;
    }

    /**
     * Sets the value of the identificacion property.
     *
     * @param value allowed object is
     *              {@link IdentificacionType }
     */
    public void setIdentificacion(IdentificacionType value) {
        this.identificacion = value;
    }

    /**
     * Gets the value of the nombreComercial property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNombreComercial() {
        return nombreComercial;
    }

    /**
     * Sets the value of the nombreComercial property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNombreComercial(String value) {
        this.nombreComercial = value;
    }

    /**
     * Gets the value of the ubicacion property.
     *
     * @return possible object is
     * {@link UbicacionType }
     */
    public UbicacionType getUbicacion() {
        return ubicacion;
    }

    /**
     * Sets the value of the ubicacion property.
     *
     * @param value allowed object is
     *              {@link UbicacionType }
     */
    public void setUbicacion(UbicacionType value) {
        this.ubicacion = value;
    }

    /**
     * Gets the value of the telefono property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link TelefonoType }{@code >}
     */
    public TelefonoType getTelefono() {
        return telefono;
    }

    /**
     * Sets the value of the telefono property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link TelefonoType }{@code >}
     */
    public void setTelefono(TelefonoType value) {
        this.telefono = value;
    }

    /**
     * Gets the value of the fax property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link TelefonoType }{@code >}
     */
    public TelefonoType getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link TelefonoType }{@code >}
     */
    public void setFax(TelefonoType value) {
        this.fax = value;
    }

    /**
     * Gets the value of the correoElectronico property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * Sets the value of the correoElectronico property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCorreoElectronico(String value) {
        this.correoElectronico = value;
    }

}
