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
package org.acme.travels.service;

import javax.enterprise.context.ApplicationScoped;

import org.acme.travels.Pedido;

@ApplicationScoped
public class InvoiceService {
    public Pedido generateInvoice(Pedido pedido) {
        pedido.setIva(pedido.getMonto() * (0.16));
        pedido.setMontoFactura(pedido.getMonto() + (pedido.getMonto() * (0.16)));
        pedido.setMontoTotal(pedido.getMontoFactura());
        pedido.setComision(0.0);

        return pedido;
    }
}
