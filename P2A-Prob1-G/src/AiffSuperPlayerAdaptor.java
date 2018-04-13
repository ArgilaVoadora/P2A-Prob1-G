
import problema1.AIFFSuperPlayer;

public class AiffSuperPlayerAdaptor implements FormatoAudio {
    
    AIFFSuperPlayer arquivo;

    @Override
    public void abrir(String file) {
        arquivo = new AIFFSuperPlayer(file);
    }

    @Override
    public void reproduzir() {
       arquivo.play();
    }

    @Override
    public void pausar() {
        arquivo.pause();
    }

    @Override
    public void parar() {
        arquivo.stop();
        arquivo.setCursor(0);
    }

    @Override
    public void avancar(int value) {
        arquivo.setCursor(value);
    }

    @Override
    public void retornar(int value) {
        arquivo.setCursor(value);
    }

    @Override
    public void liberar() {
        arquivo.release();
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
