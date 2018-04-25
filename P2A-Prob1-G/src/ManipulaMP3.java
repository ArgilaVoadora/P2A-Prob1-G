import problema1.MP3DJ;

public class ManipulaMP3 implements FormatoAudio {

    MP3DJ mptres;

    @Override
    public void abrir(String file) {
        mptres = new MP3DJ();
        mptres.setFile(file);
    }

    @Override
    public void reproduzir() {
        mptres.play();
    }

    @Override
    public void pausar() {
        mptres.stop();
    }

    @Override
    public void parar() {
        mptres.stop();
        mptres.reward(mptres.reward(0));
    }

    @Override
    public void avancar(int value) {
        mptres.forward(value);
    }

    @Override
    public void retornar(int value) {
        mptres.reward(value);
    }

    @Override
    public void liberar() {
        mptres = null;
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
