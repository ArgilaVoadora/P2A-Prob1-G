
import problema1.AIFFSuperPlayer;

public class ManipulaAIFF implements FormatoAudio {

    AIFFSuperPlayer aiff;

    @Override
    public void abrir(String file) {
        aiff = new AIFFSuperPlayer(file);
    }

    @Override
    public void reproduzir() {
        aiff.play();

    }

    @Override
    public void pausar() {
        aiff.pause();

    }

    @Override
    public void parar() {
        aiff.stop();
        aiff.setCursor(0);
    }

    @Override
    public void avancar(int value) {
        aiff.setCursor(aiff.pause() + value);
        aiff.play();
    }

    @Override
    public void retornar(int value) {
        aiff.setCursor(aiff.pause() - value);
        aiff.play();
    }

    @Override
    public void liberar() {
        aiff.release();
    }

    @Override
    public void reproduzirSimples(String file) {
        aiff = new AIFFSuperPlayer(file);
        aiff.play();
    }

    @Override
    public void pararSimples() {
        aiff.setCursor(0);
        aiff.release();
    }
}
