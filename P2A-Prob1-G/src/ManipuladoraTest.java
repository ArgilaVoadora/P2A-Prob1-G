public class ManipuladoraTest {
    public static void main(String[] args) throws Exception {
        
        ManipuladoraFacade MF = new ManipuladoraFacade("teste.mp3");
        
        MF.abrir("teste.mp3");
        MF.avancar(10);
        MF.reproduzir();
        MF.avancar(5);
        MF.pausar();
        MF.parar();
        MF.liberar();
    }
}
