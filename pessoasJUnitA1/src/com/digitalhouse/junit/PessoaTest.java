package com.digitalhouse.junit;


import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PessoaTest {

    static Pessoa p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;

    int tamanho;

    List<String> colecao = new ArrayList<>();

    @BeforeAll
    static void doBeforeAll(){
        p1 = new Pessoa("Ivo", "Ganda");
        p1.setIdade(LocalDate.of(2016,3,23));
        p2 = new Pessoa("Ana", "Musk");
        p2.setIdade(LocalDate.of(1966,1,03));
        p3 = new Pessoa("Joe", "Morello");
        p3.setIdade(LocalDate.of(2010, 12, 04));
        p4 = new Pessoa("Rob", "Johnson");
        p4.setIdade(LocalDate.of(1976, 10, 25));
        p5 = new Pessoa("Ted", "Trujillo");
        p5.setIdade(LocalDate.of(2014, 5, 14));
        p6 = new Pessoa("Robert", "Traids");
        p6.setIdade(LocalDate.of(2000, 3, 30));
        p7 = new Pessoa("Renata", "Castro");
        p7.setIdade(LocalDate.of(2010, 1, 18));
        p8 = new Pessoa("Murilo", "Bianch");
        p8.setIdade(LocalDate.of(2015, 7, 11));
        p9 = new Pessoa("Candido", "Silveira");
        p9.setIdade(LocalDate.of(1975, 9, 01));
        p10 = new Pessoa("Camila", "Porto");
        p10.setIdade(LocalDate.of(2014, 5, 25));

    }

    @Test
    void imprimirPessoas(){
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        System.out.println(p6.toString());
        System.out.println(p7.toString());
        System.out.println(p8.toString());
        System.out.println(p9.toString());
        System.out.println(p10.toString());
    }

    @BeforeEach
    void doBefore(){
       tamanho = Pessoa.colecao.size();
    }

    @Test
    void testandoColecao(){

        p1.adicionarNomes(p1);
        Assertions.assertTrue(p1.getColecao().size() > tamanho);

        System.out.println(p2.getColecao());

        //Assertions.assertEquals(tamanho, p1.colecao.size());

        /*p2.adicionarNomes(p2);
        Assertions.assertEquals(tamanho, p2.colecao.size());

        p3.adicionarNomes(p3);
        Assertions.assertEquals(tamanho, p3.colecao.size());

        p4.adicionarNomes(p4);
        Assertions.assertEquals(tamanho, p4.colecao.size());

        p5.adicionarNomes(p5);
        Assertions.assertEquals(tamanho, p5.colecao.size());

        p6.adicionarNomes(p6);
        Assertions.assertEquals(tamanho, p6.colecao.size());*/

    }

    @Test
    void testandoAssertTrue(){
        Assertions.assertTrue(p1.returnTrue());
    }

   /* @BeforeAll
    static void doBeforeAll(){
        System.out.println("Esta dentro do before all");
    }

    @BeforeEach
    void doBefore(){
        System.out.println("Esta dentro do before each");
    }


    @Test
    void adicionarColecao(){
        System.out.println("teste 1");
    }

    @Test
    void adicionarColecao2(){
        System.out.println("teste 2");
    }

    @Test
    @Disabled("Teste 3 nao foi executado")
    void adicionarColecao3(){
        System.out.println("teste 3");
    }

    @Test
    void adicionarColecao4(){
        System.out.println("teste 4");
    }

    @AfterEach
    void doAfter(){
        System.out.println("Esta dentro do after each");
    }*/

}