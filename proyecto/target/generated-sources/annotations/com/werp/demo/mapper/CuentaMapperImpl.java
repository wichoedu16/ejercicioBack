package com.werp.demo.mapper;

import com.werp.demo.dto.request.CuentaRequest;
import com.werp.demo.dto.response.CuentaResponse;
import com.werp.demo.model.Cliente;
import com.werp.demo.model.Cuenta;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-19T12:49:08-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class CuentaMapperImpl implements CuentaMapper {

    @Override
    public CuentaResponse toResponse(Cuenta cuenta) {
        if ( cuenta == null ) {
            return null;
        }

        CuentaResponse.CuentaResponseBuilder cuentaResponse = CuentaResponse.builder();

        cuentaResponse.clienteNombre( cuentaClienteNombre( cuenta ) );
        cuentaResponse.identificacion( cuentaClienteIdentificacion( cuenta ) );
        cuentaResponse.id( cuenta.getId() );
        cuentaResponse.numeroCuenta( cuenta.getNumeroCuenta() );
        cuentaResponse.tipoCuenta( cuenta.getTipoCuenta() );
        cuentaResponse.saldoInicial( cuenta.getSaldoInicial() );
        cuentaResponse.estado( cuenta.getEstado() );

        return cuentaResponse.build();
    }

    @Override
    public Cuenta toEntity(CuentaRequest request) {
        if ( request == null ) {
            return null;
        }

        Cuenta cuenta = new Cuenta();

        cuenta.setNumeroCuenta( request.getNumeroCuenta() );
        cuenta.setTipoCuenta( request.getTipoCuenta() );
        cuenta.setSaldoInicial( request.getSaldoInicial() );

        return cuenta;
    }

    @Override
    public List<CuentaResponse> toResponseList(List<Cuenta> cuentas) {
        if ( cuentas == null ) {
            return null;
        }

        List<CuentaResponse> list = new ArrayList<CuentaResponse>( cuentas.size() );
        for ( Cuenta cuenta : cuentas ) {
            list.add( toResponse( cuenta ) );
        }

        return list;
    }

    private String cuentaClienteNombre(Cuenta cuenta) {
        if ( cuenta == null ) {
            return null;
        }
        Cliente cliente = cuenta.getCliente();
        if ( cliente == null ) {
            return null;
        }
        String nombre = cliente.getNombre();
        if ( nombre == null ) {
            return null;
        }
        return nombre;
    }

    private String cuentaClienteIdentificacion(Cuenta cuenta) {
        if ( cuenta == null ) {
            return null;
        }
        Cliente cliente = cuenta.getCliente();
        if ( cliente == null ) {
            return null;
        }
        String identificacion = cliente.getIdentificacion();
        if ( identificacion == null ) {
            return null;
        }
        return identificacion;
    }
}
