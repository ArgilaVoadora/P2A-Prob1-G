import problema1.AACPlayer;

public class ManipulaAAC implements FormatoAudio {

    AACPlayer aac;

    @Override
    public void abrir(String file) {
        aac = new AACPlayer(file);
    }

    @Override
    public void reproduzir() {
        aac.play();
    }

    @Override
    public void pausar() {
        aac.stop();
    }

    @Override
    public void parar() {
        aac.stop();
        aac.setLocation(0);
    }

    @Override
    public void avancar(int value) {
        aac.setLocation(aac.getLocation() + value);
    }

    @Override
    public void retornar(int value) {
        aac.setLocation(aac.getLocation() - value);
    }

    @Override
    public void liberar() {
        aac = null;
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
