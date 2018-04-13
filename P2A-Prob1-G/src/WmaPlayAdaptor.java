
import problema1.wmaPlay;

public class WmaPlayAdaptor implements FormatoAudio {
    
    wmaPlay arquivo;
    
    @Override
    public void abrir(String file) {
        arquivo.setFile(file);
    }

    @Override
    public void reproduzir() {
        arquivo.play();
    }

    @Override
    public void pausar() {
        arquivo.stop();
    }

    @Override
    public void parar() {
        arquivo.stop();
        arquivo.setLocation(0);
    }

    @Override
    public void avancar(int value) {
        arquivo.setLocation(arquivo.getLocation() + value);
    }

    @Override
    public void retornar(int value) {
        arquivo.setLocation(arquivo.getLocation() - value);
    }

    @Override
    public void liberar() {
        arquivo = null;
    }

    @Override
    public void reproduzirSimples(String file) {
        abrir(file);
        reproduzir();
    }

    @Override
    public void pararSimples() {
        parar();
        liberar();
    }
    
}
