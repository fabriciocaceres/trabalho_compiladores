package recovery;

import parser.*;

public class First { //implementa os conjuntos first p/ alguns n.terminais

    static public final RecoverySet main = new RecoverySet();
    static public final RecoverySet ini = new RecoverySet();
    static public final RecoverySet tipoID = new RecoverySet();
    static public final RecoverySet operadorLogico = new RecoverySet();
    static public final RecoverySet increDecrementa = new RecoverySet();
    static public final RecoverySet maisOuMenos = new RecoverySet();
    static public final RecoverySet letra = new RecoverySet();
    static public final RecoverySet texto = new RecoverySet();
    static public final RecoverySet id = new RecoverySet();
    static public final RecoverySet chamaFuncao = new RecoverySet();
    static public final RecoverySet declaracaoID = tipoID;
    static public final RecoverySet listaID = id;
    static public final RecoverySet repeticao = new RecoverySet();
    static public final RecoverySet condicionalSe = new RecoverySet();
    static public final RecoverySet condicionalSeNao = new RecoverySet();
    static public final RecoverySet expressao = new RecoverySet();
    static public final RecoverySet imprimir = new RecoverySet();
    static public final RecoverySet retornoFuncao = new RecoverySet();
    static public final RecoverySet iniciaId = id;
    static public final RecoverySet criaFuncao = chamaFuncao;
    static public final RecoverySet comando = new RecoverySet();
   
    static {
    	main.add(new Integer(EG1Constants.FUNCAO));
    	main.add(new Integer(EG1Constants.INI));
    	
    	ini.add(new Integer(EG1Constants.INI));
    	
    	tipoID.add(new Integer(EG1Constants.TIPO_INTEIRO));
    	tipoID.add(new Integer(EG1Constants.TIPO_REAL));
    	tipoID.add(new Integer(EG1Constants.TIPO_TEXTO));
    	
    	operadorLogico.add(new Integer(EG1Constants.MAIOR));
    	operadorLogico.add(new Integer(EG1Constants.MENOR));
    	operadorLogico.add(new Integer(EG1Constants.MENOR_IGUAL));
    	operadorLogico.add(new Integer(EG1Constants.MAIOR_IGUAL));
    	operadorLogico.add(new Integer(EG1Constants.IGUAL));
    	operadorLogico.add(new Integer(EG1Constants.DIFERENTE));
    	operadorLogico.add(new Integer(EG1Constants.ATRIBUIR));

    	increDecrementa.add(new Integer(EG1Constants.LETRA_MINUSCULA));
    	increDecrementa.add(new Integer(EG1Constants.MENOS));
    	increDecrementa.add(new Integer(EG1Constants.MAIS));

    	increDecrementa.add(new Integer(EG1Constants.MAIS));
    	increDecrementa.add(new Integer(EG1Constants.MENOS));
  
    	letra.add(new Integer(EG1Constants.LETRA_MINUSCULA));
    	letra.add(new Integer(EG1Constants.LETRA_MAIUSCULA));
  
    	texto.add(new Integer(EG1Constants.DELIMITAR_TEXTO));
 
    	id.add(new Integer(EG1Constants.LETRA_MINUSCULA));

    	chamaFuncao.add(new Integer(EG1Constants.FUNCAO));

    	repeticao.add(new Integer(EG1Constants.PARA));

    	condicionalSe.add(new Integer(EG1Constants.SE));

    	condicionalSeNao.add(new Integer(EG1Constants.SENAO));

    	expressao.add(new Integer(EG1Constants.LETRA_MINUSCULA));
    	expressao.add(new Integer(EG1Constants.DELIMITAR_TEXTO));
    	expressao.add(new Integer(EG1Constants.NUMERO));

    	imprimir.add(new Integer(EG1Constants.MOSTRAR));

    	retornoFuncao.add(new Integer(EG1Constants.RETORNO));

    	comando.add(new Integer(EG1Constants.PARA));
    	comando.add(new Integer(EG1Constants.SE));
    	comando.add(new Integer(EG1Constants.TIPO_INTEIRO));
    	comando.add(new Integer(EG1Constants.TIPO_REAL));
    	comando.add(new Integer(EG1Constants.TIPO_TEXTO));
    	comando.add(new Integer(EG1Constants.FUNCAO));
    	comando.add(new Integer(EG1Constants.MOSTRAR));
    	comando.add(new Integer(EG1Constants.RETORNO));
    	comando.add(new Integer(EG1Constants.LETRA_MINUSCULA));
 	

    }
}
