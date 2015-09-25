package principal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Joel
 */
public class PessoaTest {

    Pessoa p1, p2, p3, p4, p5;

    public PessoaTest() {

    }

    @Test
    public void testaPessoaConstruida() {
        Assert.assertEquals(55.0, p1.getPeso());
        Assert.assertEquals(1.80, p1.getAltura());
        Assert.assertEquals(18, p1.getIdade());
        Assert.assertEquals("Fernando Pessoa", p1.getNome());
        Assert.assertEquals("Masculino", p1.getSexo());
    }
    
    @Test
    public void testaCalculaIMC(){
        Assert.assertEquals(p1.getPeso()/(p1.getAltura()*p1.getAltura()), p1.calculaIMC());
        Assert.assertEquals(p2.getPeso()/(p2.getAltura()*p2.getAltura()), p2.calculaIMC());
        Assert.assertEquals(p3.getPeso()/(p3.getAltura()*p3.getAltura()), p3.calculaIMC());
    }
    
    @Test
    public void testaChecaIMC(){
        Assert.assertEquals("Você está abaixo do peso recomendado.", p1.checaIMC());
        Assert.assertEquals("Você está Obeso. Procure o acompanhamento de um nutricionista e realizar mais atividades físicas!", p2.checaIMC());
        Assert.assertEquals("Você está muito bem! Continue assim!", p4.checaIMC());
        Assert.assertEquals("Você está acima do peso recomendado. Cuidado!", p5.checaIMC());
    }

    @Before
    public void setUp() {
        p1 = new Pessoa(55, 1.80, "Fernando Pessoa", 18, "Masculino");
        p2 = new Pessoa(77, 1.60, "Ana", 15, "Feminino");
        p3 = new Pessoa(150, 2, "Pedro", 27, "Masculino");
        p4 = new Pessoa(75, 1.78, "Joel", 20, "Masculino");
        p5 = new Pessoa(90, 1.78, "Joana", 27, "Feminino");
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
