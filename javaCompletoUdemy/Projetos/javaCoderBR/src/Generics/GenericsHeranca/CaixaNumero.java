package Generics.GenericsHeranca;

import Generics.ExemploCOMGenerics.Caixa;
// extends Nummber que dizer que ele só aceitas tipos de numeros
public class CaixaNumero<N extends Number> extends Caixa<N> {
}
