package com.grupod;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class FuncionarioTest 
{
    private Funcionario f;

    @BeforeEach
    public void setup()
    {
        f = new Funcionario();
    }
    
    @Test
    public void getINSS()
    {
        f.setSalarioBruto(1000);
        assertEquals(45, f.getINSS(), 0.0001);
    }

    @Test
    public void getINSS2(){
        f.setSalarioBruto(2500);
        assertEquals(112.50, f.getINSS(), 0.0001);
    }

    @Test
    public void getINSS3(){
        f.setSalarioBruto(2501);
        assertEquals(112.54, f.getINSS(), 0.0001);
    }

    @Test
    public void getINSS4(){
        f.setSalarioBruto(100000);
        assertEquals(4500, f.getINSS(), 0.0001);
    }

    @Test
    public void getINSS5(){
        f.setSalarioBruto(111111.12);
        assertEquals(5000, f.getINSS(), 0.0001);
    }

    @Test
    public void getINSS6(){
        f.setSalarioBruto(200000);
        assertEquals(5000, f.getINSS(), 0.0001);
    }

    @Test
    public void getINSS7(){
        f.setSalarioBruto(0);
        assertEquals(0, f.getINSS(), 0.0001);
    }

    @Test
    public void getIR1()
    {
        f.setSalarioBruto(1000);
        assertEquals(0, f.getIRPF(), 0.0001);
    }

    @Test
    public void getIR2()
    {
        f.setSalarioBruto(2500);
        assertEquals(0, f.getIRPF(), 0.0001);
    }

    @Test
    public void getIR3()
    {
        f.setSalarioBruto(2501);
        assertEquals(0.12, f.getIRPF(), 0.0001);
    }

    @Test
    public void getIR4()
    {
        f.setSalarioBruto(100000);
        assertEquals(11400, f.getIRPF(), 0.0001);
    }

    @Test
    public void getIR5()
    {
        f.setSalarioBruto(111111.12);
        assertEquals(13033.33, f.getIRPF(), 0.0001);
    }

    @Test
    public void getIR6()
    {
        f.setSalarioBruto(200000);
        assertEquals(23700, f.getIRPF(), 0.0001);
    }

    @Test
    public void getIR7()
    {
        f.setSalarioBruto(0);
        assertEquals(0, f.getIRPF(), 0.0001);
    }

    @Test
    public void getSalarioLiquido1()
    {
        f.setSalarioBruto(1000);
        assertEquals(995, f.getSalarioLiquido(), 0.0001);
    }

    @Test
    public void getSalarioLiquido2()
    {
        f.setSalarioBruto(2500);
        assertEquals(2387.50, f.getSalarioLiquido(), 0.0001);
    }

    @Test
    public void getSalarioLiquido3()
    {
        f.setSalarioBruto(2501);
        assertEquals(2388.34, f.getSalarioLiquido(), 0.0001);
    }

    @Test
    public void getSalarioLiquido4()
    {

        f.setSalarioBruto(100000);
        assertEquals(84100, f.getSalarioLiquido(), 0.0001);
    }

    @Test
    public void getSalarioLiquido5()
    {
        f.setSalarioBruto(111111.12);
        assertEquals(93077.79, f.getSalarioLiquido(), 0.0001);
    }

    @Test
    public void getSalarioLiquido6()
    {
        f.setSalarioBruto(200000);
        assertEquals(171300, f.getSalarioLiquido(), 0.0001);
    }

    @Test
    public void getSalarioLiquido7()
    {
        f.setSalarioBruto(0);
        assertEquals(0, f.getSalarioLiquido(), 0.0001);
    }
}
