
/*
 * Copyright (c) 2019.  SOFTCORP-CR S.A. All Rights Reserved. Any partial or total reproduction of this file without authorization from the owner is prohibited.
 */

package com.softcorp.cr.facturaelectronica.api.dtos.buyingelectronicbill;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodigoMonedaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodigoMonedaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoMoneda">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="AED"/>
 *               &lt;enumeration value="AFN"/>
 *               &lt;enumeration value="ALL"/>
 *               &lt;enumeration value="AMD"/>
 *               &lt;enumeration value="ANG"/>
 *               &lt;enumeration value="AOA"/>
 *               &lt;enumeration value="ARS"/>
 *               &lt;enumeration value="AUD"/>
 *               &lt;enumeration value="AWG"/>
 *               &lt;enumeration value="AZN"/>
 *               &lt;enumeration value="BAM"/>
 *               &lt;enumeration value="BBD"/>
 *               &lt;enumeration value="BDT"/>
 *               &lt;enumeration value="BGN"/>
 *               &lt;enumeration value="BHD"/>
 *               &lt;enumeration value="BIF"/>
 *               &lt;enumeration value="BMD"/>
 *               &lt;enumeration value="BND"/>
 *               &lt;enumeration value="BOB"/>
 *               &lt;enumeration value="BOV"/>
 *               &lt;enumeration value="BRL"/>
 *               &lt;enumeration value="BSD"/>
 *               &lt;enumeration value="BTN"/>
 *               &lt;enumeration value="BWP"/>
 *               &lt;enumeration value="BYR"/>
 *               &lt;enumeration value="BZD"/>
 *               &lt;enumeration value="CAD"/>
 *               &lt;enumeration value="CDF"/>
 *               &lt;enumeration value="CHE"/>
 *               &lt;enumeration value="CHF"/>
 *               &lt;enumeration value="CHW"/>
 *               &lt;enumeration value="CLF"/>
 *               &lt;enumeration value="CLP"/>
 *               &lt;enumeration value="CNY"/>
 *               &lt;enumeration value="COP"/>
 *               &lt;enumeration value="COU"/>
 *               &lt;enumeration value="CRC"/>
 *               &lt;enumeration value="CUC"/>
 *               &lt;enumeration value="CUP"/>
 *               &lt;enumeration value="CVE"/>
 *               &lt;enumeration value="CZK"/>
 *               &lt;enumeration value="DJF"/>
 *               &lt;enumeration value="DKK"/>
 *               &lt;enumeration value="DOP"/>
 *               &lt;enumeration value="DZD"/>
 *               &lt;enumeration value="EGP"/>
 *               &lt;enumeration value="ERN"/>
 *               &lt;enumeration value="ETB"/>
 *               &lt;enumeration value="EUR"/>
 *               &lt;enumeration value="FJD"/>
 *               &lt;enumeration value="FKP"/>
 *               &lt;enumeration value="GBP"/>
 *               &lt;enumeration value="GEL"/>
 *               &lt;enumeration value="GHS"/>
 *               &lt;enumeration value="GIP"/>
 *               &lt;enumeration value="GMD"/>
 *               &lt;enumeration value="GNF"/>
 *               &lt;enumeration value="GTQ"/>
 *               &lt;enumeration value="GYD"/>
 *               &lt;enumeration value="HKD"/>
 *               &lt;enumeration value="HNL"/>
 *               &lt;enumeration value="HRK"/>
 *               &lt;enumeration value="HTG"/>
 *               &lt;enumeration value="HUF"/>
 *               &lt;enumeration value="IDR"/>
 *               &lt;enumeration value="ILS"/>
 *               &lt;enumeration value="INR"/>
 *               &lt;enumeration value="IQD"/>
 *               &lt;enumeration value="IRR"/>
 *               &lt;enumeration value="ISK"/>
 *               &lt;enumeration value="JMD"/>
 *               &lt;enumeration value="JOD"/>
 *               &lt;enumeration value="JPY"/>
 *               &lt;enumeration value="KES"/>
 *               &lt;enumeration value="KGS"/>
 *               &lt;enumeration value="KHR"/>
 *               &lt;enumeration value="KMF"/>
 *               &lt;enumeration value="KPW"/>
 *               &lt;enumeration value="KRW"/>
 *               &lt;enumeration value="KWD"/>
 *               &lt;enumeration value="KYD"/>
 *               &lt;enumeration value="KZT"/>
 *               &lt;enumeration value="LAK"/>
 *               &lt;enumeration value="LBP"/>
 *               &lt;enumeration value="LKR"/>
 *               &lt;enumeration value="LRD"/>
 *               &lt;enumeration value="LSL"/>
 *               &lt;enumeration value="LYD"/>
 *               &lt;enumeration value="MAD"/>
 *               &lt;enumeration value="MDL"/>
 *               &lt;enumeration value="MGA"/>
 *               &lt;enumeration value="MKD"/>
 *               &lt;enumeration value="MMK"/>
 *               &lt;enumeration value="MNT"/>
 *               &lt;enumeration value="MOP"/>
 *               &lt;enumeration value="MRO"/>
 *               &lt;enumeration value="MUR"/>
 *               &lt;enumeration value="MVR"/>
 *               &lt;enumeration value="MWK"/>
 *               &lt;enumeration value="MXN"/>
 *               &lt;enumeration value="MXV"/>
 *               &lt;enumeration value="MYR"/>
 *               &lt;enumeration value="MZN"/>
 *               &lt;enumeration value="NAD"/>
 *               &lt;enumeration value="NGN"/>
 *               &lt;enumeration value="NIO"/>
 *               &lt;enumeration value="NOK"/>
 *               &lt;enumeration value="NPR"/>
 *               &lt;enumeration value="NZD"/>
 *               &lt;enumeration value="OMR"/>
 *               &lt;enumeration value="PAB"/>
 *               &lt;enumeration value="PEN"/>
 *               &lt;enumeration value="PGK"/>
 *               &lt;enumeration value="PHP"/>
 *               &lt;enumeration value="PKR"/>
 *               &lt;enumeration value="PLN"/>
 *               &lt;enumeration value="PYG"/>
 *               &lt;enumeration value="QAR"/>
 *               &lt;enumeration value="RON"/>
 *               &lt;enumeration value="RSD"/>
 *               &lt;enumeration value="RUB"/>
 *               &lt;enumeration value="RWF"/>
 *               &lt;enumeration value="SAR"/>
 *               &lt;enumeration value="SBD"/>
 *               &lt;enumeration value="SCR"/>
 *               &lt;enumeration value="SDG"/>
 *               &lt;enumeration value="SEK"/>
 *               &lt;enumeration value="SGD"/>
 *               &lt;enumeration value="SHP"/>
 *               &lt;enumeration value="SLL"/>
 *               &lt;enumeration value="SOS"/>
 *               &lt;enumeration value="SRD"/>
 *               &lt;enumeration value="SSP"/>
 *               &lt;enumeration value="STD"/>
 *               &lt;enumeration value="SVC"/>
 *               &lt;enumeration value="SYP"/>
 *               &lt;enumeration value="SZL"/>
 *               &lt;enumeration value="THB"/>
 *               &lt;enumeration value="TJS"/>
 *               &lt;enumeration value="TMT"/>
 *               &lt;enumeration value="TND"/>
 *               &lt;enumeration value="TOP"/>
 *               &lt;enumeration value="TRY"/>
 *               &lt;enumeration value="TTD"/>
 *               &lt;enumeration value="TWD"/>
 *               &lt;enumeration value="TZS"/>
 *               &lt;enumeration value="UAH"/>
 *               &lt;enumeration value="UGX"/>
 *               &lt;enumeration value="USD"/>
 *               &lt;enumeration value="USN"/>
 *               &lt;enumeration value="UYI"/>
 *               &lt;enumeration value="UYU"/>
 *               &lt;enumeration value="UZS"/>
 *               &lt;enumeration value="VEF"/>
 *               &lt;enumeration value="VND"/>
 *               &lt;enumeration value="VUV"/>
 *               &lt;enumeration value="WST"/>
 *               &lt;enumeration value="XAF"/>
 *               &lt;enumeration value="XAG"/>
 *               &lt;enumeration value="XAU"/>
 *               &lt;enumeration value="XBA"/>
 *               &lt;enumeration value="XBB"/>
 *               &lt;enumeration value="XBC"/>
 *               &lt;enumeration value="XBD"/>
 *               &lt;enumeration value="XCD"/>
 *               &lt;enumeration value="XDR"/>
 *               &lt;enumeration value="XOF"/>
 *               &lt;enumeration value="XPD"/>
 *               &lt;enumeration value="XPF"/>
 *               &lt;enumeration value="XPT"/>
 *               &lt;enumeration value="XSU"/>
 *               &lt;enumeration value="XTS"/>
 *               &lt;enumeration value="XUA"/>
 *               &lt;enumeration value="XXX"/>
 *               &lt;enumeration value="YER"/>
 *               &lt;enumeration value="ZAR"/>
 *               &lt;enumeration value="ZMW"/>
 *               &lt;enumeration value="ZWL"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TipoCambio" type="{https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra}DecimalDineroType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodigoMonedaType", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra", propOrder = {
    "codigoMoneda",
    "tipoCambio"
})
public class CodigoMonedaType {

    @XmlElement(name = "CodigoMoneda", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra", required = true)
    protected String codigoMoneda;
    @XmlElement(name = "TipoCambio", namespace = "https://cdn.comprobanteselectronicos.go.cr/xml-schemas/v4.3/facturaElectronicaCompra", required = true)
    protected BigDecimal tipoCambio;

    /**
     * Gets the value of the codigoMoneda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMoneda() {
        return codigoMoneda;
    }

    /**
     * Sets the value of the codigoMoneda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMoneda(String value) {
        this.codigoMoneda = value;
    }

    /**
     * Gets the value of the tipoCambio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTipoCambio() {
        return tipoCambio;
    }

    /**
     * Sets the value of the tipoCambio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTipoCambio(BigDecimal value) {
        this.tipoCambio = value;
    }

}
