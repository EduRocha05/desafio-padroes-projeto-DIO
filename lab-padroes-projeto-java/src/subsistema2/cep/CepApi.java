package subsistema2.cep;

import one.digitalinnovation.gof.Singleton.SingletonEager;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia(){

        return instancia;
    }

    public String RecuperarCidade(String cep){
        return "Curitiba";
    }

    public String RecuperarEstado(String cep){
        return "PR";
    }

}
