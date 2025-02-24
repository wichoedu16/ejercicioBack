package com.werp.demo.mapper;

import com.werp.demo.dto.response.ReporteResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-20T09:33:14-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class ReporteMapperImpl implements ReporteMapper {

    @Override
    public List<ReporteResponse> toResponseList(List<ReporteResponse> response) {
        if ( response == null ) {
            return null;
        }

        List<ReporteResponse> list = new ArrayList<ReporteResponse>( response.size() );
        for ( ReporteResponse reporteResponse : response ) {
            list.add( reporteResponse );
        }

        return list;
    }
}
