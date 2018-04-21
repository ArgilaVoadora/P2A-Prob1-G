
public class ManipuladoraFacade implements FormatoAudio {

    private FormatoAudio audio = null;
    private String file = null;
    
    public ManipuladoraFacade(String file) {
        this.file = file;
        audio = new FactoryAudio().getFormato(file);
    }    

    @Override
    public void abrir(String file) {
        audio.abrir(file);
    }

    @Override
    public void reproduzir() {
        audio.reproduzir();
    }

    @Override
    public void pausar() {
        audio.pausar();
    }

    @Override
    public void parar() {
        audio.parar();
    }

    @Override
    public void avancar(int value) {
        audio.avancar(value);
    }

    @Override
    public void retornar(int value) {
        audio.retornar(value);
    }

    @Override
    public void liberar() {
        audio.liberar();
    }

    @Override
    public void reproduzirSimples(String file) {
        audio.reproduzirSimples(file);
    }

    @Override
    public void pararSimples() {
        audio.pararSimples();
    }
}
