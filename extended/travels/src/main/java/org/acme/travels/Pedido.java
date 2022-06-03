/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.acme.travels;

import java.util.Date;

public class Pedido {
    private String tipoDePedido;
    private String noCliente;
    private String nombreCliente;
    private String producto;
    private String codigoVerificacion;
    private Date fechadeCreacion;
    private Boolean esFintech;
    private Double monto;
    private Double iva;
    private Double montoFactura;
    private Double comision;
    private Double montoTotal;

    public String getTipoDePedido() {
        return tipoDePedido;
    }

    public void setTipoDePedido(String tipoDePedido) {
        this.tipoDePedido = tipoDePedido;
    }

    public String getNoCliente() {
        return noCliente;
    }

    public void setNoCliente(String noCliente) {
        this.noCliente = noCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCodigoVerificacion() {
        return codigoVerificacion;
    }

    public void setCodigoVerificacion(String codigoVerificacion) {
        this.codigoVerificacion = codigoVerificacion;
    }

    public Date getFechadeCreacion() {
        return fechadeCreacion;
    }

    public void setFechadeCreacion(Date fechadeCreacion) {
        this.fechadeCreacion = fechadeCreacion;
    }

    public Boolean getEsFintech() {
        return esFintech;
    }

    public void setEsFintech(Boolean esFintech) {
        this.esFintech = esFintech;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Double getMontoFactura() {
        return montoFactura;
    }

    public void setMontoFactura(Double montoFactura) {
        this.montoFactura = montoFactura;
    }

    public Double getComision() {
        return comision;
    }

    public void setComision(Double comision) {
        this.comision = comision;
    }

    public Double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public boolean isEsFintech() {
        return esFintech == null ? false : true;
    }

    @Override
    public String toString() {
        return "Pedido [codigoVerificacion=" + codigoVerificacion + ", comision=" + comision + ", esFintech="
                + esFintech + ", fechadeCreacion=" + fechadeCreacion + ", iva=" + iva + ", monto=" + monto
                + ", montoFactura=" + montoFactura + ", montoTotal=" + montoTotal + ", noCliente=" + noCliente
                + ", nombreCliente=" + nombreCliente + ", producto=" + producto + ", tipoDePedido=" + tipoDePedido
                + "]";
    }

}
