package com.werp.demo.mapper;

import com.werp.demo.dto.request.ClienteRequest;
import com.werp.demo.dto.response.ClienteResponse;
import com.werp.demo.model.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-19T12:37:08-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class ClienteMapperImpl implements ClienteMapper {

    @Override
    public ClienteResponse toResponse(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        ClienteResponse.ClienteResponseBuilder clienteResponse = ClienteResponse.builder();

        clienteResponse.id( cliente.getId() );
        clienteResponse.nombre( cliente.getNombre() );
        clienteResponse.identificacion( cliente.getIdentificacion() );
        clienteResponse.direccion( cliente.getDireccion() );
        clienteResponse.telefono( cliente.getTelefono() );
        clienteResponse.estado( cliente.getEstado() );

        return clienteResponse.build();
    }

    @Override
    public Cliente toEntity(ClienteRequest request) {
        if ( request == null ) {
            return null;
        }

        Cliente.ClienteBuilder cliente = Cliente.builder();

        cliente.password( request.getPassword() );

        return cliente.build();
    }

    @Override
    public List<ClienteResponse> toResponseList(List<Cliente> clientes) {
        if ( clientes == null ) {
            return null;
        }

        List<ClienteResponse> list = new ArrayList<ClienteResponse>( clientes.size() );
        for ( Cliente cliente : clientes ) {
            list.add( toResponse( cliente ) );
        }

        return list;
    }
}
