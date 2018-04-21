
import problema1.wmaPlay;

public class ManipulaWMA implements FormatoAudio {

    wmaPlay wma;

    @Override
    public void abrir(String file) {
        wma = new wmaPlay();
        wma.setFile(file);
    }

    @Override
    public void reproduzir() {
        wma.play();
    }

    @Override
    public void pausar() {
        wma.stop();
    }

    @Override
    public void parar() {
        wma.stop();
        wma.setLocation(0);
    }

    @Override
    public void avancar(int value) {
        wma.setLocation(wma.getLocation() + value);
    }

    @Override
    public void retornar(int value) {
        wma.setLocation(wma.getLocation() - value);
    }

    @Override
    public void liberar() {
        wma = null;
    }

    @Override
    public void reproduzirSimples(String file) {
        wma = new wmaPlay();
        wma.setFile(file);
        wma.play();
    }

    @Override
    public void pararSimples() {
        wma.stop();
        wma.setLocation(0);
        wma = null;
    }

}
