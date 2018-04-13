import problema1.WAVPlayer;

public class WavPlayerAdaptor implements FormatoAudio {

    WAVPlayer arquivo;
    
    @Override
    public void abrir(String file) {
        arquivo = new WAVPlayer(file);
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
        arquivo = null;
    }

    @Override
    public void avancar(int value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void retornar(int value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void liberar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reproduzirSimples(String file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pararSimples() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
