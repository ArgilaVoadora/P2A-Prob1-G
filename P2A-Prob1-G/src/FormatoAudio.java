public interface FormatoAudio {

    public void abrir(String file);

    public void reproduzir();

    public void pausar();

    public void parar();

    public void avancar(int value);

    public void retornar(int value);

    public void liberar();

    public void reproduzirSimples(String file);
    
    public void pararSimples();
}
