import problema1.WAVPlayer;

public class ManipulaWAV implements FormatoAudio {

    WAVPlayer wav;

    @Override
    public void abrir(String file) {
        wav = new WAVPlayer(file);
    }

    @Override
    public void reproduzir() {
        wav.play();
    }

    @Override
    public void pausar() {
        wav.stop();
    }

    @Override
    public void parar() {
        wav.stop();
        wav.reward(wav.reward(0));
    }

    @Override
    public void avancar(int value) {
        wav.forward(value);
    }

    @Override
    public void retornar(int value) {
        wav.reward(value);
    }

    @Override
    public void liberar() {
        wav = null;
    }

    @Override
    public void reproduzirSimples(String file) {
        wav = new WAVPlayer(file);
        wav.play();
    }

    @Override
    public void pararSimples() {
        wav.stop();
        wav.reward(wav.reward(0));
        wav = null;
    }

}
