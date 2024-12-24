package OrientadoObjetos.Composicao.Aula143_RelacionamentoUm_Pra_Um;

public class Motor {

//    Carro carro;
    boolean ligado = false;
    double fatorInjecao = 1;

    // Bidirecional
//    Motor(Carro carro) {
//        this.carro = carro;
//    }

    int giros() {
        if (!ligado) {
            return 0; // se estiver desligado
        }else {
            return (int) Math.round(fatorInjecao * 3000);
        }

    }
}
