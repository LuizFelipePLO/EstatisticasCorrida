package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PalavrasTest {
    /*
    @Test
    public void testaUmaSoma(){
        assertEquals(10,10);        
    }*/
    public static IEventoRepository rep;


    @BeforeAll
    public static void inicializa(){
        rep = mock(IEventoRepository.class);
        when(rep.todos()).thenReturn(Arrays.asList(
            new Evento(10,"POA Day RUN", 10, 3, 2021, 5000, 0, 43, 0), 
            new Evento(12,"POA Night RUN", 15, 5, 2021, 5000, 0, 42,0), 
            new Evento(11,"NIKE RUN", 17, 6, 2021, 21000, 1, 22,0),
            new Evento(14,"SUMMER RUN", 22, 8, 2021, 5000, 0, 41, 0),      
            new Evento(16,"SPRING RUN", 22, 8, 2021, 5000, 0, 41, 30),      
            new Evento(18,"WINTER RUN", 2, 8, 2021, 5000, 0, 42, 30)));      
    }
    
    @Test
    public void calculaEstatisticasMediaTest(){
        EstatisticaDesconsidera ed = new EstatisticaDesconsidera(rep); 
        double rObs = ed.calculaEstatisticas(5000).getMedia();
        Assertions.assertEquals(2520, rObs);
    } //Pega tds de 5000 (distãncia) e descobre a média do tempo de tds eles (5 ao todo). Resp em segundos
    
}


