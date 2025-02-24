package com.werp.demo.mapper;

import com.werp.demo.dto.response.MovimientoResponse;
import com.werp.demo.model.Cuenta;
import com.werp.demo.model.Movimiento;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-18T13:01:33-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 23.0.2 (Homebrew)"
)
@Component
public class MovimientoMapperImpl implements MovimientoMapper {

    @Override
    public MovimientoResponse toResponse(Movimiento movimiento) {
        if ( movimiento == null ) {
            return null;
        }

        MovimientoResponse.MovimientoResponseBuilder movimientoResponse = MovimientoResponse.builder();

        movimientoResponse.numeroCuenta( movimientoCuentaNumeroCuenta( movimiento ) );
        movimientoResponse.id( movimiento.getId() );
        movimientoResponse.fecha( movimiento.getFecha() );
        movimientoResponse.tipoMovimiento( movimiento.getTipoMovimiento() );
        movimientoResponse.valor( movimiento.getValor() );
        movimientoResponse.saldo( movimiento.getSaldo() );

        return movimientoResponse.build();
    }

    @Override
    public List<MovimientoResponse> toResponseList(List<Movimiento> movimientos) {
        if ( movimientos == null ) {
            return null;
        }

        List<MovimientoResponse> list = new ArrayList<MovimientoResponse>( movimientos.size() );
        for ( Movimiento movimiento : movimientos ) {
            list.add( toResponse( movimiento ) );
        }

        return list;
    }

    private String movimientoCuentaNumeroCuenta(Movimiento movimiento) {
        if ( movimiento == null ) {
            return null;
        }
        Cuenta cuenta = movimiento.getCuenta();
        if ( cuenta == null ) {
            return null;
        }
        String numeroCuenta = cuenta.getNumeroCuenta();
        if ( numeroCuenta == null ) {
            return null;
        }
        return numeroCuenta;
    }
}
