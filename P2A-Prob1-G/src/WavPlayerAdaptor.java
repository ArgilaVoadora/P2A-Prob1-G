import problema1.WAVPlayer;

public class WavPlayerAdaptor implements FormatoAudio {

    WAVPlayer arquivo;
    
    @Override
    public void abrir(String file) {
        //O arquivo é aberto no construtor da classe.
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
        //O método reward(0) retorna a posição atual do arquivo .
        arquivo.reward(arquivo.reward(0));
    }

    @Override
    public void avancar(int value) {
        //O método foward avança (n) millisegundos no arquivo de áudio e retorna a posição atual em que
        arquivo.forward(value);
    }

    @Override
    public void retornar(int value) {
        //O método reward retorna (n) millisegundos no arquivo de audio e retorna a posição em que parou.
        arquivo.reward(value);
    }

    @Override
    public void liberar() {
        arquivo = null;
    }

    @Override
    public void reproduzirSimples(String file) {
        abrir(file);
    }

    @Override
    public void pararSimples() {
        parar();
        liberar();
    }
    
}
