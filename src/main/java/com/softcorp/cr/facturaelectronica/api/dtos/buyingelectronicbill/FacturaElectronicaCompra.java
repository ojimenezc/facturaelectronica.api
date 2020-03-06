


package com.softcorp.cr.facturaelectronica.api.dtos.buyingelectronicbill;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;

import org.w3c.dom.Element;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Clave" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}ClaveType"/>
 *         &lt;element name="CodigoActividad">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="6"/>
 *               &lt;minLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NumeroConsecutivo" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}NumeroConsecutivoType"/>
 *         &lt;element name="FechaEmision" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Emisor" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}EmisorType"/>
 *         &lt;element name="Receptor" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}ReceptorType"/>
 *         &lt;element name="CondicionVenta">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="01"/>
 *               &lt;enumeration value="02"/>
 *               &lt;enumeration value="03"/>
 *               &lt;enumeration value="04"/>
 *               &lt;enumeration value="05"/>
 *               &lt;enumeration value="06"/>
 *               &lt;enumeration value="07"/>
 *               &lt;enumeration value="08"/>
 *               &lt;enumeration value="09"/>
 *               &lt;enumeration value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PlazoCredito" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MedioPago" maxOccurs="4">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="01"/>
 *               &lt;enumeration value="02"/>
 *               &lt;enumeration value="03"/>
 *               &lt;enumeration value="04"/>
 *               &lt;enumeration value="05"/>
 *               &lt;enumeration value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DetalleServicio">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LineaDetalle" maxOccurs="1000">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="NumeroLinea" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                             &lt;element name="Codigo" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="13"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CodigoComercial" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}CodigoType" maxOccurs="5" minOccurs="0"/>
 *                             &lt;element name="Cantidad">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;totalDigits value="16"/>
 *                                   &lt;fractionDigits value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="UnidadMedida" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}UnidadMedidaType"/>
 *                             &lt;element name="UnidadMedidaComercial" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Detalle">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="200"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="PrecioUnitario" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType"/>
 *                             &lt;element name="MontoTotal" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType"/>
 *                             &lt;element name="Descuento" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DescuentoType" maxOccurs="5" minOccurs="0"/>
 *                             &lt;element name="SubTotal" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType"/>
 *                             &lt;element name="BaseImponible" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType" minOccurs="0"/>
 *                             &lt;element name="Impuesto" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}ImpuestoType" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="ImpuestoNeto" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType" minOccurs="0"/>
 *                             &lt;element name="MontoTotalLinea" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OtrosCargos" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}OtrosCargosType" maxOccurs="15" minOccurs="0"/>
 *         &lt;element name="ResumenFactura">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CodigoTipoMoneda" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}CodigoMonedaType" minOccurs="0"/>
 *                   &lt;element name="TotalServGravados" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType" minOccurs="0"/>
 *                   &lt;element name="TotalServExentos" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType" minOccurs="0"/>
 *                   &lt;element name="TotalServExonerado" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType" minOccurs="0"/>
 *                   &lt;element name="TotalMercanciasGravadas" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType" minOccurs="0"/>
 *                   &lt;element name="TotalMercanciasExentas" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType" minOccurs="0"/>
 *                   &lt;element name="TotalMercExonerada" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType" minOccurs="0"/>
 *                   &lt;element name="TotalGravado" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType" minOccurs="0"/>
 *                   &lt;element name="TotalExento" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType" minOccurs="0"/>
 *                   &lt;element name="TotalExonerado" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType" minOccurs="0"/>
 *                   &lt;element name="TotalVenta" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType"/>
 *                   &lt;element name="TotalDescuentos" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType" minOccurs="0"/>
 *                   &lt;element name="TotalVentaNeta" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType"/>
 *                   &lt;element name="TotalImpuesto" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType" minOccurs="0"/>
 *                   &lt;element name="TotalOtrosCargos" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType" minOccurs="0"/>
 *                   &lt;element name="TotalComprobante" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="InformacionReferencia" maxOccurs="10" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TipoDoc">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="01"/>
 *                         &lt;enumeration value="02"/>
 *                         &lt;enumeration value="03"/>
 *                         &lt;enumeration value="04"/>
 *                         &lt;enumeration value="05"/>
 *                         &lt;enumeration value="06"/>
 *                         &lt;enumeration value="07"/>
 *                         &lt;enumeration value="08"/>
 *                         &lt;enumeration value="09"/>
 *                         &lt;enumeration value="10"/>
 *                         &lt;enumeration value="11"/>
 *                         &lt;enumeration value="12"/>
 *                         &lt;enumeration value="13"/>
 *                         &lt;enumeration value="14"/>
 *                         &lt;enumeration value="15"/>
 *                         &lt;enumeration value="99"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Numero" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="FechaEmision" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="Codigo" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="01"/>
 *                         &lt;enumeration value="02"/>
 *                         &lt;enumeration value="03"/>
 *                         &lt;enumeration value="04"/>
 *                         &lt;enumeration value="05"/>
 *                         &lt;enumeration value="99"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Razon" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="180"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Otros" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OtroTexto" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OtroContenido" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;any processContents='lax' namespace='##other'/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "clave",
        "codigoActividad",
        "numeroConsecutivo",
        "fechaEmision",
        "emisor",
        "receptor",
        "condicionVenta",
        "plazoCredito",
        "medioPago",
        "detalleServicio",
        "otrosCargos",
        "resumenFactura",
        "informacionReferencia",
        "otros"
})
@XmlRootElement(name = "FacturaElectronicaCompra", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra")
public class FacturaElectronicaCompra {

    @XmlElement(name = "Clave", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra", required = true)
    protected String clave;
    @XmlElement(name = "CodigoActividad", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra", required = true)
    protected String codigoActividad;
    @XmlElement(name = "NumeroConsecutivo", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra", required = true)
    protected String numeroConsecutivo;
    @XmlElement(name = "FechaEmision", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEmision;
    @XmlElement(name = "Emisor", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra", required = true)
    protected EmisorType emisor;
    @XmlElement(name = "Receptor", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra", required = true)
    protected ReceptorType receptor;
    @XmlElement(name = "CondicionVenta", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra", required = true)
    protected String condicionVenta;
    @XmlElement(name = "PlazoCredito", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra")
    protected String plazoCredito;
    @XmlElement(name = "MedioPago", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra", required = true)
    protected List<String> medioPago;
    @XmlElement(name = "DetalleServicio", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra", required = true)
    protected FacturaElectronicaCompra.DetalleServicio detalleServicio;
    @XmlElement(name = "OtrosCargos", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra")
    protected List<OtrosCargosType> otrosCargos;
    @XmlElement(name = "ResumenFactura", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra", required = true)
    protected FacturaElectronicaCompra.ResumenFactura resumenFactura;
    @XmlElement(name = "InformacionReferencia", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra")
    protected List<FacturaElectronicaCompra.InformacionReferencia> informacionReferencia;
    @XmlElement(name = "Otros", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra")
    protected FacturaElectronicaCompra.Otros otros;


    /**
     * Gets the value of the clave property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getClave() {
        return clave;
    }

    /**
     * Sets the value of the clave property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClave(String value) {
        this.clave = value;
    }

    /**
     * Gets the value of the codigoActividad property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCodigoActividad() {
        return codigoActividad;
    }

    /**
     * Sets the value of the codigoActividad property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCodigoActividad(String value) {
        this.codigoActividad = value;
    }

    /**
     * Gets the value of the numeroConsecutivo property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNumeroConsecutivo() {
        return numeroConsecutivo;
    }

    /**
     * Sets the value of the numeroConsecutivo property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNumeroConsecutivo(String value) {
        this.numeroConsecutivo = value;
    }

    /**
     * Gets the value of the fechaEmision property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getFechaEmision() {
        return fechaEmision;
    }

    /**
     * Sets the value of the fechaEmision property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setFechaEmision(XMLGregorianCalendar value) {
        this.fechaEmision = value;
    }

    /**
     * Gets the value of the emisor property.
     *
     * @return possible object is
     * {@link EmisorType }
     */
    public EmisorType getEmisor() {
        return emisor;
    }

    /**
     * Sets the value of the emisor property.
     *
     * @param value allowed object is
     *              {@link EmisorType }
     */
    public void setEmisor(EmisorType value) {
        this.emisor = value;
    }

    /**
     * Gets the value of the receptor property.
     *
     * @return possible object is
     * {@link ReceptorType }
     */
    public ReceptorType getReceptor() {
        return receptor;
    }

    /**
     * Sets the value of the receptor property.
     *
     * @param value allowed object is
     *              {@link ReceptorType }
     */
    public void setReceptor(ReceptorType value) {
        this.receptor = value;
    }

    /**
     * Gets the value of the condicionVenta property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCondicionVenta() {
        return condicionVenta;
    }

    /**
     * Sets the value of the condicionVenta property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCondicionVenta(String value) {
        this.condicionVenta = value;
    }

    /**
     * Gets the value of the plazoCredito property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPlazoCredito() {
        return plazoCredito;
    }

    /**
     * Sets the value of the plazoCredito property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPlazoCredito(String value) {
        this.plazoCredito = value;
    }

    /**
     * Gets the value of the medioPago property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the medioPago property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMedioPago().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getMedioPago() {
        if (medioPago == null) {
            medioPago = new ArrayList<String>();
        }
        return this.medioPago;
    }

    /**
     * Gets the value of the detalleServicio property.
     *
     * @return possible object is
     * {@link FacturaElectronicaCompra.DetalleServicio }
     */
    public FacturaElectronicaCompra.DetalleServicio getDetalleServicio() {
        return detalleServicio;
    }

    /**
     * Sets the value of the detalleServicio property.
     *
     * @param value allowed object is
     *              {@link FacturaElectronicaCompra.DetalleServicio }
     */
    public void setDetalleServicio(FacturaElectronicaCompra.DetalleServicio value) {
        this.detalleServicio = value;
    }

    /**
     * Gets the value of the otrosCargos property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otrosCargos property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtrosCargos().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtrosCargosType }
     */
    public List<OtrosCargosType> getOtrosCargos() {
        if (otrosCargos == null) {
            otrosCargos = new ArrayList<OtrosCargosType>();
        }
        return this.otrosCargos;
    }

    /**
     * Gets the value of the resumenFactura property.
     *
     * @return possible object is
     * {@link FacturaElectronicaCompra.ResumenFactura }
     */
    public FacturaElectronicaCompra.ResumenFactura getResumenFactura() {
        return resumenFactura;
    }

    /**
     * Sets the value of the resumenFactura property.
     *
     * @param value allowed object is
     *              {@link FacturaElectronicaCompra.ResumenFactura }
     */
    public void setResumenFactura(FacturaElectronicaCompra.ResumenFactura value) {
        this.resumenFactura = value;
    }

    /**
     * Gets the value of the informacionReferencia property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informacionReferencia property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformacionReferencia().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacturaElectronicaCompra.InformacionReferencia }
     */
    public List<FacturaElectronicaCompra.InformacionReferencia> getInformacionReferencia() {
        if (informacionReferencia == null) {
            informacionReferencia = new ArrayList<FacturaElectronicaCompra.InformacionReferencia>();
        }
        return this.informacionReferencia;
    }

    /**
     * Gets the value of the otros property.
     *
     * @return possible object is
     * {@link FacturaElectronicaCompra.Otros }
     */
    public FacturaElectronicaCompra.Otros getOtros() {
        return otros;
    }

    /**
     * Sets the value of the otros property.
     *
     * @param value allowed object is
     *              {@link FacturaElectronicaCompra.Otros }
     */
    public void setOtros(FacturaElectronicaCompra.Otros value) {
        this.otros = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="LineaDetalle" maxOccurs="1000">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="NumeroLinea" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *                   &lt;element name="Codigo" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="13"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CodigoComercial" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}CodigoType" maxOccurs="5" minOccurs="0"/>
     *                   &lt;element name="Cantidad">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;totalDigits value="16"/>
     *                         &lt;fractionDigits value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="UnidadMedida" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}UnidadMedidaType"/>
     *                   &lt;element name="UnidadMedidaComercial" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Detalle">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="200"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="PrecioUnitario" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType"/>
     *                   &lt;element name="MontoTotal" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType"/>
     *                   &lt;element name="Descuento" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DescuentoType" maxOccurs="5" minOccurs="0"/>
     *                   &lt;element name="SubTotal" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType"/>
     *                   &lt;element name="BaseImponible" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType" minOccurs="0"/>
     *                   &lt;element name="Impuesto" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}ImpuestoType" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="ImpuestoNeto" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType" minOccurs="0"/>
     *                   &lt;element name="MontoTotalLinea" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "lineaDetalle"
    })
    public static class DetalleServicio {

        @XmlElement(name = "LineaDetalle", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra", required = true)
        protected List<FacturaElectronicaCompra.DetalleServicio.LineaDetalle> lineaDetalle;

        /**
         * Gets the value of the lineaDetalle property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lineaDetalle property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLineaDetalle().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FacturaElectronicaCompra.DetalleServicio.LineaDetalle }
         */
        public List<FacturaElectronicaCompra.DetalleServicio.LineaDetalle> getLineaDetalle() {
            if (lineaDetalle == null) {
                lineaDetalle = new ArrayList<FacturaElectronicaCompra.DetalleServicio.LineaDetalle>();
            }
            return this.lineaDetalle;
        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="NumeroLinea" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
         *         &lt;element name="Codigo" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="13"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CodigoComercial" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}CodigoType" maxOccurs="5" minOccurs="0"/>
         *         &lt;element name="Cantidad">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;totalDigits value="16"/>
         *               &lt;fractionDigits value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="UnidadMedida" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}UnidadMedidaType"/>
         *         &lt;element name="UnidadMedidaComercial" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Detalle">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="200"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="PrecioUnitario" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType"/>
         *         &lt;element name="MontoTotal" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType"/>
         *         &lt;element name="Descuento" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DescuentoType" maxOccurs="5" minOccurs="0"/>
         *         &lt;element name="SubTotal" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType"/>
         *         &lt;element name="BaseImponible" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType" minOccurs="0"/>
         *         &lt;element name="Impuesto" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}ImpuestoType" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="ImpuestoNeto" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType" minOccurs="0"/>
         *         &lt;element name="MontoTotalLinea" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "numeroLinea",
                "codigo",
                "codigoComercial",
                "cantidad",
                "unidadMedida",
                "unidadMedidaComercial",
                "detalle",
                "precioUnitario",
                "montoTotal",
                "descuento",
                "subTotal",
                "baseImponible",
                "impuesto",
                "impuestoNeto",
                "montoTotalLinea"
        })
        public static class LineaDetalle {

            @XmlElement(name = "NumeroLinea", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra", required = true)
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger numeroLinea;
            @XmlElement(name = "Codigo", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra")
            protected String codigo;
            @XmlElement(name = "CodigoComercial", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra")
            protected List<CodigoType> codigoComercial;
            @XmlElement(name = "Cantidad", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra", required = true)
            protected BigDecimal cantidad;
            @XmlElement(name = "UnidadMedida", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra", required = true)
            protected String unidadMedida;
            @XmlElement(name = "UnidadMedidaComercial", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra")
            protected String unidadMedidaComercial;
            @XmlElement(name = "Detalle", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra", required = true)
            protected String detalle;
            @XmlElement(name = "PrecioUnitario", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra", required = true)
            protected BigDecimal precioUnitario;
            @XmlElement(name = "MontoTotal", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra", required = true)
            protected BigDecimal montoTotal;
            @XmlElement(name = "Descuento", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra")
            protected List<DescuentoType> descuento;
            @XmlElement(name = "SubTotal", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra", required = true)
            protected BigDecimal subTotal;
            @XmlElement(name = "BaseImponible", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra")
            protected BigDecimal baseImponible;
            @XmlElement(name = "Impuesto", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra")
            protected List<ImpuestoType> impuesto;
            @XmlElement(name = "ImpuestoNeto", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra")
            protected BigDecimal impuestoNeto;
            @XmlElement(name = "MontoTotalLinea", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra", required = true)
            protected BigDecimal montoTotalLinea;

            /**
             * Gets the value of the numeroLinea property.
             *
             * @return possible object is
             * {@link BigInteger }
             */
            public BigInteger getNumeroLinea() {
                return numeroLinea;
            }

            /**
             * Sets the value of the numeroLinea property.
             *
             * @param value allowed object is
             *              {@link BigInteger }
             */
            public void setNumeroLinea(BigInteger value) {
                this.numeroLinea = value;
            }

            /**
             * Gets the value of the codigo property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCodigo() {
                return codigo;
            }

            /**
             * Sets the value of the codigo property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCodigo(String value) {
                this.codigo = value;
            }

            /**
             * Gets the value of the codigoComercial property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the codigoComercial property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCodigoComercial().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CodigoType }
             */
            public List<CodigoType> getCodigoComercial() {
                if (codigoComercial == null) {
                    codigoComercial = new ArrayList<CodigoType>();
                }
                return this.codigoComercial;
            }

            /**
             * Gets the value of the cantidad property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getCantidad() {
                return cantidad;
            }

            /**
             * Sets the value of the cantidad property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setCantidad(BigDecimal value) {
                this.cantidad = value;
            }

            /**
             * Gets the value of the unidadMedida property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getUnidadMedida() {
                return unidadMedida;
            }

            /**
             * Sets the value of the unidadMedida property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setUnidadMedida(String value) {
                this.unidadMedida = value;
            }

            /**
             * Gets the value of the unidadMedidaComercial property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getUnidadMedidaComercial() {
                return unidadMedidaComercial;
            }

            /**
             * Sets the value of the unidadMedidaComercial property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setUnidadMedidaComercial(String value) {
                this.unidadMedidaComercial = value;
            }

            /**
             * Gets the value of the detalle property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getDetalle() {
                return detalle;
            }

            /**
             * Sets the value of the detalle property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setDetalle(String value) {
                this.detalle = value;
            }

            /**
             * Gets the value of the precioUnitario property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getPrecioUnitario() {
                return precioUnitario;
            }

            /**
             * Sets the value of the precioUnitario property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setPrecioUnitario(BigDecimal value) {
                this.precioUnitario = value;
            }

            /**
             * Gets the value of the montoTotal property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getMontoTotal() {
                return montoTotal;
            }

            /**
             * Sets the value of the montoTotal property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setMontoTotal(BigDecimal value) {
                this.montoTotal = value;
            }

            /**
             * Gets the value of the descuento property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the descuento property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDescuento().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DescuentoType }
             */
            public List<DescuentoType> getDescuento() {
                if (descuento == null) {
                    descuento = new ArrayList<DescuentoType>();
                }
                return this.descuento;
            }

            /**
             * Gets the value of the subTotal property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getSubTotal() {
                return subTotal;
            }

            /**
             * Sets the value of the subTotal property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setSubTotal(BigDecimal value) {
                this.subTotal = value;
            }

            /**
             * Gets the value of the baseImponible property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getBaseImponible() {
                return baseImponible;
            }

            /**
             * Sets the value of the baseImponible property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setBaseImponible(BigDecimal value) {
                this.baseImponible = value;
            }

            /**
             * Gets the value of the impuesto property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the impuesto property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getImpuesto().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ImpuestoType }
             */
            public List<ImpuestoType> getImpuesto() {
                if (impuesto == null) {
                    impuesto = new ArrayList<ImpuestoType>();
                }
                return this.impuesto;
            }

            /**
             * Gets the value of the impuestoNeto property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getImpuestoNeto() {
                return impuestoNeto;
            }

            /**
             * Sets the value of the impuestoNeto property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setImpuestoNeto(BigDecimal value) {
                this.impuestoNeto = value;
            }

            /**
             * Gets the value of the montoTotalLinea property.
             *
             * @return possible object is
             * {@link BigDecimal }
             */
            public BigDecimal getMontoTotalLinea() {
                return montoTotalLinea;
            }

            /**
             * Sets the value of the montoTotalLinea property.
             *
             * @param value allowed object is
             *              {@link BigDecimal }
             */
            public void setMontoTotalLinea(BigDecimal value) {
                this.montoTotalLinea = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="TipoDoc">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="01"/>
     *               &lt;enumeration value="02"/>
     *               &lt;enumeration value="03"/>
     *               &lt;enumeration value="04"/>
     *               &lt;enumeration value="05"/>
     *               &lt;enumeration value="06"/>
     *               &lt;enumeration value="07"/>
     *               &lt;enumeration value="08"/>
     *               &lt;enumeration value="09"/>
     *               &lt;enumeration value="10"/>
     *               &lt;enumeration value="11"/>
     *               &lt;enumeration value="12"/>
     *               &lt;enumeration value="13"/>
     *               &lt;enumeration value="14"/>
     *               &lt;enumeration value="15"/>
     *               &lt;enumeration value="99"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Numero" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="FechaEmision" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="Codigo" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="01"/>
     *               &lt;enumeration value="02"/>
     *               &lt;enumeration value="03"/>
     *               &lt;enumeration value="04"/>
     *               &lt;enumeration value="05"/>
     *               &lt;enumeration value="99"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Razon" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="180"/>
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
    @XmlType(name = "", propOrder = {
            "tipoDoc",
            "numero",
            "fechaEmision",
            "codigo",
            "razon"
    })
    public static class InformacionReferencia {

        @XmlElement(name = "TipoDoc", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra", required = true)
        protected String tipoDoc;
        @XmlElement(name = "Numero", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra")
        protected String numero;
        @XmlElement(name = "FechaEmision", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fechaEmision;
        @XmlElement(name = "Codigo", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra")
        protected String codigo;
        @XmlElement(name = "Razon", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra")
        protected String razon;

        /**
         * Gets the value of the tipoDoc property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getTipoDoc() {
            return tipoDoc;
        }

        /**
         * Sets the value of the tipoDoc property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setTipoDoc(String value) {
            this.tipoDoc = value;
        }

        /**
         * Gets the value of the numero property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getNumero() {
            return numero;
        }

        /**
         * Sets the value of the numero property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setNumero(String value) {
            this.numero = value;
        }

        /**
         * Gets the value of the fechaEmision property.
         *
         * @return possible object is
         * {@link XMLGregorianCalendar }
         */
        public XMLGregorianCalendar getFechaEmision() {
            return fechaEmision;
        }

        /**
         * Sets the value of the fechaEmision property.
         *
         * @param value allowed object is
         *              {@link XMLGregorianCalendar }
         */
        public void setFechaEmision(XMLGregorianCalendar value) {
            this.fechaEmision = value;
        }

        /**
         * Gets the value of the codigo property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getCodigo() {
            return codigo;
        }

        /**
         * Sets the value of the codigo property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCodigo(String value) {
            this.codigo = value;
        }

        /**
         * Gets the value of the razon property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getRazon() {
            return razon;
        }

        /**
         * Sets the value of the razon property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setRazon(String value) {
            this.razon = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OtroTexto" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OtroContenido" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;any processContents='lax' namespace='##other'/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "otroTexto",
            "otroContenido"
    })
    public static class Otros {

        @XmlElement(name = "OtroTexto", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra")
        protected List<FacturaElectronicaCompra.Otros.OtroTexto> otroTexto;
        @XmlElement(name = "OtroContenido", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra")
        protected List<FacturaElectronicaCompra.Otros.OtroContenido> otroContenido;

        /**
         * Gets the value of the otroTexto property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otroTexto property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtroTexto().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FacturaElectronicaCompra.Otros.OtroTexto }
         */
        public List<FacturaElectronicaCompra.Otros.OtroTexto> getOtroTexto() {
            if (otroTexto == null) {
                otroTexto = new ArrayList<FacturaElectronicaCompra.Otros.OtroTexto>();
            }
            return this.otroTexto;
        }

        /**
         * Gets the value of the otroContenido property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otroContenido property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtroContenido().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FacturaElectronicaCompra.Otros.OtroContenido }
         */
        public List<FacturaElectronicaCompra.Otros.OtroContenido> getOtroContenido() {
            if (otroContenido == null) {
                otroContenido = new ArrayList<FacturaElectronicaCompra.Otros.OtroContenido>();
            }
            return this.otroContenido;
        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;any processContents='lax' namespace='##other'/>
         *       &lt;/sequence>
         *       &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "any"
        })
        public static class OtroContenido {

            @XmlAnyElement(lax = true)
            protected Object any;
            @XmlAttribute(name = "codigo")
            protected String codigo;

            /**
             * Gets the value of the any property.
             *
             * @return possible object is
             * {@link Element }
             * {@link Object }
             */
            public Object getAny() {
                return any;
            }

            /**
             * Sets the value of the any property.
             *
             * @param value allowed object is
             *              {@link Element }
             *              {@link Object }
             */
            public void setAny(Object value) {
                this.any = value;
            }

            /**
             * Gets the value of the codigo property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCodigo() {
                return codigo;
            }

            /**
             * Sets the value of the codigo property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCodigo(String value) {
                this.codigo = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "value"
        })
        public static class OtroTexto {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "codigo")
            protected String codigo;

            /**
             * Gets the value of the value property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the codigo property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getCodigo() {
                return codigo;
            }

            /**
             * Sets the value of the codigo property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setCodigo(String value) {
                this.codigo = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CodigoTipoMoneda" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}CodigoMonedaType" minOccurs="0"/>
     *         &lt;element name="TotalServGravados" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType" minOccurs="0"/>
     *         &lt;element name="TotalServExentos" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType" minOccurs="0"/>
     *         &lt;element name="TotalServExonerado" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType" minOccurs="0"/>
     *         &lt;element name="TotalMercanciasGravadas" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType" minOccurs="0"/>
     *         &lt;element name="TotalMercanciasExentas" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType" minOccurs="0"/>
     *         &lt;element name="TotalMercExonerada" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType" minOccurs="0"/>
     *         &lt;element name="TotalGravado" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType" minOccurs="0"/>
     *         &lt;element name="TotalExento" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType" minOccurs="0"/>
     *         &lt;element name="TotalExonerado" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType" minOccurs="0"/>
     *         &lt;element name="TotalVenta" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType"/>
     *         &lt;element name="TotalDescuentos" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType" minOccurs="0"/>
     *         &lt;element name="TotalVentaNeta" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType"/>
     *         &lt;element name="TotalImpuesto" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType" minOccurs="0"/>
     *         &lt;element name="TotalOtrosCargos" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType" minOccurs="0"/>
     *         &lt;element name="TotalComprobante" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "codigoTipoMoneda",
            "totalServGravados",
            "totalServExentos",
            "totalServExonerado",
            "totalMercanciasGravadas",
            "totalMercanciasExentas",
            "totalMercExonerada",
            "totalGravado",
            "totalExento",
            "totalExonerado",
            "totalVenta",
            "totalDescuentos",
            "totalVentaNeta",
            "totalImpuesto",
            "totalOtrosCargos",
            "totalComprobante"
    })
    public static class ResumenFactura {

        @XmlElement(name = "CodigoTipoMoneda", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra")
        protected CodigoMonedaType codigoTipoMoneda;
        @XmlElement(name = "TotalServGravados", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra")
        protected BigDecimal totalServGravados;
        @XmlElement(name = "TotalServExentos", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra")
        protected BigDecimal totalServExentos;
        @XmlElement(name = "TotalServExonerado", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra")
        protected BigDecimal totalServExonerado;
        @XmlElement(name = "TotalMercanciasGravadas", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra")
        protected BigDecimal totalMercanciasGravadas;
        @XmlElement(name = "TotalMercanciasExentas", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra")
        protected BigDecimal totalMercanciasExentas;
        @XmlElement(name = "TotalMercExonerada", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra")
        protected BigDecimal totalMercExonerada;
        @XmlElement(name = "TotalGravado", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra")
        protected BigDecimal totalGravado;
        @XmlElement(name = "TotalExento", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra")
        protected BigDecimal totalExento;
        @XmlElement(name = "TotalExonerado", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra")
        protected BigDecimal totalExonerado;
        @XmlElement(name = "TotalVenta", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra", required = true)
        protected BigDecimal totalVenta;
        @XmlElement(name = "TotalDescuentos", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra")
        protected BigDecimal totalDescuentos;
        @XmlElement(name = "TotalVentaNeta", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra", required = true)
        protected BigDecimal totalVentaNeta;
        @XmlElement(name = "TotalImpuesto", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra")
        protected BigDecimal totalImpuesto;
        @XmlElement(name = "TotalOtrosCargos", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra")
        protected BigDecimal totalOtrosCargos;
        @XmlElement(name = "TotalComprobante", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra", required = true)
        protected BigDecimal totalComprobante;

        /**
         * Gets the value of the codigoTipoMoneda property.
         *
         * @return possible object is
         * {@link CodigoMonedaType }
         */
        public CodigoMonedaType getCodigoTipoMoneda() {
            return codigoTipoMoneda;
        }

        /**
         * Sets the value of the codigoTipoMoneda property.
         *
         * @param value allowed object is
         *              {@link CodigoMonedaType }
         */
        public void setCodigoTipoMoneda(CodigoMonedaType value) {
            this.codigoTipoMoneda = value;
        }

        /**
         * Gets the value of the totalServGravados property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getTotalServGravados() {
            return totalServGravados;
        }

        /**
         * Sets the value of the totalServGravados property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setTotalServGravados(BigDecimal value) {
            this.totalServGravados = value;
        }

        /**
         * Gets the value of the totalServExentos property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getTotalServExentos() {
            return totalServExentos;
        }

        /**
         * Sets the value of the totalServExentos property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setTotalServExentos(BigDecimal value) {
            this.totalServExentos = value;
        }

        /**
         * Gets the value of the totalServExonerado property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getTotalServExonerado() {
            return totalServExonerado;
        }

        /**
         * Sets the value of the totalServExonerado property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setTotalServExonerado(BigDecimal value) {
            this.totalServExonerado = value;
        }

        /**
         * Gets the value of the totalMercanciasGravadas property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getTotalMercanciasGravadas() {
            return totalMercanciasGravadas;
        }

        /**
         * Sets the value of the totalMercanciasGravadas property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setTotalMercanciasGravadas(BigDecimal value) {
            this.totalMercanciasGravadas = value;
        }

        /**
         * Gets the value of the totalMercanciasExentas property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getTotalMercanciasExentas() {
            return totalMercanciasExentas;
        }

        /**
         * Sets the value of the totalMercanciasExentas property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setTotalMercanciasExentas(BigDecimal value) {
            this.totalMercanciasExentas = value;
        }

        /**
         * Gets the value of the totalMercExonerada property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getTotalMercExonerada() {
            return totalMercExonerada;
        }

        /**
         * Sets the value of the totalMercExonerada property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setTotalMercExonerada(BigDecimal value) {
            this.totalMercExonerada = value;
        }

        /**
         * Gets the value of the totalGravado property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getTotalGravado() {
            return totalGravado;
        }

        /**
         * Sets the value of the totalGravado property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setTotalGravado(BigDecimal value) {
            this.totalGravado = value;
        }

        /**
         * Gets the value of the totalExento property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getTotalExento() {
            return totalExento;
        }

        /**
         * Sets the value of the totalExento property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setTotalExento(BigDecimal value) {
            this.totalExento = value;
        }

        /**
         * Gets the value of the totalExonerado property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getTotalExonerado() {
            return totalExonerado;
        }

        /**
         * Sets the value of the totalExonerado property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setTotalExonerado(BigDecimal value) {
            this.totalExonerado = value;
        }

        /**
         * Gets the value of the totalVenta property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getTotalVenta() {
            return totalVenta;
        }

        /**
         * Sets the value of the totalVenta property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setTotalVenta(BigDecimal value) {
            this.totalVenta = value;
        }

        /**
         * Gets the value of the totalDescuentos property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getTotalDescuentos() {
            return totalDescuentos;
        }

        /**
         * Sets the value of the totalDescuentos property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setTotalDescuentos(BigDecimal value) {
            this.totalDescuentos = value;
        }

        /**
         * Gets the value of the totalVentaNeta property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getTotalVentaNeta() {
            return totalVentaNeta;
        }

        /**
         * Sets the value of the totalVentaNeta property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setTotalVentaNeta(BigDecimal value) {
            this.totalVentaNeta = value;
        }

        /**
         * Gets the value of the totalImpuesto property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getTotalImpuesto() {
            return totalImpuesto;
        }

        /**
         * Sets the value of the totalImpuesto property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setTotalImpuesto(BigDecimal value) {
            this.totalImpuesto = value;
        }

        /**
         * Gets the value of the totalOtrosCargos property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getTotalOtrosCargos() {
            return totalOtrosCargos;
        }

        /**
         * Sets the value of the totalOtrosCargos property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setTotalOtrosCargos(BigDecimal value) {
            this.totalOtrosCargos = value;
        }

        /**
         * Gets the value of the totalComprobante property.
         *
         * @return possible object is
         * {@link BigDecimal }
         */
        public BigDecimal getTotalComprobante() {
            return totalComprobante;
        }

        /**
         * Sets the value of the totalComprobante property.
         *
         * @param value allowed object is
         *              {@link BigDecimal }
         */
        public void setTotalComprobante(BigDecimal value) {
            this.totalComprobante = value;
        }

    }

}
